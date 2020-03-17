package com.cts;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeValidController {
	
	
	
	@RequestMapping("/myvalid")
	public String display(Model m)
	{
		m.addAttribute("emp1",new EmployeeBeanValid());
		return "EmpValid";
		
		
	}

	
	@RequestMapping("/callvalid")
	public String submitForm(
			@Valid
			@ModelAttribute("emp1")
			EmployeeBeanValid e,
			BindingResult br
			)
	
	
	{
				if(br.hasErrors())
		return "EmpValid";
				else
					return"EmpValidSuccess";
	}
	
	
	
	
}




