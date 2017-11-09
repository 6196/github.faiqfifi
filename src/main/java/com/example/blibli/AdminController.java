package com.example.blibli;

import org.springframework.web.bind.annotation.RequestMapping;

public class AdminController {
	
	
	@RequestMapping("/v_admin_lihat_rekap")
	public String index4() {
		return "v_admin_lihat_rekap";
	}
	
	@RequestMapping("/v_admin_dashboard")
	public String index6() {
		return "v_admin_dashboard";
	}
}
