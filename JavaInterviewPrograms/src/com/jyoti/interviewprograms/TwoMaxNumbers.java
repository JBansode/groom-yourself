package com.jyoti.interviewprograms;

public class TwoMaxNumbers {
	
	void getTwoMaxNumbers(int[] numbers){
		
		int maxTwo = 0;
		int maxOne = 0;
		
		for(int n : numbers){
			
			if(maxOne < n){
				maxTwo = maxOne;
				maxOne = n;
			}else if(maxTwo < n){
				maxTwo = n;
			}
		}
		System.out.println("max one: "+maxOne);
		System.out.println("max two: "+maxTwo);
		
	}

	public static void main(String[] args) {

		int[] numbers = {1,5,6,4};
		
		TwoMaxNumbers maxNumbers = new TwoMaxNumbers();
		maxNumbers.getTwoMaxNumbers(numbers);
		
		
	}

}
