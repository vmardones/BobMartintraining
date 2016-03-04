package com.common;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int first = 2;
		int second = 3;
		int sum = first + second;*/
		
		int output = testloop(1);
		
		System.out.println(output);
	}
	
	public static int testloop(int input) {
		
		int counter = input;
		
		while (counter < 9) {
			counter++;
		}
		
		return counter;
	}

}
