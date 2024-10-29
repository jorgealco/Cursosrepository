package com.tickets;

public class TicketDesk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioCoolPark = 100;
		double precioTesterPark = 100;
		int age = 17;
		boolean student = true;
		
		CoolParkTicket coolPark = new CoolParkTicket(precioCoolPark,age,student);
		coolPark.printPriceDay("xyz","Hola mundo");
		double priceCoolTicket = coolPark.TicketPrice();
		System.out.println();
		
		TesterParkTicket testerPark = new TesterParkTicket(precioTesterPark,age,student,10);
		testerPark.printPriceDay();
		double priceTesterTicket = testerPark.TicketPrice();

		System.out.println("Total Tickets: "+sumTicketsPark(priceCoolTicket,priceTesterTicket));

//		TicketParks ticket = new CoolParkTicket(precioCoolPark,19,false);
//		ticket.TicketPrice();
//		ticket.printPriceDay();
//		
//		System.out.println();
//		
//		ticket = new TesterParkTicket(precioTesterPark,19, false);
//		ticket.TicketPrice();
//		ticket.printPriceDay("xyZ", "overloading method");
		
		
	
	}
	public static double sumTicketsPark(double park1, double park2) {
		return park1+park2;
	}

}
