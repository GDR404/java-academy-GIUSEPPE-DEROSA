package com.academy.cic.model;

public class StudentNumCourses {
	
	private Student student;
	
	private int courseCount;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(int courseCount) {
		this.courseCount = courseCount;
	}
	
	public String toString() {
		return String.format("[%s - Numero corsi: %d]", student.toString(), courseCount);
	}
	
	public String toStringId() {
		return String.format("[%d - Numero corsi: %d]", student.getId(), courseCount);
	}

}
