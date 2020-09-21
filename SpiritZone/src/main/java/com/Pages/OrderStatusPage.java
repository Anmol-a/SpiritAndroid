package com.Pages;

import java.util.List;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OrderStatusPage {

	private By OrderBook;
	private By TradeBook;
	private By status;
	private By detailsTab;
	private By Script;
	private By exchangeTypeLabel;
	private By OrderQuantityLabel;
	private By OrderPrice;
	private By orderType;
	private By tradedQty;
	private By tradedPrice;
	private By triggerPrice;
	private By rejectedQty;
	private By productType;
	private By validity;
	private By averagePrice;
	private By disclosedQty;
	private By requestID;
	private By xTSOrderNo;
	private By orderDateAndTimeLabel;
	private By orderStatus;
	private By rejectionReasonLabel;
	private By modifyTab;
	private By exchangeOrderNo;
	private By CancelTab;
	private By closeLabel;
	private By menuButton;
	private By lblTradeBook;
	private By tradeAvgPrice;
	private By orderValue;
	private By filledQty;
	private By marketType;
	private By xTSOrderStatus;
	private By tradeID;
	private By tradeTime;
	private By userIcon;
	private By logoutButton;
	private By selectOrderStatus;
	private By confirmCancelButton;
	private By transactionPasswordField;
	private By yesButton;
	private By statusNameLabel;
	private By orderStatusTxt;
	Pojo objPojo;
	private EntityRunner EntityRunner;
	private By allDROPDOWN;
	private By openStatus;
	private By BackButton;
	private By OKpopup;
	private By NOWOrderNO;
	private By NOWOrderNOTrade;
	private By exchangeOrderNoTrade;
	private By tradeTimeTrade;
	private By NowOrderNo;
	public OrderStatusPage(Pojo objPojo) {
		
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		AppiumDriver<MobileElement> driver = objPojo.getDriver();
		OrderBook = By.xpath("(//XCUIElementTypeStaticText[@name='ORDER BOOK'])[2]");
		TradeBook = By.xpath("(//XCUIElementTypeStaticText[@name='TRADE BOOK'])[1]");
		detailsTab = By.name("document");
		orderStatusTxt = By.xpath("//XCUIElementTypeStaticText[@name='Order Date & Time']//following-sibling::XCUIElementTypeStaticText[1]");
		exchangeTypeLabel = By.xpath("(//XCUIElementTypeStaticText[@name=\"EQ | NSECM\"])[1]");
		OrderQuantityLabel = By.xpath("//XCUIElementTypeStaticText[@label='Order Qty']//following::XCUIElementTypeStaticText[3]");
		OrderPrice = By.xpath("//XCUIElementTypeStaticText[@name='Order Price']//following-sibling::XCUIElementTypeStaticText[3]");
		orderType = By.xpath("//XCUIElementTypeStaticText[@name='Order Type']//following-sibling::XCUIElementTypeStaticText[3]");
		tradedQty = By.xpath("//XCUIElementTypeStaticText[@name='Traded Qty']//following-sibling::XCUIElementTypeStaticText[3]");
		tradedPrice = By.xpath("//XCUIElementTypeStaticText[@name='Traded Price']//following-sibling::XCUIElementTypeStaticText[3]");
		triggerPrice = By.xpath("//XCUIElementTypeStaticText[@name='Trigger Price']//following-sibling::XCUIElementTypeStaticText[3]");
		rejectedQty = By.xpath("");
		productType = By.xpath("//XCUIElementTypeStaticText[@name='Product Type']//following-sibling::XCUIElementTypeStaticText[3]");
		validity = By.xpath("//XCUIElementTypeStaticText[@name='Validity']//following-sibling::XCUIElementTypeStaticText[3]");
		averagePrice = By.xpath("//XCUIElementTypeStaticText[@name='Average Price']//following-sibling::XCUIElementTypeStaticText[3]");
		disclosedQty = By.xpath("//XCUIElementTypeStaticText[@name='Disclosed Qty']//following-sibling::XCUIElementTypeStaticText[3]");
		requestID = By.xpath("//XCUIElementTypeStaticText[@name='Request ID']//following-sibling::XCUIElementTypeStaticText[3]");
		xTSOrderNo = By.xpath("//XCUIElementTypeStaticText[@label='XTS Order Number']//following::XCUIElementTypeStaticText[3]");
		orderDateAndTimeLabel = By.xpath("//XCUIElementTypeStaticText[@label='Order Status']//following::XCUIElementTypeStaticText[3]");
		orderStatus = By.xpath("//XCUIElementTypeStaticText[@label='Order Status']//following::XCUIElementTypeStaticText[2]");
		rejectionReasonLabel = By.xpath("//XCUIElementTypeStaticText[@name='Reason']//following::XCUIElementTypeStaticText[1]");
		NowOrderNo=By.xpath("//XCUIElementTypeStaticText[@name=\"NOW Order Number\"]//following::XCUIElementTypeStaticText[3]");
		modifyTab = By.xpath("//XCUIElementTypeButton[@name='Modify']");
		exchangeOrderNo = By.xpath("(//XCUIElementTypeStaticText[@label='Exchange Order No']//following::XCUIElementTypeStaticText[3])[1]");
		CancelTab = By.xpath("");
		closeLabel = By.xpath("//XCUIElementTypeButton[@label='cancel 2']");
		menuButton = By.xpath("");
		lblTradeBook = By.xpath("(//XCUIElementTypeStaticText[@name=\"TRADE BOOK\"])[1]");
		tradeAvgPrice = By.xpath("//XCUIElementTypeStaticText[@name='Avg. Price']//following::XCUIElementTypeStaticText[3]");
		orderValue = By.xpath("//XCUIElementTypeStaticText[@name='Order Values']//following::XCUIElementTypeStaticText[3]");
		filledQty = By.xpath("//XCUIElementTypeStaticText[@name='Filled Qty']//following::XCUIElementTypeStaticText[3]");
		marketType = By.xpath("//XCUIElementTypeStaticText[@name='Market Type']//following::XCUIElementTypeStaticText[3]");
		xTSOrderStatus = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtXTSOrderStatus']");
		tradeID = By.xpath("//XCUIElementTypeStaticText[@name='TradeID']//following::XCUIElementTypeStaticText[2]");
		tradeTime = By.xpath("//XCUIElementTypeStaticText[@name='NOW Order Status']//following::XCUIElementTypeStaticText[3]");
		tradeTimeTrade=By.xpath("//XCUIElementTypeStaticText[@name='TradeTime']//following::XCUIElementTypeStaticText[1]");
		userIcon = By.xpath("//XCUIElementTypeStaticText[@name=\"Search Scrip / Contract\"]//following-sibling::XCUIElementTypeButton[1]");
		logoutButton = By.xpath("//XCUIElementTypeStaticText[@name='q']");
		OKpopup=By.xpath("//XCUIElementTypeButton[@name='OK']");
		
		selectOrderStatus = By.xpath("");
		confirmCancelButton = By.xpath("//android.widget.Button[@resource-id='com.sft.now:id/btnCancelOrder']");
		transactionPasswordField = By.xpath(
				"//android.widget.TextView[@resource-id='com.sft.now:id/customTitleWithOutIcon']//following::android.widget.EditText[1]");
		yesButton = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
		statusNameLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtOrderStatus']");
		Script = By.xpath("//XCUIElementTypeStaticText[@name='GABRIEL']");
		
		allDROPDOWN=By.xpath("//XCUIElementTypeButton[@name='All']");
		
		openStatus=By.xpath("//XCUIElementTypeStaticText[@name='Open']");
		
		BackButton=By.xpath("//XCUIElementTypeButton[@name='Back']");
		xTSOrderNo=By.xpath("");
		NOWOrderNO=By.xpath("//XCUIElementTypeStaticText[@name='NOW Order Number']//following-sibling::XCUIElementTypeStaticText[3]");
		NOWOrderNOTrade=By.xpath("//XCUIElementTypeStaticText[@name='NOW Order No']//following-sibling::XCUIElementTypeStaticText[1]");	
		exchangeOrderNoTrade=By.xpath("//XCUIElementTypeStaticText[@name='Exchange Order No']//following-sibling::XCUIElementTypeStaticText[1]");
		//Excahnge-//XCUIElementTypeStaticText[@name=\"Exchange Order No\"]//following::XCUIElementTypeStaticText[1]
	
	}

	public void verifyOrderStatusDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {

			if (EntityRunner.getBooleanValueForField("ConfigOrderBook")) {
				objPojo.getObjUtilities().logReporter("Click Order Book",
						objPojo.getObjWrapperFunctions().click(OrderBook));

				if (EntityRunner.getBooleanValueForField("ConfigFilterStatus")) {
					objPojo.getObjUtilities().logReporter("Click Order Status",
							objPojo.getObjWrapperFunctions().click(selectOrderStatus));
					
					
					String SelectStatus = EntityRunner.getStringValueForField("ChooseOrderStatus");
					By selectStatus = By.xpath("//android.widget.TextView[@text=" + "'" + SelectStatus + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Select Status",
							objPojo.getObjWrapperFunctions().click(selectStatus));
				}
				if (EntityRunner.getBooleanValueForField("ConfigDetails")) {
					String testData = EntityRunner.getStringValueForField("ScriptName");
					Script = By.xpath("//XCUIElementTypeStaticText[@name="+ "'" + testData + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Specific Script", testData,
							objPojo.getObjWrapperFunctions().click(Script));
					objPojo.getObjUtilities().logReporter("Click Details tab",
							objPojo.getObjWrapperFunctions().click(detailsTab));
				}
			}

		}
		else if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			
			if (EntityRunner.getBooleanValueForField("ConfigOrderBook")) {
				objPojo.getObjUtilities().logReporter("Click Order Book",
						objPojo.getObjWrapperFunctions().click(OrderBook));
			
				if (EntityRunner.getBooleanValueForField("ConfigOrderStatusName")) {
					objPojo.getObjUtilities().logReporter("Click Order Status",
							objPojo.getObjWrapperFunctions().click(selectOrderStatus));
					String SelectStatus = EntityRunner.getStringValueForField("SelectStatus");
					By selectStatus = By.xpath("//android.widget.TextView[@text=" + "'" + SelectStatus + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Specific Status", SelectStatus,
							objPojo.getObjWrapperFunctions().click(selectStatus));
				}
				
				
				
				
				
				String testData = EntityRunner.getStringValueForField("ScriptName");
				//change it  3/10/19
				Script = By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + testData + "'" + "]");
				objPojo.getObjUtilities().logReporter("Click Specific Script", testData,
						objPojo.getObjWrapperFunctions().click(Script));
				
				
				if (EntityRunner.getBooleanValueForField("ConfigDetails")) {
//					objPojo.getDriver().findElementsByAccessibilityId("")
					objPojo.getObjUtilities().logReporter("Click Details",
							objPojo.getObjWrapperFunctions().click(detailsTab));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderStatusTxt")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderStatusTxt);
					objPojo.getObjUtilities().logReporter("Verify Exchange Type Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigExchangeType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeTypeLabel);
					objPojo.getObjUtilities().logReporter("Verify Exchange Type Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderQuantity")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(OrderQuantityLabel);
					objPojo.getObjUtilities().logReporter("Verify Order Quantity Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigNowOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(NOWOrderNO);
					objPojo.getObjUtilities().logReporter("Verify NOW Order NO as : " + str,
							!str.equals(""));
				}
				//ConfigNowOrderNoTrade
				if (EntityRunner.getBooleanValueForField("ConfigNowOrderNoTrade")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(NOWOrderNOTrade);
					objPojo.getObjUtilities().logReporter("Verify NOW Order NO as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderPrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(OrderPrice);
					objPojo.getObjUtilities().logReporter("Verify Order Price Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderType);
					objPojo.getObjUtilities().logReporter("Verify Order Type Displayed as : " + str, !str.equals(""));
				}

				if (EntityRunner.getBooleanValueForField("ConfigTradedQty")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradedQty);
					objPojo.getObjUtilities().logReporter("Verify Traded Qty Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigTradedPrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradedPrice);
					objPojo.getObjUtilities().logReporter("Verify Traded Price Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigTriggerPrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(triggerPrice);
					objPojo.getObjUtilities().logReporter("Verify Trigger Price Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigRejectedQty")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(rejectedQty);
					objPojo.getObjUtilities().logReporter("Verify Rejected Qty Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigProductType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(productType);
					objPojo.getObjUtilities().logReporter("Verify Product Type Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("Configvalidity")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(validity);
					objPojo.getObjUtilities().logReporter("Verify Validity Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigaveragePrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(averagePrice);
					objPojo.getObjUtilities().logReporter("Verify Average Price Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigdisclosedQty")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(disclosedQty);
					objPojo.getObjUtilities().logReporter("Verify Disclosed Qty Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigrequestID")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(requestID);
					objPojo.getObjUtilities().logReporter("Verify Request ID Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigXTSOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(xTSOrderNo);
					objPojo.getObjUtilities().logReporter("Verify XTSOrderNo Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigExchangeOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeOrderNo);
					objPojo.getObjUtilities().logReporter("Verify Exchange OrderNo Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigNOWOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(NowOrderNo);
					objPojo.getObjUtilities().logReporter("Verify Now OrderNo Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigorderStatus")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderStatus);
					objPojo.getObjUtilities().logReporter("Verify OrderStatus Displayed as : " + str, !str.equals(""));
				}
				
				if (EntityRunner.getBooleanValueForField("ConfigOrderDateAndTime")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderDateAndTimeLabel);
					objPojo.getObjUtilities().logReporter("Verify Order Date and Time Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigRejectionReason")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(rejectionReasonLabel);
					objPojo.getObjUtilities().logReporter("Verify Rejection Reason: " + str, !str.equals(""));

				}
				if (EntityRunner.getBooleanValueForField("ConfigStatusName")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(statusNameLabel);
					objPojo.getObjUtilities().logReporter("Verify Status Name : " + str, !str.equals(""));

				}
			
		
		}
		}
	}

	public void clickOnModifyAndCancel() {

		if (EntityRunner.getBooleanValueForField("ConfigModify")) {
			objPojo.getObjUtilities().logReporter("Click Modify Tab",
					objPojo.getObjWrapperFunctions().click(modifyTab));
		}
		if (EntityRunner.getBooleanValueForField("ConfigCancel")) {
			objPojo.getObjUtilities().logReporter("Click Cancel tab",
					objPojo.getObjWrapperFunctions().click(CancelTab));
			confirmCancel();
		}
	}

	public void clickOnMenuAndCrossSymbol() {

		if (EntityRunner.getBooleanValueForField("ConfigCrossSymbol")) {
			objPojo.getObjUtilities().logReporter("Click Close Label",
					objPojo.getObjWrapperFunctions().click(closeLabel));
		}
		
		if (EntityRunner.getBooleanValueForField("ConfigBackButton")) {
			objPojo.getObjUtilities().logReporter("Click Back Label",
					objPojo.getObjWrapperFunctions().click(BackButton));
		}
		
		if (EntityRunner.getBooleanValueForField("ConfigMenu")) {
			objPojo.getObjUtilities().logReporter("Click Menu Button",
					objPojo.getObjWrapperFunctions().click(menuButton));
		}
	}

	private void verifyTradeBookDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigTradeBook")) {
				objPojo.getObjUtilities().logReporter("Click Trade Label",
						objPojo.getObjWrapperFunctions().click(lblTradeBook));
			//	objPojo.getObjWrapperFunctions().scrollDown();
				String testData = EntityRunner.getStringValueForField("ScriptName");
				////XCUIElementTypeStaticText[@name="+ "'" + testData + "'" + "]"
				Script = By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + testData + "'" + "]");
				objPojo.getObjUtilities().logReporter("Click Specific Script", testData,
						objPojo.getObjWrapperFunctions().click(Script));

				if (EntityRunner.getBooleanValueForField("ConfigDetails")) {
					objPojo.getObjUtilities().logReporter("Click Details Tab Script", testData,
							objPojo.getObjWrapperFunctions().click(detailsTab));
				}

				if (EntityRunner.getBooleanValueForField("ConfigExchangeType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeTypeLabel);
					objPojo.getObjUtilities().logReporter("Verify Exchange Type Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderQuantity")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(OrderQuantityLabel);
					objPojo.getObjUtilities().logReporter("Verify Order Quantity Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigTradeAvgPrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradeAvgPrice);
					objPojo.getObjUtilities().logReporter("Verify Trade Avegage Price Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigOrderValue")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderValue);
					objPojo.getObjUtilities().logReporter("Verify OrderValue Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigFilledQty")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(filledQty);
					objPojo.getObjUtilities().logReporter("Verify FilledQty Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigMarketType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(marketType);
					objPojo.getObjUtilities().logReporter("Verify MarketType Displayed as : " + str, !str.equals(""));
				}

				if (EntityRunner.getBooleanValueForField("ConfigXTSOrderStatus")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(xTSOrderStatus);
					objPojo.getObjUtilities().logReporter("Verify XTSOrderStatus Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigXTSOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(xTSOrderNo);
					objPojo.getObjUtilities().logReporter("Verify XTSOrderNo Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigExchangeOrderNo")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeOrderNo);
					objPojo.getObjUtilities().logReporter("Verify Exchange OrderNo Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigExchangeOrderNoTrade")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeOrderNoTrade);
					objPojo.getObjUtilities().logReporter("Verify Exchange OrderNo Displayed as : " + str,
							!str.equals(""));
				}

				if (EntityRunner.getBooleanValueForField("ConfigTradeTime")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradeTime);
					objPojo.getObjUtilities().logReporter("Verify TradeTime Displayed as : " + str, !str.equals(""));
				}
				
				if (EntityRunner.getBooleanValueForField("ConfigTradeTimeTrade")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradeTimeTrade);
					objPojo.getObjUtilities().logReporter("Verify TradeTime Displayed as : " + str, !str.equals(""));
				}

				if (EntityRunner.getBooleanValueForField("ConfigTradeID")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(tradeID);
					objPojo.getObjUtilities().logReporter("Verify TradeID Displayed as : " + str, !str.equals(""));
				}

			}
		}

	}

	public void clickOnLogoutAfterLogin() {
		if (EntityRunner.getBooleanValueForField("ConfigLogoutAfterLogin")) {
			objPojo.getObjUtilities().logReporter("Click User Icon", objPojo.getObjWrapperFunctions().click(userIcon));
			
			objPojo.getObjUtilities().logReporter("Click Logout Button",
					objPojo.getObjWrapperFunctions().click(logoutButton));
			objPojo.getObjUtilities().logReporter("Click OK pop-UP",
					objPojo.getObjWrapperFunctions().click(OKpopup));
			
			

		}
	}

	public void confirmCancel() {
		if (EntityRunner.getBooleanValueForField("ConfigConfirmCancel")) {
			objPojo.getObjUtilities().logReporter("Click Confirm Cancel Button",
					objPojo.getObjWrapperFunctions().click(confirmCancelButton));
			if (objPojo.getObjWrapperFunctions().checkElementDisplayed(yesButton)) {
				objPojo.getObjUtilities().logReporter("Set Transaction Password",
						objPojo.getObjWrapperFunctions().clearAndSendKeys(transactionPasswordField,
								EntityRunner.getStringValueForField("TransactionPassword")));
				objPojo.getObjUtilities().logReporter("Click Popup Yes Button",
						objPojo.getObjWrapperFunctions().click(yesButton));
			}

		}
	}
	public void clickOPENstatus() {
		if (EntityRunner.getBooleanValueForField("ConfigOpen")) {
		objPojo.getObjUtilities().logReporter("Clicked Drop Down",
				objPojo.getObjWrapperFunctions().click(allDROPDOWN));
		
		objPojo.getObjUtilities().logReporter("Click Open Status",
				objPojo.getObjWrapperFunctions().click(openStatus));
		}	
	}
	public void verifyOrderByUsingDropDownOption() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigVerifyOrderStatus")) {
				objPojo.getObjUtilities().logReporter("Select Order Status",
						objPojo.getObjWrapperFunctions().click(selectOrderStatus));   
				
				
				
				String SelectStatus = EntityRunner.getStringValueForField("SelectStatus");
				By selectStatus = By.xpath("//android.widget.TextView[@text=" + "'" + SelectStatus + "'" + "]");
				if (objPojo.getObjWrapperFunctions().checkElementDisplayed(selectStatus)) {
					objPojo.getObjUtilities().logReporter("Select Order Status",
							objPojo.getObjWrapperFunctions().click(selectStatus));
					List<MobileElement> Orders = (List<MobileElement>) objPojo.getDriver().findElements(
							By.xpath("//android.view.ViewGroup[@resource-id='com.sft.now:id/container']"));
					for (MobileElement Order : Orders) {
						MobileElement str = Order;
						str.click();
						String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(statusNameLabel);
						objPojo.getObjUtilities().logReporter("Verify Order Status  : " + str1, !str1.equals(""));
					}

				}

			}
		}

	}

	public void fillAndSubmitOrderStatusPage() {
		
		clickOPENstatus();
		verifyOrderByUsingDropDownOption();
		verifyOrderStatusDetails();
		clickOnModifyAndCancel();
		verifyTradeBookDetails();
		clickOnMenuAndCrossSymbol();
		clickOnLogoutAfterLogin();

	}



}
