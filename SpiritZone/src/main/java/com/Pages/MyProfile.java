package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import com.Pages.SpiritZoneHomeOrder;

public class MyProfile {
	
	SpiritZoneHomeOrder HomeOrder;
	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	By MyProfileButton;
	By MyOrdersButton;
	By MyAddressButton;
	By SettingsButton;
	By LogoutButton;
	By TrackINOrderDetails;
	By TrackOUTOrderDetails;
	By MyProfileText;
	
	//Mr Order Moudles 
	By Customercare;
	By InprocessOrder;
	By FailedOrder;
	By RetryOrder;
	By Reorder;
	By ContinueReOrder;
	By CancelOrder;
	By DeliveredOrder;
	By InvoiceOut;
	By InvoiceIn;
	By LeaveFeedback;
	By OutForDelivery;
	By reasonforCancelBtn;
	By reasonCancelvalue;
	By reasoncancelvalueOKbtn;
	By reasonCancelSubmitBtn;
	By orderStatusText;
	
	
	//MyAddressModule
	By AddupADDRESS;
	By EditAddress;
	By DeleteAddress;
	By UseasShippingAddress;
	
	
	//SettingsModule
	By SettingsText;
	By ChangePassword;
	By SalesnPromotions;
	By OldPasswdField;
	By NewPasswdField;
	By RepeatNewPasswdField;
	By SavePasswordBtn;
	
	
	//LogoutModule
	By Logout;
	By YesLogout;
	By NoLogout;
	
	
	
	//Cancel Transcation 
	By CancelTransaction;
	By YesTransactionTransaction;
	By NoTransactionTransaction;
	
	
	public MyProfile(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
	
		//Xpaths
		MyProfileButton = By.xpath("//android.widget.TextView[@text='MY PROFILE']");
		MyOrdersButton = By.xpath("//android.widget.TextView[@text = 'Your Orders']");
		MyAddressButton  = By.xpath("//android.widget.TextView[@text = 'My Address']");
		SettingsButton = By.xpath("//android.widget.TextView[@text = 'Settings']");
		LogoutButton = By.xpath("//android.widget.TextView[@text = 'Log out']");
		MyProfileText = By.xpath("//android.widget.TextView[@text='My Profile']");
		
		
		
		
		//My-Orders 
		Customercare = By.xpath("//android.widget.TextView[@text='Need some Help?']");
		InprocessOrder = By.xpath("//android.widget.TextView[@text='In Process']");
		TrackINOrderDetails = By.xpath("//android.widget.TextView/following-sibling::android.widget.ImageView");
		TrackOUTOrderDetails = By.xpath("//android.widget.TextView[@text = 'TRACK']");
		FailedOrder = By.xpath("//android.widget.TextView[@text='Failed']");
		Reorder = By.xpath("//android.widget.TextView[@text='REORDER']");
		ContinueReOrder = By.xpath("//android.widget.TextView[@text='CONTINUE']");
		RetryOrder = By.xpath("//android.widget.TextView[@text='RETRY']");
		
		DeliveredOrder = By.xpath("//android.widget.TextView[@text='Delivered']");
		InvoiceOut = By.xpath("//android.widget.TextView[@text='INVOICE']");
		InvoiceIn = By.xpath("//android.widget.TextView[@text='DOWNLOAD INVOICE']");
		LeaveFeedback = By.xpath("//android.widget.TextView[@text='LEAVE FEEDBACK']");
		
		orderStatusText = By.xpath("(//android.widget.TextView)[5]");
		
		//Only if out for delivery
		OutForDelivery = By.xpath("//android.widget.TextView[@text='Out For Delivery']");
		CancelOrder = By.xpath("//android.widget.TextView[@text='CANCEL ORDER']");
		reasonforCancelBtn = By.xpath("//android.widget.Button[@text='Reason for cancelling order.']");
		reasonCancelvalue = By.xpath("//android.widget.EditText[@text='Not Needed']");
		reasoncancelvalueOKbtn = By.xpath("//android.widget.Button[@text='OK']");
		reasonCancelSubmitBtn = By.xpath("//android.widget.TextView[@text='SUBMIT']");
		
		
		
		//ADDRESS MODULE
		
		AddupADDRESS = By.xpath("(//android.widget.ImageView)[2]");
		//it traverse to Fiill Submit Address module
		EditAddress = By.xpath("(//android.widget.TextView[@text='Edit'])[2]");
		DeleteAddress = By.xpath("(//android.widget.TextView[@text='Use as the shipping address'])[2]/following-sibling::android.widget.ImageView");
		UseasShippingAddress = By.xpath("(//android.widget.CheckBox)[2]");
		
		
		
		//Settings
		SettingsText = By.xpath("//android.widget.TextView[@text='Settings']");
		ChangePassword = By.xpath("//android.widget.TextView[@text='CHANGE PASSWORD']");		
		SalesnPromotions = By.xpath("(//android.widget.Switch)");
		OldPasswdField = By.xpath("//android.widget.TextView[@text='Old Password']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		NewPasswdField = By.xpath("//android.widget.TextView[@text='New Password']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		RepeatNewPasswdField = By.xpath("//android.widget.TextView[@text='Repeat New Password']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		SavePasswordBtn = By.xpath("//android.widget.Button[@text='SAVE PASSWORD']");
		
		
		//LogoutBtn
		Logout = By.xpath("");
		YesLogout = By.xpath("//android.widget.Button[@text='YES']");
		NoLogout = By.xpath("//android.widget.Button[@text='NO']");
		
		
		//Cancel transaction 
		CancelTransaction = By.xpath("//android.widget.TextView[@text='Cancel']");
		NoTransactionTransaction = By.xpath("//android.widget.Button[@text='NO']");
		YesTransactionTransaction = By.xpath("//android.widget.Button[@text='YES']");
		
		
		
	}
	
	//Your Orders
	public void FillMyProfileYourOrder() {
		
		//Click on Your Orders
		objPojo.getObjUtilities().logReporter("Clicked On My Orders Button ",objPojo.getObjWrapperFunctions().click(MyOrdersButton));
		String OrderType = objPojo.getEntityRunner().getStringValueForField("OrderType");
		
		if(OrderType.equalsIgnoreCase("Failed"))
		{
			objPojo.getObjUtilities().logReporter("Traversed TO Failed Order Section",true);
			//Clicking On Failed 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Customercare);

			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Failed']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
			}
			
			objPojo.getObjUtilities().logReporter("Clicked On FailedOrders Button",objPojo.getObjWrapperFunctions().clickException(FailedOrder,"Failed Order Product"));
			String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Failed']")).getText();
			objPojo.getObjUtilities().logReporter("Your Order type is "+ProcessText,true);
			System.out.println("Your Order type is "+ProcessText);
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
			
			//TO retry
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReorder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Retry Button ",	objPojo.getObjWrapperFunctions().click(RetryOrder));
			}
		}
		
		if(OrderType.equalsIgnoreCase("Delivered"))
		{
		 	
			//Clicking On Delivered 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Customercare);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Customercare);

			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
			}
			
		
			objPojo.getObjUtilities().logReporter("Clicked On Delivered Order ",objPojo.getObjWrapperFunctions().click(DeliveredOrder));
			String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Delivered']")).getText();
			objPojo.getObjUtilities().logReporter("Your Order type is "+ProcessText,true);
			System.out.println("Your Order type is "+ProcessText);
			
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
			
			
			//Leave FeedBack
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigLeaveFeedBack"))
			{
				//App Crashes
				objPojo.getObjUtilities().logReporter("Clicked On LeaveFeedBack Button ",objPojo.getObjWrapperFunctions().click(LeaveFeedback));
			}
			
			//Reorder
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReorder"))
			{
				
				objPojo.getObjUtilities().logReporter("Clicked On Reorder Button ",objPojo.getObjWrapperFunctions().click(Reorder));
				objPojo.getObjWrapperFunctions().click(ContinueReOrder);
				//Traverse to Product cart
				//TraversingToCartDetails();
			}
			
			//Reorder
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigDownloadInvoiceInside"))
			{
				//Download Invoice Inside
				objPojo.getObjWrapperFunctions().scrollDown();
				objPojo.getObjUtilities().logReporter("Clicked On Download Invoice Button ",objPojo.getObjWrapperFunctions().click(InvoiceIn));
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
			//Reorder
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigDownloadInvoiceOutside"))
			{
				//Download Invoice Outside
				objPojo.getObjUtilities().logReporter("Clicked On Invoice Download Button ",objPojo.getObjWrapperFunctions().click(InvoiceOut));
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
		
		//CAUTION : ONLY FOR DEV APPLICATION
		if(OrderType.equalsIgnoreCase("InProcess"))
		{
			//Clicking On Delivered 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Customercare);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Customercare);

			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='In Process']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
			}
			
			

			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigTRACKInside"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On InProcess Button ",objPojo.getObjWrapperFunctions().click(InprocessOrder));
				String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='In Process']")).getText();
				objPojo.getObjUtilities().logReporter("OrderType is  "+ProcessText,true);
				System.out.println("Your Order type is "+ProcessText);
				
				//Order No
				String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
				objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
				
				
				objPojo.getObjUtilities().logReporter("Clicked On Track Order Details Button ",objPojo.getObjWrapperFunctions().click(TrackINOrderDetails));
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigTRACKOutSide"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Track Order Details Button ",objPojo.getObjWrapperFunctions().click(TrackOUTOrderDetails));
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}		
	}
	
	public void CustomerService() {
		
		//For Customer Service
		objPojo.getObjUtilities().logReporter("Clicked On My Orders Button ",
				objPojo.getObjWrapperFunctions().click(MyOrdersButton));
		objPojo.getObjUtilities().logReporter("Clicked On Customer Care Section ",
				objPojo.getObjWrapperFunctions().click(Customercare));
		
	}
	
	
	
	
	//My Address
	public void FillMyProfileMyAddress() {
		
		String AddressAction = objPojo.getEntityRunner().getStringValueForField("AddressAction");
		objPojo.getObjUtilities().logReporter("Clicked on My Address Button "
				,objPojo.getObjWrapperFunctions().click(MyAddressButton));
		
		if(AddressAction.equalsIgnoreCase("AddAddress"))
		{
			objPojo.getObjUtilities().logReporter("Clicked on AddUp Address",
					objPojo.getObjWrapperFunctions().click(AddupADDRESS));
			//Traverse To Address Module
		}
		
		if(AddressAction.equalsIgnoreCase("EditAddress"))
		{
			objPojo.getObjUtilities().logReporter("Clicked On Edit Address Button ",
					objPojo.getObjWrapperFunctions().click(EditAddress));
			//Traverse To Address Module
		}
		
		if(AddressAction.equalsIgnoreCase("DeleteAddress"))
		{
			objPojo.getObjUtilities().logReporter("Clicked on Delete Address Button ",
					objPojo.getObjWrapperFunctions().click(DeleteAddress));
		}
		
		if(AddressAction.equalsIgnoreCase("UseAsShipping"))
		{
			objPojo.getObjUtilities().logReporter("Clicked On Use as Shipping Address Button",
					objPojo.getObjWrapperFunctions().click(UseasShippingAddress));
		}
		
	}
	
	//Settings
	public void FillMyProfileSettings() {
		
		String LogoutOption = objPojo.getEntityRunner().getStringValueForField("ProfileType");
		objPojo.getObjUtilities().logReporter("Clicked On Settings Button ",
				objPojo.getObjWrapperFunctions().click(SettingsButton));
		
		
		if(LogoutOption.equalsIgnoreCase("Settings-Password"))
		{
			objPojo.getObjUtilities().logReporter("Clicked On Change Password Button ",
					objPojo.getObjWrapperFunctions().click(ChangePassword));
			
			objPojo.getObjUtilities().logReporter("Clicked On OldPassword Field ",
					objPojo.getObjWrapperFunctions().click(OldPasswdField));
			
			objPojo.getObjUtilities().logReporter("Typing Old Password.....",
					objPojo.getObjWrapperFunctions().clearAndSendKeys(OldPasswdField, "steveJOBS@123"));
		
			objPojo.getObjUtilities().logReporter("Clicked On NewPassword Field",
					objPojo.getObjWrapperFunctions().click(NewPasswdField));
			
			objPojo.getObjUtilities().logReporter("Typing New Password.....",
					objPojo.getObjWrapperFunctions().clearAndSendKeys(NewPasswdField, "steveJOBS@123"));
			
		objPojo.getObjWrapperFunctions().click(RepeatNewPasswdField);
		
		objPojo.getObjUtilities().logReporter("ReTyping New Password.....",
				objPojo.getObjWrapperFunctions().clearAndSendKeys(RepeatNewPasswdField, "steveJOBS@123"));
		
		}
		
		if(LogoutOption.equalsIgnoreCase("Settings-Notification"))
		{
			objPojo.getObjUtilities().logReporter("Clicked on Sales and Promotions ",
					objPojo.getObjWrapperFunctions().click(SalesnPromotions));
		}
	
	}
	
	//Log-Out
	public void FillMyProfileLogout() {
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//LOGING OUT! Bye
		String LogoutOption = objPojo.getEntityRunner().getStringValueForField("LogoutOption");
		 
		if(LogoutOption.equalsIgnoreCase("Yes"))
		{
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		objPojo.getObjUtilities().logReporter("Clicked On LogOut Button and Selecting Yes",objPojo.getObjWrapperFunctions().click(LogoutButton));
		objPojo.getObjWrapperFunctions().click(YesLogout);
		}
		
		if(LogoutOption.equalsIgnoreCase("No"))
		{
		objPojo.getObjUtilities().logReporter("Clicked On Logout Button and Selecting No ",objPojo.getObjWrapperFunctions().click(LogoutButton));
		objPojo.getObjWrapperFunctions().click(NoLogout);
		}	
	}
	
	
	public void FillMyProfileModules() {
		
		objPojo.getObjUtilities().logReporter("<B>Traversed to My Profiles</B>",true);
		
		//CLICKING ON MY PROFILE SECTION
		objPojo.getObjUtilities().logReporter("Clicked On My Profile ",objPojo.getObjWrapperFunctions().click(MyProfileButton));
		objPojo.getObjWrapperFunctions().waitForElementToBeClickable(SettingsButton);
		
		//Type of Module we are gonna perform actions on
		String ProfileModuleType = objPojo.getEntityRunner().getStringValueForField("ProfileType");
		
		if(ProfileModuleType.equalsIgnoreCase("MyOrder"))
		{
		objPojo.getObjUtilities().logReporter("<B>Traversed TO My Order Section </B>",true);
		FillMyProfileYourOrder();
		}
		
		if(ProfileModuleType.equalsIgnoreCase("MyAddress"))
		{
		objPojo.getObjUtilities().logReporter("<B>Traversed TO My Address </B>",true);
		FillMyProfileMyAddress();
		}
		
		if(ProfileModuleType.equalsIgnoreCase("CustomerService"))
		{
			objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Customer Service </B>",true);
			CustomerService();
		}
		
		
		
		if(ProfileModuleType.equalsIgnoreCase("Settings") ||ProfileModuleType.equalsIgnoreCase("Settings-Password")|| ProfileModuleType.equalsIgnoreCase("Settings-Notification"))
		{
		FillMyProfileSettings();
		}
		
		if(ProfileModuleType.equalsIgnoreCase("Logout"))
		{
		FillMyProfileLogout();
		}
	
	}
}
