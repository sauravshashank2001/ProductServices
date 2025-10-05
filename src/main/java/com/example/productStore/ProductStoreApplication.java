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
import com.example.productStore.models.Category;
import com.example.productStore.models.Price;
import com.example.productStore.models.Product;
import com.example.productStore.repository.CategoryRepository;
import com.example.productStore.repository.PriceRepository;
import com.example.productStore.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductStoreApplication implements CommandLineRunner {


//	private MentorRepository mentorRepository;
//	private StudentRepository studentRepository;
//	private UserRepository userRepository;
	private MentorRepository mentorRepository;
	private StudentRepository studentRepository;
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	private PriceRepository priceRepository;

//	public ProductStoreApplication(MentorRepository mentorRepository, StudentRepository studentRepository, UserRepository userRepository){
//		this.mentorRepository = mentorRepository;
//		this.studentRepository = studentRepository;
////		this.userRepository = userRepository;
//	}
	public ProductStoreApplication(ProductRepository productRepository, CategoryRepository categoryRepository,PriceRepository priceRepository){
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.priceRepository = priceRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProductStoreApplication.class, args);
	}

	@Override
	@Transactional
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
//		Student student = new Student();
//		student.setId(1L);
//		student.setName("kanhaiya");
//		student.setEmail("ka@gamil.com");
//		student.setPsp(98.0);
//		student.setBatch("batch2");
//		studentRepository.save(student);

//		Category category = new Category();
//		category.setName("electronics");
//
//		Category savedCategory = categoryRepository.save(category);
//
//		Price price = new Price("Ruppee", 20.0);
////		Price savedPrice = priceRepository.save(price);
//
//		Product product = new Product();
//		product.setTitle("iphone");
//		product.setPrice(price);
//		product.setImage("image_url");
//		product.setDescription("new launched iphone");
//		product.setCategory(savedCategory);
//		product.setPrice(savedPrice);

//		productRepository.save(product);

//		Optional<Category> categoryOptional = categoryRepository.findById("4040509b-a32e-4bec-9e6d-5b58e119be39");
//		if(!categoryOptional.isEmpty()){
//			Category category = categoryOptional.get();
//			System.out.println(category.getProducts());
//		}


		Optional<Category> categoryOptional = categoryRepository.findById("67931294-df89-4094-993f-5179f946b1d4");
		Category category = categoryOptional.get();
		System.out.println(category);
		List<Product> products = category.getProducts();
		System.out.println(products);
    }

}
