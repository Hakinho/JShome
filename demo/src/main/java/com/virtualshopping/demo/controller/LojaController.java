package com.virtualshopping.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LojaController {

@GetMapping
public String exibirLoja () {
	return "loja";
}
}
