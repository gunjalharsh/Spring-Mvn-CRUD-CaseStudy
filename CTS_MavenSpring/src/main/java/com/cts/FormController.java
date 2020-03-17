package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping(value="/checkaccount" ,method=RequestMethod.GET)
	public String display(@RequestParam("user1") String Username,@RequestParam("pass") String Password,Model m) {
		
		if(Username.equals("Harshal")) {
			
			String msg="Login Successful "+ Username;
			m.addAttribute("message",msg);
			return "successpage";
			
		}
		else {
			String msg="Invalid " + Username;
		m.addAttribute("message1",msg);
		return "errorpage";
		}
		
	}
	


}
