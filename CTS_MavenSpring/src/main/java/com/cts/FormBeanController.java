package com.cts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.FormBean;

@Controller
@RequestMapping("/mainlogin")
public class FormBeanController {
	
	@RequestMapping("/callpage")
	public String disp(Model model)
	{
		FormBean res=new FormBean();
		Map<String,String> c1=new HashMap<String,String>();
		c1.put("IND", "India");
		c1.put("US","United States");
		c1.put("SG", "Singapur");
		c1.put("ML","Malaysia");
		
		model.addAttribute("countryopt", c1);
		model.addAttribute("result", res);
		
		
		return "FormLogin";}
		
		@RequestMapping("/valid")
		public String submitForm(
				
				@ModelAttribute("result12")
				FormBean res)
		{
			return "SuccessForm";
		}
		

     
}