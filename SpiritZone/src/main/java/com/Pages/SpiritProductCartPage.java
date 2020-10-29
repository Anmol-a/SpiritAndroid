package com.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritProductCartPage {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	 ArrayList<String> SubCategoriesTypeList;
	 
	 
	 By AddtoCart;
	 By CartTravserse;
	 By PermitNoInput;
	 By AddBtn;
	 By SubmitBTN;
	 By PayonOrder;
	 By TestWallet;
	 By Success;
	 By OrderStatusBtn;
	 By PermitNumNo;
	 By PayonDelivery;
	 By COD;
	 By OnlineOnDelivery;
	 
	 
	 
		public SpiritProductCartPage(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
		
			
			//CART
			AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
			CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
			PermitNoInput = By.xpath("//android.widget.EditText[@text='Permit number']");
			PermitNumNo =  By.xpath("(//android.widget.TextView)[8]");
			
			
			//Payment Options
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
		
		
		//TRAVERSE TO CART
		public void TraversingToCartDetails() throws InterruptedException {
			
			objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("(//android.widget.TextView[@text='CART'])[1]"));
			String CustomProductName = objPojo.getEntityRunner().getStringValueForField("CartTraverseProductName");
			
			
			
			if(objPojo.getDriver().findElements(By.xpath("(//android.widget.TextView[@text='CART'])[1]")).size()==0)			
			{
				Assert.assertEquals(true, false,"Failed to Traverse CART properly");
			}
			
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+CustomProductName+"']")).size()==0)			
			{
				Assert.assertEquals(true, false,"Product Not Matching at Cart ");
			}
			
			
			
			if(objPojo.getEntityRunner().getBooleanValueForField("ConfigPerformAction"))
			{
			String Add =  objPojo.getEntityRunner().getStringValueForField("AddupBtnClick");
			int addclick = Integer.parseInt(Add);

			//Wait for 3 seconds
			Thread.sleep(3000);
			for(int x = 1; x<=addclick;x++)
			{
				AddBtn = By.xpath("//android.widget.TextView[@text='"+x+"']//following-sibling::android.widget.FrameLayout[1]");
				objPojo.getObjWrapperFunctions().clickException(AddBtn,"Add Button");
				//Wait for 1 second
				Thread.sleep(1000);
			
			}
			
			//PERMIT APPLICABLE
			String Permit = objPojo.getEntityRunner().getStringValueForField("IFPermit");
			if(Permit.equalsIgnoreCase("Yes"))
			{
				String text = objPojo.getEntityRunner().getStringValueForField("PermitNumber");
				objPojo.getObjUtilities().logReporter("Typed on Permit no as "+text,
							objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(PermitNoInput,
									text,"Permit Number Input"));
				
			}
			if(Permit.equalsIgnoreCase("No"))
			{
				
				objPojo.getObjUtilities().logReporter("Permit Not Applied ",objPojo.getObjWrapperFunctions().clickException(PermitNumNo,"No Permit Button"));
			}
			
			
			//PRINTING TOTAL AMOUNT AND ONE DAY PERMIT COST
			String onedayPermitCostStr=objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='One-day Permit Cost']//following-sibling::android.widget.TextView").getText();
			String TotalAmountStr= objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='Total Amount']//following-sibling::android.widget.TextView").getText();
			objPojo.getObjUtilities().logReporter("One Day Permit Cost is "+onedayPermitCostStr,true);
			objPojo.getObjUtilities().logReporter("Total Amount is "+TotalAmountStr,true);
			System.out.println("One Day Permit Cost is "+onedayPermitCostStr);
			System.out.println("Total Amount is "+TotalAmountStr);
			
			
			// Wait for 2.5 second
			Thread.sleep(2500);
			objPojo.getObjWrapperFunctions().scrollDown();
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPayOnOrder")) {
				
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
				
				objPojo.getObjUtilities().logReporter("Clicked on Orderstatus Button ",
				objPojo.getObjWrapperFunctions().clickException(OrderStatusBtn,"Order Status Button"));					
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCOD")) {
				objPojo.getObjUtilities().logReporter("Click on Pay On Delivery ",
				objPojo.getObjWrapperFunctions().clickException(COD,"Cash On Delivery Button"));
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigOnlinonDelivery")) {
				objPojo.getObjUtilities().logReporter("Click on Pay On Delivery ",
				objPojo.getObjWrapperFunctions().clickException(OnlineOnDelivery,"Pay On Delivery Button"));
			}
			
			//Wait for 5 seconds
			Thread.sleep(5000);
		}
	}
		public void fillCartOrder() throws InterruptedException{
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='CURRENTLY UNAVAILABLE']")).size()==0)
				{
				TraversingToCartDetails();
				}
		}
	
}
