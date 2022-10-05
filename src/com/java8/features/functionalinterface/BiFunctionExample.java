package com.java8.features.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class BiFunctionExample {

	static BiFunction<List<Employee>, Predicate<Employee>, Map<String, Double>> empBiFunction = ((employees,empPredicate) -> {
		Map<String, Double> empMap = new HashMap<>();
		employees.forEach((employee) -> {
			if(empPredicate.test(employee)) {
			empMap.put(employee.getName(), employee.getCtc());
			}
		});
		return empMap;
	});
	
	public static void main(String[] args) {
		//use of BiFunction wherein we are passing list of employee and a predicate to filter the employees and return a map
		System.out.println(empBiFunction.apply(EmployeeData.getEmployeeData(), PredicateExample.levelPredicate));
	}

}
