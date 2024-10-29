package com.tickets;

public abstract class TicketParks {
	
	String welcomeMessage;
		//Setter
		public TicketParks() {
			this.welcomeMessage = "Welcome students - ";
		}

		//Getter
		public String welcomeMessage() {
			return this.welcomeMessage;
		}
		
		//Abstraction
		public abstract double TicketPrice();
		public abstract void printPriceDay();
		public abstract void printPriceDay(String keyManager, String priceDay);


		
		
}
