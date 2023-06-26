package com.academy.cic.model;

public class Registration {
	
	private int id;
	private int studentId;
	private int courseId;
	private int grade;
	
	public Registration() {}
	
	public Registration(int id, int studentId, int courseId) {
		this.id = id;
		this.studentId = studentId;
		this.courseId = courseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
