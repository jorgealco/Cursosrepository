package com.java;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arreglo Unidimensional
		
//		String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
//		System.out.println(dias[3]);
//		
//		for (int i= 0; i< 7; i++) {
//			System.out.println("Dia: "+dias[i]);
//		}
//		
//		int [] arr3 = {1,2,3,4,5,6,7,8,9,10};
	//	
//		for (int i=9; i<arr3.length; i--) {
//			if(arr3[i]%2==0) {
//				System.out.println( arr3[i]);
//				
//			}
//		 }
		//Array with for
//		int [] numbers  = {5,10,85, 39,71,35};
//		System.out.println("First Element: " +numbers[0]);
//		System.out.println("Last  Element: " +numbers[numbers.length-1]);
//		System.out.println("Total de elementos: "+numbers.length);
//			for(int i=numbers.length - 1; i>0; i--) {
//				System.out.println("Descendant order: "+numbers[i]);
//			}
//			for(int i=0; i<=5; i++) {
//			System.out.println("Ascendente order: "+numbers[i]);
//		}
		// Array List
		
//		ArrayList <String>test = new ArrayList<String>();
//		test.add("G Dawg");
//		test.add("Postman");
//		test.add("API");
//		test.add("selenium");
//		System.out.println(test.get(2));
//		
//		for(int i=0; i<test.size(); i++) {
//			System.out.println(test.get(i));
//		}
//		System.out.println("****************");
//		for( String val:test) {
//			System.out.println(val);
//		}
//		/// item is present in Array List
//		System.out.println("El Valor G Dwag esta presente: "+test.contains("G Dawg"));
		
		//Break white spaces
		String s = "Rahul Shetty Academy";
		String [] test = s.split(" ");
//		for(int i=0; i<test.length; i++) {
//			System.out.println(test[i]);
//		}
		
		//Delimiter a value 
		//trim is used to delete the blanck spaces on the left or right 
//		for(int i=0; i<s.length(); i++) {
//			System.out.println(test[i].trim());
//		}
		//Print each single String Character from the Object
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		} 
}

}
