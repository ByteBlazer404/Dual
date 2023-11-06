package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
public class controllerList {
	@GetMapping("/user")
	public String user() {
		return "david";
	}
	 
}
