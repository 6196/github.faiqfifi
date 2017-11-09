package com.example.blibli;

import org.springframework.web.bind.annotation.RequestMapping;

public class BerandaController {
	@RequestMapping("/beranda")
	public String index2() {
		return "beranda";
	}
	
}
