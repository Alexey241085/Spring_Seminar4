package ru.gb.my_first_crud;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class MyFirstCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstCrudApplication.class, args);
		System.out.println("+++++++++");
		log.info("сайт запущен");
		System.out.println("+++++++++");
	}

}
