package com.java8.features.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class SupplierExample {

	static Supplier<Employee> oneEmployee = () -> {
		return new Employee("Emp1",1,25000.00, "male", Arrays.asList("Java", "Python","BigData"));
	};
	
	static Supplier<List<Employee>> allEmployee = () -> {
		return EmployeeData.getEmployeeData();
	};
	
	public static void main(String[] args) {
		//getting Employee thorugh supplier
		System.out.println("Get Employee: "+ oneEmployee.get());
		//get all employee through supplier
		System.out.println("Get All Employees: "+ allEmployee.get());

	}

}
