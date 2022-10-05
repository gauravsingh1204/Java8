package com.java8.features.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class FunctionExample {

	static Function<List<Employee>, Map<String, Double>> empFunction = ((employees) -> {
		Map<String, Double> empMap = new HashMap<>();
		employees.forEach((employee) -> {
			if(PredicateExample.ctcPredicate.test(employee)) {
			empMap.put(employee.getName(), employee.getCtc());
			}
		});
		return empMap;
	});
	
	public static void main(String[] args) {
		//using Function interface to return a map of Emp name as key and salary as value
		System.out.println(empFunction.apply(EmployeeData.getEmployeeData()));
	}

}
