package com.employee_application.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee_application.entities.Employee;
import com.employee_application.repositories.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepo;
	@RequestMapping("/show")
	public String show() {
		return "login";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("employee")Employee emp,ModelMap model) {
		model.addAttribute("msg", "employee details are saved!!");
		employeeRepo.save(emp);
		return "login";
	}
	@RequestMapping("/listall")
	public String showallEmps(ModelMap model) {
		List<Employee> employees = employeeRepo.findAll();
		model.addAttribute("employees", employees);
		return"listall";
	}
	@RequestMapping("/deleteById")
	public String deleteById(@RequestParam("id")long id,ModelMap model) {
		employeeRepo.deleteById(id);
		List<Employee> employees = employeeRepo.findAll();
		model.addAttribute("employees", employees);
		return"listall";
	}
	@RequestMapping("/updateById")
	public String updateById(@RequestParam("id")long id,ModelMap model) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		model.addAttribute("employee",employee);
		return"update";
	}
	@RequestMapping("/update")
	public String updateEmployee(@ModelAttribute("employee")Employee employee,ModelMap model) {
		employeeRepo.save(employee);
		List<Employee> employees = employeeRepo.findAll();
		model.addAttribute("employees", employees);
		return"listall";
	}
}
