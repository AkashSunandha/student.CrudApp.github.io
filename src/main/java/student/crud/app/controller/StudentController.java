package student.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import student.crud.app.entitiy.Student;
import student.crud.app.services.StudentService;

//@RestController:- annotation is used to return basic String Values
@Controller// annotation is used when we need to return a WEBPAGE
@RequestMapping("/crud") // annotation is used for providing extension of URL(not mandatory)
public class StudentController {
	 
	@Autowired//when we want SpringBoot to create a object of instance variable(service)
//ReferenceVariable of an INTERFACE can refer to the object of the implementing Class
	StudentService service;
	
	@PostMapping("/create")
	public String create(@ModelAttribute Student s) {
//@ModelAttribute:-when we want to store all types of data/information coming from frontend to the controller in a single object
		service.addStudent(s);
		return "index";
	}
	
	@GetMapping("/read")
	public String read(@RequestParam("kodId") String kodId, Model m) {
//@RequestParam:- is used when we want to collect information coming from frontend to the controller
		Student s = service.fetchStudent(kodId);
		m.addAttribute("s", s);
//"s"-->instance variable
//s-->Student type object(s)
		return "showStudent";
	}
	
	@GetMapping("/readAll")
	public String readAll(Model m) {
		List<Student> slist = service.fetchAllStudents();
		m.addAttribute("slist", slist);
		System.out.println(slist);
		return "showStudent";
	}
	
	@PutMapping("/update")
	public String update(@ModelAttribute Student s) {
		service.updateStudent(s);
		return "index";
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam("kodId") String kodId) {
		service.deleteStudent(kodId);
		return "index";
	}
	
	//in SpringBoot no need to do mapping for index.html 
	
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	@GetMapping("/fetchStudent")
	public String fetchStudent() {
		return "fetchStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent() {
		return "updateStudent";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent() {
		return "deleteStudent";
	}
	
}
