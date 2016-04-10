package com.beans;

import java.io.Serializable;

public class EmployeeAddress implements Serializable {

	String empNo;
	int empId;
	Address addr;
	private static final long serialVersionId = 123456789;

	public EmployeeAddress(String empNo, int empId, Address addr) {
		this.empNo = empNo;
		this.empId = empId;
		this.addr = addr;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
