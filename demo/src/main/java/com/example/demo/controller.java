package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
	@RequestMapping("/")
	public String index() {
		return "hello from spring boot";
	}

}
