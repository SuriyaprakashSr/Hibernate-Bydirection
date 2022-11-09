package com.ty.manytomany.bi.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.bi.dto.Course;
import com.ty.manytomany.bi.dto.Student;

public class StudentController {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("suriya");
		student1.setPhone(1234);
		
		Student student2 = new Student();
		student2.setName("prakash");
		student2.setPhone(37366);
		
		Student student3 = new Student();
		student3.setName("tom");
		student3.setPhone(8998);
		
		Course course1 = new Course();
		course1.setId(101);
		course1.setName("java");
		
		Course course2 = new Course();
		course2.setId(102);
		course2.setName("adv java");
		
		
		Course course3 = new Course();
		course3.setId(103);
		course3.setName("html");
		
		
	List<Course> l1 = new ArrayList<Course>();
	l1.add(course1);
	l1.add(course3);
	
	student1.setCourses(l1);
	
	List<Course> l2 = new ArrayList<Course>();
	l2.add(course2);
	l2.add(course3);
	
	student2.setCourses(l2);
	
	List<Course> l3 = new ArrayList<Course>();
	l3.add(course1);
	l3.add(course2);
	l3.add(course3);
	
	student1.setCourses(l3);
	
	List<Student> ls1 = new ArrayList<Student>();
	ls1.add(student1);
	ls1.add(student3);
	
	course1.setStudents(ls1);
	
	List<Student> ls2 = new ArrayList<Student>();
	ls2.add(student2);
	ls2.add(student3);
	
	course2.setStudents(ls2);
	
	List<Student> ls3= new ArrayList<Student>();
	ls3.add(student1);
	ls3.add(student2);
	ls3.add(student3);
	
	course3.setStudents(ls3);
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(student1);
	entityManager.persist(student2);
	entityManager.persist(student3);
	
	entityManager.persist(course1);
	entityManager.persist(course2);
	entityManager.persist(course3);
	
	entityTransaction.commit();
	
	
		
	}

}
