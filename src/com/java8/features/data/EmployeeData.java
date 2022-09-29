package com.java8.features.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
	
	public static List<Employee> getEmployeeData() {
		
		Employee emp1 = new Employee("Emp1","c1",25000.00, "male", Arrays.asList("Java", "Python","BigData"));
		Employee emp2 = new Employee("Emp2","c2",35000.00, "female", Arrays.asList("BA", "Python"));
		Employee emp3 = new Employee("Emp3","c3",45000.00, "male", Arrays.asList("Java", "spark","BigData"));
		Employee emp4 = new Employee("Emp4","c4",55000.00, "female", Arrays.asList("Java", "linux'","BigData"));
		Employee emp5 = new Employee("Emp5","c5",65000.00, "male", Arrays.asList("BigData"));
		Employee emp6 = new Employee("Emp6","c6",75000.00, "female", Arrays.asList("Java","sql"));
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
		return empList;
	}

}
