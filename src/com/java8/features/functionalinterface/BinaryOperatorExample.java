package com.java8.features.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	static BinaryOperator<Integer> additionOperator = (a,b) -> a+b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using additional opertor: "+ additionOperator.apply(10, 20));
		
		//using maxBy function from BinaryOperator
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("MaxBy result: "+ maxBy.apply(10, 20));
		
		//using minBy function from BinaryOperator
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("MinBy result: "+ minBy.apply(10, 20));
	}
}
