package com.cg.project.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	 private String firstName, lastName ,empDesignation,empDepartment;
	 private double empSalary;
	 public Employee(){}
	 
	public Employee(String firstName, String lastName, String empDesignation, String empDepartment, double empSalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empDesignation = empDesignation;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public Employee(int empId, String firstName, String lastName, String empDesignation, String empDepartment,
			double empSalary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empDesignation = empDesignation;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDepartment == null) ? 0 : empDepartment.hashCode());
		result = prime * result + ((empDesignation == null) ? 0 : empDesignation.hashCode());
		result = prime * result + empId;
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", empDesignation="
				+ empDesignation + ", empDepartment=" + empDepartment + ", empSalary=" + empSalary + "]";
	}
	 
}
