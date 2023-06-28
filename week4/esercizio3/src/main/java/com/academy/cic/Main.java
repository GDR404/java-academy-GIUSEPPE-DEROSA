package com.academy.cic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.academy.cic.entity.Course;
import com.academy.cic.entity.Registration;
import com.academy.cic.entity.Student;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Dao dao = new Dao();
		
		List<Student> sList = new ArrayList<Student>();
		Student s1 = new Student("Mario", "Rossi", 20);
		Student s2 = new Student("Mario", "Verdi", 21);
		Student s3 = new Student("Paolo", "Bianchi", 22);
		Student s4 = new Student("Paolo", "Rossi", 23);
		Student s5 = new Student("Mario", "Bianchi", 24);
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		Course c1 = new Course("First course");
		Course c2 = new Course("Second course");
		Course c3 = new Course("Third course");
		
		List<Registration> rList = new ArrayList<Registration>();
		Registration r1 = new Registration(s1, c1);
		Registration r2 = new Registration(s1, c2);
		rList.add(r1);
		rList.add(r2);
		rList.add(new Registration(s1, c3));
		rList.add(new Registration(s2, c2));
		rList.add(new Registration(s2, c3));
		rList.add(new Registration(s3, c1));
		rList.add(new Registration(s4, c1));
		rList.add(new Registration(s4, c3));

		dao.insertCourse(c1);
		dao.insertCourse(c2);
		dao.insertCourse(c3);
		
		for (Student s: sList)
			dao.insertStudent(s);
		
		for (Registration r: rList)
			dao.registryStudentCourse(r);

		List<Student> students = dao.findByNameSurname("Paolo", "Bianchi");
		if (students != null) {
			for (Student s: students)
				System.out.println(s);
		}
		
		dao.updateCourseGradeById(r1.getId(), 30);
		dao.updateCourseGradeById(r2.getId(), 27);
		
		Double avgGrade = dao.findAvgGradeByStudentId(s1.getId());
		if (avgGrade != null)
			System.out.println(s1.toString()+ " - avg grade: " + avgGrade);
		
		Student s = dao.findStudent(s1.getId());
		System.out.println(s);
		for (Registration r: s.getRegistrations()) {
			System.out.println(r.getCourse() + (r.getGrade()!=null ? " - grade: "+r.getGrade() : ""));
		}
	}

}
