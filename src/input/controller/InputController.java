package input.controller;

import input.view.PopUpDisplay;

public class InputController
{
	private PopUpDisplay myPopUp;
	
	public InputController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		myPopUp.showResponse("Look Words!");
	}
}

