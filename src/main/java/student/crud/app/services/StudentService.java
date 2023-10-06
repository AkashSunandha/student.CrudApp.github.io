package student.crud.app.services;

import java.util.List;

import student.crud.app.entitiy.Student;

public interface StudentService {
	String addStudent(Student s);
	Student fetchStudent(String kodId);
	String updateStudent(Student s);
	String deleteStudent(String kodId);
	List<Student> fetchAllStudents();
}
