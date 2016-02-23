package CSC130_Airplane;

/**
 * <p>Title: Lab #1</p>
 *
 * <p>Description: Seat Class - An object of type Seat contains a 
 * seat number, a seat type and a variable that keeps track of whether
 * the seat is empty. The class defines methods to get the seat number 
 * and type, assign or cancel a seat, to determine whether the seat is 
 * empty and a toString method which allows the user to see the current
 * state of the seat.</p>
 *
 * @author Saad Ahmad & Austin 
 */
public class Seat
{
	private String seatType;
	private boolean empty;
	private int seatNumber;

	/**
	 * default constructor -- The seat is given a number and a type based
	 * upon the arguments sent. By default the seat is empty.
	 * @param sType - The type of this seat (first or coach)
	 * @param sNum - The number for this seat
	 */
	public Seat(String sType, int sNum)
	{
		seatType = sType;
		empty = true;
		seatNumber = sNum;
	}

	/**
	 * getSeatNumber --
	 * Returns the number of this seat.
	 * @return the seat number stored in the instance variable seatNumber
	 */
	public int getSeatNumber()
	{
		return seatNumber;
	}

	/**
	 * getSeatType --
	 * Returns the type of this seat (first or coach).
	 * @return the seat type stored in the instance variable seatType
	 */
	public String getSeatType()
	{
		return seatType;
	}

	/**
	 * assignSeat --
	 * Marks the seat as occupied.
	 */
	public void assignSeat()
	{
		empty = false;
	}

	/**
	 * cancelSeat --
	 * Marks the seat as empty.
	 */
	public void cancelSeat()
	{
		empty = true;
	}

	/**
	 * isEmpty --
	 * Determines whether the seat is empty or occupied.
	 * @return true if the seat is empty; false if it is occupied
	 */
	public boolean isEmpty()
	{
		return empty;
	}

	/**
	 * toString --
	 * Returns a string representing the current state of the seat.
	 */
	public String toString()
	{
		return "Seat type: " + seatType + "\n" +
				"Seat number: " + seatNumber + "\n" +
				"Occupied: " + !empty;
	}
}

