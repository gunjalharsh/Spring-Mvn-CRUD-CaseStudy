package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class modelAndViewController {
@RequestMapping(value="/modview",method=RequestMethod.GET)
public ModelAndView getdata() {
	List<String> list=getList();
	ModelAndView m1=new ModelAndView("modelview");
	m1.addObject("lists",list);
	return m1;
	
	
}
private List<String> getList()
{
	
	List<String> list=new ArrayList<String>();
	list.add("Java");
	list.add("Python");
	list.add("Angular");
	list.add("Express Framework");
	list.add("Swagger tool");
	
	return list;
}
}
