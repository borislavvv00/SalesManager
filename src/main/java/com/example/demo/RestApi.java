package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi 
{
	@GetMapping(value="/")
	public String getMessage()
	{
		return "Test Message!";
	}
}
