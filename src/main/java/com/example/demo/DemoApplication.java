	package com.example.demo;
				import org.springframework.beans.factory.annotation.Value;
				import org.springframework.boot.SpringApplication;
				import org.springframework.boot.autoconfigure.SpringBootApplication;
				import org.springframework.web.bind.annotation.GetMapping;
				import org.springframework.web.bind.annotation.RestController;
				
				@SpringBootApplication
				@RestController
				public class DemoApplication {

					@Value("${hello.name}")
					private String helloName;
					
					public static void main(String[] args) {
					SpringApplication.run(DemoApplication.class, args);
					}
					
					@GetMapping("/hello")
					public String hello() {
					return String.format("Hello %s!", helloName);
					}
					
				}
				