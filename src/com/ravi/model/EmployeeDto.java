package com.ravi.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name =  "Employee")
public class EmployeeDto {

	@Id
	@GeneratedValue
	@Column(name="empId")
	private int empId;
	
	@Column(name =  "empName",nullable = false)
	@Pattern(regexp = "/^[a-z][a-z\\s]*$/", message ="Please Enter only Character")
	private String empName;
	
	@Column(name =  "mobileNo", length = 10)   
    @Pattern(regexp = "^[0-9]", message ="Please Enter only Number")
	private long mobileNo;
	
	@Column(name =  "emailId")
	private String emailId;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name =  "deptId")
	private DepartmentDto dept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public DepartmentDto getDept() {
		return dept;
	}

	public void setDept(DepartmentDto dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeDto [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", dept=" + dept + "]";
	}
	
}
