package com.homework.task.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


		@Controller
		@RequestMapping("/Task")
	public class TaskController {

		@GetMapping
	public String frmTask () {
		return "forms/taskform";
	}
}
