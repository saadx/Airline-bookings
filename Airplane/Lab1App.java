package CSC130_Airplane;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

/**
 * <p>Title: Lab #1</p>
 *
 * <p>Description: The application class is responsible for creating an Airplane object. The
 * user is presented with options to reserve a seat, cancel a seat and to display the current
 * status of the seats on the plane.  The user is given the option to continue processing
 * requests until he/she chooses to quit.</p>
 *
 * @author Saad Ahmad & Austin Joseph
 */
public class Lab1App
{
	public static void main(String[] args)
	{
		Airplane thePlane = new Airplane();
		String[] choices = {"Request First Class Seat", "Request Coach Seat", "Cancel Reservation", "View Seating Chart", "Quit"};

		int choice = JOptionPane.showOptionDialog(null,
				"Enter your choice...", 			//text displayed in the window
				"Reservation System Menu",          //text displayed in the window's title bar
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				choices,                			//text to be displayed in each button
				choices[0]);            			//default button

		while (choice != 4)
		{
			switch (choice)
			{
			case 0:
				thePlane.assignFirstClass();
				break;
			case 1:
				thePlane.assignCoachClass();
				break;
			case 2:
				thePlane.cancelSeat();
				break;
			case 3:
				JTextArea text = new JTextArea(20,30);
				JScrollPane scroll = new JScrollPane(text);
				text.setText(thePlane.toString());
				JOptionPane.showMessageDialog(
						null,
						scroll,
						"Seat Assignments",
						JOptionPane.DEFAULT_OPTION);
			}

			choice = JOptionPane.showOptionDialog(null,
					"Enter your choice...", 			//text displayed in the window
					"Reservation System Menu",          //text displayed in the window's title bar
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					choices,                			//text to be displayed in each button
					choices[0]);            			//default button

		} //end while
	} //end main
} //end Lab1App
