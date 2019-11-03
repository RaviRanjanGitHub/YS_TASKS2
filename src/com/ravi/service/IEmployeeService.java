package com.ravi.service;

import com.ravi.model.EmployeeDto;

public interface IEmployeeService {

	public EmployeeDto saveEmp(EmployeeDto emp);
	
	public EmployeeDto updateEmp(EmployeeDto emp);
	
	public EmployeeDto deleteEmp(EmployeeDto emp);
	
	public EmployeeDto getEmpById(int empId);
	
}
