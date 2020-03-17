package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	
	@RequestMapping("/hdfclogin")
	public String display1() {
		//connecting to view layer
		
		return "callview";//jsp file name
	
	}
	@RequestMapping("/signin")
	public String display2(Model m) {
		
		m.addAttribute("CTS","Chennai");
		return "view12";
 		
	}

}
