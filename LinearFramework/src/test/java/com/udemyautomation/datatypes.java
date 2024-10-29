package com.udemyautomation;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array
		String [] arr = new String [5];
		arr[0] = "Monday";
		arr[1] = "Tuesday";
		arr[2] = "Wedenesday";
		arr[3] = "Thursday";
		arr[4] = "Friday";
	System.out.println(arr[4]);
		
		String [] arr2= {"Monday", "Tuesday", "Wedenesday", "Thursday", "Friday"};
		
		//for Loop	
		for (int i= 4; i<arr2.length; i--) {
				System.out.println(arr2[i]);
			
			
		}
		
		
	}
	
	

}
