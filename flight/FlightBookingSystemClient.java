package flight;

public class FlightBookingSystemClient {
	public static void main(String[] args) {
		FlightBookingSystem book = new FlightBookingSystem();
		book.flightSearch("lucknow", "chennai");
		book.flightBook("Ashish", "lucknow", "chennai");
	}
}