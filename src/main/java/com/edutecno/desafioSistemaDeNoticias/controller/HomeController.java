package com.edutecno.desafioSistemaDeNoticias.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.edutecno.sistemadenoticias.service.LeerTxt;


@Controller
public class HomeController {
	
	
	LeerTxt noticias = new LeerTxt();
	
	@RequestMapping("/")
	public String inicio(Model modelo) {
		modelo.addAttribute("noticias",noticias.leerArchivoTXT());
		return "index";
	}


}



