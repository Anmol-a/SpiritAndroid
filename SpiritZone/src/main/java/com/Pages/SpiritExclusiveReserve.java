package com.Pages;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

public class SpiritExclusiveReserve {
	
	
	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	 By Vodka;
	 
		public SpiritExclusiveReserve(Pojo objPojo) {
			this.objPojo = objPojo;
			EntityRunner = objPojo.getEntityRunner();
			Vodka = By.xpath("//android.widget.TextView[@text='VODKA']");
			
		}
		
		//SHOWCASE
		public void FillHomeOrderForExclusive() throws InterruptedException {
			By ShowCaseProductOne;
			By ShowCaseProductTwo;
			By ViewAll;
			
			ShowCaseProductOne = By.xpath("(//android.widget.TextView[@text='Exclusive']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup)[1]");
			ShowCaseProductTwo = By.xpath("(//android.widget.TextView[@text='Exclusive']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup)[2]");
			ViewAll = By.xpath("//android.widget.TextView[@text='Exclusive']//parent::android.view.ViewGroup//parent::android.view.ViewGroup/android.widget.TextView[@text='View All']");
			
			objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='The Reserve']")).size()==0)
			{
				objPojo.getObjWrapperFunctions().scrollDown();
	
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigExclusiveFirstProduct")) {		
				//Scroll Down
				
				objPojo.getObjUtilities().logReporter("Clicked On First Product ",
				objPojo.getObjWrapperFunctions().clickException(ShowCaseProductOne,"First Product On ShowCase"));		
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigExclusiveLastScroll"))
			{
				for(int x =0;x<5;x++)
				{
				objPojo.getObjWrapperFunctions().scrollRightForCategory(By.xpath("//android.widget.TextView[@text='Exclusive']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView"));
				}
				
				objPojo.getObjUtilities().logReporter("Clicked On Last Product ",
						objPojo.getObjWrapperFunctions().clickException(ShowCaseProductTwo,"First Product On ShowCase"));		
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigExclusiveViewAll")) {
				//Scroll Down
				Thread.sleep(2000);
				objPojo.getObjUtilities().logReporter("Clicked On View ALL ",
				objPojo.getObjWrapperFunctions().clickException(ViewAll,"View All button For ShowCase module"));
				
				objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.TextView[@text='LIQUOR']"));
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='LIQUOR']")).size()==0)
				{
					Assert.assertEquals(false, true,"Failed at Exclusive Module After Clicking on View All");
				}
		
		}		
	}
	 
		
		//RESERVE 
		public void FillHomeOrderForReserve() throws InterruptedException {
		
			By ViewAll;
			By FirstProduct;
			By SecondProduct;
			By ReserveTitle;
			
			
			ViewAll = By.xpath("(//android.widget.TextView[@text='View All'])");
			FirstProduct = By.xpath("(//android.widget.TextView[@text='The Reserve']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup)[1]");
			SecondProduct = By.xpath("(//android.widget.TextView[@text='The Reserve']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup)[2]");
			ReserveTitle = By.xpath("//android.widget.TextView[@text='THE RESERVE']");
			
			
			
			
			//Wait for any Operation Till Page is Loaded
			objPojo.getObjWrapperFunctions().waitForElementPresence(Vodka);
			while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Popular Brands']")).size()==0)
			{
				objPojo.getObjWrapperFunctions().scrollDown();
	
			}
			
			//Wait for any Operation Till Page is Loaded
			objPojo.getObjWrapperFunctions().waitForElementPresence(ViewAll);
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFirstReserveProduct")) {
				//Clicking on First Product
				objPojo.getObjUtilities().logReporter("Clicked On First Product For Reserve",
						objPojo.getObjWrapperFunctions().clickException(FirstProduct,"First Product On Reserve"));
			}
			
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReserveLastScroll")) {

				for(int x =0;x<5;x++)
				{
				objPojo.getObjWrapperFunctions().scrollRightForCategory(By.xpath("//android.widget.TextView[@text='The Reserve']//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup//parent::android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView"));
				}
				
				objPojo.getObjUtilities().logReporter("Clicked On Last Product ",
						objPojo.getObjWrapperFunctions().clickException(SecondProduct,"Last  Product On Reserve Horizontal Scroll"));
				
			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReserveViewAll")) 
			{
				
				System.out.println();
				//Clicking on View All
				objPojo.getObjUtilities().logReporter("Clicked On ViewAll For Reserve",
						objPojo.getObjWrapperFunctions().clickException(ViewAll,"View All on Reserve"));
				objPojo.getObjWrapperFunctions().waitForElementPresence(ReserveTitle);
				
				//Wait for 2 Seconds
				Thread.sleep(2000);
				
				//scroll
				String ReserveProductListName = objPojo.getEntityRunner().getStringValueForField("ReserveProductName");	
				while(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='"+ReserveProductListName+"']")).size()==0)
				{
					objPojo.getObjWrapperFunctions().scrollDownCustomForProuctList();	
					Thread.sleep(700);	
				}
				//Click on Specified Product
				objPojo.getDriver().findElementByXPath("//android.widget.TextView[@text='"+ReserveProductListName+"']").click();
				
				}
			}
	
		
		
		
		
		
		
	 
	 
		public void fillAndSubmitExclusiveReserve() throws InterruptedException {
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigExclusiveType"))
			{
			objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Exclusive Category Updates </B>",true);
			FillHomeOrderForExclusive();

			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigReserveType"))
			{
				objPojo.getObjUtilities().logReporter("<B>Traversed TO Home Page to Perform Reserve Category Updates </B>",true);
				FillHomeOrderForReserve();
				//ReserveProductDescription();	
			}
		}

}
