package student.crud.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.crud.app.entitiy.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
//	Student--> class who's object should be created
//	String--> data type of the Primary key
	
//Our Repository doesn't have a method called as findByKodId() but we do have a method findById() 
//which we can override by declaring the method signature in the repository class
	Student findByKodId(String kodId);

	
	
}
