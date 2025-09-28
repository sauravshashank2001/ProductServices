package com.example.productStore;

//import com.example.productStore.inheritanceexample.singletable.Mentor;
//import com.example.productStore.inheritanceexample.singletable.MentorRepository;
//import com.example.productStore.inheritanceexample.tableperclass.Student;
//import com.example.productStore.inheritanceexample.tableperclass.StudentRepository;
import com.example.productStore.inheritanceexample.joinedtable.MentorRepository;
import com.example.productStore.inheritanceexample.joinedtable.Student;
import com.example.productStore.inheritanceexample.joinedtable.StudentRepository;
import com.example.productStore.inheritanceexample.tableperclass.User;
import com.example.productStore.inheritanceexample.tableperclass.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductStoreApplication implements CommandLineRunner {


//	private MentorRepository mentorRepository;
//	private StudentRepository studentRepository;
//	private UserRepository userRepository;
	private MentorRepository mentorRepository;
	private StudentRepository studentRepository;

	public ProductStoreApplication(MentorRepository mentorRepository, StudentRepository studentRepository, UserRepository userRepository){
		this.mentorRepository = mentorRepository;
		this.studentRepository = studentRepository;
//		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductStoreApplication.class, args);
	}

	public void run(String... args) throws Exception {
//		Mentor mentor = new Mentor();
//		mentor.setName("Vikrant");
//		mentor.setEmail("abc@gmail.com");
//		mentor.setAvgRating(10.0);
//		mentorRepository.save(mentor);
//		User user = new User();
//		user.setId(2L);
//		user.setName("Kishan");
//		user.setEmail("k@gamil.com");
//
//		userRepository.save(user);
//
//		Student student = new Student();
//		student.setId(1L);
//		student.setName("Kishan");
//		student.setEmail("k@gamil.com");
//		student.setPsp(99.0);
//		student.setBatch("batch1");
//		studentRepository.save(student);

//		List<User> users = userRepository.findAll();
//		users.forEach(user2-> {
//			System.out.println(user2.getName());
//		});
		Student student = new Student();
		student.setId(1L);
		student.setName("kanhaiya");
		student.setEmail("ka@gamil.com");
		student.setPsp(98.0);
		student.setBatch("batch2");
		studentRepository.save(student);



    }

}
