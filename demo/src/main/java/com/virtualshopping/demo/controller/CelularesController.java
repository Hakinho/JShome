package com.virtualshopping.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/celulares")
public class CelularesController {

@GetMapping
public String exibirCelulares () {
	return "celulares";
}
}