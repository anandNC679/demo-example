package com.candidjava.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

/*	@RequestMapping("/")
	public String index() {
		return "index";
	}*/
	
	 @GetMapping("/index")
	    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name", name);
	        return "index";
	    }

}
