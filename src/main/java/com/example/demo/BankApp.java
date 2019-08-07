package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankApp {

	@RequestMapping(path = "version", method = RequestMethod.GET)
	public String getVersion() {
		return "1.0";
	}
}
