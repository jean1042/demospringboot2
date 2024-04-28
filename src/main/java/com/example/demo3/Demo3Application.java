package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@RestController
public class Demo3Application {
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@RequestMapping("/getuser")
	public String hello(@RequestParam(value = "name", defaultValue = "June") String name) {
		return String.format("Juneee3 Hello %s!", name);
	}

	@PostMapping("/postuser")
	public String postTest2(@RequestBody String username){
		return "User created with username: " + username;
	}
}
