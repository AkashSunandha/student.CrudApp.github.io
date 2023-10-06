package student.crud.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.crud.app.entitiy.Student;
import student.crud.app.repositories.StudentRepository;

@Service//to tell SpringBoot that it's a SERVICE class not a normal class	
public class StudentServiceImplementation implements StudentService{
	
	@Autowired//creates object of the instance variable(repo)
	StudentRepository repo;
	
	public String addStudent(Student s) {
		repo.save(s);//save() is a preDefined method that adds new row to the database
		return "Student added!!!";
	}
	
	public Student fetchStudent(String kodId) {
//		repo.findById(String id); returns Optional but we want Student type object 
//		so write the method signature in StudentRepository
		return repo.findByKodId(kodId);
	}
	
	public String updateStudent(Student s) {
		repo.save(s);
		return "Student updated!!!";
	}
	
	public String deleteStudent(String kodId) {
		repo.deleteById(kodId);
		return "Student deleted!!!";
	}

	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
