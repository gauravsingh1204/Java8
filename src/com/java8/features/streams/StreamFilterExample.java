package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamFilterExample {

	//filter employee using level
	private static void filterEmployeeByLevel() {
		List<Employee> empFilteredList = EmployeeData.getEmployeeData()
										.stream()
										.filter((emp) -> emp.getLevel()>=3)
										.collect(Collectors.toList());
		System.out.println("Filtered Emp List: "+ empFilteredList);
	}
	
	
	public static void main(String[] args) {
		filterEmployeeByLevel();

	}

}
