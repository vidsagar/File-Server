package com.project.fileserver;

import com.project.fileserver.authentication.User;
import com.project.fileserver.authentication.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FileServerApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(FileServerApplication.class, args);
	}
	public void run(String... args) {
		System.out.println("Data creation started...");
		userRepo.save(new User("user1@email.com", "user1"));
		userRepo.save(new User("user2@email.com", "user2"));
		userRepo.save(new User("user3@email.com", "user3"));
		userRepo.save(new User("user4@email.com", "user4"));
		userRepo.save(new User("user5@email.com", "user5"));
		System.out.println("Data creation complete...");
		showAllUsers();
	}
		public void showAllUsers(){
//		userRepo.findAll().forEach(user -> System.out.println(user.getUserEmail() + " " + user.getUserPassword()));
			System.out.println(userRepo.count());
		}
}
