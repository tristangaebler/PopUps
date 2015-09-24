package input.controller;

import input.view.PopUpDisplay;
import input.model.Thingy;

public class InputController
{
	private PopUpDisplay myPopUp;
	private Thingy myTestThing;
	
	public InputController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		String myName = myPopUp.grabAnswer("Type in your name");
		myPopUp.showResponse("You typed in " + myName);
		
		String temp = myPopUp.grabAnswer("You typed in your age");
		int myAge;
		
		if(isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -999;
		}
		
		myPopUp.showResponse("You typed "+ myAge);
			
		String tempWeight = myPopUp.grabAnswer("You typed in your age");
		double myWeight = Double.parseDouble("Type in your weight");
		myPopUp.showResponse("You typed "+ myWeight);

		myTestThing = new Thingy(myName, myAge, myWeight);
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopUp.showResponse("not and int - bad value will be used");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopUp.showResponse("not an double - bad value will be used");
		}
		
		return isDouble;
	}
	
	
}













