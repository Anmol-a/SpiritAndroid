package com.Pages;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritZoneCart {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	By PayNow;

	
	
	
	public SpiritZoneCart(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		PayNow = By.xpath("//android.widget.Button");



	}

	public void fillcartDetails() 
	{	
		//SCROLL DOWN
		
		objPojo.getObjUtilities().logReporter("Clicked on PayNow",
				objPojo.getObjWrapperFunctions().click(PayNow));
		
	}



	



	public void fillAndSubmitCARTdetails() {
		fillcartDetails();

	}
}
