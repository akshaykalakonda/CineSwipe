package com.klef.cineswipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {
	
	@GetMapping("/")
    public ModelAndView home() {
    	ModelAndView mv=new ModelAndView("index");
    	return mv;
    }
	
	@GetMapping("home")
	@ResponseBody
    public String homemsg() {
    	return "<b>Hello Manoj</b>";
    }
}
