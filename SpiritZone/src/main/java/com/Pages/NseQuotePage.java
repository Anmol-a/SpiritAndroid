package com.Pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.spiritzone.EntityRunner;
import com.spiritzone.FrameworkServices;
import com.spiritzone.Pojo;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;

public class NseQuotePage {

	public static IOSDriver<MobileElement> driver;	
	String searchScriptTextFieldios;
	private By SellButton;
	private By BuyButton;
	private By searchScriptTextField;
	private By scriptName;
	private By quoteWatchListIcon;
	private By quoteBuyIcon;
	private By quoteSellIcon;
	private By instrumentTypeAll;
	private By instrumentTypeEquity;
	private By scriptTitle;
	private By exchangeType;
	private By lowerCircuitValueLabel;
	private By overviewLabel;
	private By marketDepthLabel;
	private By instrumentInfoLabel;
	private By volumePrice;
	private By priceInPercent;
	private By bidValue;
	private By askValue;
	private By openValue;
	private By dayLowValue;
	private By weekLowValue;
	private By prevCloseValue;
	private By dayHighValue;
	private By weekHighValue;
	private By upperLimitValue;
	private By totalVolumeValue;
	private By lastTradedTimelabel;
	private By lastUpdatedTimelabel;
	private By AddToWatchlist;
	private By scriptNameGABRIEL;
	Pojo objPojo;
	private EntityRunner EntityRunner;
	private String testData;
	private By instrumentTypeFNO;
	private By futures;
	private By instumentType;
	private By allExpiryDate;
	private By expiryDate;
	private By EquitySegment;
	private By BSEDropDown;
	private By ADropDown;
	private By BDropDown;

	public NseQuotePage(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		searchScriptTextFieldios ="**/XCUIElementTypeTextField[`value BEGINSWITH \"Search scrip\"`]";
		searchScriptTextField = By.xpath("//XCUIElementTypeTable[@name='Empty list']//preceding-sibling::XCUIElementTypeOther//XCUIElementTypeTextField");
		
		scriptNameGABRIEL = By.xpath("(//XCUIElementTypeStaticText[@name='VGUARD'])[1]");
		//searchScriptTextField = By.xpath("");
		quoteWatchListIcon = By.xpath("");
		quoteBuyIcon = By.name("Q");
		quoteSellIcon = By.name("R");
		//quoteBuyIcon = By.xpath("//XCUIElementTypeButton[@name='Q']");
		//quoteSellIcon = By.xpath("//XCUIElementTypeButton[@name='R']");
		instrumentTypeAll = By.xpath("");
		instrumentTypeEquity = By.name("Equity");
								//By.xpath("//XCUIElementTypeButton[@name='Equity']");
		scriptTitle = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/toolbarScripDisplayName']");
		exchangeType = By.xpath("//android.widget.ToggleButton[@resource-id='com.sft.now:id/toggleNSEBSE']");
		lowerCircuitValueLabel = By.xpath("//XCUIElementTypeStaticText[@name='Lower Limit']//following-sibling::XCUIElementTypeStaticText[1]");
		overviewLabel = By.xpath("//android.widget.TextView[@text='OVERVIEW']");
		marketDepthLabel = By.xpath("//android.widget.TextView[@text='MARKET DEPTH']");
		instrumentInfoLabel = By.xpath("//android.widget.TextView[@text='INSTRUMENT INFO']");
		volumePrice = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/priceInPoint']");
		priceInPercent = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/priceInPercent']");
		bidValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblBidValue']");
		askValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblAskValue']");
		openValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblOpenValue']");
		dayLowValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblDayLowValue']");
		weekLowValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl52WeekLowValue']");
		prevCloseValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblPrevCloseValue']");
		dayHighValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblDayHighValue']");
		weekHighValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl52WeekHighValue']");
		upperLimitValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblUpperLimitValue']");
		totalVolumeValue = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblTotVolumeValue']");
		lastTradedTimelabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lastTradedTimeValue']");
		lastUpdatedTimelabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lastUpdatedTimeValue']");
		instrumentTypeFNO = By.name("FNO");
				//By.xpath("//XCUIElementTypeButton[@name='FNO']");
		futures= By.name("Futures"); 
				//By.xpath("//XCUIElementTypeButton[@name='Futures']");
		allExpiryDate =By.xpath("//XCUIElementTypeButton[@name='All Expiry']");
		EquitySegment = By.xpath("//XCUIElementTypeButton[@name='Equity']");
		BSEDropDown= By.xpath("//XCUIElementTypeButton[@name=\"All Series\"]");
		ADropDown=By.xpath("(//XCUIElementTypeStaticText[@name='A'])[2]");
		BDropDown=By.xpath("(//XCUIElementTypeStaticText[@name='B'])[2]");
		BuyButton = By.name("BUY");
		SellButton = By.name("SELL");
		
		//BuyButton = By.xpath("//XCUIElementTypeButton[@name='BUY']");
		//SellButton=By.xpath("//XCUIElementTypeButton[@name='SELL']");
	}

	public void fillQuoteDetails()  {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			TouchAction touch = new TouchAction(objPojo.getDriver());
			
			if (EntityRunner.getBooleanValueForField("ConfigSearchScript")) {
				objPojo.getObjUtilities().logReporter("Clicked on search Script",
						objPojo.getObjWrapperFunctions().click(searchScriptTextField));
				if (EntityRunner.getBooleanValueForField("ConfigSearchScript")) {
					
					
				MobileElement searchScriptTextFieldiosClassChain = objPojo.getDriver().findElement(MobileBy.iOSClassChain(searchScriptTextFieldios));
					objPojo.getObjUtilities().logReporter("Set Script Text Field Value",
							objPojo.getObjWrapperFunctions().clearAndSendKeySios(searchScriptTextFieldiosClassChain,
									EntityRunner.getStringValueForField("SearchScript")));				
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			
				}
				
}
			if(EntityRunner.getBooleanValueForField("ConfigActionClass"))
			{
				
			//		Clicking on first DropDown For FO using Co-ordinates FOR 6+
			//FOR 1st NIFTYIT,BANKNIDTY,USDJPY,EURINR
				//touch.press(PointOption.point(2,179)).perform();
				//For 2nd
				//touch.press(PointOption.point(2,249)).perform();
				//for 3rd
			touch.press(PointOption.point(2,319)).perform();
		//	touch.press(PointOption.point(2,319)).perform();
				//for 4th
			//	touch.press(PointOption.point(2,390)).perform();
				System.out.println("Clicked on Co-ordintaes ");
			}
			
			if (EntityRunner.getBooleanValueForField("ConfigInstrumentTypeAll")) {
				objPojo.getObjUtilities().logReporter("Click Instrument Type Equity",
						objPojo.getObjWrapperFunctions().click(instrumentTypeAll));
				
			}
			if (EntityRunner.getBooleanValueForField("ConfigInstrumentTypeEquity"))
			{
				objPojo.getObjUtilities().logReporter("Click Instrument Type Equity ",
						objPojo.getObjWrapperFunctions().click(instrumentTypeEquity));
			}
			//FNO
			if (EntityRunner.getBooleanValueForField("ConfigFNO")) {
				//objPojo.getDriver().findElementByXPath("//*[@name=\"FNO\"]").click();
			//	objPojo.getObjWrapperFunctions().click(instrumentTypeFNO);
//			TouchAction touch3 = new TouchAction(driver);
//				touch3.tap(PointOption.point(200, 100)).perform();
				
			}
				if (EntityRunner.getBooleanValueForField("ConfigFutures")) {
					objPojo.getObjUtilities().logReporter("Click FUTURE DROPDOWN  ",
							objPojo.getObjWrapperFunctions().click(futures));
					
					testData=EntityRunner.getStringValueForField("FuturesDropdowm");
					
					instumentType=By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + testData + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Instrument Type",
							objPojo.getObjWrapperFunctions().click(instumentType));
						
				}
				if (EntityRunner.getBooleanValueForField("ConfigAllExpiryDate"))
					
				{
					objPojo.getObjUtilities().logReporter("Click AllExpiryDate ",
							objPojo.getObjWrapperFunctions().click(allExpiryDate));
					//change xpath once inspector starts
					expiryDate=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
					objPojo.getObjUtilities().logReporter("Click Instrument Type",
							objPojo.getObjWrapperFunctions().click(expiryDate));
				
			}
				
				if (EntityRunner.getBooleanValueForField("ConfigSearchScriptBSE")) {
					objPojo.getObjUtilities().logReporter("Clicked On All Series DropDown ",
					objPojo.getObjWrapperFunctions().click(BSEDropDown));
					
				}
				if (EntityRunner.getBooleanValueForField("ConfigSearchScriptA")) {
					objPojo.getObjWrapperFunctions().click(ADropDown);
				}
				if (EntityRunner.getBooleanValueForField("ConfigSearchScriptB")) {
					objPojo.getObjWrapperFunctions().click(BDropDown);
				}
	
			if (EntityRunner.getBooleanValueForField("ConfigScriptName"))
			{
				
				String Menu = EntityRunner.getStringValueForField("SearchScript");
				//(//XCUIElementTypeStaticText[@name='JUBLFOOD'])[1]
				scriptName=By.xpath("(//XCUIElementTypeStaticText[@name=" + "'" + Menu + "'" + "])[1]");
				objPojo.getObjUtilities().logReporter("Click Script Name",
						objPojo.getObjWrapperFunctions().click(scriptName));
			}
			
			if (EntityRunner.getBooleanValueForField("ConfigExchangeType")) {
				objPojo.getObjUtilities().logReporter("Click Exchange Type",
						objPojo.getObjWrapperFunctions().click(exchangeType));
			}

			if (EntityRunner.getBooleanValueForField("ConfigQuoteWatchlist")) {
				objPojo.getObjUtilities().logReporter("Click Quote watch List icon",
						objPojo.getObjWrapperFunctions().click(quoteWatchListIcon));
				if (EntityRunner.getBooleanValueForField("ConfigAddToWatchlist")) {
					String testData = EntityRunner.getStringValueForField("AddToWatchlist");
					AddToWatchlist = By.xpath("//android.widget.TextView[@text=" + "'" + testData + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Add to WatchList",
							objPojo.getObjWrapperFunctions().click(AddToWatchlist));
				}
			}
			if (EntityRunner.getBooleanValueForField("ConfigLowerCircuitValue")) {
				
			String text = objPojo.getObjWrapperFunctions().fetchValueFromFields(lowerCircuitValueLabel);
				String text1 = objPojo.getObjUtilities().TickValue(text);
				double txt = Double.parseDouble(text1) + 4;
				String s = Double.toString(txt);
//				System.out.println(s);
				testData=EntityRunner.getStringValueForField("DependencyForLowerCircuit");
//				System.out.println(testData);
				objPojo.getObjUtilities().setValueIntoDatbase("TriggerPriceRandomSL","Price",testData ,s);
//				EntityRunner.setStringValueForField("LowerCircuitValue",testData s);
			}
			if (EntityRunner.getBooleanValueForField("ConfigTriggerPriceRandom")) {
				if (EntityRunner.getBooleanValueForField("ConfigQuoteBuyIcon")) {
					String text = objPojo.getObjWrapperFunctions().fetchValueFromFields(lowerCircuitValueLabel);
					double txt = Double.parseDouble(objPojo.getObjUtilities().TickValue(text)) + 4;
					double txt1 = (txt) - 2;
					String s = Double.toString(txt1);
					EntityRunner.setStringValueForField("TriggerPriceRandomSL", s);
				}
				
				if (EntityRunner.getBooleanValueForField("ConfigSellafterBuy")) 
				{
					System.out.println((EntityRunner.getBooleanValueForField("ConfigSellafterBuy")));
					objPojo.getObjWrapperFunctions().click(quoteBuyIcon);
					objPojo.getObjWrapperFunctions().click(SellButton);
					
				}
				
				
				if (EntityRunner.getBooleanValueForField("ConfigQuoteSellIcon")) {
					String text = objPojo.getObjWrapperFunctions().fetchValueFromFields(lowerCircuitValueLabel);
					double txt = Double.parseDouble(objPojo.getObjUtilities().TickValue(text)) + 4;
					double txt1 = (txt) + 2;
					String s = Double.toString(txt1);
					EntityRunner.setStringValueForField("TriggerPriceRandomSL", s);
				}
			}

			/*
			 * String text = getText(limitList); double txt = Double.parseDouble(text) - 1;
			 * System.out.println(txt); clearAndSendKeys(triggerPriceTextField, txt + "");
			 * String trigger = getText(triggerPriceTextField);
			 * PlaceOrderEntity.setStringValueForField("TriggerPriceRandom", trigger);
			 */

			if (EntityRunner.getBooleanValueForField("ConfigQuoteBuyIcon")) {
				objPojo.getObjUtilities().logReporter("Click Quote Buy Icon",
						objPojo.getObjWrapperFunctions().click(quoteBuyIcon));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuoteSellIcon")) {
				objPojo.getObjUtilities().logReporter("Click Quote Sell Icon",
						objPojo.getObjWrapperFunctions().click(quoteSellIcon));
			}
			if (EntityRunner.getBooleanValueForField("ConfigOverviewLabel")) {
				objPojo.getObjUtilities().logReporter("Click overview Label",
						objPojo.getObjWrapperFunctions().click(overviewLabel));
			}
			if (EntityRunner.getBooleanValueForField("ConfigMarketDepthLabel")) {
				objPojo.getObjUtilities().logReporter("Click Market Depth",
						objPojo.getObjWrapperFunctions().click(marketDepthLabel));
			}
			if (EntityRunner.getBooleanValueForField("ConfigInstrumentInfoLabel")) {
				objPojo.getObjUtilities().logReporter("Click Instrument Label",
						objPojo.getObjWrapperFunctions().click(instrumentInfoLabel));
			}

		}

		else if (EntityRunner.getAction().equalsIgnoreCase("Verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigScriptTitle")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(scriptTitle);
				objPojo.getObjUtilities().logReporter("Verify Script Title Displayed as : " + str, !str.equals(""));
			}
		

			if (EntityRunner.getBooleanValueForField("ConfigVolumePrice")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(volumePrice);
				objPojo.getObjUtilities().logReporter("Verify Volume Price Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigPriceInPercent")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(priceInPercent);
				objPojo.getObjUtilities().logReporter("Verify Price In Percent Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigBidValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(bidValue);
				objPojo.getObjUtilities().logReporter("Verify Bid Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigAskValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(askValue);
				objPojo.getObjUtilities().logReporter("Verify Ask Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigOpenValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(openValue);
				objPojo.getObjUtilities().logReporter("Verify Open Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigDayLowValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(dayLowValue);
				objPojo.getObjUtilities().logReporter("Verify Day Low Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigWeekLowValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(weekLowValue);
				objPojo.getObjUtilities().logReporter("Verify Week Low Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigPrevCloseValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(prevCloseValue);
				objPojo.getObjUtilities().logReporter("Verify Prev Close Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigDayHighValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(dayHighValue);
				objPojo.getObjUtilities().logReporter("Verify Day High Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigWeekHighValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(weekHighValue);
				objPojo.getObjUtilities().logReporter("Verify Week High Value Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigUpperLimitValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(upperLimitValue);
				objPojo.getObjUtilities().logReporter("Verify Upper Limit Value Displayed as : " + str,
						!str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigLowerCircuitValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(lowerCircuitValueLabel);
				objPojo.getObjUtilities().logReporter("Verify Lower Limit Value Displayed as : " + str,
						!str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigTotalVolumeValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(totalVolumeValue);
				objPojo.getObjUtilities().logReporter("Verify Total Volume Value Displayed as : " + str,
						!str.equals(""));
			}
/*
			TouchAction action = new TouchAction(objPojo.getDriver());
			action.longPress(PointOption.point(526, 1948)).moveTo(PointOption.point(526, 1496)).release().perform();
*/
			if (EntityRunner.getBooleanValueForField("ConfigLastTradedTimeValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(lastTradedTimelabel);
				objPojo.getObjUtilities().logReporter("Verify Last Traded Time Value Displayed as : " + str,
						!str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigLastUpdatedTimeValue")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(lastUpdatedTimelabel);
				objPojo.getObjUtilities().logReporter("Verify Last Updated Time Value Displayed as : " + str,
						!str.equals(""));
			}

		}

	}

	public void fillAndSubmitQuoteDetails(){

		fillQuoteDetails();

	}
}
