package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.EmployeeBean;

@Controller
public class MVCCRUD {
	@Autowired
	EmpJDBCController dao2;
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(EmployeeBean emp) {
		
		dao2.save1(emp);
		return "redirect:/viewemps";
	}

	@RequestMapping("/viewemps")
	public String viewemp(Model m)
	{
		
		List<EmployeeBean> list=dao2.getEmployees();
		m.addAttribute("emplist", list);
		return "viewemps";
	}
	
	@RequestMapping(value="/delete/{name}/",method=RequestMethod.GET)
public String deleteEmployee(EmployeeBean emp,@PathVariable("name") String name ) {
		emp.setDeleteEmployee(name);
		dao2.delete1(emp);
	return "redirect:/viewemps";
		
	}
	
	//DataUpdate
	@RequestMapping(value="/update" )
	public String updateEmployee(EmployeeBean emp) {
		
	return "UpdateForm";
		
	}   
	
	@RequestMapping(value="/updateData" , method=RequestMethod.GET)
	public String updateEmployeeData(EmployeeBean emp) {
		
		dao2.updateData(emp);
		System.out.println("Here");
	return "redirect:/viewemps";
		
	}   
	
}
