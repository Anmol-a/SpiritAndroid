package com.Pages;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritZonePopularBrands {
	
	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	 ArrayList<String> SubCategoriesTypeList;
	 
	 
	 By Vodka;
	 
		public SpiritZonePopularBrands(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
			
			
			Vodka = By.xpath("//android.widget.TextView[@text='VODKA']");
			
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
			
			Thread.sleep(2800);
			HashMap< String, Integer> PopularBrandsHash = new HashMap<String, Integer>();
			PopularBrandsHash.put("Johnnie Walker", 1);
			PopularBrandsHash.put("Chivas Regal", 2);
			PopularBrandsHash.put("JACK DANIELS", 3);
			PopularBrandsHash.put("Glenfiddich", 4);
			PopularBrandsHash.put("ABSOLUT", 5);
			PopularBrandsHash.put("Smirnoff", 6);
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
			String PopularBrandProductName = objPojo.getEntityRunner().getStringValueForField("ProductName");	
			Thread.sleep(3000);
			//ForLoop
			for(String ProductName: PopularBrandsHash.keySet())
			{
				if(ProductName.equalsIgnoreCase(PopularBrandName))
				{
					int scrollOccurence = PopularBrandsHash.get(PopularBrandName);
					for(int x= 1; x<=scrollOccurence;x++)
					{	
						
						objPojo.getObjWrapperFunctions().scrollRightForPopularBrand(ScrollingLiquorContainer);	
						Thread.sleep(1500);
					}
				}
			}
			
			//Clicking on our Brand
			By BrandName;
			By Bacardi;
			//BrandName = By.xpath("(//android.widget.ImageView)[4]");
			//for Bigger SmartPhones
			BrandName = By.xpath("(//android.widget.TextView[@text='Popular Brands']//ancestor::android.view.ViewGroup)[9]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
			Bacardi = By.xpath("(//android.widget.TextView[@text='Popular Brands']//ancestor::android.view.ViewGroup)[9]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
			
			
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
			
			
			Thread.sleep(3000);
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
			
			
			//Click On Specified Product 
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+PopularBrandProductName+"']")).size()==0)
			{
				objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();
			}
			
			objPojo.getObjWrapperFunctions().clickException(By.xpath("//android.widget.TextView[@text='"+PopularBrandProductName+"']"), "Clicked on Product As: "+PopularBrandProductName+"For BrandName as : "+PopularBrandName);
			
			
			
			}		
			
		
		
		
		public void fillAndSubmitPopularBrands() throws InterruptedException {
			
			Reporter.log("Traversed to Popular Brands ",true);
			Thread.sleep(4000);
			FillHomeOrderForPopularBrand();
		}
		
		
		
		
		
		
		
}
