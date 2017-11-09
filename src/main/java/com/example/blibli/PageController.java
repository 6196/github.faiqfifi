package com.example.blibli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/v_admin_lihat_ruangan")
	public String index5() {
		return "v_admin_lihat_ruangan";
	}
	
	@RequestMapping("/v_admin_lihat_kategori")
	public String index7() {
		return "v_admin_lihat_kategori";
	}
	
	@RequestMapping("/v_admin_tambah_pelanggan")
	public String index8() {
		return "v_admin_tambah_pelanggan";
	}
	
	@RequestMapping("/v_admin_tambah_admin")
	public String index3() {
		return "v_admin_tambah_admin";
	}
}
