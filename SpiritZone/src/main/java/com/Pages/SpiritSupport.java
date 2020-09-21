package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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
		ApprovedOrderID = By.xpath("(//android.widget.TextView)[7]");
		
		
		
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
		SubmitBtn = By.xpath("(//android.view.ViewGroup/android.widget.ImageView)[7]");
		
	}
	
	
	public void FillandSubmitSupportModule()
	{
		//Clicking on Support Module
		
		objPojo.getObjUtilities().logReporter("Clicked On Support Module Button ",objPojo.getObjWrapperFunctions().click(SupportModuleBtn));
		System.out.println("Traversed To SUPPORT MODULE!!!!!");
		objPojo.getObjWrapperFunctions().waitForElementToBeClickable(FailedOrderID);
		
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigOlderMessage")) {
			//Clicking Older Messages
			objPojo.getObjUtilities().logReporter("Clicked On View Older Button ",objPojo.getObjWrapperFunctions().click(ViewOlderBtn));
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(FailedOrderID);
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
			objPojo.getObjUtilities().logReporter("Clicked On Approved Order Module ",objPojo.getObjWrapperFunctions().click(ApprovedOrderID));
			System.out.println("Clicked on Delivered Order ID");
			
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
			objPojo.getObjWrapperFunctions().waitForElementInVisibilityLocated(ConcernInput);
			objPojo.getObjUtilities().logReporter("Typed Issue as ",objPojo.getObjWrapperFunctions().clearAndSendKeys(ConcernInput,issue));	
			objPojo.getObjUtilities().logReporter("Clicked On Submit Button ",objPojo.getObjWrapperFunctions().click(SubmitBtn));
			objPojo.getObjWrapperFunctions().waitForElementToBeClickable(FailedOrderID);
		
		}
		
	}
		
	public void fillSupportModule() {
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Support Module </B>",true);
		FillandSubmitSupportModule();
	}
	

}
