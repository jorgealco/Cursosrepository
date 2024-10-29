package com.udemyautomation;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		System.out.println(d.getData());
		System.out.println("************");
		getData2();
		System.out.println("************");
		System.out.println(getData2());
		System.out.println("************");
		
		System.out.println("El resultado de la suma es: "+suma(1,2,4));
	}
	
	public static String getData2() {
		System.out.println("Bye World");
		return "G Dawg";
}
	public static boolean suma(int a, int b, int c) {
		if(a+b==c) {
			System.out.println(+a+ " + "+b+" = "+c);
			return true;
		}else {
			System.out.println(+a+ " + "+b+" = "+c);
			return false;
		}
	}
}
