package com.java8.features.data.functionalinterface;

import java.util.function.Consumer;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class ConsumerExample {

	private static Consumer<Employee> emp = (emp) -> System.out.println(emp);
	private static Consumer<Employee> empName = (emp) -> System.out.println(emp.getName());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEmployeeName();
		printAllEmployee();
		printEmployeeUsingCondition();
		
	}
	
	static void printAllEmployee() {
		System.out.println("Inside print all employees");
		EmployeeData.getEmployeeData().forEach(emp);
	}
	
	static void printEmployeeName() {
		System.out.println("Inside print Employee names");
		EmployeeData.getEmployeeData().forEach(empName);
	}

	static void printEmployeeUsingCondition() {
		System.out.println("Inside print Empoyee using condition");
		EmployeeData.getEmployeeData().forEach((employee) -> {
			if(employee.getGender().equalsIgnoreCase("male")) { 
				emp.andThen(empName).accept(employee);				
			}
		});
	}

}
