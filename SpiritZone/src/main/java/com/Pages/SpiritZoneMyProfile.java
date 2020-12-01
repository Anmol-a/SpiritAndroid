package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import com.Pages.SpiritZoneHomeOrder;

public class SpiritZoneMyProfile {
	
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
	
	
	//Traverse from 
	By Cart;
	By Favourites;
	By Support;
	
	
	//Mr Order Moudles 
	By Myordertext;
	By Customercare;
	By InprocessOrder;
	By FailedOrder;
	By CancelOrderType;
	By IssueInitiatedOrder;
	By BackToStoreOrder;
	By RetryOrder;
	By ContinueReorder;
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
	By CancelBTN;
	By ReconfirmCancel;
	By SubmitCancel;
	
	
	//Back Button 
	By MyOrdersBack;
	
	
	
	//FeedBacck
	By SuperFastDelivery;
	By AmazingDeals;
	By GoodOptions;
	By Other;
	By FeedBackSubmit;
	By CustomTextFieldFeedBack;
	
	//MyAddressModule
	By AddupADDRESS;
	By EditAddress;
	By DeleteAddress;
	By UseasShippingAddress;
	By EnableGPSbutton;
	
	
	//SettingsModule
	By SettingsText;
	By ChangePassword;
	By SalesnPromotions;
	By OldPasswdField;
	By NewPasswdField;
	By RepeatNewPasswdField;
	By SavePasswordBtn;
	By YesChangePassword;
	By ConfirmedOkPassword;
	
	//LogoutModule
	By Logout;
	By YesLogout;
	By NoLogout;
	
	
	
	//Cancel Transcation 
	By CancelTransaction;
	By YesTransactionTransaction;
	By NoTransactionTransaction;
	
	
	public SpiritZoneMyProfile(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		
		//Traversing from 
		Cart = By.xpath("//android.widget.TextView[@text='CART']");
		Favourites = By.xpath("//android.widget.TextView[@text='FAVORITES']");
		Support = By.xpath("//android.widget.TextView[@text='SUPPORT']");
		
		
		MyOrdersBack = By.xpath("(//android.widget.TextView[@text='ORDER DETAILS']//ancestor::android.view.ViewGroup)[8]/android.view.ViewGroup/android.widget.ImageView");
		
		
		//Xpaths
		MyProfileButton = By.xpath("//android.widget.TextView[@text='MY PROFILE']");
		MyOrdersButton = By.xpath("//android.widget.TextView[@text = 'Your Orders']");
		MyAddressButton  = By.xpath("//android.widget.TextView[@text = 'My Address']");
		SettingsButton = By.xpath("//android.widget.TextView[@text = 'Settings']");
		LogoutButton = By.xpath("//android.widget.TextView[@text = 'Log out']");
		MyProfileText = By.xpath("//android.widget.TextView[@text='My Profile']");
		
		
		
		
		//My-Orders 
		Myordertext = By.xpath("//android.widget.TextView[@text='MY ORDERS']");
		Customercare = By.xpath("//android.widget.TextView[@text='Need some Help?']");
		InprocessOrder = By.xpath("//android.widget.TextView[@text='In Process']");
		TrackINOrderDetails = By.xpath("//android.widget.TextView/following-sibling::android.widget.ImageView");
		TrackOUTOrderDetails = By.xpath("(//android.widget.ImageView/preceding::android.widget.TextView)[9]");
		FailedOrder = By.xpath("//android.widget.TextView[@text='Failed']");
		Reorder = By.xpath("//android.widget.TextView[@text='REORDER']");
		ContinueReOrder = By.xpath("//android.widget.TextView[@text='CONTINUE']");
		RetryOrder = By.xpath("//android.widget.TextView[@text='RETRY']");
		ContinueReorder = By.xpath("//android.widget.TextView[@text='CONTINUE']");
		
		BackToStoreOrder = By.xpath("//android.widget.TextView[@text='BackToStore']");
		CancelOrderType = By.xpath("//android.widget.TextView[@text='Cancelled']");
		DeliveredOrder = By.xpath("//android.widget.TextView[@text='Delivered']");
		InvoiceOut = By.xpath("//android.widget.TextView[@text='INVOICE']");
		InvoiceIn = By.xpath("//android.widget.TextView[@text='DOWNLOAD INVOICE']");
		LeaveFeedback = By.xpath("//android.widget.TextView[@text='LEAVE FEEDBACK']");
		
		orderStatusText = By.xpath("(//android.widget.TextView)[5]");
		
		CancelBTN = By.xpath("//android.widget.TextView[@text='CANCEL ORDER']");
		ReconfirmCancel = By.xpath("//android.widget.Button[@text='Reason for cancelling order.']");
		SubmitCancel = By.xpath("//android.widget.TextView[@text='SUBMIT']");
		//Feedback 
		SuperFastDelivery = By.xpath("//android.widget.TextView[@text='Super-Fast Delivery']");
		AmazingDeals = By.xpath("//android.widget.TextView[@text='Amazing Deals']");
		GoodOptions = By.xpath("//android.widget.TextView[@text='Good Options']");
		Other = By.xpath("//android.widget.TextView[@text='Other']");
		FeedBackSubmit = By.xpath("//android.widget.Button[@text='SUBMIT']");
		CustomTextFieldFeedBack = By.xpath("//android.widget.EditText[@text='Write your review']");
		
		//Only if out for delivery
		OutForDelivery = By.xpath("//android.widget.TextView[@text='Out For Delivery']");
		CancelOrder = By.xpath("//android.widget.TextView[@text='CANCEL ORDER']");
		reasonforCancelBtn = By.xpath("//android.widget.Button[@text='Reason for cancelling order.']");
		IssueInitiatedOrder = By.xpath("//android.widget.TextView[@text='IssueInitiated']");
		reasonCancelvalue = By.xpath("//android.widget.EditText[@text='Not Needed']");
		reasoncancelvalueOKbtn = By.xpath("//android.widget.Button[@text='OK']");
		reasonCancelSubmitBtn = By.xpath("//android.widget.TextView[@text='SUBMIT']");
		
		
		
		//ADDRESS MODULE
		
		AddupADDRESS = By.xpath("(//android.widget.ImageView)[2]");
		//it traverse to Fiill Submit Address module
		EditAddress = By.xpath("(//android.widget.TextView[@text='Edit'])[2]");
		DeleteAddress = By.xpath("(//android.widget.TextView[@text='Use as the shipping address'])[2]/following-sibling::android.widget.ImageView");
		UseasShippingAddress = By.xpath("(//android.widget.CheckBox)[2]");
		EnableGPSbutton = By.xpath("//android.widget.TextView[@text='Current Location']");
		
		
		//Settings
		SettingsText = By.xpath("//android.widget.TextView[@text='Settings']");
		ChangePassword = By.xpath("//android.widget.TextView[@text='CHANGE PASSWORD']");		
		SalesnPromotions = By.xpath("(//android.widget.Switch)");
		OldPasswdField = By.xpath("//android.widget.TextView[@text='Old Password']/preceding::android.widget.EditText[1]");
		NewPasswdField = By.xpath("//android.widget.TextView[@text='New Password']/preceding::android.widget.EditText[1]");
		RepeatNewPasswdField = By.xpath("//android.widget.TextView[@text='Repeat New Password']/preceding::android.widget.EditText[1]");
		SavePasswordBtn = By.xpath("//android.widget.Button[@text='SAVE PASSWORD']");
		YesChangePassword = By.xpath("//android.widget.Button[@text='YES']");
		ConfirmedOkPassword = By.xpath("//android.widget.TextView[@text='OK']");
		
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
	public void FillMyProfileYourOrder() throws InterruptedException 
	{
		
		//Click on Your Orders
		objPojo.getObjUtilities().logReporter("Clicked On My Orders Button ",objPojo.getObjWrapperFunctions().click(MyOrdersButton));
		
		//Assert My Orders Section
		objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
		String myordertextString = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='MY ORDERS']")).getText();
		if(myordertextString.equalsIgnoreCase("MY ORDERS"))
		{
			objPojo.getObjUtilities().logReporter(" Traversed to My Orders is  Successful ", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter(" Traversed to My Orders is  UnSuccessful ", false);	
		}
		
		
		//Order type
		String OrderType = objPojo.getEntityRunner().getStringValueForField("OrderType");
		
		if(OrderType.equalsIgnoreCase("Cancelled"))
		{
			objPojo.getObjUtilities().logReporter("Traversing TO Cancel Order Section",true);
			//Clicking On Failed 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			
			
			
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Cancelled']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='August 03, 10:13 PM']")).size() != 0)
				{
					objPojo.getObjUtilities().logReporter("<B> Sorry No Cancel Product here in your Ordered Items </B>",false);
					break;	
				}
			}
			
			
			
			objPojo.getObjUtilities().logReporter("Clicked On Cancel Orders Button",objPojo.getObjWrapperFunctions().clickException(CancelOrderType,"Cancel Order Product"));
			Thread.sleep(3000);
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in   BACKSTORE ORDER");
			}
			
			
			String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Cancelled']")).getText();
			//Assert 
			if(ProcessText.equalsIgnoreCase("Cancelled"))
			{
				objPojo.getObjUtilities().logReporter(" Traversed to Cancel Orders Succesfull",true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter(" Failed Traversed to Cancel Orders Succesfull",false);
			}	
			
			
			
			objPojo.getObjUtilities().logReporter("Your Order type is "+ProcessText,true);
			System.out.println("Your Order type is "+ProcessText);
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);

			//TO retry
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReorder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Retry Button ",	objPojo.getObjWrapperFunctions().clickException(RetryOrder,"Reorder button"));
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='CONTINUE']")).size()!=0)
				{
					for(int x=0 ; x <2;x++)
					{
				objPojo.getObjUtilities().logReporter("Clicked On Continue Button ",	objPojo.getObjWrapperFunctions().clickException(ContinueReorder,"Reorder button"));
				}
				}
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='This Item is Out Of Stock']")).size()!=0)
                {
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					objPojo.getObjUtilities().logReporter("Scanerio Passed But Order is Out Of Stock!!!!!!!!!! ",true);
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					
					objPojo.getDriver().close();
                 }
				
				
			}
			
		}
		
		if(OrderType.equalsIgnoreCase("BackToStore"))
		{
			objPojo.getObjUtilities().logReporter("Traversing TO BackToStore Order Section",true);
			//Clicking On Failed 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			
			
			
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='BackToStore']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='August 03, 10:13 PM']")).size() != 0)
				{
					objPojo.getObjUtilities().logReporter("<B> Sorry No BackToStoreOrder Product here in your Ordered Items </B>",false);
					break;	
				}
			}
			
			
			
			
			objPojo.getObjUtilities().logReporter("Clicked On BackTOStore Orders Button",objPojo.getObjWrapperFunctions().clickException(BackToStoreOrder,"Cancel Order Product"));
			Thread.sleep(3000);
			String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='BackToStore']")).getText();
			//Assert 
			if(ProcessText.equalsIgnoreCase("BackToStore"))
			{
				objPojo.getObjUtilities().logReporter(" Traversed to BackToStore Orders Succesfull",true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter(" Failed Traversed to BackToStore Orders Succesfull",false);
			}
			
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in   BACKSTORE ORDER");
			}
			
			
			
			objPojo.getObjUtilities().logReporter("Your Order type is "+ProcessText,true);
			System.out.println("Your Order type is "+ProcessText);
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
			
			
			
		}
		
		
		
		
		
		
		//----------------------------FAILED
		if(OrderType.equalsIgnoreCase("Failed"))
		{
			objPojo.getObjUtilities().logReporter("Traversed TO Failed Order Section",true);
			//Clicking On Failed 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));

			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Failed']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='August 03, 10:13 PM']")).size() != 0)
				{
					objPojo.getObjUtilities().logReporter("<B> Sorry No Failed Product here in your Ordered Items </B>",false);
					break;	
				}
			}
			
			
			objPojo.getObjUtilities().logReporter("Clicked On FailedOrders Button",objPojo.getObjWrapperFunctions().clickException(FailedOrder,"Failed Order Product"));
			Thread.sleep(3000);
			
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in   INPROCESS ORDER");
			}
			
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
			
			//TO retry
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReorder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Retry Button ",	objPojo.getObjWrapperFunctions().clickException(RetryOrder,"Reorder button"));
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='CONTINUE']")).size()!=0)
				{
					for(int x=0 ; x <2;x++)
					{
				objPojo.getObjUtilities().logReporter("Clicked On Continue Button ",	objPojo.getObjWrapperFunctions().clickException(ContinueReorder,"Reorder button"));
				}
				}
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='This Item is Out Of Stock']")).size()!=0)
                {
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					objPojo.getObjUtilities().logReporter("Scanerio Passed But Order is Out Of Stock!!!!!!!!!! ",true);
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					
					objPojo.getDriver().close();
                 }
				
				
			}
		}
		
		//----------------------------DELIVERED
		if(OrderType.equalsIgnoreCase("Delivered"))
		{
		 	
			//Clicking On Delivered 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));

		
			Thread.sleep(2000);
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size() == 0)
			{
				
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='August 03, 10:13 PM']")).size() != 0)
				{
					objPojo.getObjUtilities().logReporter("<B> Sorry No Delivered Product here in your Ordered Items </B>",false);
					break;	
				}
				
		   }
			
		
			//Outside Invoice
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigDownloadInvoiceOutside"))
			{
				//Download Invoice Outside
				Thread.sleep(2000);
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				objPojo.getObjUtilities().logReporter("Clicked On Invoice Download Button ",objPojo.getObjWrapperFunctions().clickException(InvoiceOut,"OutSide Invoice Download Button"));
				
				   // waiting for 5 seconds
					Thread.sleep(5000);
					
					//Verify
					if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='INVOICE']")).size()!=0)
					{
						Assert.assertEquals(false, true,"Error in Downloading INVOICE");
					}
				
			}	
			
			else
			{
				
				List<MobileElement> Delivered;
				//-----------------------------------FEEDBACK
				if (objPojo.getEntityRunner().getBooleanValueForField("ConfigLeaveFeedback"))
				{
					objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
//					for(int x = 0;x<objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size();x++)
//					{
//						int occur = 1;
//						objPojo.getObjWrapperFunctions().clickWebElement(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).get(x));
//						
//						 if(x==objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size()-1 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='FEEDBACK']")).size()!=0)
//						{
//							 objPojo.getObjWrapperFunctions().click(MyOrdersBack);
//								objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
//								objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
//								while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size() == 0)
//								{
//									objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
//								}
//						
//								x=0;
//								
//								
//						}
//						
//						if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='FEEDBACK']")).size()!=0)
//						{
//							objPojo.getObjWrapperFunctions().click(MyOrdersBack);
//						}
//						else if (objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='FEEDBACK']")).size()==0)
//						{
//							//Do your Rating stuffs
//						}
//
//							
//					}
					
					
					
					while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Delivered']")).size() == 0)
					{
						
						objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
						
					}
				
					
					
					
				}
				
			objPojo.getObjUtilities().logReporter("Clicked On Delivered Orders Button",objPojo.getObjWrapperFunctions().clickException(DeliveredOrder,"Delivered Order Product"));
			Thread.sleep(2000);
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in DELIVERED ORDER");
			}
			

			
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);
			
			
			//Leave FeedBack
//			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigLeaveFeedBack"))
//			{
//				//App Crashes
//				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='LEAVE FEEDBACK']")).size()!=0)
//				{
//					
//				
//				objPojo.getObjUtilities().logReporter("Clicked On LeaveFeedBack Button ",objPojo.getObjWrapperFunctions().clickException(LeaveFeedback,"Leave FeedBack Button"));
//				
//				//As of Now only one option
//				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Super-Fast Delivery']")).size()!=0)
//				{
//				objPojo.getObjUtilities().logReporter("Clicked On SuperFastDelivery Button ",objPojo.getObjWrapperFunctions().clickException(SuperFastDelivery,"Super Fast Delivery Button"));
//				
//
//				
//				if (objPojo.getEntityRunner().getBooleanValueForField("ConfigLeaveFeedBackOther"))
//				{
//					
//					if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Other']")).size()!=0)
//					{
//					objPojo.getObjUtilities().logReporter("Clicked On Other Feed Back Button ",objPojo.getObjWrapperFunctions().clickException(Other,"Other Button"));
//					
//					objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(CustomTextFieldFeedBack, "Keep You Spirits High !!", "Custom Field TextField");
//					//SendKeys	
//				}
//				}
//				if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='SUBMIT']")).size()!=0)
//				{
//				objPojo.getObjUtilities().logReporter("Clicked On LeaveFeedBack Button ",objPojo.getObjWrapperFunctions().clickException(FeedBackSubmit,"FeedBackSUbmit"));
//				}
//				}
//				else
//				{
//					objPojo.getObjUtilities().logReporter("<B>  Already Given FeedBack  </B>", true);
//				}
//				
//				
//				
//				
//				
//				
//				}	
//				else
//				{
//					objPojo.getObjUtilities().logReporter("<B>  Already Given FeedBack  </B>", true);
//				}
//				
//			}
			
			//Reorder
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReorder"))
			{
				
				objPojo.getObjUtilities().logReporter("Clicked On Reorder Button ",objPojo.getObjWrapperFunctions().click(Reorder));
				objPojo.getObjWrapperFunctions().click(ContinueReOrder);
				Thread.sleep(3000);
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='This Item is Out Of Stock']")).size()!=0)
                {
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					objPojo.getObjUtilities().logReporter("Scanerio Passed But Order is Out Of Stock!!!!!!!!!! ",true);
					objPojo.getObjUtilities().logReporter("--------------------------------------------------- ",true);
					
					objPojo.getDriver().close();
                 }
				
				for(int x =0;x<2;x++)
				{
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='CONTINUE']")).size()!=0)
				{
					objPojo.getObjWrapperFunctions().click(ContinueReOrder);
				}
				}
				
				//Verify in Cart
				Thread.sleep(2000);
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='CART']")).size()==0)
				{
					Assert.assertEquals(false, true,"Failed to Traverse to CART in DELIVERED products");
				}
				
				
				//Traverse to Product cart
				//TraversingToCartDetails();
			}
			
			//Reorder
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigDownloadInvoiceInside"))
			{
				//Download Invoice Inside
				objPojo.getObjWrapperFunctions().scrollDown();
				objPojo.getObjUtilities().logReporter("Clicked On Download Invoice Button ",objPojo.getObjWrapperFunctions().click(InvoiceIn));
				
					Thread.sleep(5000);
	
					//Verify
					if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='DOWNLOAD INVOICE']")).size()!=0)
					{
						Assert.assertEquals(false, true,"Error in Downloading INVOICE");
					}
			
			}
		}
	}
	
		
		//CAUTION : ONLY FOR DEV APPLICATION
		if(OrderType.equalsIgnoreCase("InProcess"))
		{
			//Clicking On Delivered 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			Thread.sleep(1300);
			
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));

			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='In Process']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigTRACKOutSide"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Track Order Details Button ",objPojo.getObjWrapperFunctions().click(TrackOUTOrderDetails));
				Thread.sleep(1700);
					//Assert
					String AssertTrack= objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Order Received']")).getText();
					if(AssertTrack.equalsIgnoreCase("Order Received"))
					{
						objPojo.getObjUtilities().logReporter("<B> Passed Track Order Test Case </B>",true);
					}
					else
					{
						objPojo.getObjUtilities().logReporter("<B> Failed Track Order Test Case </B>",false);
					}
					
					Thread.sleep(5000);

			}	
			
			
			else
			{
			objPojo.getObjUtilities().logReporter("Clicked On InProcess Button ",objPojo.getObjWrapperFunctions().click(InprocessOrder));
			
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in   INPROCESS ORDER");
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCancel"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Cancelled Button ",objPojo.getObjWrapperFunctions().click(CancelBTN));
				objPojo.getObjUtilities().logReporter("Reconfirmed Cancellation ",objPojo.getObjWrapperFunctions().click(ReconfirmCancel));
				String CancellationReason = objPojo.getEntityRunner().getStringValueForField("CancellationReason");
				
				
				for(int x =1;x<7;x++)
				{
					if(objPojo.getDriver().findElements(By.xpath("//android.widget.EditText[@text='"+CancellationReason+"']")).size()==0)
					{
						objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.EditText[@resource-id='android:id/numberpicker_input']//following-sibling::android.widget.Button"));
					}
					else
					{
						objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.EditText[@text='"+CancellationReason+"']"));
						objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.Button[@text='OK']"));
						objPojo.getObjWrapperFunctions().click(SubmitCancel);
						break;
						
					}
				}
				
				Thread.sleep(2000);
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Cancelled']")).size()==0)
				{
					Assert.assertEquals(false, true);
				}
				
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
				Thread.sleep(1700);
				//Assert
				String AssertTrack= objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Order Received']")).getText();
				if(AssertTrack.equalsIgnoreCase("Order Received"))
				{
					objPojo.getObjUtilities().logReporter("<B> Passed Track Order Test Case </B>",true);
				}
				else
				{
					objPojo.getObjUtilities().logReporter("<B> Failed Track Order Test Case </B>",false);
				}

				
				
					Thread.sleep(5000);
				
			}
			
		}		
	}
		
		//ISSUE INITIATED-------------------------
		if(OrderType.equalsIgnoreCase("IssueInitiated"))
		{
			objPojo.getObjUtilities().logReporter("Traversing TO IssueInitiated Order Section",true);
			//Clicking On Failed 
			//Scroll
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='MY ORDERS']"));
			
			
			
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='IssueInitiated']")).size() == 0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
				
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='August 03, 10:13 PM']")).size() != 0)
				{
					objPojo.getObjUtilities().logReporter("<B> Sorry No IssueInitiated Product here in your Ordered Items </B>",false);
					break;	
				}
			}
			
			
			
			objPojo.getObjUtilities().logReporter("Clicked On IssueInitiated Orders Button",objPojo.getObjWrapperFunctions().clickException(IssueInitiatedOrder,"Issue Initiated Order Product"));
			Thread.sleep(3000);
			//Checking if PROducts,Shipping address,Order No are there or not
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Order No.')]")).size()==0 && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[ends-with(@text,'India')]")).size()==0	&& objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Error in  IssueInitiatedOrder ORDER");
			}
			
			
			String ProcessText  = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='IssueInitiated']")).getText();
			//Assert 
			if(ProcessText.equalsIgnoreCase("IssueInitiated"))
			{
				objPojo.getObjUtilities().logReporter(" Traversed to IssueInitiatedOrder Orders Succesfull",true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter(" Failed Traversed to IssueInitiatedOrder Orders Succesfull",false);
			}	
			
			
			
			objPojo.getObjUtilities().logReporter("Your Order type is "+ProcessText,true);
			System.out.println("Your Order type is "+ProcessText);
			
			//Order No
			String OrderNo = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
			objPojo.getObjUtilities().logReporter(" "+OrderNo,true);

			
		}

		
		
		
		
		
}	
	public void CustomerService() 
	{
		
		//For Customer Service
		objPojo.getObjUtilities().logReporter("Clicked On My Orders Button ",
				objPojo.getObjWrapperFunctions().click(MyOrdersButton));
		
		
		objPojo.getObjUtilities().logReporter("Clicked On Customer Care Section ",
				objPojo.getObjWrapperFunctions().click(Customercare));
	}
	
	
	
	
	//My Address
	public void FillMyProfileMyAddress() throws InterruptedException {
		
		String AddressAction = objPojo.getEntityRunner().getStringValueForField("AddressAction");
		objPojo.getObjUtilities().logReporter("Clicked on My Address Button "
				,objPojo.getObjWrapperFunctions().click(MyAddressButton));
		
		
		Thread.sleep(1300);
		//Assert My Address
		String ShippingAddressStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='SHIPPING ADDRESSES']")).getText();
		if(ShippingAddressStr.equalsIgnoreCase("SHIPPING ADDRESSES"))
			{
			objPojo.getObjUtilities().logReporter("<B> Traversed to Shipping Succesfully </B>", true);
			}
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Unable to Traverse To Shipping </B>", false);
		}
		
		
		
		//Performing Other Actions
		if(AddressAction.equalsIgnoreCase("AddAddress"))
		{
			
			int AddressintBefore = objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Edit']")).size();
			
			objPojo.getObjUtilities().logReporter("Clicked on AddUp Address",
					objPojo.getObjWrapperFunctions().click(AddupADDRESS));
		}
		
		if(AddressAction.equalsIgnoreCase("EditAddress"))
		{
			objPojo.getObjUtilities().logReporter("Clicked On Edit Address Button ",
					objPojo.getObjWrapperFunctions().click(EditAddress));
			
			Thread.sleep(1400);
			//Assert 
			String DeliverLocaationStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Select Delivery Location']")).getText();
			if(DeliverLocaationStr.equalsIgnoreCase("Select Delivery Location"))
			{
				objPojo.getObjUtilities().logReporter("<B> Traversed to Editing Delivery Address Module</B>", true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter("<B> Failed to Traverse to Editing Delivery Address Module</B>", true);
			}
			//Traverse To Address Module
		}
		
		if(AddressAction.equalsIgnoreCase("DeleteAddress"))
		{
			
			int AddressintBefore = objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Edit']")).size();
			
			objPojo.getObjUtilities().logReporter("Clicked on Delete Address Button ",
					objPojo.getObjWrapperFunctions().click(DeleteAddress));
			
			
			//Verifying 
			Thread.sleep(700);
			int AddressintAfter = objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Edit']")).size();
			
			if(!(AddressintAfter==AddressintBefore-1))
			{
				Assert.assertEquals(false, true,"Address deletion issue ");
			}
			
		}
		
		if(AddressAction.equalsIgnoreCase("UseAsShipping"))
		{
			if(objPojo.getDriver().findElements(By.xpath("(//android.widget.CheckBox)[2]")).size()!=0)
			{
			objPojo.getObjUtilities().logReporter("Clicked On Use as Shipping Address Button",
					objPojo.getObjWrapperFunctions().clickException(UseasShippingAddress,"UseasShippingAddressButton"));
		}
			else
			{
				objPojo.getObjUtilities().logReporter("Sorry Extra Address is Added up to Change from Shipping Address",true);	
			}
			
	  }	 
	}
	
	//Settings
	public void FillMyProfileSettings() throws InterruptedException {
		
		String LogoutOption = objPojo.getEntityRunner().getStringValueForField("ProfileType");
		objPojo.getObjUtilities().logReporter("Clicked On Settings Button ",
				objPojo.getObjWrapperFunctions().click(SettingsButton));
		
		//Asserting if traversed to Settings 
		String SettingsStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Settings']")).getText();
		String FullNameStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Full Name']//preceding::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")).getText();
		String DOBStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Date of Birth']//following-sibling::android.widget.TextView")).getText();
		String MobileNumberStr = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[@text='Mobile Number']//preceding::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText)[2]")).getText();

		
		
		
		if(SettingsStr.equalsIgnoreCase("Settings")  && FullNameStr.length()>1 && DOBStr.length()>1 && MobileNumberStr.length()>1)
		{
			objPojo.getObjUtilities().logReporter("<B> Traversed to Settings  Successfully </B>", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Traversed to Setting is UnSuccessful </B>", false);
		}
		
		
		
		if(LogoutOption.equalsIgnoreCase("Settings-Password"))
		{
			objPojo.getObjUtilities().logReporter("Clicked On Change Password Button ",
					objPojo.getObjWrapperFunctions().click(ChangePassword));
			
			objPojo.getObjUtilities().logReporter("Clicked On OldPassword Field ",
					objPojo.getObjWrapperFunctions().click(OldPasswdField));
			
			objPojo.getObjUtilities().logReporter("Typing Old Password.....",
					objPojo.getObjWrapperFunctions().clearAndSendKeysNull(OldPasswdField, objPojo.getEntityRunner().getStringValueForField("OldPassword") , ""));
		
			objPojo.getObjUtilities().logReporter("Clicked On NewPassword Field",
					objPojo.getObjWrapperFunctions().click(NewPasswdField));
			
			objPojo.getObjUtilities().logReporter("Typing New Password.....",
					objPojo.getObjWrapperFunctions().clearAndSendKeysNull(NewPasswdField, objPojo.getEntityRunner().getStringValueForField("NewPassword") , ""));
			
		objPojo.getObjWrapperFunctions().click(RepeatNewPasswdField);
		
		objPojo.getObjUtilities().logReporter("ReTyping New Password.....",
				objPojo.getObjWrapperFunctions().clearAndSendKeysNull(RepeatNewPasswdField, objPojo.getEntityRunner().getStringValueForField("ConfirmPassword"), "" ));
		
		//Save password Button
		objPojo.getObjWrapperFunctions().click(SavePasswordBtn);
		
		//Verifying Password Type
		String ScanerioType = objPojo.getEntityRunner().getStringValueForField("ScanerioType");
		if(ScanerioType.equalsIgnoreCase("Positive-Password"))
		{
			//ConfirmPassword
			Thread.sleep(1000);
			objPojo.getObjWrapperFunctions().click(YesChangePassword);
			
			//Assert if Password Change
			Thread.sleep(1800);
			String PasswordChangeStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Password Changed']")).getText();
			if(PasswordChangeStr.equalsIgnoreCase("Password Changed"))
			{
				objPojo.getObjUtilities().logReporter("<B> Password Saved Succesfully </B>", true);
				objPojo.getObjWrapperFunctions().clickException(ConfirmedOkPassword, "ConfirmedOkPassword");
			}
			else
			{
				objPojo.getObjUtilities().logReporter("<B> Unable to Save Password </B>", false);
			}
		}
	    if(ScanerioType.equalsIgnoreCase("Negative-Password"))
		{
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='YES']")).size()!=0)
			{
			objPojo.getObjWrapperFunctions().click(YesChangePassword);
			}
			Thread.sleep(1800);
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='OK']")).size()==0)
			{
				objPojo.getObjUtilities().logReporter("<B> Unable To change Password - Negtive Scanerio Passed  </B>", true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter("<B> Netaive Password Scanerio Failed </B>", false);
			}
		}
		
		
		
		}
		
		if(LogoutOption.equalsIgnoreCase("Settings-Notification"))
		{
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.Switch[@text='OFF']")).size()>0)
			{
			objPojo.getObjUtilities().logReporter("Clicked on Sales and Promotions ",
					objPojo.getObjWrapperFunctions().click(SalesnPromotions));
			
			Thread.sleep(1000);
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.Switch[@text='ON']")).size()==0)
			{
				Assert.assertEquals(true, false ,"Error in Switching Sales and promotion");
			}
			
			}
			
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.Switch[@text='ON']")).size()>0)
			{
			objPojo.getObjUtilities().logReporter("Clicked on Sales and Promotions ",
					objPojo.getObjWrapperFunctions().click(SalesnPromotions));
			
			Thread.sleep(1000);
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.Switch[@text='OFF']")).size()==0)
			{
				Assert.assertEquals(true, false ,"Error in Switching Sales and promotion");
			}
			
			}
			
			
	}
	
	}
	
	//Log-Out
	public void FillMyProfileLogout() throws InterruptedException {
			
			//waiting for 2.5sec
			Thread.sleep(2500);
			
		//Assert Logout Button
		String logoutStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Log out']")).getText();	
		if(logoutStr.equalsIgnoreCase("Log out"))
		{
			objPojo.getObjUtilities().logReporter("<B> Log Out Button is Displayed under My Profiles </B>", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Unable to display Log Out Button under My Profiles </B>", false);
		}
		
		
		
		//LOGING OUT! Bye
		String LogoutOption = objPojo.getEntityRunner().getStringValueForField("LogoutOption");
		 
		if(LogoutOption.equalsIgnoreCase("Yes"))
		{
			//waiting for 1.5sec
				Thread.sleep(1500);
		objPojo.getObjUtilities().logReporter("Clicked On LogOut Button and Selecting Yes",objPojo.getObjWrapperFunctions().click(LogoutButton));
		objPojo.getObjWrapperFunctions().click(YesLogout);
		Thread.sleep(1500);
		
		//Verify If logged out Properly
		String Loginstr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Login to your account to get #spiritzoned!']")).getText();
		if(Loginstr.equalsIgnoreCase("Login to your account to get #spiritzoned!"))
		{
			objPojo.getObjUtilities().logReporter("<B> Logged Out Succesfully </B>", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Error in Logging Out</B>", false);
		}
		
		
		}
		
		if(LogoutOption.equalsIgnoreCase("No"))
		{
		objPojo.getObjUtilities().logReporter("Clicked On Logout Button and Selecting No ",objPojo.getObjWrapperFunctions().click(LogoutButton));
		objPojo.getObjWrapperFunctions().click(NoLogout);
		Thread.sleep(1500);
		
		//Verify If Not logged out
				String myProfileStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text = 'My Profile']")).getText();
				
				if(myProfileStr.equalsIgnoreCase("My Profile"))
				{
					objPojo.getObjUtilities().logReporter("<B> Traversed to My Profile Successful </B>", true);
				}
				else
				{
					objPojo.getObjUtilities().logReporter("<B> Traversed to My Profile failed </B>", false);
				}
		
		}	
	}
	
	
	public void FillMyProfileModules() throws InterruptedException 
	{
		
		objPojo.getObjUtilities().logReporter("<B>Traversed to My Profiles</B>",true);
		
		//CLICKING ON MY PROFILE SECTION
		String Traversefrom = objPojo.getEntityRunner().getStringValueForField("TraverseFrom");
		if(Traversefrom.equalsIgnoreCase("CART"))
		{
			objPojo.getObjWrapperFunctions().click(Cart);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("(//android.widget.TextView[@text='CART'])[1]"));	
		}
		else if(Traversefrom.equalsIgnoreCase("FAVORITES"))
		{
			objPojo.getObjWrapperFunctions().click(Favourites);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("(//android.widget.TextView[@text='FAVORITES'])[1]"));	
		}
		else if(Traversefrom.equalsIgnoreCase("SUPPORT"))
		{
			objPojo.getObjWrapperFunctions().click(Support);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("(//android.widget.TextView[@text='SUPPORT'])[1]"));	
		}	
		
		objPojo.getObjUtilities().logReporter("Clicked On My Profile ",objPojo.getObjWrapperFunctions().click(MyProfileButton));
		objPojo.getObjWrapperFunctions().waitForElementToBeClickable(SettingsButton);
		
		//Asserting UserName and Password 
		int NameSize = objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+objPojo.getEntityRunner().getStringValueForField("UserName")+"']")).size();
		int EmailSize = objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+objPojo.getEntityRunner().getStringValueForField("Email")+"']")).size();
		if(NameSize==0 && EmailSize==0)
		{
			Assert.assertEquals(false, true,"Error in UserName and Email ID");
		}
		
		
		
		
		//Asserting if we're traversed to MY PROFILE
		String myProfileStr = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text = 'My Profile']")).getText();
		
		if(myProfileStr.equalsIgnoreCase("My Profile"))
		{
			objPojo.getObjUtilities().logReporter("<B> Traversed to My Profile Successful </B>", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Traversed to My Profile failed </B>", false);
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		//Type of Module we are gonna perform actions on
		String ProfileModuleType = objPojo.getEntityRunner().getStringValueForField("ProfileType");
		
		if(ProfileModuleType.equalsIgnoreCase("MyOrder"))
		{
			
		objPojo.getObjUtilities().logReporter("<B>Traversed TO My Order Section </B>",true);
		FillMyProfileYourOrder();
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		if(ProfileModuleType.equalsIgnoreCase("MyAddress"))
		{
		objPojo.getObjUtilities().logReporter("<B>Traversed TO My Address </B>",true);
		
		FillMyProfileMyAddress();
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		if(ProfileModuleType.equalsIgnoreCase("CustomerService"))
		{
			objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Customer Service </B>",true);
			CustomerService();
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		if(ProfileModuleType.equalsIgnoreCase("Settings") ||ProfileModuleType.equalsIgnoreCase("Settings-Password")|| ProfileModuleType.equalsIgnoreCase("Settings-Notification"))
		{
		FillMyProfileSettings();
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		if(ProfileModuleType.equalsIgnoreCase("Logout"))
		{
		FillMyProfileLogout();
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}
}
