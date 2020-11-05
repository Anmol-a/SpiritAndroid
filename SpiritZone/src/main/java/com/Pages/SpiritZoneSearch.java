package com.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;
import com.spiritzone.WrapperFunctions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SpiritZoneSearch {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	//Search Bars
	By HomeSearchBar;
	By CategorySearchBar;
	By ExclusiveSearchBar;
	By ReserveBrandsSearchBar;
	By PopularBrandsSearchBar;
	
	//Category
	By Whiskey;
	By Vodka;
	By Gin;
	By Tequila;
	By Brandy;
	By Wine;
	By Beer;
	By Rum;
	By Others;
	By ScrollingLiquorContainer;
	By ViewAll;
	By ReserveTitle;
	
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
	
	By MyProfile;
	By Home;
	
	
	
	public SpiritZoneSearch(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();

		
		ScrollingLiquorContainer = By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]//android.view.ViewGroup[@clickable='true']");
		//SearchBar = By.xpath("//android.widget.EditText[@text='Search..']");
		HomeSearchBar = By.xpath("//android.widget.EditText[@text='Beer, Rum, Vodka and More']");
		CategorySearchBar = By.xpath("");
		ExclusiveSearchBar = By.xpath("");
		ReserveBrandsSearchBar = By.xpath("");
		PopularBrandsSearchBar = By.xpath("");
		
		Whiskey = By.xpath("//android.widget.TextView[@text='WHISKEY']");
		Vodka = By.xpath("//android.widget.TextView[@text='VODKA']");
		Gin = By.xpath("//android.widget.TextView[@text='GIN']");
		Tequila = By.xpath("//android.widget.TextView[@text='TEQUILA']");
		Brandy = By.xpath("//android.widget.TextView[@text='BRANDY']");
		Wine = By.xpath("//android.widget.TextView[@text='WINE']");
		Beer = By.xpath("//android.widget.TextView[@text='BEER']");
		Rum = By.xpath("//android.widget.TextView[@text='RUM']");
		Others = By.xpath("//android.widget.TextView[@text='OTHERS']");
		ViewAll = By.xpath("//android.widget.TextView[@text='View All']");
		ReserveTitle = By.xpath("//android.widget.TextView[@text='THE RESERVE']");
		
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
		
		MyProfile= By.xpath("//android.widget.TextView[@text='MY PROFILE']");	
		Home = By.xpath("//android.widget.TextView[@text='HOME']");
	
	}

	public void fillSearchLiquiorDetails() throws InterruptedException
	{
		String ConfigModule = objPojo.getEntityRunner().getStringValueForField("ConfigSearchModule");
		String ConfigTestType = objPojo.getEntityRunner().getStringValueForField("TestType");
		String Liquior = objPojo.getEntityRunner().getStringValueForField("LiquiorName");
		String SubCategory = objPojo.getEntityRunner().getStringValueForField("SubCategory");
		String PopularBrandName = objPojo.getEntityRunner().getStringValueForField("BrandName");
		WrapperFunctions GenericMethod = objPojo.getObjWrapperFunctions();
		By SearchButton = By.xpath("(//android.widget.ImageView)[2]");
		By InnerSearchExpectHome = By.xpath("//android.widget.EditText[@text='Search']");
		
		
		
		
		Thread.sleep(2000);	
		//Clicking on Search Bar
		
			if(ConfigModule.equalsIgnoreCase("Home"))
			{
				GenericMethod.waitForElementToBeClickable(HomeSearchBar);
			objPojo.getObjUtilities().logReporter("Clicked on Search Bar",
					GenericMethod.clickException(HomeSearchBar,"Search Bar Field"));
			
			
			//Enter value in Search Bar
				objPojo.getObjUtilities().logReporter("Typed on SearchBar as "+Liquior,
						GenericMethod.clearAndSendKeysCustomException(HomeSearchBar,
														Liquior,"Search Bar Field"));
			}
		
			
			else if(ConfigModule.equalsIgnoreCase("Category"))
			{
				//Wait for any Operation Till Page is Loaded
				objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
				
				
			if(SubCategory.equalsIgnoreCase("Whiskey"))
			{
				GenericMethod.clickException(Whiskey, "Whiskey");
				
			}
			if(SubCategory.equalsIgnoreCase("Vodka"))
			{
				GenericMethod.clickException(Vodka, "Vodka");
			}
			if(SubCategory.equalsIgnoreCase("Gin"))
			{
				GenericMethod.clickException(Gin, "Gin");
			}
			if(SubCategory.equalsIgnoreCase("Tequila"))
			{
				GenericMethod.clickException(Tequila, "Tequila");
			}
			if(SubCategory.equalsIgnoreCase("Brandy"))
			{
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.clickException(Brandy, "Brandy");
			}
			if(SubCategory.equalsIgnoreCase("Wine"))
			{
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.clickException(Wine, "Wine");
			}
			if(SubCategory.equalsIgnoreCase("Beer"))
			{
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.clickException(Beer, "Beer");
			}
			if(SubCategory.equalsIgnoreCase("Rum"))
			{
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.clickException(Rum, "Rum");
			}
			if(SubCategory.equalsIgnoreCase("Others"))
			{
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.scrollRightForCategory(ScrollingLiquorContainer);
				GenericMethod.clickException(Others, "Others");
			}
				
			
			//Asseretion
			Thread.sleep(2000);
			GenericMethod.waitForElementVisibility(objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[@text='"+SubCategory+"'])[1]")));
			String Actual = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView[@text='"+SubCategory+"'])[1]")).getText();
			String Expected = SubCategory;
			
			if(!Actual.equalsIgnoreCase(Expected))
			{
			Assert.assertEquals(false, true,"Assertion Falied Clicked on Wrong Category");	
				
			}
			
			
		}
			
			else if(ConfigModule.equalsIgnoreCase("Exclusive"))
			{
				//Wait for any Operation Till Page is Loaded
				objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
				
				objPojo.getObjWrapperFunctions().scrollDownSmall();
				GenericMethod.clickException(ViewAll, "ExclusiveViewAll");
				
			}
			
			
			else if(ConfigModule.equalsIgnoreCase("Reserve"))
			{
				//Wait for any Operation Till Page is Loaded
				objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
				
				//Scrolling to Reserve
				for(int x=0 ;x<2;x++)
				{
					GenericMethod.scrollDownLong();
				}
				
				
				//Wait for any Operation Till Page is Loaded
				GenericMethod.waitForElementPresence(ViewAll);
				GenericMethod.clickException(ViewAll,"View All on Reserve");
				GenericMethod.waitForElementPresence(ReserveTitle);
			}
			
			
			
			else if(ConfigModule.equalsIgnoreCase("Popular Brands"))
			{
				By ScrollingLiquorContainer;
				ScrollingLiquorContainer = By.xpath("((//androidx.recyclerview.widget.RecyclerView)[3]//android.view.ViewGroup[@clickable='true'])[2]");

				//Wait for any Operation Till Page is Loaded
				objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
				//Scrolling to PopularBrands
				for(int x=0 ;x<2;x++)
				{
					GenericMethod.scrollDownLong();
					Thread.sleep(700);
				}
				
				
				
				HashMap< String, Integer> PopularBrandsHash = new HashMap<String, Integer>();
				PopularBrandsHash.put("Johnnie Walker", 1);
				PopularBrandsHash.put("Chivas Regal", 2);
				PopularBrandsHash.put("Jack Daniels", 3);
				PopularBrandsHash.put("GLENFIDDICH", 4);
				PopularBrandsHash.put("Absolut", 5);
				PopularBrandsHash.put("Smirnoff", 6);
				PopularBrandsHash.put("Sula", 7);
				PopularBrandsHash.put("Sensi", 8);
				PopularBrandsHash.put("Fruzzante", 9);
				PopularBrandsHash.put("Kingfisher", 10);
				PopularBrandsHash.put("BIRA 91", 11);
				PopularBrandsHash.put("Tuborg", 12);
				PopularBrandsHash.put("Old Monk", 13);
				PopularBrandsHash.put("Bacardi", 14);
				
				//ForLoop
				for(String ProductName: PopularBrandsHash.keySet())
				{
					if(ProductName.equalsIgnoreCase(PopularBrandName))
					{
						int scrollOccurence = PopularBrandsHash.get(PopularBrandName);
						for(int x= 1; x<=scrollOccurence;x++)
						{		
							objPojo.getObjWrapperFunctions().scrollRightForPopularBrand(ScrollingLiquorContainer);	
							Thread.sleep(700);
						}
					}
				}
//				int x =0;
//				int scrollOccurence = PopularBrandsHash.get(PopularBrandName);
//				while(x<scrollOccurence)
//				{
//					objPojo.getObjWrapperFunctions().scrollRightForPopularBrand(ScrollingLiquorContainer);	
//					Thread.sleep(1000);
//					x++;
//				}
				
				//Clicking on our Brand
				By BrandName;
				By Bacardi;
				//BrandName = By.xpath("(//android.widget.ImageView)[4]");
				//
				
				
				BrandName = By.xpath("(//android.widget.ImageView)[6]");
				Bacardi = By.xpath("(//android.widget.ImageView)[7]");
				
				
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
					objPojo.getObjUtilities().logReporter("Wrong Popular Brand Selected as "+PopularBrandNameAssert,false);
				}
				
				
				
			
				
			}
			
			
			if(!ConfigModule.equalsIgnoreCase("Home"))
			{
				GenericMethod.click(SearchButton);
				GenericMethod.click(InnerSearchExpectHome);
				GenericMethod.clearAndSendKeysCustomException(InnerSearchExpectHome, Liquior, "Search Bar");
				
				
			}
			
			
		//waiting for 2 seconds		
		Thread.sleep(2700);
		
		//Clicked on our Specified Product at Search Bar after entering Products name (ASSERT TO as Clicking is Concatinated)
		objPojo.getObjUtilities().logReporter("Clicked on "+Liquior +" at Search Bar",
				objPojo.getObjWrapperFunctions().clickException(FirstLiquiourProduct,Liquior+"Product at Search Bar"));
		
		
		
		//Positive-Saved
		if(ConfigTestType.equalsIgnoreCase("Positive-Saved"))
	{
		GenericMethod.clickException(MyProfile,"My Profile");
		GenericMethod.clickException(Home,"Home Down Bar");
		
		if(ConfigModule.equalsIgnoreCase("Home"))
		{
			GenericMethod.waitForElementToBeClickable(HomeSearchBar);
			objPojo.getObjUtilities().logReporter("Clicked on Search Bar",
					GenericMethod.clickException(HomeSearchBar,"Search Bar Field"));
			
			
			if(!Liquior.equalsIgnoreCase(objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+Liquior+"']")).getText()))
			{
				Assert.assertEquals(true, false,"No Saved Item for Search bar");
			}	
		}
	}
		
		
		
		
		else
		{
		
		// Clicked on our Specified Product at Product List(ASSERT TO as Clicking is Concatinated)
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
		
		//Assertion if Product on Cart is Same as product we Searched
		if(!ProductName.equalsIgnoreCase(Liquior))
		{
			Assert.assertEquals(true, false,"Error At Cart Page Product Mismatches from one We Searched");
		}
		
		
		objPojo.getObjUtilities().logReporter("Name of The Product is "+ProductName,true);

		//Scroll-Down
		objPojo.getObjWrapperFunctions().scrollDown();	
		String Type = objPojo.getEntityRunner().getStringValueForField("TestType");		
		if(Type.equalsIgnoreCase("Positive-Notify") || Availibility.equalsIgnoreCase("CURRENTLY UNAVAILABLE"))
		{	
			
			Reporter.log("<B>--------------------------------------------------------------</B>",true);
			Reporter.log("<B> Passed!!! and Clicked On NotiyMe Button as Product is Out Of Stock! </B>",true);
			Reporter.log("<B>--------------------------------------------------------------</B>",true);
			
	
		}
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

		String traverse = objPojo.getEntityRunner().getStringValueForField("TravserseCart");
		objPojo.getObjUtilities().logReporter("<B>Traversed To Perform Liquor Search Actions </B>",true);
		fillSearchLiquiorDetails();
		if(traverse.equalsIgnoreCase("Yes"))
		{
		TraversingToCartDetails();
		TraversingToAssertOrderDetails();
	
		}
	}

}
