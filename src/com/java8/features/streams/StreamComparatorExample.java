package com.java8.features.streams;

import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamComparatorExample {

	private static List<Employee> sortEmployeeByName(){
		return EmployeeData.getEmployeeData()
				.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
	}
	
	private static List<Employee> sortEmployeeByNameDesc(){
		return EmployeeData.getEmployeeData()
				.stream()
				.sorted(Comparator.comparing(Employee::getName).reversed()) // this will sort in reverse order
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		sortEmployeeByName().forEach(emp -> System.out.println(emp));;
		sortEmployeeByNameDesc().forEach(System.out::println);;
	}

}
