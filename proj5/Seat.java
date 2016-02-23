package proj5;

/**
 * <p>Title: Airline bookings software   </p>
 * <p>Description: Contains methods to initialize a seat object, reserve seats,
 *                   cancel seats, accessor methods and mutator methods.</p>
 * @author Saad Ahmad
 */

public class Seat 
{
	private String seatType;
	private  boolean seatStatus;
	private int seatNo;
	
	/**
	 * parameterized constructor
	 * initializes the variables by the values received by the parameter
	 * @param number stores the seat number received as argument
	 * @param type stores the seat type received as argument
	 */
	public Seat(int number, String type)
	{
		seatNo = number;
		seatType = type;
		seatStatus = true;
	}
	
	/**
	 * getSeatNo method
	 * sends back the seat number to the method call
	 * @return the number stored in seatNo 
	 */
	public int getSeatNo()
	{
		return seatNo;
	}
	
	/**
	 * getSeatType method
	 * sends back the class to the method call
	 * @return the type of seat stored in seatType
	 */
	public String getSeatType()
	{
		return seatType;
	}
	
	/**
	 * getSeatStatus method
	 * sends back the seat vacancy status to the method call
	 * @return the status of seat stored in seatStatus (empty or occupied)
	 */
	public boolean getSeatStatus()
	{
		return seatStatus;
	}
	
	/**
	 * reserveSeat method
	 * changes seat status to false(occupied)
	 */
	public void reserveSeat()
	{
		seatStatus = false;
	}
	
	/**
	 * cancelReservation method
	 * changes seat status back to true(empty)
	 */
	public void cancelReservation()
	{
		seatStatus = true;
	}
	
	/**
	 * toString method
	 * sends back the state of the object
	 * @return String with seat number, seat type and status.
	 */
	public String toString()
	{
		String str = ("Seat Number " + (seatNo+1) + " of " + seatType + " class" + " is ");
		if (seatStatus == true)
			str += ("empty.");
		else 
			str += ("reserved.");
		return str;
	}	
}
