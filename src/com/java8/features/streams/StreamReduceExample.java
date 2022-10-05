package com.java8.features.streams;

import java.util.Optional;

import com.java8.features.data.Employee;
import com.java8.features.data.EmployeeData;

public class StreamReduceExample {

	//get total of ctc of all employee
	private static Optional<Double> getTotalCtcOfEmployees() {
		return EmployeeData.getEmployeeData().stream()
				.map((emp) -> emp.getCtc())
				.reduce((prevCtc, nextCtc) -> prevCtc+nextCtc);
	}
	
	//get employee with maximum salary
	private static Optional<Employee> getEmployeeWithmaximumCtc() {
		return EmployeeData.getEmployeeData().stream()
				.reduce((emp1, emp2) -> {
					if(emp1.getCtc() > emp2.getCtc()) {
						return emp1;
					}
						else
							return emp2;
					}
				);
	}
	
	public static void main(String[] args) {
		Optional<Double> totalCtc = getTotalCtcOfEmployees();
		if(totalCtc.isPresent()) 
			System.out.println(totalCtc.get());
		Optional<Employee> empWithMaxCtc = getEmployeeWithmaximumCtc();
		if(empWithMaxCtc.isPresent()) {
			System.out.println(empWithMaxCtc.get().getName());
		}
	}

}
