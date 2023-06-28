package com.academy.cic.entity;

import java.util.Objects;
import java.util.logging.Logger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.PostPersist;
import javax.persistence.Table;

@NamedQuery(name="Registration.findAvgGradeByStudentId", query = "SELECT avg(r.grade) FROM Registration r WHERE student.id = ?0")

@Entity
@Table(name = "REGISTRATION")
public class Registration {
	private static final Logger logger = Logger.getLogger(Registration.class.getName());
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(name = "grade")
	private int grade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="course_id")
	private Course course;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="student_id")
	private Student student;
	
	public Registration() {}

	public Registration(Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	@PostPersist
	public void logNewRegistration() {
		String logMessage = String.format("Registered student %d to course %d", student.getId(), course.getId());
	    logger.info(logMessage);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(course, grade, student);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(course, other.course) && Objects.equals(grade, other.grade)
				&& Objects.equals(student, other.student);
	}
}
