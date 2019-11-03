package com.ravi.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ravi.dao.IEmployeeDao;
import com.ravi.model.EmployeeDto;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public EmployeeDto saveEmp(EmployeeDto emp) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(emp);
		return emp;
	}

	@Override
	public EmployeeDto updateEmp(EmployeeDto emp) {
		Session currentsession = sessionFactory.getCurrentSession();
		currentsession.saveOrUpdate(emp);
		return emp;
	}

	@Override
	public EmployeeDto deleteEmp(EmployeeDto emp) {
		EmployeeDto empDto = (EmployeeDto) sessionFactory.getCurrentSession().load(EmployeeDto.class, emp.getEmpId());
		
		if (empDto!=null) {
			this.sessionFactory.getCurrentSession().delete(empDto);
			
		}
		return empDto;
	}

	@Override
	public EmployeeDto getEmpById(int empId) {
		return (EmployeeDto) sessionFactory.getCurrentSession().get(
				EmployeeDto.class, empId);
	}

}
