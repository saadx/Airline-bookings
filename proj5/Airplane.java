package proj5;

/**
 * <p>Title: Airline bookings software   </p>
 * <p>Description: Contains methods to initialize an airplane object, reserve seats,
 *                   cancel seats, and generate seating chart.</p>
 * @author Saad Ahmad
 */

public class Airplane 
{
	private Seat[] seats;
	
	/**
	 * default constructor
	 * initializes array of 10 elements and initializes each element using the
	 * parameterized constructor of Seat class
	 */
	public Airplane()
	{
		seats = new Seat[10];
		for (int i = 0; i < seats.length; i++)
		{
			if (i < 4)
				seats[i] = new Seat(i, "first");
			else
				seats[i] = new Seat(i, "coach");
		}
	}
	
	/**
	 * reservation method
	 * @param String seatClass - class to reserve the seat in.
	 * @return String telling whether reservation was successful or not.
	 */
	public String reservation(String seatClass)
	{
		int i=0;
		while (i < seats.length)
		{
			if ((seats[i].getSeatType() == seatClass) && (seats[i].getSeatStatus() == true)) 
			{
				seats[i].reserveSeat();
				return seats[i].toString();
			}
			i++;
		}
		return "No seats available in the selected class";
	}
	
	/**
	 * Cancellation method
	 * @param int num - seat number to cancel the reservation.
	 * @return the status of seat stored in seatStatus (empty or occupied)
	 */
	public String cancellation(int num)
	{
		if (seats[num-1].getSeatStatus() == false)
		{
			seats[num-1].cancelReservation();
			return "Reservation Canceled";
		}
		else
			return "The seat number you entered is not reserved. Please enter a reserved seat number to cancel.";
	}
	
	/**
	 * seatingChart method
	 * @return String containing the status of each object 
	 * 			whose address is stored in the corresponding element of array.
	 */
	public String seatingChart()
	{
		String str = "";
		for (int i = 0; i < seats.length; i++)
		{
			str += seats[i].toString() + "\n";
		}
		return str;
	}
}
