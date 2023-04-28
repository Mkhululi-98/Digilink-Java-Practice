package com.mkululi;

import com.mkululi.model.User;
import com.mkululi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserManagementApplication  implements CommandLineRunner  {
	@Autowired
	UserRepository userRepository;
	public static void main(String[] args) {

		SpringApplication.run(UserManagementApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Mkululi","Manina","0737528094","Mkululi@gmail.com","UserN");
		User user1 = new User("Mike","Adams","0737528094","Mike@gmail.com","UserN");
		User user2 = new User("James","Van der byl","0737528094","James@gmail.com","UserN");
		User user3 = new User("John","Atkins","0737528094","James@gmail.com","UserN");
		User user4 = new User("Kelvin","Klein","0737528094","Kelvin@gmail.com","UserN");
		User user5 = new User("Micheal","Sues","0737528094","Micheal@gmail.com","UserN");
		userRepository.save(user);
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		userRepository.save(user4);
		userRepository.save(user5);

	}
}
