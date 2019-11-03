package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.model.EmployeeDto;
import com.ravi.service.IEmployeeService;

@RestController
@RequestMapping("/rest")
public class EmployeeConroller {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/save")
	public EmployeeDto saveEmp(@RequestBody EmployeeDto emp) {
		return service.saveEmp(emp);
	}
	@PostMapping("/update")
	public EmployeeDto updateEmp(@RequestBody EmployeeDto emp) {
		return service.updateEmp(emp);
	}
	@PostMapping("/delete")
	public EmployeeDto deleteEmp(@RequestBody EmployeeDto emp) {
		return service.deleteEmp(emp);
	}
	@GetMapping("/getemp/{empId}")
	public EmployeeDto getEmpById(@PathVariable int empId) {
		return service.getEmpById(empId);
	}
}