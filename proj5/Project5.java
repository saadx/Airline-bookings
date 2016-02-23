package proj5;

/**
 * <p>Title: Airline bookings software app class </p>
 * <p>Description: Displays options to reserve or cancel a seat, display a seating chart or quit booking window.
 * 					 Takes more input if needed, does the processing and displays the results.</p>
 * @author Saad Ahmad
 */

import javax.swing.JOptionPane;

public class Project5 
{
	public static void main (String args[])
	{
//		Seat p1 = new Seat(3, "first");
//		System.out.println(p1.toString());
//		System.out.println("Seat number is: " + p1.getSeatNo());
//		System.out.println("Seat type: " + p1.getSeatType());
//		System.out.println("Seat status before reserving is: " + p1.getSeatStatus());
//		p1.reserveSeat();
//		System.out.println("Seat status after reserving is: " + p1.getSeatStatus());
//		System.out.println(p1.toString());
//		p1.cancelReservation();
//		System.out.println("Seat status after canceling is: " + p1.getSeatStatus());
//		
//		Seat p2 = new Seat(5, "coach");
//		System.out.println("\n" + p2.toString());
//		System.out.println("Seat number is: " + p2.getSeatNo());
//		System.out.println("Seat type: " + p1.getSeatType());
//		System.out.println("Seat status before reserving is: " + p2.getSeatStatus());
//		p2.reserveSeat();
//		System.out.println("Sear status after reserving is: " + p2.getSeatStatus());
//		System.out.println(p2.toString());
//		p2.cancelReservation();
//		System.out.println("Seat status after canceling is: " + p2.getSeatStatus());
		
		Airplane p1 = new Airplane();
		int choice = -1;
		while (choice != 3)
		{
			String[] choices = {"Reservation", "Cancellation", "Seating chart", "QUIT"};
			choice = JOptionPane.showOptionDialog(null, "What would you like to do?", "Bookings menu", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[3]);
			if (choice == 0)
			{
				String[] classOptions = {"First Class", "Coach Class"};
				int classChoice = JOptionPane.showOptionDialog(null, "Please select class", "Class Options",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, classOptions, null);
				if (classChoice == 0)
				{
					String x = p1.reservation("first");
					JOptionPane.showMessageDialog(null, x, "Booking result", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					String x = p1.reservation("coach");
					JOptionPane.showMessageDialog(null, x, "Booking result", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
			else if (choice == 1)
			{
				String x = p1.cancellation(Integer.parseInt(JOptionPane.showInputDialog("Please enter the seat number you want to cancel reservation for")));
				JOptionPane.showMessageDialog(null, x, "Cancellation result", JOptionPane.INFORMATION_MESSAGE);
			}
			
			else if (choice == 2)
			{
				String x = p1.seatingChart();
				JOptionPane.showMessageDialog(null, x, "Seating Chart", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
