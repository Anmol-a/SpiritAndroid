package com.Pages;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritProductDescription {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	
	
	 
	 
	 By AddtoCart;
	 By CartTravserse;
	 By MakeRequestBtn;
		
	 By Volume	;
	 
		
		public SpiritProductDescription(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
			
			
			
			CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
			Volume = By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]");
			AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
			MakeRequestBtn = By.xpath("//android.widget.TextView[@text='MAKE A REQUEST']");
			
		}
		
		 
			//TO PRODUCT DESCRIPTION
			public void TraverseToPrductDescription() throws InterruptedException
			{
					System.out.println();
					//Wait for 3 seconds
					Thread.sleep(4000);
					String Price = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[5]")).getText();
					objPojo.getObjUtilities().logReporter("Price of The Product is "+Price,true);

					//ProductName
					String ProductName = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
					objPojo.getObjUtilities().logReporter("Name of The Product is "+ProductName,true);
			
					//Scroll-Down
					String Availibility = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[6]")).getText();
					objPojo.getObjUtilities().logReporter("Availability status : "+Availibility,true);
					objPojo.getObjWrapperFunctions().scrollDown();	
					//String Availibility = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='CURRENTLY UNAVAILABLE']")).getText();
					
					
					ArrayList<String> VolumeList = new ArrayList<String>();
					VolumeList.add("750 ml");
					VolumeList.add("180 ml");
					VolumeList.add("1 Litre");
					VolumeList.add("90 ml");
					VolumeList.add("200 ml");
					VolumeList.add("50 ml");
					VolumeList.add("60 ml");
					VolumeList.add("700 ml");
					VolumeList.add("2 Litre");
					VolumeList.add("330 ml");
					VolumeList.add("275 ml");
					VolumeList.add("500 ml");
					VolumeList.add("650 ml");
					VolumeList.add("3 Litre");
					VolumeList.add("330 ml-Can");
					VolumeList.add("330 ml-Pint");
					VolumeList.add("capa");
					VolumeList.add("250 ml");
					VolumeList.add("70 ml");
					
					if(objPojo.getEntityRunner().getBooleanValueForField("ConfigClickVolume"))
					{
						objPojo.getObjUtilities().logReporter("Clicked on Product Volume",
								objPojo.getObjWrapperFunctions().clickException(Volume,"Product Volume Button"));
						
						
						for(int x = 0 ; x<VolumeList.size();x++)
						{
						if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+VolumeList.get(x)+"']")).size()!=0)
						{
							objPojo.getObjUtilities().logReporter("Clicked on "+VolumeList.get(x), true);
							objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+VolumeList.get(x)+"']"));
							
							//ASSERT-REMAIN
//							System.err.println(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Volume: "+VolumeList.get(x)+"']")));
//							System.err.println(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Volume: "+VolumeList.get(x)+"']")).size());
//							if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Volume: "+VolumeList.get(x)+"']")).size()==0)
//							{
//							Assert.assertEquals(false, true ,"Volume Change Failed");
//							}
							objPojo.getObjWrapperFunctions().click(Volume);
							
							
						}
						}
						
					}
					
					
					
					
					
					
					if(Availibility.equalsIgnoreCase("CURRENTLY UNAVAILABLE"))
					{	
						
						Reporter.log("<B>--------------------------------------------------------------</B>",true);
						Reporter.log("<B> Passed!!! and Clicked On NotiyMe Button as Product is Out Of Stock! </B>",true);
						Reporter.log("<B>--------------------------------------------------------------</B>",true);
						
						
					}
					
					else if(objPojo.getEntityRunner().getBooleanValueForField("ConfigMakeARequest"))
					{
						if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='MAKE A REQUEST']")).size() > 0)
						{

							objPojo.getObjUtilities().logReporter("Click on Make Request Button",
									objPojo.getObjWrapperFunctions().clickException(MakeRequestBtn,"Make a Request Button"));
							
							
							if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Our team will buzz you soon!']")).size()==0)
							{
								Assert.assertEquals(false, true,"Failed to Verify Clicking on Make Request Button");
							}
						}
						else
						{
							
							objPojo.getObjUtilities().logReporter("Already Made a Request!",true);
							System.out.println("Already Made a Request!");
						}	
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