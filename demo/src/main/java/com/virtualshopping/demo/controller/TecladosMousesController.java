package com.virtualshopping.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teclados-mouses")
public class TecladosMousesController {

@GetMapping
public String exibirTecladosMouses () {
	return "teclados-mouses";
}
}