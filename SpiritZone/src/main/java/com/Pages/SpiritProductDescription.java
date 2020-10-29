package com.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritProductDescription {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	 ArrayList<String> SubCategoriesTypeList;
	 
	 
	 By AddtoCart;
	 By CartTravserse;
	 By Volume;
	 
		
		public SpiritProductDescription(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
			
			
			CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
			Volume = By.xpath("");
			AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
			
			
		}
			//Xpaths
			//TO PRODUCT DESCRIPTION
			public void TraverseToPrductDescription() throws InterruptedException
			{
					//Wait for 3 seconds
					Thread.sleep(4000);
					String Price = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[5]")).getText();
					objPojo.getObjUtilities().logReporter("Price of The Product is "+Price,true);

					//ProductName
					String ProductName = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
					objPojo.getObjUtilities().logReporter("Name of The Product is "+ProductName,true);
			
					//Scroll-Down
					Thread.sleep(3500);
					String Availibility = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[6]")).getText();
					objPojo.getObjUtilities().logReporter("Availability status : "+Availibility,true);
					objPojo.getObjWrapperFunctions().scrollDown();	
					//String Availibility = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='CURRENTLY UNAVAILABLE']")).getText();
					
					if(Availibility.equalsIgnoreCase("CURRENTLY UNAVAILABLE"))
					{	
						
						Reporter.log("<B>--------------------------------------------------------------</B>",true);
						Reporter.log("<B> Passed!!! and Clicked On NotiyMe Button as Product is Out Of Stock! </B>",true);
						Reporter.log("<B>--------------------------------------------------------------</B>",true);
						
						
					}
				
					else
					{
						//Traverse to Cart
						if(objPojo.getEntityRunner().getBooleanValueForField("ConfigAddToCartButton"))
						{
							//Adding to cart button
							objPojo.getObjUtilities().logReporter("Clicked on Add to cart",
									objPojo.getObjWrapperFunctions().clickException(AddtoCart,"Add To Cart Button"));
							
							objPojo.getObjUtilities().logReporter("Traversed TO CART",
									objPojo.getObjWrapperFunctions().clickException(CartTravserse ,"CART ICON"));
							
						//Wait for 2 sec
						Thread.sleep(2000);				
					}	
				}		
			}
			
		
	
public void productDescription() throws InterruptedException 
		{
	
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Product Description Page </B>",true);
		TraverseToPrductDescription();
		
		
		
		
		
		
		}
	
	
	
}
