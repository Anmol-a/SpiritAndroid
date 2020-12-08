package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.digester.ObjectParamRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SpiritSupport {
	
	
	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	By SupportModuleBtn;
	By ViewOlderBtn;
	
	//Change it later
	By FailedOrderID;
	By DeliveredOrderID;
	By ApprovedOrderID;
	
	//Xpaths for Queries APPROVED
	By OrderReceive;
	By OrderPacked;
	By OrderDelayed;
	By CancelOrder;
	By IncorrectOrder;
	By MakeOrderChanges;
	By ChangeDeliveryLocation;
	
	//Xpaths for Queries DELIVERED
	By NotReceivedOrder;
	By SpillageOrder;
	By MissingIncorrect;
	By TasteQualityQuantityIssue;
	By PaymentBillingIssue;
	By Invoice;
	
	
	//OneTOFifth Product
	By FirstProduct;
	By SecondProduct;
	By ThirdProduct;
	By ForthProduct;
	By FifthProduct;
	
	//SubQuery
	By FirstSubQuery;
	By SecondSubQuery;
	
	
	By ConcernInput;
	By SubmitBtn;
	By Cart;
	By Favourites;
	By MyProfile;
	
	//Addto Gallery and Other Stuffs
	By ClipBtn;
	By Camera;
	By Gallery;
	
	
	//Allow
	By Allow;
	By Deny;
	
	
	public SpiritSupport(Pojo objPojo)
	{
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		Cart = By.xpath("//android.widget.TextView[@text='CART']");
		Favourites = By.xpath("//android.widget.TextView[@text='FAVORITES']");
		MyProfile = By.xpath("//android.widget.TextView[@text='MY PROFILE']");
		
		//X-paths
		SupportModuleBtn = By.xpath("//android.widget.TextView[@text='SUPPORT']");
		ViewOlderBtn = By.xpath("//android.widget.Button[@text='VIEW OLDER MESSAGES']");
		FailedOrderID = By.xpath("(//android.widget.TextView)[6]");
		DeliveredOrderID = By.xpath("(//android.widget.TextView)[10]");
		ApprovedOrderID = By.xpath("//android.widget.FrameLayout/android.widget.TextView[contains(@text,'Approved')]");
		
		//One-to-Five
		FirstProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[starts-with(@text,'OrderID')])[1]");
		SecondProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[starts-with(@text,'OrderID')])[2]");		
		ThirdProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[starts-with(@text,'OrderID')])[3]");
		ForthProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[starts-with(@text,'OrderID')])[4]");
		FifthProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[starts-with(@text,'OrderID')])[5]");
		
		//Sub-Query
		FirstSubQuery = By.xpath("//android.widget.TextView[starts-with(@text,'Please select ')]//parent::android.view.ViewGroup[1]//following-sibling::android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]");
		
		
		//Questions
		OrderReceive = By.xpath("//android.widget.TextView[@text='When will I receive my order?']");
		OrderPacked  = By.xpath("//android.widget.TextView[@text='Why is my order not packed yet?']");
		OrderDelayed = By.xpath("//android.widget.TextView[@text='My order is delayed']");
		CancelOrder	= By.xpath("//android.widget.TextView[@text='I want to cancel my order']");
		IncorrectOrder = By.xpath("//android.widget.TextView[@text='I have placed an incorrect order']");
		MakeOrderChanges = By.xpath("//android.widget.TextView[@text='I want to make changes to my order']");
		ChangeDeliveryLocation = By.xpath("//android.widget.TextView[@text='I want to change my delivery location']");
		
		NotReceivedOrder = By.xpath("//android.widget.TextView[@text='I have not received my order']");
		SpillageOrder = By.xpath("//android.widget.TextView[@text='I have packaging or spillage issue with my order']");
		MissingIncorrect = By.xpath("//android.widget.TextView[@text='Items are missing or incorrect in my order']");
		TasteQualityQuantityIssue = By.xpath("//android.widget.TextView[@text='I have food taste, quality or quantity issue with my order']");
		PaymentBillingIssue = By.xpath("//android.widget.TextView[@text='I have payment and billing related query for my order']");
		Invoice = By.xpath("//android.widget.TextView[@text='I want an invoice for this order']");
			
		ConcernInput = By.xpath("//android.widget.EditText[@text='Type here']");
		SubmitBtn = By.xpath("//android.widget.EditText[@text='Type here']//parent::android.view.ViewGroup[1]//following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
		
		ClipBtn = By.xpath("//android.widget.EditText[@text='Type here']//parent::android.view.ViewGroup[1]//parent::android.view.ViewGroup[1]/android.widget.ImageView");
		Camera = By.xpath("//android.widget.TextView[@text='Select from Camera']");
		Gallery = By.xpath("//android.widget.TextView[@text='Select from Gallery']");
		
		Allow = By.xpath("//android.widget.Button[@text='ALLOW']");
		Deny = By.xpath("//android.widget.Button[@text='DENY']");
		
	}
	
	
	public void FillandSubmitSupportModule() throws InterruptedException
	{
				
		//Assertion for Support Module
		Thread.sleep(2500);
		String Support = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='SUPPORT']")).getText();
		if(Support.equalsIgnoreCase("SUPPORT"))
		{
			objPojo.getObjUtilities().logReporter("<B> Traversed to Support Module </B>", true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("<B>  Failed To Travese to Support Module </B>", false);	
		}
		
		
		System.out.println("Traversed To SUPPORT MODULE!!!!!");
		
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigOlderMessage"))
		{
			//Clicking Older Messages
			objPojo.getObjUtilities().logReporter("Clicked On View Older Button ",objPojo.getObjWrapperFunctions().click(ViewOlderBtn));
			Thread.sleep(1000);
			
			String AssertOlder = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[@text='Welcome to spiritzone. Please select below orderID'])[1]")).getText();
			if(AssertOlder.equalsIgnoreCase("Welcome to spiritzone. Please select below orderID"))
			{
				objPojo.getObjUtilities().logReporter("<B> Traversed to Older Messages in Support Module </B>", true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter("<B>  Failed To Travese to Older Messages in Support Module </B>", false);	
			}	
				
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigGalleryCamera"))
		{
			
			objPojo.getObjWrapperFunctions().click(FirstProduct);
			objPojo.getObjWrapperFunctions().click(FirstSubQuery);
			
			Thread.sleep(1700);
			if(objPojo.getEntityRunner().getStringValueForField("GalleryCameraAction").equalsIgnoreCase("Camera"))
			{
				objPojo.getObjWrapperFunctions().waitForElementPresence(ConcernInput);
				objPojo.getObjWrapperFunctions().clickException(ClipBtn, "ClickButton");
				objPojo.getObjWrapperFunctions().clickException(Camera, "Camera");
				
				
				for(int x =0;x<2;x++)
				{
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='ALLOW']")).size()!=0)
				{
					objPojo.getObjWrapperFunctions().clickException(Allow, "Allow");
				}
				}		
			}
			
			if(objPojo.getEntityRunner().getStringValueForField("GalleryCameraAction").equalsIgnoreCase("Gallery"))
			{
				objPojo.getObjWrapperFunctions().waitForElementPresence(ConcernInput);
				objPojo.getObjWrapperFunctions().clickException(ClipBtn, "ClickButton");
				objPojo.getObjWrapperFunctions().clickException(Gallery, "Camera");
				
				
				for(int x =0;x<2;x++)
				{
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='ALLOW']")).size()!=0)
				{
					objPojo.getObjWrapperFunctions().clickException(Allow, "Allow");
				}
				}		
			}
			
			
			//AssertIF Traversed
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.EditText[@text='Type here']")).size()!=0)
			{
				Assert.assertEquals(false, true,"ERROR AT SELECTING CAMERA GALLERY At SUPPORT MODULE");
			}
			
		}
		
		
		
		
		
		
		
		
		//First 5 product to be clicked
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCheckClickable"))
		{
			String WhichOneToclick = objPojo.getEntityRunner().getStringValueForField("CheckClickable");
			Thread.sleep(1700);
			
			if(WhichOneToclick.equalsIgnoreCase("First"))
			{
				objPojo.getObjWrapperFunctions().clickException(FirstProduct,"First Product");
				objPojo.getObjWrapperFunctions().clickException(FirstSubQuery,"First Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Second"))
			{
				objPojo.getObjWrapperFunctions().clickException(SecondProduct,"Second Product");
				objPojo.getObjWrapperFunctions().clickException(FirstSubQuery,"First Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Third"))
			{
				objPojo.getObjWrapperFunctions().clickException(ThirdProduct,"Third Product");	
				objPojo.getObjWrapperFunctions().clickException(FirstSubQuery,"First Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Forth"))
			{
				objPojo.getObjWrapperFunctions().clickException(ForthProduct,"Forth Product");
				objPojo.getObjWrapperFunctions().clickException(FirstSubQuery,"First Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Fifth"))
			{
				objPojo.getObjWrapperFunctions().clickException(FifthProduct,"Fifth Product");
				objPojo.getObjWrapperFunctions().clickException(FirstSubQuery,"First Product");
			}
			
			//Concern Input
			objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
			
			//Assert
			Thread.sleep(5000);
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[starts-with(@text,'Thank you')]")).size()==0)
			{
				Assert.assertEquals(false, true,"Unable to Issue Ticket ");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		if(objPojo.getEntityRunner().getBooleanValueForField("ConfigOverallCheck"))
		{
			int X =0;
			
			
			
			
			if(objPojo.getEntityRunner().getStringValueForField("OrderIDCheckOverall").equalsIgnoreCase("First"))
			{
				X=1;
			}
			
			if(objPojo.getEntityRunner().getStringValueForField("OrderIDCheckOverall").equalsIgnoreCase("Second"))
			{
				X=2;
			}
			
			
			if(objPojo.getEntityRunner().getStringValueForField("OrderIDCheckOverall").equalsIgnoreCase("Third"))
			{
				X=3;
			}
			
			if(objPojo.getEntityRunner().getStringValueForField("OrderIDCheckOverall").equalsIgnoreCase("Forth"))
			{
				X=4;
			}
			
			
			if(objPojo.getEntityRunner().getStringValueForField("OrderIDCheckOverall").equalsIgnoreCase("Fifth"))
			{
				X=5;
			}

			
	
				
			String FirstORderID=objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[starts-with(@text,'OrderID is')])["+X+"]")).getText();
			String str = FirstORderID.replaceAll("\\s+$", "");
			String FirstStringlastWord = str.substring(str.lastIndexOf(" ")+1);
	
			
			String SecondORderID=objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[starts-with(@text,'OrderID is')])[2]")).getText();
			String str2 = SecondORderID.replaceAll("\\s+$", "");
			String SecondStringlastWord = str2.substring(str2.lastIndexOf(" ")+1);
			
			String ThridORderID=objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[starts-with(@text,'OrderID is')])[3]")).getText();
			String str3 = ThridORderID.replaceAll("\\s+$", "");
			String ThirdStringlastWord = str3.substring(str3.lastIndexOf(" ")+1);
			
			String ForthOrderID=objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[starts-with(@text,'OrderID is')])[4]")).getText();
			String str4 = ForthOrderID.replaceAll("\\s+$", "");
			String ForthStringlastWord = str4.substring(str4.lastIndexOf(" ")+1);
			
			String FifthOrderID=objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[starts-with(@text,'OrderID is')])[5]")).getText();
			String str5 = FifthOrderID.replaceAll("\\s+$", "");
			String FifthStringlastWord = str5.substring(str5.lastIndexOf(" ")+1);
			
			
			
			ArrayList<String> OrderIDLastStrings = new ArrayList<>();
			OrderIDLastStrings.add(FirstStringlastWord);
			OrderIDLastStrings.add(SecondStringlastWord);
			OrderIDLastStrings.add(ThirdStringlastWord);
			OrderIDLastStrings.add(ForthStringlastWord);
			OrderIDLastStrings.add(FifthStringlastWord);
			
			
			
			

			
			
			if(FirstStringlastWord.equalsIgnoreCase("Canceled"))
			{
				objPojo.getObjUtilities().CustomLogger("Clicked on Cacelled Type Order ID");
				
				//clicking on CANCELLED
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over First Cancel Order
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='What is Spiritzone’s cancellation policy?']"));
				objPojo.getObjUtilities().CustomLogger("Selecting and completing for What is Spiritzone’s cancellation policy?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on CANCELLED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Why was my order cancelled?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Why was my order cancelled?']"));
				objPojo.getObjUtilities().CustomLogger("Why was my order cancelled?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on CANCELLED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='How can I cancel my order?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='How can I cancel my order?']"));
				objPojo.getObjUtilities().CustomLogger("How can I cancel my order?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on CANCELLED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I was charged a cancellation fee']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I was charged a cancellation fee']"));
				objPojo.getObjUtilities().CustomLogger("I was charged a cancellation fee");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on CANCELLED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I just cancelled my order. When will receive my refund?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I just cancelled my order. When will receive my refund?']"));
				objPojo.getObjUtilities().CustomLogger("I just cancelled my order. When will receive my refund?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
			}
			
			
			if(FirstStringlastWord.equalsIgnoreCase("Approved") || FirstStringlastWord.equalsIgnoreCase("Process") || FirstStringlastWord.equalsIgnoreCase("Packed") || FirstStringlastWord.equalsIgnoreCase("Delivery"))
			{
				//clicking on In Process
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over First In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='When will I receive my order?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='When will I receive my order?']"));
				objPojo.getObjUtilities().CustomLogger("Selecting and completing for When Will I Receieve My Order?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				//clicking on In Process
				if(  !(FirstStringlastWord.equalsIgnoreCase("Delivery")) &&  !(FirstStringlastWord.equalsIgnoreCase("Approved") ))
				{
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Why is my order not out for delivery yet?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Why is my order not out for delivery yet?']"));
				objPojo.getObjUtilities().CustomLogger("Why is my order not out for delivery yet?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				}
				
				
				
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='My order is delayed']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='My order is delayed']"));
				objPojo.getObjUtilities().CustomLogger("My order is delayed");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want to cancel my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want to cancel my order']"));
				objPojo.getObjUtilities().CustomLogger("I want to cancel my Order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				if(!FirstStringlastWord.equalsIgnoreCase("Delivery"))
				{
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I have placed an incorrect order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have placed an incorrect order']"));
				objPojo.getObjUtilities().CustomLogger("I have placed an incorrect order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				}
				
				
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want to make changes to my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want to make changes to my order']"));
				objPojo.getObjUtilities().CustomLogger("I want to make changes to my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want to change my delivery location']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want to change my delivery location']"));
				objPojo.getObjUtilities().CustomLogger("I want to change my delivery location");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				if(FirstStringlastWord.equalsIgnoreCase("Process"))
				{
				//clicking on In Process
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second In Process Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want to make an online payment for this order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want to make an online payment for this order']"));
				objPojo.getObjUtilities().CustomLogger("I want to change my delivery location");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
			}
				
				
				if(FirstStringlastWord.equalsIgnoreCase("Delivery"))
			{

					//clicking on In Process
					Thread.sleep(5000);
					objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
					objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
					//Iterating Over Second In Process Order
					Thread.sleep(5000);
					objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I am unable to contact the delivery agent']"));
					objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I am unable to contact the delivery agent']"));
					objPojo.getObjUtilities().CustomLogger("I want to change my delivery location");
					//SendKeys in Concern Input
					objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
					
			}
		}
			
			
			//DELIVERED-----------------------------------------
			if(FirstStringlastWord.equalsIgnoreCase("Delivered"))
			{

				objPojo.getObjUtilities().CustomLogger("Clicked on Delivered Type Order ID");
				
				
				//clicking on DELIVERED
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over First Cancel Order
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have not received my order']"));
				objPojo.getObjUtilities().CustomLogger("I have not received my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on DELIVERED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Second Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I have packaging or spillage issue with my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have packaging or spillage issue with my order']"));
				objPojo.getObjUtilities().CustomLogger("I have packaging or spillage issue with my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on DELIVERED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Items are missing or incorrect in my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Items are missing or incorrect in my order']"));
				objPojo.getObjUtilities().CustomLogger("Items are missing or incorrect in my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on DELIVERED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I have taste, quality or quantity issue with my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have taste, quality or quantity issue with my order']"));
				objPojo.getObjUtilities().CustomLogger("I have taste, quality or quantity issue with my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on DELIVERED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I have payment and billing related query for my order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have payment and billing related query for my order']"));
				objPojo.getObjUtilities().CustomLogger("I have payment and billing related query for my order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
			
				
				//clicking on DELIVERED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over Third Cancel Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want an invoice for this order']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want an invoice for this order']"));
				objPojo.getObjUtilities().CustomLogger("I want an invoice for this order");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
			}
			
			
			
			//FAILED-----------------------------------------
			if(FirstStringlastWord.equalsIgnoreCase("Failed"))
			{
				//clicking on FAILED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over FAILED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='The transaction failed but the amount deducted from the bank account']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='The transaction failed but the amount deducted from the bank account']"));
				objPojo.getObjUtilities().CustomLogger("The transaction failed but the amount deducted from the bank account");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on FAILED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over FAILED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='The transaction was successful, but the amount is not deducted from the bank account']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='The transaction was successful, but the amount is not deducted from the bank account']"));
				objPojo.getObjUtilities().CustomLogger("The transaction failed but the amount deducted from the bank account");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				
				//clicking on FAILED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over FAILED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I was not able to make the payment']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I was not able to make the payment']"));
				objPojo.getObjUtilities().CustomLogger("I was not able to make the payment");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				
				//clicking on FAILED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over FAILED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Can I use a different mode of payment for my order?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Can I use a different mode of payment for my order?']"));
				objPojo.getObjUtilities().CustomLogger("Can I use a different mode of payment for my order?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
			}
			
			//REFUNDED-------------------------------------------
			if(FirstStringlastWord.equalsIgnoreCase("Refunded"))
			{
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I want to know the status of my refund']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I want to know the status of my refund']"));
				objPojo.getObjUtilities().CustomLogger("I want to know the status of my refund");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I requested for a refund, but I do not see it in my bank account. Where is my refund?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I requested for a refund, but I do not see it in my bank account. Where is my refund?']"));
				objPojo.getObjUtilities().CustomLogger("I requested for a refund, but I do not see it in my bank account. Where is my refund?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='It has been more than 30 days since I requested a refund and I haven’t received it yet. What should I do now?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='It has been more than 30 days since I requested a refund and I haven’t received it yet. What should I do now?']"));
				objPojo.getObjUtilities().CustomLogger("It has been more than 30 days since I requested a refund and I haven’t received it yet. What should I do now?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Where can I check my refund status?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Where can I check my refund status?']"));
				objPojo.getObjUtilities().CustomLogger("Where can I check my refund status?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='When I issue a refund, are the transaction fees returned?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='When I issue a refund, are the transaction fees returned?']"));
				objPojo.getObjUtilities().CustomLogger("When I issue a refund, are the transaction fees returned?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();	
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			//Returned-----------------------------------------
			if(FirstStringlastWord.equalsIgnoreCase("Returned"))
			{
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='How long does the Spiritzone return process take?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='How long does the Spiritzone return process take?']"));
				objPojo.getObjUtilities().CustomLogger("How long does the Spiritzone return process take?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I have returned my order. When will I receive a refund?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I have returned my order. When will I receive a refund?']"));
				objPojo.getObjUtilities().CustomLogger("I have returned my order. When will I receive a refund?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='I returned the wrong items']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='I returned the wrong items']"));
				objPojo.getObjUtilities().CustomLogger("I returned the wrong items");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				//clicking on RETURNED
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+FirstORderID+"']"));
				//Iterating Over RETURNED  Order
				Thread.sleep(5000);
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[@text='Can I get a replacement for the items returned?']"));
				objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='Can I get a replacement for the items returned?']"));
				objPojo.getObjUtilities().CustomLogger("Can I get a replacement for the items returned?");
				//SendKeys in Concern Input
				objPojo.getObjWrapperFunctions().SendKeysinConcernINput();
				
				
				
				
				
			}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFailedOrderID")) {
			//CLICKING ON FIRST ORDER ID
			objPojo.getObjUtilities().logReporter("Clicked On Failed Order Module ",objPojo.getObjWrapperFunctions().click(FailedOrderID));	
			System.out.println("Clicked on Failed Order ID");
			
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigDeliveredOrderID")) {
			//SECOND ORDER ID
			objPojo.getObjUtilities().logReporter("Clicked On Delivered Order Module ",objPojo.getObjWrapperFunctions().click(DeliveredOrderID));
			System.out.println("Clicked on Delivered Order ID");
			
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigApprovedOrderID")) {
			//SECOND ORDER ID
			//Assert if Clicked Correctly
			//Thread.sleep(6200);
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.FrameLayout/android.widget.TextView[contains(@text,'Approved')]")).size()!=0)
			{	
			objPojo.getObjUtilities().logReporter("Clicked On Approved Order Module ",objPojo.getObjWrapperFunctions().click(ApprovedOrderID));
			objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.TextView[@text='Please select questions for Approved']"));

			System.out.println("Clicked on Delivered Order ID");
			}
			
			else
			{
				objPojo.getObjUtilities().logReporter("<B>  No Approved Order Found </B>",false);
			}
			
		}
		
		
		
		
		//SELECTING QUERY TYPE
		String QueryType = objPojo.getEntityRunner().getStringValueForField("QueryType");
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigQueryType")) 
		{
			String issue = "Facing Issue";
			
			if (QueryType.equalsIgnoreCase("OrderReceive"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Order Received ",objPojo.getObjWrapperFunctions().click(OrderReceive));		
			}
			else if (QueryType.equalsIgnoreCase("OrderPacked"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Order Packed ",objPojo.getObjWrapperFunctions().click(OrderPacked));
			}
			else if (QueryType.equalsIgnoreCase("OrderDelayed"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Order Delayed",objPojo.getObjWrapperFunctions().click(OrderDelayed));
			}
			else if (QueryType.equalsIgnoreCase("CancelOrder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Cancel Order ",objPojo.getObjWrapperFunctions().click(CancelOrder));
			}
			else if (QueryType.equalsIgnoreCase("IncorrectOrder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Incorrect Order ",objPojo.getObjWrapperFunctions().click(IncorrectOrder));
			}
			else if (QueryType.equalsIgnoreCase("MakeOrderChanges"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Make Order Changes Button ",objPojo.getObjWrapperFunctions().click(MakeOrderChanges));
			}
			else if (QueryType.equalsIgnoreCase("ChangeDeliveryLocation"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Changing Delivery Location ",objPojo.getObjWrapperFunctions().click(ChangeDeliveryLocation));
			}	
			
			
			//DELIVERED ITEM
			else if (QueryType.equalsIgnoreCase("NotReceivedOrder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Not Received Order ",objPojo.getObjWrapperFunctions().click(NotReceivedOrder));
			}
			else if (QueryType.equalsIgnoreCase("SpillageOrder"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Spillage",objPojo.getObjWrapperFunctions().click(SpillageOrder));
			}
			else if (QueryType.equalsIgnoreCase("MissingIncorrect"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Missing Incorrect Order ",objPojo.getObjWrapperFunctions().click(MissingIncorrect));
			}
			else if (QueryType.equalsIgnoreCase("TasteQualityQuantityIssue"))
			{
				objPojo.getObjUtilities().logReporter("Clicked on Taste Quality Issues ",objPojo.getObjWrapperFunctions().click(TasteQualityQuantityIssue));
			}
			else if (QueryType.equalsIgnoreCase("PaymentBillingIssue"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Payment Billing Issues",objPojo.getObjWrapperFunctions().click(PaymentBillingIssue));
			}
			else if (QueryType.equalsIgnoreCase("Invoice"))
			{
				objPojo.getObjUtilities().logReporter("Clicked On Invoice ",objPojo.getObjWrapperFunctions().click(Invoice));
			}
			
			//Clearing and sending input as String
			Thread.sleep(2500);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(ConcernInput);
			objPojo.getObjUtilities().logReporter("Typed Issue as ",objPojo.getObjWrapperFunctions().clearAndSendKeys(ConcernInput,issue));	
			//Urgent change submit button xpath
			objPojo.getObjUtilities().logReporter("Clicked On Submit Button ",objPojo.getObjWrapperFunctions().click(SubmitBtn));
			
			
			//assertion
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("//android.widget.TextView[contains(@text,'Thank you for raising the ticket.')]"));
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[contains(@text,'Thank you for raising the ticket.')]")).size()!=0)
			{
				objPojo.getObjUtilities().logReporter("<B>  Sucessfully Typed into Input Field </B>",true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter("<B>  Failed to type into input field </B>",false);
			}
		
		}
		
	}
		
	public void fillSupportModule() throws InterruptedException {
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Support Module </B>",true);
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
		else if(Traversefrom.equalsIgnoreCase("MYPROFILE"))
		{
			objPojo.getObjWrapperFunctions().click(MyProfile);
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(By.xpath("(//android.widget.TextView[@text='MY PROFILE'])[1]"));	
		}	
		
		objPojo.getObjUtilities().logReporter("Clicked On Support Module Button ",objPojo.getObjWrapperFunctions().clickException(SupportModuleBtn,"Support Module Button"));

			
		FillandSubmitSupportModule();
	}
	

}
