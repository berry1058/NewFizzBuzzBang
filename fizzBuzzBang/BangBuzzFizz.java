package com.fizzBuzzBang;

public class BangBuzzFizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<110; i++){
			BuzzBangFizz(i);
			
		}
	}
	
	



public static String BuzzBangFizz(int i) {
	String h = null;
	if( (i % 105) == 0){
		
		h = "Fizz";
		
	}if((i%35)==0){
		h = "Buzz";
		System.out.println(h);
	}if((i%21)==0){
		h = "Bang";
		System.out.println(h);
	}if((i%15)==0){
		h = "FizzBuzz";
		System.out.println(h);
	}if((i%7)==0){
		h = "FizzBang";
		System.out.println(h);
	}if((i%5)==0){
		h = "BuzzBang";
		System.out.println(h);
	}if((i%3)==0){
		h = "FizzBuzzBang";
		System.out.println(h);
	}
	return h;
}
}
