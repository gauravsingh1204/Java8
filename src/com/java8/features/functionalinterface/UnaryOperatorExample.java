package com.java8.features.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> upperCaseOperator = (s) -> s.toUpperCase();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using Unary opertor: "+ upperCaseOperator.apply("test"));
	}

}
