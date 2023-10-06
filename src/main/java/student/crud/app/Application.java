package student.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

//Whitelabel Error Page
//This application has no explicit mapping for /error, so you are seeing this as a fallback.
//
//Thu Aug 10 12:00:19 IST 2023
//There was an unexpected error (type=Not Found, status=404).
//No message available
//Solution:- i missed to add @Controller in the NavController class


//Whitelabel Error Page
//This application has no explicit mapping for /error, so you are seeing this as a fallback.
//
//Tue Aug 08 11:50:11 IST 2023
//There was an unexpected error (type=Method Not Allowed, status=405).
//Method 'POST' is not supported.
//Solution: make changes in application.properties:-spring.mvc.hiddenmethod.filter.enabled=true

//org.thymeleaf.exceptions.TemplateInputException:-

//Whitelabel Error Page
//This application has no explicit mapping for /error, so you are seeing this as a fallback.
//
//Wed Aug 09 11:17:49 IST 2023
//There was an unexpected error (type=Not Found, status=404).
//No message available


//org.springframework.beans.factory.UnsatisfiedDependencyException: 
//Error creating bean with name 'trainerController': 
//Unsatisfied dependency expressed through field 'tservice': 
//No qualifying bean of type 'com.learnSphere.services.TrainerService' available: 
//expected at least 1 bean which qualifies as autowire candidate. 
//Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
//Solution:- I missed @Service annotation in the SerViceImplementation class