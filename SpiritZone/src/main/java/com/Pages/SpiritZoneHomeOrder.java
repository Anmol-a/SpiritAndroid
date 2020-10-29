package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;
import com.spiritzone.Utilities;
import com.spiritzone.WrapperFunctions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;


public class SpiritZoneHomeOrder {
	
	
	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	 ArrayList<String> SubCategoriesTypeList;
	
	
	By Whiskey;
	By Vodka;
	By GIN;
	By Tequila;
	By Brandy;
	By Wine;
	By Beer;
	By Rum;
	By Others;
	
	//TEMPORARY
	By FirstProduct;
	By SecondProduct;
	
	
	By PriceFilterHigh;
	By PriceFilterLow;
	
	By NotifyMeBtn;
	
	//CART
	By AddtoCart;
	By CartTravserse;
	
	//Add Button
	By AddBtn;
	
	
	//PermitNo
	By PermitNoInput;
	By PermitNumYes;
	By PermitNumNo;
	
	//Payment Options
	By PayonOrder;
	By PayonDelivery;
	By COD;
	By OnlineOnDelivery;
	By SubmitBTN;
	
	//Payment Method Online 
	By TestWallet;
	By Success;
	By OrderStatusBtn;
	
	
	By Filter;
	By APPLYButton;
	By DISCARButton;
	
	By SwipeFilterScroll;
	
	
	
	public SpiritZoneHomeOrder(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();

		
		Whiskey = By.xpath("//android.widget.TextView[@text='WHISKEY']");
		Vodka = By.xpath("//android.widget.TextView[@text='VODKA']");
		GIN = By.xpath("//android.widget.TextView[@text='GIN']");
		Tequila = By.xpath("//android.widget.TextView[@text='TEQUILA']");
		Brandy = By.xpath("//android.widget.TextView[@text='BRANDY']");
		
		Wine = By.xpath("//android.widget.TextView[@text='WINE']");
		Beer = By.xpath("//android.widget.TextView[@text='BEER']");
		Rum = By.xpath("//android.widget.TextView[@text='RUM']");
		Others = By.xpath("//android.widget.TextView[@text='OTHERS']");
		
		//TEMPORARY
		FirstProduct = By.xpath("(//android.widget.ImageView)[5]");
		SecondProduct = By.xpath("(//android.widget.ImageView)[6]");
				
		
		PriceFilterHigh = By.xpath("//android.widget.TextView[@text='Price: Lowest to highest']");
		PriceFilterLow = By.xpath("//android.widget.TextView[@text='Price: Highest to lowest']");
		
		NotifyMeBtn = By.xpath("//android.widget.TextView[@text='NOTIFY ME']");
		
		//CART
		AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
		CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
		PermitNoInput = By.xpath("//android.widget.EditText[@text='Permit number']");
		PermitNumYes =  By.xpath("//android.widget.TextView[@text='YES']");
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
		
		DISCARButton = By.xpath("//android.widget.Button[@text='DISCARD']");
		APPLYButton = By.xpath("//android.widget.Button[@text='APPLY']");
		Filter = By.xpath("//android.widget.TextView[@text='Filters']");
		
		SwipeFilterScroll = By.xpath("(//androidx.recyclerview.widget.RecyclerView)[1]");
		
	}
	
	
	//LIQOR CATEGORIES	
	public void FillHomeOrderForCategoryModules() throws InterruptedException 
	{
		WrapperFunctions GenericMethod = objPojo.getObjWrapperFunctions();
		
		Thread.sleep(2000);
		String CategoryType = objPojo.getEntityRunner().getStringValueForField("CategoryType");
		
		By ScrollingLiquorContainer;
		ScrollingLiquorContainer = By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]//android.view.ViewGroup[@clickable='true']");
		
		if(CategoryType.equalsIgnoreCase("Whiskey"))
		{
			objPojo.getObjUtilities().logReporter("Click on  Whiskey ",objPojo.getObjWrapperFunctions().clickException(Whiskey,"Whiskey Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Vodka"))
		{
			objPojo.getObjUtilities().logReporter("Click on VODKA ",objPojo.getObjWrapperFunctions().clickException(Vodka,"Vodka Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("GIN"))
		{
			objPojo.getObjUtilities().logReporter("Click on GIN ",objPojo.getObjWrapperFunctions().clickException(GIN,"GIN Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Tequila"))
		{
			objPojo.getObjUtilities().logReporter("Click on Tequila ",objPojo.getObjWrapperFunctions().clickException(Tequila,"Tequila Category"));
		}
		
		
		else if(CategoryType.equalsIgnoreCase("Brandy"))
		{
			//Scroll right		
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjUtilities().logReporter("Click on Brandy ",objPojo.getObjWrapperFunctions().clickException(Brandy,"Brandy Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Beer"))
		{
			//Scroll right
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjUtilities().logReporter("Click on Beer ",objPojo.getObjWrapperFunctions().clickException(Beer,"Beer Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Wine"))
		{
			//Scroll right
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjUtilities().logReporter("Click on Wine ",objPojo.getObjWrapperFunctions().clickException(Wine,"Wine Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Rum"))
		{
			//Scroll right
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjUtilities().logReporter("Click on RUM ",objPojo.getObjWrapperFunctions().clickException(Rum,"Rum Category"));
		}
		
		else if(CategoryType.equalsIgnoreCase("Others"))
		{
			//Scroll right Twice
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjWrapperFunctions().scrollRightForCategory(ScrollingLiquorContainer);
			objPojo.getObjUtilities().logReporter("Click on Others ",	objPojo.getObjWrapperFunctions().clickException(Others,"Others Category"));
		}
	}		
		
		
	public void Filters() throws InterruptedException		
	   {
		
		 String CategoryType = objPojo.getEntityRunner().getStringValueForField("CategoryType");
		 String FilterButtonAction = objPojo.getEntityRunner().getStringValueForField("FilterButton-Action");
		 
		//ArrayList SubCategories
		String SubCategory = objPojo.getEntityRunner().getStringValueForField("Sub-Category");
		ArrayList<String> SubCategories = new ArrayList<String>(Arrays.asList(SubCategory.split("\\,")));
		
		String str = CategoryType.toLowerCase();
		String CategoryLocator = str.substring(0, 1).toUpperCase() + str.substring(1);
		
		
		//ArrayList SwipeFilters
		String SwipeFilters = objPojo.getEntityRunner().getStringValueForField("SwipeFilter");
		ArrayList<String> SwipeFiltersList = new ArrayList<String>(Arrays.asList(SwipeFilters.split("\\,")));

		 
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSwipeFilters"))
		{
			for(int x = 0;x<SwipeFiltersList.size();x++)
			{
	
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.FrameLayout/android.widget.TextView[@text='"+SwipeFiltersList.get(x)+"']")).size()!=0)
				{
					objPojo.getObjUtilities().logReporter("Clicking and Verifying for "+SwipeFiltersList.get(x),true);
					objPojo.getObjWrapperFunctions().clickException(By.xpath("//android.widget.FrameLayout/android.widget.TextView[@text='"+SwipeFiltersList.get(x)+"']"), "");	
			
				
					//Assert
					String str1 = SwipeFiltersList.get(x).toLowerCase();
					String AllProductsCategory = str1.substring(0, 1).toUpperCase() + str1.substring(1);
					if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+SwipeFiltersList.get(x)+"']")).size()==0 || objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+AllProductsCategory+"']")).size()<4)
					{
						Assert.assertEquals(true, false,"Error In Assertion of Swipe Category Filters");
					}
				
				
				
				}
				
				else
				{
					objPojo.getObjWrapperFunctions().SwipeForCategoryFilter(SwipeFilterScroll);
					x=x-1;
					Thread.sleep(1000);
					
					
					
				}

				
			
			}
			
		}
		
		
		
		 
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFilters")) 
		
		{	
			Thread.sleep(1700);
			objPojo.getObjWrapperFunctions().clickException(Filter, "Filter Button");
			objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.TextView[@text='Category']"));
	
			//CATEGORIES
			//Swipe First
			if(CategoryType.equalsIgnoreCase("Beer") || CategoryType.equalsIgnoreCase("RUM") || CategoryType.equalsIgnoreCase("Others"))
			{
				//Swipe
				Thread.sleep(700);
				objPojo.getObjWrapperFunctions().SwipeForCategoryFilter(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[1]"));
				objPojo.getObjWrapperFunctions().clickException(By.xpath("(//android.widget.TextView[@text='"+CategoryLocator+"'])[1]"), "Category Product");
			}
			
			else
			{
				objPojo.getObjWrapperFunctions().clickException(By.xpath("(//android.widget.TextView[@text='"+CategoryLocator+"'])[1]"), "Category Product");
				
			}
			
			
			//SUB-CATEGORIES
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSubCategories")) 
			{
				objPojo.getObjWrapperFunctions().waitForElementVisibility(objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Sub Categories']")));
				for(int i = 0 ;i<SubCategories.size();i++)
				{
					objPojo.getObjWrapperFunctions().clickException(By.xpath("(//android.widget.TextView[@text='"+SubCategories.get(i)+"'])[1]"), "Sub-Category Product");
				}
			}
			
			
			//Apply or Discard
			if(FilterButtonAction.equalsIgnoreCase("Apply"))
			{
				objPojo.getObjWrapperFunctions().clickException(APPLYButton, "APPLY Button");
				
				
				//ASSERT FILTER For APPLY
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Filter);
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+CategoryLocator+"']")).size()==0)
				{
					Assert.assertEquals(false, true,"Failed After Applying Filters");
				}
			}
			else if(FilterButtonAction.equalsIgnoreCase("Discard"))
			{
				objPojo.getObjWrapperFunctions().clickException(DISCARButton, "DISCARD Button");
			
			
				//ASSERT FILTER For DISCARD
				objPojo.getObjWrapperFunctions().waitForElementToBeClickable(Filter);
				Thread.sleep(1700);
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Rio Strong']")).size()==0)
				{
					Assert.assertEquals(false, true,"Failed After Applying Filters");
				}
			
			}
		
	
		}
		

		
	   }
	
	
	
	
		
   public void TraverseAllProducts() throws InterruptedException		
   {
	   			//Wait for 3 Secs
	   			Thread.sleep(3000);
	   			
	   			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigShowCaseCategoryType")) 
			{	
				//Applying Category for ShowCase
				By ShowCaseWHISKEY;
				By ShowCaseVODKA;
				By ShowCaseGIN;
				
				ShowCaseWHISKEY = By.xpath("//android.widget.TextView[@text='WHISKEY']");
				ShowCaseVODKA = By.xpath("//android.widget.TextView[@text='VODKA']");
				ShowCaseGIN = By.xpath("//android.widget.TextView[@text='GIN']");
				
				
				String ShowCaseCategory = objPojo.getEntityRunner().getStringValueForField("ShowCaseCategoryType");
				
				if(ShowCaseCategory.equalsIgnoreCase("WHISKEY"))
				{
					objPojo.getObjUtilities().logReporter("Click on ShowCase Product",objPojo.getObjWrapperFunctions().clickException(ShowCaseWHISKEY,"ShowCase Whiskey Filter"));
				}
				
				else if (ShowCaseCategory.equalsIgnoreCase("VODKA"))
				{
					objPojo.getObjUtilities().logReporter("Click on Vodka Product",objPojo.getObjWrapperFunctions().clickException(ShowCaseVODKA,"ShowCase Vodka Filter"));
				}
				
				else if(ShowCaseCategory.equalsIgnoreCase("GIN"))
				{
					objPojo.getObjUtilities().logReporter("Click on GIN Product",objPojo.getObjWrapperFunctions().clickException(ShowCaseGIN,"ShowCase GIN Filter"));
				}
			}
			
			//Filter Category
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigHighLow")) 
			{	
				
				Thread.sleep(2000);
				//Applying High Filter 
				String LowestPriceProductName = objPojo.getDriver().findElement(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText();
				String HighestPriceProductName = "";
				
				
				objPojo.getObjUtilities().logReporter("Applied HIGH TO LOW Filter",objPojo.getObjWrapperFunctions().clickException(PriceFilterHigh,"High to Low Filter"));
				HighestPriceProductName = objPojo.getDriver().findElement(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText();
				
				
				
				//Assert if HighestProduct Shown is Similar
				objPojo.getObjWrapperFunctions().clickException(PriceFilterLow,"Low To High Filter");
				
				//Scroll to Last and Get Price for Highest
				while(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+HighestPriceProductName+"']")).size()==0)
				{
					objPojo.getObjWrapperFunctions().scrollDownLongProuctList();
					if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+HighestPriceProductName+"']")).size()!=0)
					{
						break;
					}
				}

				//Main Assertion if Product is same
				if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+HighestPriceProductName+"']//parent::android.view.ViewGroup//following::android.view.ViewGroup/android.widget.TextView[@text='HOME']")).size()==0)
				{
				Assert.assertEquals(false, true,"Failed at Filter High Low");	
				}
					
				
				
				
				
				
				
				//Applying Low Filter - Dont Confuse with locator name
				Thread.sleep(2700);
				objPojo.getObjWrapperFunctions().clickException(PriceFilterHigh,"Low To High Filter");
				
				//assert-Low Filter
				if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+LowestPriceProductName+"']")).size()==0)
				{
					Assert.assertEquals(false, true,"Failed at Filter Low High");		
				}
				
			
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCartTraverse")) {	
				
				
				String CustomProductName = objPojo.getEntityRunner().getStringValueForField("CartTraverseProductName");
				
				
				//Scroll to Last and Get Price for Highest
				if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']")).size()!=0)
				{
					Thread.sleep(1000);
					objPojo.getObjWrapperFunctions().click(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']"));

				}
				
				else {
				while(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']")).size()==0)
				{
					objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
					if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']")).size()!=0)
					{
						Thread.sleep(1000);
						objPojo.getObjWrapperFunctions().click(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']"));
						break;
					}
				}
			}	
				
				
				
				
				
				
			}
			
		
	
			//Last Product
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigLastProduct")) 
			{	
			Thread.sleep(2000);
			String LastProductName = objPojo.getEntityRunner().getStringValueForField("LastProductName");
			
			//Scroll to Last and Get Price for Highest
			while(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+LastProductName+"']")).size()==0)
			{
				objPojo.getObjWrapperFunctions().scrollDownLongProuctList();
				if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+LastProductName+"']")).size()!=0)
				{
					break;
				}
			}
				
		//ASSERT
		if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+LastProductName+"']")).size()==0)
		{
			Assert.assertEquals(false, true,"Failed at Traversing Last Page");	
		}
				
		}	
   }
   

	
	
	//TRAVERSE TO CART
	public void TraversingToCartDetails() throws InterruptedException {
		
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
	
	public void TraversingToAssertOrderDetails() throws InterruptedException 
	{
	
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
	
	
	//SHOWCASE
	public void FillHomeOrderForShowCase() throws InterruptedException {
		By ShowCaseProductOne;
		By ShowCaseProductTwo;
		By ViewAll;
		
		ShowCaseProductOne = By.xpath("(//android.widget.ImageView)[3]");
		ShowCaseProductTwo = By.xpath("(//android.widget.ImageView)[4]");
		ViewAll = By.xpath("(//android.widget.TextView[@text='View All'])[1]");
		
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigShowCaseFirstProduct")) {		
			//Scroll Down
			Thread.sleep(6000);
			objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
			objPojo.getObjWrapperFunctions().scrollDown();
			objPojo.getObjWrapperFunctions().scrollDownSmall();
			objPojo.getObjUtilities().logReporter("Clicked On First Product ",
			objPojo.getObjWrapperFunctions().clickException(ShowCaseProductOne,"First Product On ShowCase"));		
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigShowCaseSecondProduct")) {	
			//Scroll Down
			Thread.sleep(2000);
			objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
			objPojo.getObjWrapperFunctions().scrollDown();
			objPojo.getObjWrapperFunctions().scrollDownSmall();
			objPojo.getObjUtilities().logReporter("Clicked On Second Product ",
			objPojo.getObjWrapperFunctions().clickException(ShowCaseProductTwo,"Second Product On ShowCase"));
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigShowCaseViewAll")) {
			//Scroll Down
			Thread.sleep(2000);
			objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
			objPojo.getObjWrapperFunctions().scrollDown();
			objPojo.getObjWrapperFunctions().scrollDownSmall();
			objPojo.getObjUtilities().logReporter("Clicked On View ALL ",
			objPojo.getObjWrapperFunctions().clickException(ViewAll,"View All button For ShowCase module"));
	
	}		
}
	
	
	//RESERVE 
	public void FillHomeOrderForReserve() throws InterruptedException {
	
		By ViewAll;
		By FirstProduct;
		By SecondProduct;
		By ReserveTitle;
		
		
		ViewAll = By.xpath("(//android.widget.TextView[@text='View All'])");
		FirstProduct = By.xpath("(//android.widget.ImageView)[1]");
		SecondProduct = By.xpath("(//android.widget.ImageView)[2]");
		ReserveTitle = By.xpath("//android.widget.TextView[@text='THE RESERVE']");
		
		
		
		
		//Wait for any Operation Till Page is Loaded
		objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
		Thread.sleep(2000);
		//Scrolling to Reserve
		for(int x=0 ;x<2;x++)
		{
		objPojo.getObjWrapperFunctions().scrollDownLong();
		}
		
		//Wait for any Operation Till Page is Loaded
		objPojo.getObjWrapperFunctions().waitForElementPresence(ViewAll);
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFirstReserveProduct")) {
			//Clicking on First Product
			objPojo.getObjUtilities().logReporter("Clicked On First Product For Reserve",
					objPojo.getObjWrapperFunctions().clickException(FirstProduct,"First Product On Reserve"));
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSecondReserveProduct")) {
			//Clicking on Second Product
			objPojo.getObjUtilities().logReporter("Clicked On Second Product For Reserve",
					objPojo.getObjWrapperFunctions().clickException(SecondProduct,"Second Product On Reservce"));
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReservceViewAll")) {
			//Clicking on View All
			objPojo.getObjUtilities().logReporter("Clicked On ViewAll For Reserve",
					objPojo.getObjWrapperFunctions().clickException(ViewAll,"View All on Reserve"));
			objPojo.getObjWrapperFunctions().waitForElementPresence(ReserveTitle);
			
			//Wait for 2 Seconds
			Thread.sleep(2000);
			
			HashMap< String, Integer> ReserveProductsHash = new HashMap<String, Integer>();
			ReserveProductsHash.put("Hennessy Very Special", 0);
			ReserveProductsHash.put("Krug Grande Cuvee", 1);
			ReserveProductsHash.put("Glenmorangie 18 Years", 1);
			ReserveProductsHash.put("Dom Perignon Brut", 2);
			ReserveProductsHash.put("Belvedere Vodka", 2);
			ReserveProductsHash.put("Hennessy XO", 3);
			ReserveProductsHash.put("Moet & Chandon Brut Imperial", 4);
			ReserveProductsHash.put("Dom Perignon Rose", 5);
			ReserveProductsHash.put("Dom Perignon P2 2000", 5);
			ReserveProductsHash.put("Paradis Imperial", 6);
			ReserveProductsHash.put("Hennessy Richard", 6);
			
			//scroll
			String ReserveProductList = objPojo.getEntityRunner().getStringValueForField("ReserveProductName");	
			
			for(String ProductName: ReserveProductsHash.keySet()){
				if(ProductName.equalsIgnoreCase(ReserveProductList))
				{
					int scrollOccurence = ReserveProductsHash.get(ReserveProductList);
					for(int x= 1; x<=scrollOccurence;x++)
					{		
						objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();	
						Thread.sleep(1000);
					}
					
					objPojo.getObjUtilities().logReporter("Clicked On ViewAll For Reserve " +ProductName, true);
					//Click After Scroll Dynamic Xpath!!!!!!!!!!!
					
					objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='"+ProductName+"']").click();
				}
				else
				{
					System.out.println("No RESERVE PRODUCT MATCHING");
				}
			}
			}
	}
	
	//RESERVE PRODUCT DESCRIPTION
	public void ReserveProductDescription() throws InterruptedException
	{
		By MakeRequestBtn;
		MakeRequestBtn = By.xpath("//android.widget.TextView[@text='MAKE A REQUEST']");
		
		//ScrollDown
		Thread.sleep(3000);	
		objPojo.getObjWrapperFunctions().scrollDown();
		
		String Price = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[5]")).getText();
		objPojo.getObjUtilities().logReporter("Price of  The Product is "+Price,true);

		//ProductName
		String ProductName = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
		objPojo.getObjUtilities().logReporter("Name of The  Product is "+ProductName,true);	
		
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='MAKE A REQUEST']")).size() > 0)
		{

			objPojo.getObjUtilities().logReporter("Click on Make Request Button",
					objPojo.getObjWrapperFunctions().clickException(MakeRequestBtn,"Make a Request Button"));
		}
		else
		{
			
			objPojo.getObjUtilities().logReporter("Already Made a Request!",true);
			System.out.println("Already Made a Request!");
		}	
	}
	
	
	public void FillHomeOrderForPopularBrand() throws InterruptedException
	{
		//Wait for any Operation Till Page is Loaded
		objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
		//Scrolling to 
		for(int x=0 ;x<3;x++)
		{
		objPojo.getObjWrapperFunctions().scrollDown();
		}
		
		
		HashMap< String, Integer> PopularBrandsHash = new HashMap<String, Integer>();
		PopularBrandsHash.put("Johnnie Walker", 1);
		PopularBrandsHash.put("Chivas Regal", 2);
		PopularBrandsHash.put("Jack Daniels", 3);
		PopularBrandsHash.put("Glendiddich", 4);
		PopularBrandsHash.put("Avsoult", 5);
		PopularBrandsHash.put("Smrinoff", 6);
		PopularBrandsHash.put("Sula", 7);
		PopularBrandsHash.put("Sensi", 8);
		PopularBrandsHash.put("Fruzzante", 9);
		PopularBrandsHash.put("Kingfisher", 10);
		PopularBrandsHash.put("Bira 91", 11);
		PopularBrandsHash.put("Tuborg", 12);
		PopularBrandsHash.put("Old Monk", 13);
		PopularBrandsHash.put("Bacardi", 14);
		
		
		By ScrollingLiquorContainer;
		ScrollingLiquorContainer = By.xpath("((//androidx.recyclerview.widget.RecyclerView)[3]//android.view.ViewGroup[@clickable='true'])[2]");
		
		String PopularBrandName = objPojo.getEntityRunner().getStringValueForField("BrandName");	
			
		//ForLoop
		for(String ProductName: PopularBrandsHash.keySet())
		{
			if(ProductName.equalsIgnoreCase(PopularBrandName))
			{
				int scrollOccurence = PopularBrandsHash.get(PopularBrandName);
				for(int x= 1; x<=scrollOccurence;x++)
				{		
					objPojo.getObjWrapperFunctions().scrollRightForPopularBrand(ScrollingLiquorContainer);	
					Thread.sleep(1000);
				}
			}
		}
		
		//Clicking on our Brand
		By BrandName;
		By Bacardi;
		//BrandName = By.xpath("(//android.widget.ImageView)[4]");
		BrandName = By.xpath("(//android.widget.ImageView)[8]");
		Bacardi = By.xpath("(//android.widget.ImageView)[5]");
		
		
		Thread.sleep(2500);
		if(!PopularBrandName.equalsIgnoreCase("Bacardi"))
		{	
		objPojo.getObjUtilities().logReporter("Clicked On Brand Name ",
						objPojo.getObjWrapperFunctions().clickException(BrandName,"Popular Brand Name as "+PopularBrandName ));
		
					Thread.sleep(2000);
			
		}
		else
		{
			objPojo.getObjUtilities().logReporter("Clicked On Brand Name ",
					objPojo.getObjWrapperFunctions().clickException(Bacardi," Bacardi Brand "));
			
			Thread.sleep(2000);
			
		}
		
		//Asserting Proper Brand Name and Checking 
		String PopularBrandNameAssert = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
		
		if(PopularBrandName.equalsIgnoreCase(PopularBrandNameAssert))
		{
			objPojo.getObjUtilities().logReporter("Selected Popular BrandName as "+PopularBrandNameAssert,true);
		}
		else
		{
			objPojo.getObjUtilities().logReporter("Wrong Popular Brand Selected",false);
		}
		
		
		//Write our own Code for Popular brands first and second Product Click Late (09-08-2020)
		By PopularFirstProduct;
		By PopularSecondProduct;
		
		PopularFirstProduct = By.xpath("(//android.widget.ImageView)[3]");
		PopularSecondProduct = By.xpath("(//android.widget.ImageView)[4]");
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPopularProductOne")) {	
			//Applying High Filter 
			objPojo.getObjUtilities().logReporter("Clicked On First Product For Popular Module",
					objPojo.getObjWrapperFunctions().clickException(PopularFirstProduct ,"First Popular Product"));
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPopularProductTwo")) {	
			//Applying High Filter 
			objPojo.getObjUtilities().logReporter("Clicked On Second Product For Popular Module",
					objPojo.getObjWrapperFunctions().clickException(PopularSecondProduct ,"Second Popular Product"));
		}		
	}
	
	
	
	
	

	public void fillAndSubmitHomeOrder() throws InterruptedException {
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigCategoryType")) 
		{
			
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Liquor Category Updates </B>",true);	
		FillHomeOrderForCategoryModules();
		Filters();
		TraverseAllProducts();
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReOrder"))
		{
			objPojo.getObjUtilities().logReporter("<B>Traversed to Cart Details</B>",true);
			TraversingToCartDetails();
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigShowCaseType"))
		{
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform ShowCase Category Updates </B>",true);
		FillHomeOrderForShowCase();
		
		TraverseAllProducts();
		TraversingToCartDetails();
		TraversingToAssertOrderDetails();
		}
		
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReserveType"))
		{
			FillHomeOrderForReserve();
			ReserveProductDescription();	
		}
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPopularBrand"))
		{
			FillHomeOrderForPopularBrand();
			TraverseAllProducts();
			TraversingToCartDetails();
			TraversingToAssertOrderDetails();
		}
	}
}
