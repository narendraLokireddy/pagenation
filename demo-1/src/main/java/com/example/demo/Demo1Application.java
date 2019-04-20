package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.spring.entity.User;
import com.spring.service.PageNationService;

@SpringBootApplication(scanBasePackages="com.*")
@EnableJpaRepositories(basePackages="com.*")
@EntityScan(basePackages="com.*")
public class Demo1Application implements CommandLineRunner {
	
	/*@Autowired
	PageNationService service;*/
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class);
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		/*// TODO Auto-generated method stub
		System.out.println("started");
		for(int i=13;i<100;i++) {
		User save = service.save(new User(3+i,"narendra",56));
		System.out.println(save);
		}
		
		Page<User> pagenation = service.pagenation(2, 7, "id");
		
		int totalPages = pagenation.getTotalPages();
		
		System.out.println(totalPages);*/
		
		
		
		
		
	}

}
