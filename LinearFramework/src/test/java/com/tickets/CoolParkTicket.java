package com.tickets;

public class CoolParkTicket extends TicketParks{
	
	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	//Constructor
	public CoolParkTicket(double price, int personAge, boolean studentID) {
		super();
		adultTicket = price;
		childTicket = price * (.80);
		studentTicket = price * (.50);
		age = personAge;
		student = studentID;
		park = "Cool Park | ";
		priceDay = "Normal Day Price";
	}
	
	//Encapsulation
		//Setter
		private void setPriceDay(String priceDay) {
			this.priceDay = priceDay;			
		}
		//Getter
		private String getPriceDay(String priceDay) {
			return priceDay;		
		}
	
	//Methods
		//Ticket
		@Override
		public double TicketPrice() {
			double priceTicket;
			if(student ==true) {
				priceTicket = studentTicket;
				System.out.println("Student price (50% applied): $"+studentTicket);
			}else if(age>=18) {
				priceTicket = adultTicket;
				System.out.println("Adult Price: $"+adultTicket);
			}else{
				priceTicket = childTicket;
				System.out.println("child Price (20% applied): $"+childTicket);
			}
			return priceTicket;
		}
	//Overloading
		//Print
		@Override
		public void printPriceDay() {
			System.out.println(welcomeMessage()+park+getPriceDay(priceDay));
		}
		//Print
		@Override
		public void printPriceDay(String keyManager, String priceDay) {
			setPriceDay(priceDay);
			System.out.println(welcomeMessage()+park+getPriceDay(priceDay));
		}
}
