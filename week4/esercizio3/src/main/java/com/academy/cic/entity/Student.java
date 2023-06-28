package com.academy.cic.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQuery(name="Student.findByNameSurname", query = "SELECT s FROM Student s WHERE s.name = :name AND s.surname = :surname")
@Entity
@Table(name = "STUDENT")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(name = "first_name", nullable = false , length = 32)
	private String name;
	
	@Column(name = "last_name", nullable = false , length = 32)
	private String surname;
	
	@Column(name = "age")
	private Integer age;
	
	@OneToMany(mappedBy = "student")
	private List<Registration> registrations;
	
	public Student() {}

	
	public Student(String name, String surname, Integer age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public List<Registration> getRegistrations() {
		return registrations;
	}


	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, name, registrations, surname);
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
		Student other = (Student) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(registrations, other.registrations) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + ", id=" + getId() + "]";
	}
}
