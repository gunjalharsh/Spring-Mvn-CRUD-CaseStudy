package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterController {
	@RequestMapping(value="/useri18n_hello",method=RequestMethod.GET)
			public ModelAndView initView()
			{
		
			ModelAndView mv=new ModelAndView();
			mv.addObject("harshal", "Welcome to internationalization Example with spring and maven");
			mv.setViewName("ResourceBundleView");
				return mv;
		
		
			}

}
