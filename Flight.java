package practicalTenFlightControl;

public class Flight {

	/*
	 * instance vars
	 */
	private String flightNumber;
	private String destination;
	private String origin;

	private double duration;

	/*
	 * default constructor
	 * 
	 */
	public Flight() {

	}

	/**
	 * constructor with arguments
	 * 
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.setDuration(duration);
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set. Duration needs to be less than 18hrs
	 */
	public void setDuration(double duration) {
		if (duration >= 18.00) {
			System.out.println("If duration exceeds maximm flying time allowance (<=18hrs), it will be set to 0.0\n");
			this.duration = 0.0;
		} else {
			
			this.duration = duration;
		}
	}

	/*
	 * ( method to display all information regarding flight details
	 */
	@Override
	public String toString() {
		return "Flight [flightNumber=" + this.flightNumber + ", destination=" + this.destination + ", origin="
				+ this.origin + ", duration=" + this.duration + "]";
	}

}
