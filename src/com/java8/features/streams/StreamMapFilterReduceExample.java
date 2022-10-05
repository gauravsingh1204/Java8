package com.java8.features.streams;

import java.util.Optional;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamMapFilterReduceExample {
	
	//get employee with maximum salary
	private static Optional<Double> getEmployeeWithMinimumCtc() {
		return EmployeeData.getEmployeeData().stream()
				.filter((emp) -> emp.getGender().equalsIgnoreCase("male"))
				.map(emp -> emp.getCtc())
				.reduce((a,b) -> a<b?a:b);
	}
	
//get employee with maximum salary with match operations
	private static boolean anyMaleEmployee() {
		return EmployeeData.getEmployeeData().stream()
				.anyMatch((emp) -> emp.getGender().equalsIgnoreCase("male"));		
	}
	
//get employee with maximum salary with match operations
	private static Optional<Employee> findFirstMaleEmployee() {
		return EmployeeData.getEmployeeData().stream()
				.filter((emp) -> emp.getGender().equalsIgnoreCase("male"))
				.findFirst();		
	}	
		
	public static void main(String[] args) {
		Optional<Double> minCtc = getEmployeeWithMinimumCtc();
		if(minCtc.isPresent()) {
			System.out.println(minCtc.get());
		}
	}
}
