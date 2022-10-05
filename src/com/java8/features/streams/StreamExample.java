package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamExample {

	//return list of employee names in upper case. Use of Method Reference 
	private static void getEmployeeNamesAsList() {
		List<Employee> employeeList = EmployeeData.getEmployeeData();
		employeeList.stream() // creates a stream of employee object
			.map(Employee::getName) // creates a stream of String Object i.e. Employee Names
			.map(String::toUpperCase)//creates a stream of String object i.e. converts names into upper case
			.collect(Collectors.toList());// finally collect to return as list of String
		System.out.println("Employee Names: "+ employeeList);
	}
	
	//return list of employee names in upper case. Use of Method Reference 
		private static void getEmployeeNamesWihtoutMethodReference() {
			List<Employee> employeeList = EmployeeData.getEmployeeData();
			employeeList.stream() // creates a stream of employee object
				.map(emp -> emp.getName()) // creates a stream of String Object i.e. Employee Names
				.map(name -> name.toUpperCase())//creates a stream of String object i.e. converts names into upper case
				.collect(Collectors.toList());// finally collect to return as list of String
			System.out.println("Employee Names: "+ employeeList);
		}
	
	public static void main(String[] args) {
		getEmployeeNamesAsList();
		getEmployeeNamesWihtoutMethodReference();
	}

}
