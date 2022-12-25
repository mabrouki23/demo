package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class controller {
	@RequestMapping("/index")
	public String index() {
		return "hello from spring boot";
	}

}
