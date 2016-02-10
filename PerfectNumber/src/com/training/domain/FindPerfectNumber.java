package com.training.domain;

public class FindPerfectNumber {

	private int number;
	
	
	public FindPerfectNumber(int number) {
		super();
		this.number = number;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public boolean isPerfect() {
		
		int sum = 0;
		boolean returnValue;
		
		for(int i= 1; i <= number/2; i++) {
			
			if(number % i == 0)
				sum+= i;
		}
		
		if(sum == number)
			returnValue = true;
		else
			returnValue = false;
		
		return returnValue;
	}
	
	
}
