package com.hariram.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping(value="/helloworld", method=RequestMethod.GET)
	public String hello() {
		return "helloworld";
	}
	
	@RequestMapping(value="/helloworldparam", method=RequestMethod.GET)
	public String hello(@RequestParam(value="name", required=false, defaultValue="unknown") String name, Model model) {
		model.addAttribute("name", name);
		return "helloworldparam";
	}
}
