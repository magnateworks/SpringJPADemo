package org.cris;

import java.util.List;

import org.cris.entity.User;
import org.cris.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User(101,"anc","MANGESH","KSH");
//		userRepository.save(user);
//		
//		List<User> users = userRepository.findAll();
//		
//		for (User u : users) {
//			System.out.println(u);
//		}
		List<User> userList = userRepository.findByFirstName("M");
		
		for (User user : userList) {
			System.out.println(user);
			System.out.println(userRepository.count());
			System.out.println(userRepository.existsById(100));
		}
		//
		
		
		
 	}

}
