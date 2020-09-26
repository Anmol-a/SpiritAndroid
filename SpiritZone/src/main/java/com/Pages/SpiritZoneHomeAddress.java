package com.Pages;


import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class SpiritZoneHomeAddress {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	

	By enableGPS;
	By CurrentLocation;
	By setDelivery;
	By usecurrentGPS;
	By setHomeaddress;
	By Landmark;
	By SaveasHOME;
	By SaveasOFFICE;
	By SaveasOther;	
	By ConfirmLocation;
	
	
	public SpiritZoneHomeAddress(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		enableGPS = By.xpath("(//android.widget.TextView)[3]");
		CurrentLocation = By.xpath("//android.widget.TextView[@text='DELIVERY LOCATION']");
		setDelivery = By.xpath("//android.widget.EditText");
		usecurrentGPS = By.xpath("//android.widget.TextView[@text='Using GPS']");
		setHomeaddress = By.xpath("//android.widget.EditText[@text='HOME/FLAT/BLOCK NO']");
		Landmark = By.xpath("//android.widget.EditText[@text='LANDMARK']");
		
		
		SaveasHOME = By.xpath("//android.widget.TextView[@text='HOME']");
		SaveasOFFICE = By.xpath("//android.widget.TextView[@text='OFFICE']");
		SaveasOther = By.xpath("//android.widget.TextView[@text='OTHER']");
		
		
		ConfirmLocation = By.xpath("//android.widget.Button[@text='CONFIRM LOCATION']");
	
	
	}

	public void fillHomeDetailsAddress() {
		
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String TypeOfAddress = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");
		String TestType = objPojo.getEntityRunner().getStringValueForField("TestType");
		
		if(!(TestType.equalsIgnoreCase("Positive-Profie") || (TestType.equalsIgnoreCase("Positive-ProfieEditAddress"))))
		{
		objPojo.getObjUtilities().logReporter("Clicked on CurrentLocation",
				objPojo.getObjWrapperFunctions().clickException(CurrentLocation,"Current Location Icon"));
		
		}	
		
		if(!(TypeOfAddress.equalsIgnoreCase("None") || (TestType.equalsIgnoreCase("Positive-ProfieEditAddress"))))
		{
		
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Using GPS']")).size()!=0)
		{
		objPojo.getObjUtilities().logReporter("Clicked on CurrentLocation",
				objPojo.getObjWrapperFunctions().clickException(usecurrentGPS,"Current GPS Icon"));
		}
		
		String FLATno = "607 Shankar Apartments";
		String NearLandmark = "Near Western Express Highway";
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFLATaddress")) {
		objPojo.getObjUtilities().logReporter(" Entering Home/FLAT NO as "+ objPojo.getEntityRunner().getStringValueForField("FLATaddress"),
		objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(setHomeaddress,
				objPojo.getEntityRunner().getStringValueForField("FLATaddress"),"Flat Address Field"));
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigNearLandmark")) {
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		objPojo.getObjUtilities().logReporter(" Entering Nearby Landmark as "+ objPojo.getEntityRunner().getStringValueForField("NearLandmark"),
				objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(Landmark,
						objPojo.getEntityRunner().getStringValueForField("NearLandmark"),"LandMark Field"));
		}
		
	}	
			
		public void SaveASIconSubmit()
		{
			
		String TypeOfAddress = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");
		String typeOfHome = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");	
		if(typeOfHome.equalsIgnoreCase("Home"))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				objPojo.getObjWrapperFunctions().clickException(SaveasHOME,"Home Icon in Address"));
		}
		
		if(typeOfHome.equalsIgnoreCase("Office"))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				objPojo.getObjWrapperFunctions().clickException(SaveasOFFICE,"Office Icon in Address"));
		}
		
		
		if(typeOfHome.equalsIgnoreCase("Other"))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				objPojo.getObjWrapperFunctions().clickException(SaveasOther,"Save As Other Icon in Address"));
		}
		
		if(!(TypeOfAddress.equalsIgnoreCase("None"))) {
		objPojo.getObjUtilities().logReporter("Clicked on Confirm Location BTN",
				objPojo.getObjWrapperFunctions().clickException(ConfirmLocation,"Confirm Location Button"));
		}
	}


	public void AssertAddress()
	{
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String HomeElement = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='HOME']")).getText();
		
		String MyProfile = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='MY PROFILE']")).getText();	
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative"))
		{
			
			objPojo.getObjUtilities().logReporter("Negtive Scanerio ", true);
		}
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive")) 
		{
		
		if (HomeElement.equalsIgnoreCase("HOME")) {
			
			objPojo.getObjUtilities().logReporter("<B> Passed Scanerio!!!! </B>", true);
		}
			
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Scanerio Failed!!!! </B>", false);	
		}
	}
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-Profie") ||objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-ProfieEditAddress") ) 
		{
			if (MyProfile.equalsIgnoreCase("MY PROFILE")) {
				
				objPojo.getObjUtilities().logReporter("<B> Passed Scanerio!!!! </B>", true);
			}		
			else
			{
				objPojo.getObjUtilities().logReporter("<B> Scanerio Failed!!!! </B>", false);	
			}
		
		}
	
	}
	
	
	
	public void EditCurrentAddress() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		By setHomeaddressEdit;
		By Landmarkedit;
		
		setHomeaddressEdit = By.xpath("(//android.widget.EditText)[1]");
		Landmarkedit = By.xpath("(//android.widget.EditText)[2]");
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFLATaddress")) {
			objPojo.getObjUtilities().logReporter(" Entering Home/FLAT NO as "+ objPojo.getEntityRunner().getStringValueForField("FLATaddress"),
			objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(setHomeaddressEdit,
					objPojo.getEntityRunner().getStringValueForField("FLATaddress"),"Flat Address Field"));
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigNearLandmark")) {
				
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			objPojo.getObjUtilities().logReporter(" Entering Nearby Landmark as "+ objPojo.getEntityRunner().getStringValueForField("NearLandmark"),
					objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(Landmarkedit,
							objPojo.getEntityRunner().getStringValueForField("NearLandmark"),"LandMark Field"));
			}		
		
	}

	public void fillAndSubmitHomeDetails() {
		
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Address Updates </B>",true);

		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-ProfieEditAddress"))
		{
			EditCurrentAddress();
		}
		else
		{
		fillHomeDetailsAddress();
		}
		
		//SavingIcon
		SaveASIconSubmit();
		//Asserting for Positive Scanerios
		AssertAddress();
	
	
	
	}

	
	
//	public void fillAndSubmitHomeDetailsOrder() {
//		
//		fillHomeOrder();
//		
//		
//		
//	}
	
	
}
