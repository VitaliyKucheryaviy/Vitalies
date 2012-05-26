package ua.vitalies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/vitalies/goHell", method = RequestMethod.GET)
	public String test() {
		
		return "hell";
	}

}
