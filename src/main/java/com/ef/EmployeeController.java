package com.ef;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@RequestMapping("/hello")
	public String sayHello(ModelMap model) {
		model.addAttribute("msg", "Hello Developer Welcome to mvc");
		return "hello";
	}
	
	@RequestMapping("/signUpPage")
	public String redirectToViewPage1(Model model) {
		model.addAttribute("command",new Employee());
		return "viewPage1";
	}
	@RequestMapping(value="/Register",method=RequestMethod.POST)
	public String registerEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println("Employee= "+employee.getId()+" and " +employee.getName());
		return "viewEmployees";
	}
	
	@RequestMapping("/loginUpPage")
	public String redirectToViewPage2(ModelMap model) {
		return "viewPage2";
}
	@RequestMapping("/viewRecordsPage")
	public String redirectToViewPage3(ModelMap model) {
		return "viewPage3";
}
}