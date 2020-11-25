package com.Pages;



import java.util.ArrayList;
import java.util.Arrays;

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
	 By Backbutton;
	 By MakeRequestBtn;
	 By AddBtn;
	 By SubtractBtn;
		
	 By Volume	;
	 
		
		public SpiritProductDescription(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
			
			
			
			CartTravserse = By.xpath("//android.widget.TextView[@text='CART']");
			Volume = By.xpath("//android.widget.TextView[starts-with(@text,'Volume')]");
			AddtoCart = By.xpath("//android.widget.Button[@text='ADD TO CART']");
			MakeRequestBtn = By.xpath("//android.widget.TextView[@text='MAKE A REQUEST']");
			Backbutton = By.xpath("(//android.widget.TextView[@text='LIQUOR']/ancestor::android.view.ViewGroup)[7]/android.view.ViewGroup[1]");
			SubtractBtn = By.xpath("(//android.widget.TextView[@text='NOW IN CART']//following-sibling::android.view.ViewGroup/android.view.ViewGroup)[1]");
			AddBtn = By.xpath("(//android.widget.TextView[@text='NOW IN CART']//following-sibling::android.view.ViewGroup/android.view.ViewGroup)[3]");
		}
		
		 
			//TO PRODUCT DESCRIPTION
			public void TraverseToPrductDescription() throws InterruptedException
			{
				
				//
				String MultipleSubtractStr = objPojo.getEntityRunner().getStringValueForField("MultipleSubtractProducts");
				ArrayList<String> MultipleSubtractStrList= new ArrayList<String>(Arrays.asList(MultipleSubtractStr.split("\\,")));
				
					System.out.println();
					//Wait for 3 seconds
					Thread.sleep(4000);
					String Price = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).getText();
					objPojo.getObjUtilities().logReporter("Price of The Product is "+Price,true);
					
					
					//Alcohol Content
					String AlcoholContent = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Alcohol')]")).getText();
					objPojo.getObjUtilities().logReporter("Alcohol Content  of The Product is "+AlcoholContent,true);
					if(AlcoholContent.isEmpty())
					{
						Assert.assertEquals(true, false,"no Alcohol  Content");
					}
					
					
					//Product  Description
					String ProductDescription = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Product Description']/following-sibling::android.widget.TextView")).getText();
					objPojo.getObjUtilities().logReporter("Product Description "+ProductDescription,true);
					if(ProductDescription.isEmpty())
					{
						Assert.assertEquals(true, false,"no Alcohol  Content");
					}

					//ProductName and Assertion
					String ProductName = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[1]")).getText();
					objPojo.getObjUtilities().logReporter("Name of The Product is "+ProductName,true);
					if(ProductName==null)
					{
						Assert.assertEquals(true, false,"no Product Name ");
					}
						
			
					//Scroll-Down
					String Availibility = objPojo.getDriver().findElement(By.xpath("(//android.widget.TextView)[6]")).getText();
					objPojo.getObjUtilities().logReporter("Availability status : "+Availibility,true);
					objPojo.getObjWrapperFunctions().scrollDown();	
					if(Availibility==null)
					{
						Assert.assertEquals(true, false,"no Product Availability Details");
					}
					
					
					ArrayList<String> VolumeList = new ArrayList<String>();
					VolumeList.add("capa");
					VolumeList.add("70 ml");
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
					VolumeList.add("250 ml");
					VolumeList.add("375 ml");
					VolumeList.add("330 ml-Can");
					VolumeList.add("330 ml-Pint");

					
					
					
					//Checking Volume
					if(objPojo.getEntityRunner().getBooleanValueForField("ConfigClickVolume"))
					{
					    //Predefined Volume
						String Volprefdefined = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Volume: ')]")).getText().replace("Volume: ", "");
						
						
						Thread.sleep(700);
						objPojo.getObjUtilities().logReporter("Clicked on Product Volume",
								objPojo.getObjWrapperFunctions().clickException(Volume,"Product Volume Button"));
						
						
						for(int x = 0 ; x<VolumeList.size();x++)
						{
						Thread.sleep(1000);
						if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+VolumeList.get(x)+"']")).size()!=0)
						{
							//Postdefined Volume
							String VolAfterdefined = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+VolumeList.get(x)+"']")).getText();
							
							Thread.sleep(1000);
							//Storing Price
							objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.TextView[@text='Sizes']"));
							String ProductPrice = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).getText().replace("₹ ", "").replace(",", "");
							int Priceint = Integer.parseInt(ProductPrice);
							
							
							objPojo.getObjUtilities().logReporter("Clicked on "+VolumeList.get(x), true);
							objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.TextView[@text='"+VolumeList.get(x)+"']"));
							
							//Asserting Price
							String ProductPriceAfterChange = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[starts-with(@text,'₹')]")).getText().replace("₹ ", "").replace(",", "");
							int PriceAfterApplyingVolumeint = Integer.parseInt(ProductPriceAfterChange);
							
							objPojo.getObjWrapperFunctions().click(Volume);
					
							String str1 =  Volprefdefined.replace(" ", "");
							String str2 =  VolAfterdefined.replace(" ", "");	
							
							if((Priceint==PriceAfterApplyingVolumeint   && !str1.equalsIgnoreCase(str2)))
							{
								if((x!=17 && x!=18))
								{
									break;
								}
								Assert.assertEquals(false, true ,"Volume Sizes not Working Properly");	
							}	
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
					
					
					//Adding Multiple Products in Cart
					else if(objPojo.getEntityRunner().getBooleanValueForField("ConfigAddToCartButtonMultiple"))
					{
						
						//Looping Till we've Multiple Products
						for(int x = 1;x<MultipleSubtractStrList.size()+1;x++)
						{
						Thread.sleep(1700);
						//Adding to cart button
						objPojo.getObjUtilities().logReporter("Clicked on Add to cart",
								objPojo.getObjWrapperFunctions().clickException(AddtoCart,"Add To Cart Button"));
						
						//Back To Add More Product
						objPojo.getObjUtilities().logReporter("Clicked on Back to Product List",
								objPojo.getObjWrapperFunctions().clickException(Backbutton,"Add To Cart Button"));
						
						System.err.println(MultipleSubtractStrList.size());
						if(x==MultipleSubtractStrList.size())
						{
							objPojo.getObjUtilities().logReporter("Traversed TO CART",
									objPojo.getObjWrapperFunctions().clickException(CartTravserse ,"CART ICON"));
							
							break;
						}
						String CustomProductName = MultipleSubtractStrList.get(x);
						
						//Scroll to Last and Get Price for Highest
						if(objPojo.getDriver().findElements(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']")).size()!=0)
						{
							Thread.sleep(1000);
							objPojo.getObjWrapperFunctions().click(By.xpath("(//androidx.recyclerview.widget.RecyclerView)[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2][@text='"+CustomProductName+"']"));

						}
						
						else
						{
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
	}
					
					
					
					
					//Adding Single Product in Cart
					else
					{
						//Traverse to Cart
						if(objPojo.getEntityRunner().getBooleanValueForField("ConfigAddToCartButton"))
						{
							Integer AddBtnDigit=0;
							//Adding to cart button
							objPojo.getObjUtilities().logReporter("Clicked on Add to cart",
									objPojo.getObjWrapperFunctions().clickException(AddtoCart,"Add To Cart Button"));
							
							
							//Assert that Add to cart is clickable
							int maxQTY = Integer.parseInt(objPojo.getEntityRunner().getStringValueForField("ConfigAddToMultQTY"));
							for(int x = 1 ;x<maxQTY+1;x++)
							{
								//Clicking on Addup Btn
								objPojo.getObjWrapperFunctions().click(AddBtn);
								String AddBtnNo = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='NOW IN CART']//following-sibling::android.view.ViewGroup/android.widget.TextView")).getText();
								AddBtnDigit = Integer.parseInt(AddBtnNo);
								if(x!=AddBtnDigit-1)
								{
									break;
								}
								
							}
							
							
							//Check if Subtract Button is Working or not 
							Thread.sleep(1600);
							if(objPojo.getEntityRunner().getBooleanValueForField("ConfigSubtCheck"))
							{
								for(int x =AddBtnDigit ;x>0;x--)
								{
									objPojo.getObjWrapperFunctions().click(SubtractBtn);
									if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='ADD TO CART']")).size()!=0)
									{
										break;
									}
									String SubtBTNNo = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='NOW IN CART']//following-sibling::android.view.ViewGroup/android.widget.TextView")).getText();
									int SubNo = Integer.parseInt(SubtBTNNo);
									
//									if(SubNo!=AddBtnDigit-1)
//									{
//										Assert.assertEquals(true, false,"Error Subtracting Product from Product Description");
//									}
								}
							}
							
							
							Thread.sleep(1000);
							objPojo.getObjUtilities().logReporter("Traversed TO CART",
									objPojo.getObjWrapperFunctions().clickException(CartTravserse ,"CART ICON"));
							
							
							
						//Wait for 2 sec
						Thread.sleep(3000);		
						if(maxQTY>0  && !objPojo.getEntityRunner().getBooleanValueForField("ConfigSubtCheck"))
						{
							if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+AddBtnDigit+"']")).size()==0)
							{
								Assert.assertEquals(false, true,"Error Updating quantity of Product via Description");
							}
						}
						
						if(objPojo.getEntityRunner().getBooleanValueForField("ConfigSubtCheck"))
						{
							if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@text='EXPLORE MY BAR']")).size()==0)
							{
								Assert.assertEquals(false, true,"Error Updating quantity of Product via Description");
							}
						}
						
						
					}	
				}		
			}
			
		
	
	public void productDescription() throws InterruptedException 
		{
	
		objPojo.getObjUtilities().logReporter("<B>Traversed TO Product Description Page </B>",true);
		TraverseToPrductDescription();
		}
	
}
