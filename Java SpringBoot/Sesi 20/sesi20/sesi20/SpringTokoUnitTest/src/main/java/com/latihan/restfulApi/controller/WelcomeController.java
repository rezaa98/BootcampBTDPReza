package com.latihan.restfulApi.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	private String message = "SEMANGAT MENGERJAKAN ASSIGNMENT";

	@GetMapping(value = "/")
	public String main(Model model) {
		model.addAttribute("message", message);
		return "welcome";
	}
//hello?name=Qathrin
//	@GetMapping("/hello")
//	public String mainWithParam(
//			@RequestParam(name = "name", required = false, defaultValue = "") 
//			String name,Model model) {
//		model.addAttribute("message", name);
//		return "welcome";
//	}
}
