import java.util.*;

class FlightBooking{
	
	
	public static void main(String[] args ){
		Scanner scan = new Scanner(System.in);
		
		FlightCustomer customer1 = new FlightCustomer("Divyannshu","3126578394",4200);
		FlightCustomer customer2 = new FlightCustomer("Daniel","312746827",3600);

		System.out.println("---------------- Enter your Flight Details Here ------------------");
		
		System.out.print("Enter Airline: ");
		String airline = scan.nextLine();
		
		System.out.print("Enter Destination City: ");
		String desCity = scan.nextLine();
		
		System.out.print("Enter Departure City: ");
		String depCity = scan.nextLine();
		
		System.out.print("Enter Flight Number: ");
		int FlightNumber = scan.nextInt();
		
		System.out.print("Enter Price: ");
		double price = scan.nextDouble();
		
		scan.close();
		
		Flight flight1 = new Flight(FlightNumber,price,airline,depCity,desCity);
		
		Flight flight2 = new Flight(FlightNumber,price,airline,depCity,desCity);
		
		customer1.updateMileage(flight2.getPrice());
		
		flight1.pricingMethod(20);
		
	
		
	}
		
}

