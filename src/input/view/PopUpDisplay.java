package input.view;

import javax.swing.JOptionPane;
/**
 * A popup display class used for showing input and output.
 * @author Tristan Gaebler
 * @version 1.0 9/24/15
 *
 */
public class PopUpDisplay
{
	/**
	 * Displays the supplied text as a popup window.
	 * @param wordsFromSomewhere The text to be displayed.
	 */
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	/**
	 * Displays a pop up with the supplied String parameter with a field to type in a response.
	 * It returns the answer to the supplied question as a String. 
	 * @param stuff A question to be displayed in the pop up window. 
	 * @return The users input as a string data type.
	 */
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
