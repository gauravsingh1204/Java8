package com.java8.features.functionalinterface;

import java.util.function.Predicate;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class PredicateExample {

	static Predicate<Employee> levelPredicate = (emp) -> emp.getLevel() >= 4;
	static Predicate<Employee> ctcPredicate = (emp) -> emp.getCtc() <= 55000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filterEmployeewithLevel();
		filterEmployeewithSalary();
		filterEmployee();
	}
	
	private static void filterEmployee() {
		System.out.println("Inside Filter Employee");
		EmployeeData.getEmployeeData().forEach((employee) -> {
			if(levelPredicate.and(ctcPredicate).negate().test(employee)) {
				System.out.println(employee);
			}
		});
	}
	
	//filter employee with level greater than 4
	private static void filterEmployeewithLevel() {
		System.out.println("Inside Filter Employee with level");
		EmployeeData.getEmployeeData().forEach((employee) -> {
			if(levelPredicate.test(employee)) {
				System.out.println(employee);
			}
		});
	}
	
	//filter employee with salary less than 55000
	private static void filterEmployeewithSalary() {
		System.out.println("Inside Filter Employee with Salary");
		EmployeeData.getEmployeeData().forEach((employee) -> {
			if(ctcPredicate.test(employee)) {
				System.out.println(employee);
			}
		});
	}
}
