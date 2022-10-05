package com.java8.features.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class PredicateAndConsumerExample {

	static Predicate<Employee> levelPredicate = (emp) -> emp.getLevel() >= 4;
	static Predicate<Employee> ctcPredicate = (emp) -> emp.getCtc() <= 55000;
	
	static BiConsumer<String, List<String>> biConsumer= (name, skills) -> System.out.println("Name: "+name+" activities: "+ skills);
	
	static Consumer<Employee> employeeConsumer = (emp) -> {
		if(levelPredicate.and(ctcPredicate).test(emp)) {
			biConsumer.accept(emp.getName(), emp.getSkills());
		}
	};
	
	//Method to print Emp name & Skills whose levle is greater than 4 and ctc is less than 55000
	private static void printEmpNameAndSkills() {
		EmployeeData.getEmployeeData().forEach(employeeConsumer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEmpNameAndSkills();
	}

}
