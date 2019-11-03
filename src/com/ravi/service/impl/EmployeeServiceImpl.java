package com.ravi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.dao.IEmployeeDao;
import com.ravi.model.EmployeeDto;
import com.ravi.service.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	
	@Override
	public EmployeeDto saveEmp(EmployeeDto emp) {
		return dao.saveEmp(emp);
	}

	@Override
	public EmployeeDto updateEmp(EmployeeDto emp) {
		return dao.updateEmp(emp);
	}

	@Override
	public EmployeeDto deleteEmp(EmployeeDto emp) {
	  return dao.deleteEmp(emp);
	}

	@Override
	public EmployeeDto getEmpById(int empId) {
		return dao.getEmpById(empId);
	}

}
