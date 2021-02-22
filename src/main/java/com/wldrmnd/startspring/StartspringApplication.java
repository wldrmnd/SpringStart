package com.wldrmnd.startspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//посмотреть уроки spring + thymeleaf
//понять что такое рест, сделать по гайду стагндартное приложение на Spring MVC
//https://www.youtube.com/playlist?app=desktop&list=PLU2ftbIeotGoGSEUf54LQH-DgiQPF2XRO
//посмотреть видосы про спринг кор
@SpringBootApplication
public class StartspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartspringApplication.class, args);
	}
}
