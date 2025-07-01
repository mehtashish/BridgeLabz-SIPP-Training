package flight;

public class FlightBookingSystem {
	static String[] source = { "New Delhi", "Lucknow", "Bareilly", "Mumbai" };
	static String[] destination = { "Kolkata", "Chennai", "Pune", "Bhopal" };

	String passengerName;
	String goingFrom, goingTo;

	private boolean isValidRoute(String from, String to) {
		boolean sourceAvailable = false;
		boolean destinatioAvailable = false;

		for (String s : source) {
			if (s.equalsIgnoreCase(from)) {
				sourceAvailable = true;
				break;
			}
		}
		for (String d : destination) {
			if (d.equalsIgnoreCase(to)) {
				destinatioAvailable = true;
				break;
			}
		}
		return sourceAvailable && destinatioAvailable;
	}

	public void flightSearch(String goingFrom, String goingTo) {
		if (isValidRoute(goingFrom, goingTo)) {
			System.out.println("Flights available from " + goingFrom + " to " + goingTo);
		} else {
			System.out.println("No flights available from " + goingFrom + " to " + goingTo);
		}
	}

	public void flightBook(String passengerName, String goingFrom, String goingTo) {
		if (isValidRoute(goingFrom, goingTo)) {
			this.passengerName = passengerName;
			this.goingFrom = goingFrom;
			this.goingTo = goingTo;
			System.out.println("Flight booked for " + passengerName + " from " + goingFrom + " to " + goingTo);
		} else {
			System.out.println("No such route available!");
		}
	}
}
