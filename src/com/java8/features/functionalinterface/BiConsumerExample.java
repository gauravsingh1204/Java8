package com.java8.features.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.java8.features.data.EmployeeData;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEmployeeNameWithSkilss();
		
	}

	private static void printEmployeeNameWithSkilss() {
		BiConsumer<String, List<String>> biConsumer= (name, skills) -> System.out.println("Name: "+name+" activities: "+ skills);
		
		EmployeeData.getEmployeeData().forEach((employee) -> biConsumer.accept(employee.getName(), employee.getSkills()));
	}
}
