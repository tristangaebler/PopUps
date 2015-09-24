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
	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
		JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
}
