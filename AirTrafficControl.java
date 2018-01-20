/**
 * 
 */
package practicalTenFlightControl;

/**
 * @author Ciaran
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// instantiation of the flight class, creating new objects
		Flight Flight1 = new Flight("EZY3214", "Belfast", "Amsterdam", 2.2);
		Flight Flight2 = new Flight("BA127", "London", "Cape Town", 11.5);
		Flight Flight3 = new Flight("AE999", "Dublin", "New York", 7.5);
		Flight Flight4 = new Flight("AA678", "Dublin", "Newark", 8.5);
		Flight Flight5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

		// accessing the details of each object through the toString method
		/*
		 * System.out.println(Flight1.toString());
		 * System.out.println(Flight2.toString());
		 * System.out.println(Flight3.toString());
		 * System.out.println(Flight4.toString());
		 */

		// storing method details in an array
		Flight[] flights = { Flight1, Flight2, Flight3, Flight4, Flight5 };

		// invoking the methods
		arrayOutputFlightDetails(flights);
		longestFlight(flights);
		dublinFlights(flights);

	}

	/*
	 * method using array for outputting flight details
	 */
	public static void arrayOutputFlightDetails(Flight[] flights) {

		for (int loop = 0; loop < flights.length; loop++) {
			System.out.println(flights[loop].toString());
		}

	}

	/*
	 * method to find the longest flight
	 */
	public static void longestFlight(Flight[] flights) {

		double longestFlight = flights[0].getDuration();

		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDuration() > longestFlight) {
				// new longest duration flight found
				longestFlight = flights[loop].getDuration();
			}
		}
		System.out.println("\nUsing the for loop, the longest flight duration is : " + longestFlight + " hours.");

		for (Flight flight : flights) {

			if (flight.getDuration() > longestFlight) {
				longestFlight = flight.getDuration();
			}
		}
		System.out.println("Using the foreach loop, the longest flight is " + longestFlight + " hours.\n");
	}

	/*
	 * method to display the flight numbers that have Dublin as their destination.
	 */
	public static void dublinFlights(Flight[] myArray) {

		String destination = "Dublin";

		for (int loop = 0; loop < myArray.length; loop++) {
			if (myArray[loop].getDestination().equalsIgnoreCase(destination)) {
				System.out.println("Using the for loop, the flight numbers are " + myArray[loop].getFlightNumber());
			}
		}

		for (Flight flight : myArray) {
			if (flight.getDestination().equalsIgnoreCase(destination)) {
				System.out.println("Using the foreach loop, the flight numbers are " + flight.getFlightNumber());
			}

		}

	}
}
