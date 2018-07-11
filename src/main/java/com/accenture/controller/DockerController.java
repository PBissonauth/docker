package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DockerController {

	
	@GetMapping("/")
	public String Dock() {
		return "hello";
	}
	
	@PostMapping("/user")
	public String DockerPeople(@RequestParam String user, Model model) {
		model.addAttribute("user", user);
		return "hello";

	}
}
