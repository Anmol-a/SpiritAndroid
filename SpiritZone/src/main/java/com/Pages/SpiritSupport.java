package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.digester.ObjectParamRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	
	
	
	By ConcernInput;
	By SubmitBtn;
	
	
	
	
	
	public SpiritSupport(Pojo objPojo)
	{
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		
		//X-paths
		SupportModuleBtn = By.xpath("//android.widget.TextView[@text='SUPPORT']");
		ViewOlderBtn = By.xpath("//android.widget.Button[@text='VIEW OLDER MESSAGES']");
		FailedOrderID = By.xpath("(//android.widget.TextView)[6]");
		DeliveredOrderID = By.xpath("(//android.widget.TextView)[10]");
		ApprovedOrderID = By.xpath("//android.widget.FrameLayout/android.widget.TextView[contains(@text,'Approved')]");
		
		//One-to-Five
		FirstProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[contains(@text,'OrderID')])[1]");
		SecondProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[contains(@text,'OrderID')])2]");		
		ThirdProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[contains(@text,'OrderID')])[3]");
		ForthProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[contains(@text,'OrderID')])[4]");
		FifthProduct = By.xpath("(//android.widget.FrameLayout/android.widget.TextView[contains(@text,'OrderID')])[5]");
		
		
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
			
		ConcernInput = By.xpath("//android.widget.EditText[@text='Type here...']");
		SubmitBtn = By.xpath("(//android.view.ViewGroup/android.widget.ImageView)[8]");
		
	}
	
	
	public void FillandSubmitSupportModule() throws InterruptedException
	{
		//Clicking on Support Module
		
		objPojo.getObjUtilities().logReporter("Clicked On Support Module Button ",objPojo.getObjWrapperFunctions().clickException(SupportModuleBtn,"Support Module Button"));
		
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
		//objPojo.getObjWrapperFunctions().waitForElementToBeClickable(FailedOrderID);
		
		
		
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
		
		//First 5 product to be clicked
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCheckClickable"))
		{
			String WhichOneToclick = objPojo.getEntityRunner().getStringValueForField("CheckClickable");
			Thread.sleep(1700);
			
			if(WhichOneToclick.equalsIgnoreCase("First"))
			{
				objPojo.getObjWrapperFunctions().clickException(FirstProduct,"First Product");
				
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Second"))
			{
				objPojo.getObjWrapperFunctions().clickException(SecondProduct,"Second Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Third"))
			{
				objPojo.getObjWrapperFunctions().clickException(ThirdProduct,"Third Product");	
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Forth"))
			{
				objPojo.getObjWrapperFunctions().clickException(ForthProduct,"Forth Product");
			}
			
			else if(WhichOneToclick.equalsIgnoreCase("Fifth"))
			{
				objPojo.getObjWrapperFunctions().clickException(FifthProduct,"Fifth Product");
			}
			
			
			
			//Assert if Clicked Correctly
			Thread.sleep(6200);
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.FrameLayout/android.widget.TextView[contains(@text,'Default')]")).size()!=0)
			{
				objPojo.getObjUtilities().logReporter("Clicked Succesfully on "+WhichOneToclick+" Product which is a Default product which has issues", true);	
			}
			
			else
			{
			objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.TextView[@text='Please select questions for Approved']"));
			String AssertCheckProductClicked = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Please select questions for Approved']")).getText();
			if(AssertCheckProductClicked.equalsIgnoreCase("Please select questions for Approved"))
			{
				objPojo.getObjUtilities().logReporter("Clicked Succesfully on "+WhichOneToclick+" Product", true);
			}
			else
			{
				objPojo.getObjUtilities().logReporter("Failed to Click Succesfully on "+WhichOneToclick+" Product", false);
			}
				
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
		FillandSubmitSupportModule();
	}
	

}
