package org.simplilearn.controllers;

import java.util.List;

import org.simplilearn.entities.Emp;
import org.simplilearn.services.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmpController {

	private EmpService employeeService;
	
	public EmpController(EmpService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String showHome(Model model) {
		
		List<Emp> employees = employeeService.getAll();
		model.addAttribute("emps", employees);
	    return "home";

	}
	@GetMapping("/add")
	public String showForm(Model model) {
		Emp e = new Emp();
		e.setName("Sateesh");
		e.setAddress("Bangalore");
		model.addAttribute("emp",e);
		return "emp-form";
		
	}

	@PostMapping("/processEmployee")
	public String addEmployee(@ModelAttribute("emp") Emp e) {
         employeeService.insert(e);
		return "redirect:/";
		
	}
	
}
