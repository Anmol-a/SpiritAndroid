package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SpiritZoneSearch {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	By SearchBar;
	By FirstLiquiourProduct;
	By NotifyBtn;
	By AddtoCart;
	
	By Favourites;
	By CartTravserse;

	By AddBtn;
	By PermitNumYes;
	By PermitNumNo;
	By PermitNoInput;
	By OnedayPermitCost;
	By TotalAmount;
	
	
	//mode of paytment
	By PayonOrder;
	By PayonDelivery;
	By COD;
	By OnlineOnDelivery;
	
	//SUbmit Button
	By SubmitBTN;
	
	//Payment Method Online 
	By TestWallet;
	By Success;
	By OrderStatusBtn;
	
	
	
	
	
	public SpiritZoneSearch(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();

	
		//SearchBar = By.xpath("//android.widget.EditText[@text='Search..']");
		SearchBar = By.xpath("//android.widget.EditText[@text='Beer, Rum, Vodka and More']");
		
		
		String Liquior = objPojo.getEntityRunner().getStringValueForField("LiquiorName");
		FirstLiquiourProduct = By.xpath("//android.widget.TextView[@text='"+Liquior+"']");
		
		NotifyBtn = By.xpath("//android.widget.TextView[@text='NOTIFY ME']");
	    AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
		 
		Favourites = By.xpath("");
		CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
		//AddBtn = By.xpath("//android.widget.TextView[@text='1']//following-sibling::android.widget.FrameLayout[1]");
		
		
		PermitNumYes =  By.xpath("//android.widget.TextView[@text='YES']");
		PermitNumNo =  By.xpath("(//android.widget.TextView)[8]");
		PermitNoInput =  By.xpath("//android.widget.EditText[@text='Permit number']");
		
		OnedayPermitCost = By.xpath("//android.widget.TextView[@text='One-day Permit Cost']//following-sibling::android.widget.TextView");
		TotalAmount = By.xpath("//android.widget.TextView[@text='Total Amount']//following-sibling::android.widget.TextView");
	
		//PAYMENTS Scroll
		PayonOrder= By.xpath("//android.widget.TextView[@text='Pay On Order']");
		PayonDelivery= By.xpath("//android.widget.TextView[@text='Pay On Delivery']");
		COD= By.xpath("//android.widget.TextView[@text='Cash On Delivery']");
		OnlineOnDelivery= By.xpath("//android.widget.TextView[@text='Online On Delivery']");
	
		//Test Wallet 		
		TestWallet = By.xpath("//android.widget.TextView[@text = 'Test Wallet']");		
		Success = By.xpath("//android.widget.Button[@resource-id='successBtn']");	
		SubmitBTN = By.xpath("//android.widget.Button[@text='SUBMIT']");
		OrderStatusBtn = By.xpath("//android.widget.Button[@text='ORDER DETAILS']");
	
	}

	public void fillSearchLiquiorDetails() throws InterruptedException {
		
		Thread.sleep(2000);	
		//Clicking on Search Bar
			objPojo.getObjUtilities().logReporter("Clicked on Search Bar",
				objPojo.getObjWrapperFunctions().clickException(SearchBar,"Search Bar Field"));		
		
		//Entered value in Search Bar
			String Liquior = objPojo.getEntityRunner().getStringValueForField("LiquiorName");
				objPojo.getObjUtilities().logReporter("Typed on SearchBar as "+Liquior,
										objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(SearchBar,
														Liquior,"Search Bar Field"));
		
		//waiting for 2 seconds		
		Thread.sleep(2000);
		
		//Clicked on our Specified Product at Search Bar after entering Products name
		objPojo.getObjUtilities().logReporter("Clicked on "+Liquior +" at Search Bar",
				objPojo.getObjWrapperFunctions().clickException(FirstLiquiourProduct,Liquior+"Product at Search Bar"));
		
		// Clicked on our Specified Product at Product List
		objPojo.getObjUtilities().logReporter("Clicked on "+Liquior+" at Product List",
				objPojo.getObjWrapperFunctions().clickException(FirstLiquiourProduct,Liquior+"Product After Search Bar"));
		
		
		//waiting for 2.5 seconds	
		Thread.sleep(2500);
		
		//Getting text of Price and Availibility
		String Availibility = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[6]")).getText();
		String Price = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[5]")).getText();
		objPojo.getObjUtilities().logReporter("Avialability  of The Product is "+Availibility,true);
		objPojo.getObjUtilities().logReporter("Price of The Product is "+Price,true);	
		
		//ProductName
		String ProductName = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
		objPojo.getObjUtilities().logReporter("Name of The Product is "+ProductName,true);

		//Scroll-Down
		objPojo.getObjWrapperFunctions().scrollDown();	
		String Type = objPojo.getEntityRunner().getStringValueForField("TestType");		
		if(Type.equalsIgnoreCase("Positive-Notify") || Availibility.equalsIgnoreCase("CURRENTLY UNAVAILABLE"))
		{	
			
			Reporter.log("<B>--------------------------------------------------------------</B>",true);
			Reporter.log("<B> Passed!!! and Clicked On NotiyMe Button as Product is Out Of Stock! </B>",true);
			Reporter.log("<B>--------------------------------------------------------------</B>",true);
			
			
			objPojo.getDriver().close();
		}
		

		//Traverse to Cart
		String traverse = objPojo.getEntityRunner().getStringValueForField("TravserseCart");
		if(traverse.equalsIgnoreCase("Yes"))
		{
			//Adding to cart button
			objPojo.getObjUtilities().logReporter("Clicked on Add to cart",
					objPojo.getObjWrapperFunctions().clickException(AddtoCart,"Add to Cart Button"));
			
			objPojo.getObjUtilities().logReporter("Traversed TO CART",
					objPojo.getObjWrapperFunctions().clickException(CartTravserse,"Cart ICON"));
			
			
				Thread.sleep(2000);		
		}		
	}
	
	
	public void TraversingToCartDetails() throws InterruptedException 
	{
	
		String Add =  objPojo.getEntityRunner().getStringValueForField("AddupBtnClick");
		int addclick = Integer.parseInt(Add);
	
		Thread.sleep(2000);		
		for(int x = 1; x<=addclick;x++)
		{
			AddBtn = By.xpath("//android.widget.TextView[@text='"+x+"']//following-sibling::android.widget.FrameLayout[1]");
			objPojo.getObjWrapperFunctions().clickException(AddBtn,"Add Button");
			Thread.sleep(1000);
	
		}
	
		String Permit = objPojo.getEntityRunner().getStringValueForField("IFPermit");
		if(Permit.equalsIgnoreCase("Yes"))
		{
			String text = objPojo.getEntityRunner().getStringValueForField("PermitNumber");
			objPojo.getObjUtilities().logReporter("Typed on Permit no as "+text,
						objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(PermitNoInput,
								text,"Permit No Input Field"));
			
		}
		if(Permit.equalsIgnoreCase("No"))
		{
			objPojo.getObjUtilities().logReporter("Not Applying Permit No ",
					objPojo.getObjWrapperFunctions().clickException(PermitNumNo,"No Permit Button"));
		}
		
		
		
		
		String onedayPermitCostStr=objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='One-day Permit Cost']//following-sibling::android.widget.TextView").getText();
		String TotalAmountStr= objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='Total Amount']//following-sibling::android.widget.TextView").getText();
		System.out.println("One Day Permit Cost is "+onedayPermitCostStr);
		System.out.println("Total Amount is "+TotalAmountStr);
		
		
		//ScrollDown
		Thread.sleep(2000);
		objPojo.getObjWrapperFunctions().scrollDown();
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPayOnOrder"))
		{
			
			
			objPojo.getObjUtilities().logReporter("Clicked on Pay On Order ",
			objPojo.getObjWrapperFunctions().clickException(PayonOrder,"Pay On Order Button"));
			
			if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative-Amount") ||objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative-Permit")) 
			{		
				Reporter.log("<B>--------------------------------------------------------------</B>",true);
				Reporter.log("<B> Negative Scanerio</B>",true);
				Reporter.log("<B>--------------------------------------------------------------</B>",true);
				objPojo.getDriver().close();
			}
			
			
			//Submitting Final Order
			objPojo.getObjWrapperFunctions().scrollDown();
			objPojo.getObjUtilities().logReporter("Clicked Submit Button ",
			objPojo.getObjWrapperFunctions().clickException(SubmitBTN,"Submit Button "));		
			//Clicking on Test Wallet
			objPojo.getObjUtilities().logReporter("Clicked on Test Wallet",
			objPojo.getObjWrapperFunctions().clickException(TestWallet,"Test Wallet"));
			//Click On success
			objPojo.getObjUtilities().logReporter("Clicked on Success ",
			objPojo.getObjWrapperFunctions().clickException(Success,"Success Button"));
			//ConnfirmOrder
			objPojo.getObjUtilities().logReporter("Clicked on Orderstatus Button ",
			objPojo.getObjWrapperFunctions().clickException(OrderStatusBtn,"Order Status Button"));				
			
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPayOnDelivery")) {
			objPojo.getObjUtilities().logReporter("Click on Pay On Delivery ",
			objPojo.getObjWrapperFunctions().clickException(PayonDelivery,"Pay On Delivery Button"));
			String Negative = objPojo.getEntityRunner().getStringValueForField("TestType");
			
			if (Negative.equalsIgnoreCase("Negative-Amount") || Negative.equalsIgnoreCase("Negative-Permit")) 
			{		
				Reporter.log("<B>--------------------------------------------------------------</B>",true);
				Reporter.log("<B> Negative Scanerio</B>",true);
				Reporter.log("<B>--------------------------------------------------------------</B>",true);
				objPojo.getDriver().close();
			}
			
			
			//Submitting Final Order
			objPojo.getObjWrapperFunctions().scrollDown();
			objPojo.getObjUtilities().logReporter("Clicked Submit Button ",
			objPojo.getObjWrapperFunctions().clickException(SubmitBTN,"Submit Button "));
			
			objPojo.getObjUtilities().logReporter("Clicked on Orderstatus Button ",
			objPojo.getObjWrapperFunctions().clickException(OrderStatusBtn,"Order Status Button"));					
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCOD")) {
			objPojo.getObjUtilities().logReporter("Click on Pay On Delivery ",
			objPojo.getObjWrapperFunctions().clickException(COD,"Cash On Delivery"));
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigOnlinonDelivery")) {
			objPojo.getObjUtilities().logReporter("Click on Pay On Delivery ",
			objPojo.getObjWrapperFunctions().clickException(OnlineOnDelivery,"OnLine On Delivery"));
		}
		
			//Wait for 5 seconds
			Thread.sleep(5000);
		
	}
	
	public void TraversingToAssertOrderDetails() throws Exception {
	
		//Travsering and Asserting
		Thread.sleep(2500);	
		String OrderDetails = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='ORDER DETAILS']")).getText();	
		String OrderNO = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[2]")).getText();
		if(OrderDetails.equalsIgnoreCase("ORDER DETAILS"))
		{
		try
		{
			objPojo.getObjUtilities().logReporter("<B> "+OrderNO+"</B>", true);
			objPojo.getObjUtilities().logReporter("Traversed to Order Details", true);
			System.out.println("Passed!!! while paying On ORDER");
			objPojo.getDriver().closeApp();
			objPojo.getObjUtilities().logReporter("Order Sucessfully Placed", true);
		}
		catch (Exception e) 
		{
			objPojo.getDriver().closeApp();
			System.out.println("Execution Done");
		}

	}
		
		else
		{
			objPojo.getObjUtilities().logReporter("Unable to Traverse to Order Details", false);
			System.out.println("FAILED!!! while paying On ORDER");
			objPojo.getDriver().closeApp();
		}
}
	
	
	public void fillAndSubmitSearchDetails() throws Exception 
	{
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Liquor Search Actions </B>",true);
		fillSearchLiquiorDetails();
		TraversingToCartDetails();
		TraversingToAssertOrderDetails();
	}

}
