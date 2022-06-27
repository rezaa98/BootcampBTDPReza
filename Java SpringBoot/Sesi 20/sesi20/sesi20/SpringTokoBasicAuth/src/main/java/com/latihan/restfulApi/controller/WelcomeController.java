package com.latihan.restfulApi.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api")
public class WelcomeController {

	private String message = "SEMANGAT MENGERJAKAN ASSIGNMENT";

	@GetMapping(value = "/")
	public String main(Model model) {
		model.addAttribute("message", message);
		return "welcome";
	}
	@GetMapping("/index")
	public String index() {
		return "Welcome...";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
		HttpSession session= request.getSession(false);
		SecurityContextHolder.clearContext();
    	session= request.getSession(false);
	    if(session != null) {
	        session.invalidate();
	    }
	    for(Cookie cookie : request.getCookies()) {
	        cookie.setMaxAge(0);
	    }

	    return "Berhasil Logout...";
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
