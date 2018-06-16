package com.persitant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Student;

public class StudentPersistant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("SampleJPA");

		
		EntityManager manager = factory
				.createEntityManager();
		
		/*
		manager.getTransaction().begin();
		
		Student st1 = new Student("Redeemer","rex@gmail.com");
		Student st2 = new Student("Hunte","hunt@gmail.com");
		Student st3 = new Student("Morex","max@gmail.com");
		
	    manager.persist(st1);
	    manager.persist(st2);
		manager.persist(st3);
		System.out.println("Comming something..");


		manager.getTransaction().commit();
		manager.close();
		factory.close();
		*/
		
		//Find student
		
		Student student = manager.find(Student.class, 151);
		
		System.out.println(student.getEmail() + " | " + student.getFistName() );



	}

}
