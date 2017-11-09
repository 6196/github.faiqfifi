package com.example.blibli;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
}
