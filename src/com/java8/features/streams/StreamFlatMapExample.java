package com.java8.features.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamFlatMapExample {

	private static void printAllEmployeeSkills() {
		System.out.println("inside all Employee Skills");
		List<String> empSkills = EmployeeData.getEmployeeData().stream() //gets stream of Employee objects
								.map(Employee::getSkills) // converts Employee object to List of String(Skills)
								.flatMap(skill -> skill.stream())//converts list of string to stream of String object
								.collect(Collectors.toList()); // collects the stream of String object into set 
		System.out.println("Employee Skills : "+ empSkills);
	}
	
	private static void printDistinctEmployeeSkills() {
		System.out.println("inside distinct Employee Skills");
		List<String> empSkills = EmployeeData.getEmployeeData().stream() //gets stream of Employee objects
								.map(Employee::getSkills) // converts Employee object to List of String(Skills)
								.flatMap(skill -> skill.stream())//converts list of string to stream of String object
								.distinct() // removes the duplicate values from the streams
								.collect(Collectors.toList()); // collects the stream of String object into set 
		System.out.println("Employee Skills : "+ empSkills);
	}
	
	private static void printTotalEmployeeSkills() {
		System.out.println("inside Employee Skills Count");
		Long empSkillsCount = EmployeeData.getEmployeeData().stream() //gets stream of Employee objects
								.map(Employee::getSkills) // converts Employee object to List of String(Skills)
								.flatMap(skill -> skill.stream())//converts list of string to stream of String object
								.distinct() // removes the duplicate values from the streams
								.count(); //return the distinct skill count
		System.out.println("Employee Skills Count : "+ empSkillsCount);
	}
	
	private static void printSortedEmployeeSkills() {
		System.out.println("inside Employee Skills Count");
		List<String> sortedEmpSkills = EmployeeData.getEmployeeData().stream() //gets stream of Employee objects
				.map(Employee::getSkills) // converts Employee object to List of String(Skills)
				.flatMap(skill -> skill.stream())//converts list of string to stream of String object
				.distinct() // removes the duplicate values from the streams
				.sorted() // this will sort in default ascending order
				.collect(Collectors.toList()); // collects the stream of String object into set 
		System.out.println("Sorted Employee Skills : "+ sortedEmpSkills);
	}
	
	
	public static void main(String[] args) {
		printAllEmployeeSkills();
		printDistinctEmployeeSkills();
		printTotalEmployeeSkills();
		printSortedEmployeeSkills();
	}
}
