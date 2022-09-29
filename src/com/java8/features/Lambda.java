package com.java8.features;

public class Lambda {

	public static void main(String[] args) {
		
		//Implementing Runnable through legacy
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Legacy Thread");
				
			}
		}).start();
		
		//Implementing Runnable using lambda
		new Thread(() -> System.out.println("Inside Lambda thread")).start();

	}

}
