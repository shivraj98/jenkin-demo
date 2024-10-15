package com.example.jenkindemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/demo")
	public String getAllProduct() {
		
       return "hello world";
	}

}
