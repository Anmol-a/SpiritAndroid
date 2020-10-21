package com.Pages;


import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;
import com.spiritzone.WrapperFunctions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class SpiritZoneHomeAddress {

	WrapperFunctions GenericMethod = null;
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
	By SearchInputAddress;
	By ClickSearchInputAddress;
	By ZoomIn;
	By ZoomOut;
	By ChangeButton;
	
	public SpiritZoneHomeAddress(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		enableGPS = By.xpath("(//android.widget.TextView)[3]");
		SearchInputAddress = By.xpath("//android.widget.EditText[@text='Search for area, street name...']");
		CurrentLocation = By.xpath("//android.widget.TextView[@text='DELIVERY LOCATION']");
		setDelivery = By.xpath("//android.widget.EditText");
		usecurrentGPS = By.xpath("//android.widget.TextView[@text='Using GPS']");
		setHomeaddress = By.xpath("//android.widget.EditText[@text='HOME/FLAT/BLOCK NO']");
		Landmark = By.xpath("//android.widget.EditText[@text='LANDMARK']");
		
		
		SaveasHOME = By.xpath("//android.widget.TextView[@text='HOME']");
		SaveasOFFICE = By.xpath("//android.widget.TextView[@text='OFFICE']");
		SaveasOther = By.xpath("//android.widget.TextView[@text='OTHER']");
		
		String ConfigSearchAddress = objPojo.getEntityRunner().getStringValueForField("ConfigSearchAddress");
		ClickSearchInputAddress = By.xpath("//android.widget.TextView[@text='"+ConfigSearchAddress+"']");
		ConfirmLocation = By.xpath("//android.widget.Button[@text='CONFIRM LOCATION']");
		
		ZoomIn = By.xpath("//android.widget.ImageView[@content-desc='Zoom in']");
		ZoomOut = By.xpath("//android.widget.ImageView[@content-desc='Zoom out']");
		
		ChangeButton = By.xpath("//android.widget.TextView[@text='CHANGE']");
	
	}

	public void fillHomeDetailsAddress() throws InterruptedException 
	{
		String ConfigDeliveryInput = objPojo.getEntityRunner().getStringValueForField("ConfigDeliveryInput");
		String TypeOfAddress = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");
		String TestType = objPojo.getEntityRunner().getStringValueForField("TestType");
		String ConfigSearchAddress = objPojo.getEntityRunner().getStringValueForField("ConfigSearchAddress");
		WrapperFunctions GenericMethod = objPojo.getObjWrapperFunctions();
		
		
		Thread.sleep(4000);
		

		
		if(!(TestType.equalsIgnoreCase("Positive-Profie") || (TestType.equalsIgnoreCase("Positive-ProfieEditAddress"))))
		{
		objPojo.getObjUtilities().logReporter("Clicked on CurrentLocation",
				GenericMethod.clickException(CurrentLocation,"Current Location Icon"));
		
		}	
		
		if(!(TypeOfAddress.equalsIgnoreCase("None") || (TestType.equalsIgnoreCase("Positive-ProfieEditAddress"))))
		{
		
			if(ConfigDeliveryInput.equalsIgnoreCase("LocationInput"))
			{
				
				GenericMethod.waitForElementToBeClickable(SearchInputAddress);
				GenericMethod.click(SearchInputAddress);
				GenericMethod.clearAndSendKeys(SearchInputAddress, ConfigSearchAddress);
				
				//Clicking on our Address
				GenericMethod.waitForElementPresence(ClickSearchInputAddress);
				GenericMethod.click(ClickSearchInputAddress);
				
			}
			
		 if(ConfigDeliveryInput.equalsIgnoreCase("CurrentGPS"))		
	{
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Using GPS']")).size()!=0)
		{
		objPojo.getObjUtilities().logReporter("Clicked on CurrentLocation",
				GenericMethod.clickException(usecurrentGPS,"Current GPS Icon"));
		}
	}

		
}	
		
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFLATaddress") && !ConfigDeliveryInput.equalsIgnoreCase("CurrentGPS"))
		{
		
		GenericMethod.waitForElementToBeClickable(setHomeaddress);
		objPojo.getObjUtilities().logReporter(" Entering Home/FLAT NO as "+ objPojo.getEntityRunner().getStringValueForField("FLATaddress"),
		GenericMethod.clearAndSendKeysCustomException(setHomeaddress,
				objPojo.getEntityRunner().getStringValueForField("FLATaddress"),"Flat Address Field"));
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigNearLandmark")&& !ConfigDeliveryInput.equalsIgnoreCase("CurrentGPS"))
		{
			
		Thread.sleep(2500);
		objPojo.getObjUtilities().logReporter(" Entering Nearby Landmark as "+ objPojo.getEntityRunner().getStringValueForField("NearLandmark"),
				GenericMethod.clearAndSendKeysCustomException(Landmark,
						objPojo.getEntityRunner().getStringValueForField("NearLandmark"),"LandMark Field"));
		}
		
	}	
			
		public void SaveASIconSubmit()
		{
		WrapperFunctions GenericMethod = objPojo.getObjWrapperFunctions();
			
		String TestType = objPojo.getEntityRunner().getStringValueForField("TestType");	
		String TypeOfAddress = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");
		String typeOfHome = objPojo.getEntityRunner().getStringValueForField("TypeOfAddress");	
		
		
		if(typeOfHome.equalsIgnoreCase("Home"))
		{

		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				GenericMethod.clickException(SaveasHOME,"Home Icon in Address"));
		}
		
		if(typeOfHome.equalsIgnoreCase("Office"))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				GenericMethod.clickException(SaveasOFFICE,"Office Icon in Address"));
		}
		
		
		if(typeOfHome.equalsIgnoreCase("Other"))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Address Type",
				GenericMethod.clickException(SaveasOther,"Save As Other Icon in Address"));
		}
		
		if(!(TypeOfAddress.equalsIgnoreCase("None")  && !(TestType.equalsIgnoreCase("Positive-Zoom")) ))
		{
		objPojo.getObjUtilities().logReporter("Clicked on Confirm Location BTN",
				GenericMethod.clickException(ConfirmLocation,"Confirm Location Button"));

		
		}
	}


	public void AssertAddress() throws InterruptedException
	{
		String FLATaddress =objPojo.getEntityRunner().getStringValueForField("FLATaddress");
		Thread.sleep(4000);

	
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative"))
		{
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Select Delivery Location']")).size()!=0)
			{
			objPojo.getObjUtilities().logReporter("Negtive Scanerio Passed ", true);
		    }
			else 
			{
				objPojo.getObjUtilities().logReporter("Negtive Scanerio Failed ", false);	
			}
		
		}

		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive")) 
		{
			String HomeElement = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='HOME']")).getText();
			String MyProfile = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='MY PROFILE']")).getText();
		if (HomeElement.equalsIgnoreCase("HOME"))
		{
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'"+FLATaddress+"')]")).size()!=0)
			{
			objPojo.getObjUtilities().logReporter("<B> Passed Scanerio!!!! </B>", true);
		}
			else 
			{
				objPojo.getObjUtilities().logReporter("<B>Address Scanerio Failed!!!! </B>", false);	
			}
				
	}	
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Address Scanerio Failed!!!! </B>", false);	
		}
	}
				
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-Profie") ||objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-ProfieEditAddress") ) 
		{
			String MyProfile = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='MY PROFILE']")).getText();
			if (MyProfile.equalsIgnoreCase("MY PROFILE")) {
				
				objPojo.getObjUtilities().logReporter("<B> Passed Scanerio!!!! </B>", true);
			}		
			else
			{
				objPojo.getObjUtilities().logReporter("<B> Scanerio Failed!!!! </B>", false);	
			}
		
		}
		
		
		
		//Zoom-Out Zoom-in
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-Zoom"))
		{
				for(int l=0;l<3;l++)
				{
					GenericMethod.click(ZoomIn);
				}
				for(int l=0;l<3;l++)
				{
					GenericMethod.click(ZoomOut);
				}
				
		}
	
	}
	
	
	
	public void EditCurrentAddress() throws InterruptedException {
		Thread.sleep(4000);
		
		
		
		By setHomeaddressEdit;
		By Landmarkedit;
		
		setHomeaddressEdit = By.xpath("(//android.widget.EditText)[1]");
		Landmarkedit = By.xpath("(//android.widget.EditText)[2]");
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFLATaddress")) {
			objPojo.getObjUtilities().logReporter(" Entering Home/FLAT NO as "+ objPojo.getEntityRunner().getStringValueForField("FLATaddress"),
					GenericMethod.clearAndSendKeysCustomException(setHomeaddressEdit,
					objPojo.getEntityRunner().getStringValueForField("FLATaddress"),"Flat Address Field"));
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigNearLandmark")) {
				
				Thread.sleep(2500);
				
			objPojo.getObjUtilities().logReporter(" Entering Nearby Landmark as "+ objPojo.getEntityRunner().getStringValueForField("NearLandmark"),
					GenericMethod.clearAndSendKeysCustomException(Landmarkedit,
							objPojo.getEntityRunner().getStringValueForField("NearLandmark"),"LandMark Field"));
			}		
		
	}

	public void fillAndSubmitHomeDetails() throws InterruptedException {
		String ConfigDeliveryInput = objPojo.getEntityRunner().getStringValueForField("ConfigDeliveryInput");
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Address Updates </B>",true);

		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive-ProfieEditAddress"))
		{
			EditCurrentAddress();
		}
		else
		{
		fillHomeDetailsAddress();
		}
		
		if(!ConfigDeliveryInput.equalsIgnoreCase("CurrentGPS"))
		{
		//SavingIcon
		SaveASIconSubmit();
		//Asserting for Positive Scanerios
		AssertAddress();
		}
	
	
	}

	
}
