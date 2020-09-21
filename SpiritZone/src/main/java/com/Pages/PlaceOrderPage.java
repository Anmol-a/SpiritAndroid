package com.Pages;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;

import io.appium.java_client.ios.touch.IOSPressOptions;

public class PlaceOrderPage {

	private By placeOrderTitle;
	private By buyButton;
	private By sellButton;
	private By ProductTypeMenuButton;
	private By quantityTextField;
	private By priceTextField;
	private By drpOrderType;
	private By OrderTypeButton;
	private By drpProduct;
	private By increaseIconButtonForQuantity;
	private By decreaseIconButtonForQuantity;
	private By increaseIconButtonForLimit;
	private By decreaseIconButtonForLimit;
	private By triggerPriceTextField;
	private By increaseIconButtonForTriggerPrice;
	private By decreaseIconButtonForTriggerPrice;
	private By disclosedQtyTextField;
	private By increaseIconButtonForDisclosedQty;
	private By decreaseIconButtonForDisclosedQty;
	private By validityLabel;
	private By selectAfterMarketOrderIcon;
	private By ValidityMenuButton;
	private By drpValidity;
	private By placeOrderBTN;
	private By lblAlertPopUp;
	private By pleaseEnterValidTriggerPriceLabel;
	private By okPopUpButton;
	private By confirmOrder;
	private By viewOrderStatus;
	private By transactionPasswordField;
	private By yesButton;
	private By limitList;
	private By limitListSlm;
	private By TriggerPriceShouldBeGreaterLabel;
	private By quantityCannotBeEmptyLabel;
	private By limitPriceCannotBeEmptyLabel;
	private By enterValidQuantityLabel;
	private By disclosedQuantityGreaterVerify;
	private By disclosedQuantityMinimumVerify;
	private By userIcon;
	private By logoutButton;
	private By increaseTriggerPriceButton;
	private By decreaseTriggerPriceButton;
	private By increasePriceButton;
	private By decreasePriceButton;
	private By quantitytext;
	private By quantityplusbutton;
	private By quantityminusbutton;
	private By AMOCheckBox;
	private By PopupMessage;
	private By quoteBuyIcon;
	private By SELLBUTTON;
	Pojo objPojo;
	private EntityRunner EntityRunner;
	private String testData;
	public By BackSpaceButton;
	private String testData2;
	

	// Disclosed Qty should not be greater than Order Qty
	// Disclosed Qty has to be minimum 10% of the total quantity.
	public PlaceOrderPage(Pojo objPojo) {
		
		
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		placeOrderTitle = By.xpath("");
		
		
		buyButton  = By.name("BUY");
		sellButton = By.name("SELL");
		//buyButton = By.xpath("//XCUIElementTypeButton[@name='BUY']");
		//sellButton = By.xpath("//XCUIElementTypeButton[@name='SELL']");
		drpOrderType = By
				.xpath("//XCUIElementTypeStaticText[@name='Order Type']//following-sibling::XCUIElementTypeButton[1]");
		OrderTypeButton = By.name("btnOrderTypeButton");
		drpProduct = By
				.xpath("//XCUIElementTypeStaticText[@name='Order Type']//following-sibling::XCUIElementTypeButton[2]");
		ProductTypeMenuButton = By.name("");
		quantityTextField = By
				.xpath("//XCUIElementTypeStaticText[@name='Quantity']//following-sibling::XCUIElementTypeTextField[1]");
		increaseIconButtonForQuantity = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/quantity_Increment1']");
		decreaseIconButtonForQuantity = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/quantity_Decrement1']");
		priceTextField =
				// By.xpath("//android.widget.EditText[@resource-id='com.sft.now:id/txtPrice']"),
				By.xpath(
						"//XCUIElementTypeStaticText[@name='Quantity']//following-sibling::XCUIElementTypeTextField[2]");
		increaseIconButtonForLimit = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/price_Increment1']");
		decreaseIconButtonForLimit = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/price_Decrement1']");
		triggerPriceTextField = By.xpath(
				"//XCUIElementTypeStaticText[@name='Trigger Price']//following-sibling::XCUIElementTypeTextField[1]");
		increaseIconButtonForTriggerPrice = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/triggerPrice_Increment1']");
		decreaseIconButtonForTriggerPrice = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/disclosedQty_Decrement1']");
		disclosedQtyTextField = By.xpath(
				"//XCUIElementTypeStaticText[@name='Disclosed Qty']//following-sibling::XCUIElementTypeTextField[2]");
		increaseIconButtonForDisclosedQty = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/disclosedQty_Increment1']");
		decreaseIconButtonForDisclosedQty = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/disclosedQty_Decrement1']");
		
		drpValidity = By.name("Day");
		//drpValidity = By.xpath("//XCUIElementTypeButton[@name='Day']");
		selectAfterMarketOrderIcon = By.xpath("//android.widget.CheckBox[@resource-id='com.sft.now:id/checkboxAMO']");
		placeOrderBTN = By.name("PLACE ORDER");
		confirmOrder = By.name("Confirm Order");
		viewOrderStatus = By.name("View Order Status");
		
		//placeOrderBTN = By.xpath("//XCUIElementTypeButton[@name='PLACE ORDER']");
		//confirmOrder = By.xpath("//XCUIElementTypeButton[@name='Confirm Order']");
		//viewOrderStatus = By.xpath("//XCUIElementTypeButton[@name='View Order Status']");
		lblAlertPopUp = By.xpath("");
		okPopUpButton = By.name("OK");
		
	//	okPopUpButton = By.xpath("//XCUIElementTypeButton[@name='OK']");
		pleaseEnterValidTriggerPriceLabel = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
		transactionPasswordField = By.xpath("//XCUIElementTypeSecureTextField");
		
		yesButton = By.name("OK");
		//yesButton = By.xpath("//XCUIElementTypeButton[@name='OK']");

		limitList = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/toolbarLTP']");
		limitListSlm = By.xpath("//android.widget.TextView[@text='SL-M']//preceding::android.widget.TextView[3]");
		TriggerPriceShouldBeGreaterLabel = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
		quantityCannotBeEmptyLabel = By.xpath("//XCUIElementTypeStaticText[@name='Quantity Cannot be Empty']");
		limitPriceCannotBeEmptyLabel = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
		enterValidQuantityLabel = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
		disclosedQuantityGreaterVerify = By.xpath(
				"//XCUIElementTypeStaticText[@name='Disclosed Qty has to be minimum 10% of the total quantity.']");
		disclosedQuantityMinimumVerify = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
		userIcon = By.xpath("");
		logoutButton = By.xpath("");
		increaseTriggerPriceButton = By
				.xpath("");
		decreaseTriggerPriceButton = By
				.xpath("(//XCUIElementTypeButton[@name=\'-\'])[3]");
		increasePriceButton = By.xpath("");
		decreasePriceButton = By.xpath("(//XCUIElementTypeButton[@name=\"-\"])[2]");
		quantitytext = By.xpath("");
		quantityplusbutton = By
				.xpath("");
		quantityminusbutton = By
				.xpath("");
		AMOCheckBox = By.xpath(
				"//XCUIElementTypeButton[@name='Day']//following-sibling::XCUIElementTypeOther/XCUIElementTypeButton");
		PopupMessage = By.xpath(
				"//XCUIElementTypeStaticText[@name='NOW 2.0.3']//following-sibling::XCUIElementTypeStaticText[1]");
		
		BackSpaceButton = By.name("Delete");
		//BackSpaceButton  = By.xpath("//XCUIElementTypeKey[@name='Delete']");
		 
		quoteBuyIcon = By.name("Q");
		SELLBUTTON = By.name("SELL");
		//SELLBUTTON = By.xpath("//XCUIElementTypeButton[@name='SELL']");
		//quoteBuyIcon = By.xpath("//XCUIElementTypeButton[@name='Q']");
	}

	public void fillPlaceOrderDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			if (EntityRunner.getBooleanValueForField("ConfigAction")) {
				if (EntityRunner.getBooleanValueForField("ConfigBUY"))
					objPojo.getObjUtilities().logReporter("Click Buy Button",
							objPojo.getObjWrapperFunctions().click(buyButton));
				if (EntityRunner.getBooleanValueForField("ConfigSELL"))
					objPojo.getObjUtilities().logReporter("Click Sell Button",
							objPojo.getObjWrapperFunctions().click(sellButton));
				
			}
			if (EntityRunner.getBooleanValueForField("ConfigSellAfterBuy")) 
			{
				System.out.println((EntityRunner.getBooleanValueForField("ConfigSellafterBuy")));
				objPojo.getObjWrapperFunctions().click(quoteBuyIcon);
				objPojo.getObjWrapperFunctions().click(SELLBUTTON);
				
			}
			if (EntityRunner.getBooleanValueForField("ConfigOrderTypeDropDown")) {
				objPojo.getObjUtilities().logReporter("Click Order Type Button",
						objPojo.getObjWrapperFunctions().click(drpOrderType));
				String Menu = EntityRunner.getStringValueForField("OrderTypeDropDownValue");
				OrderTypeButton = By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + Menu + "'" + "]");
				objPojo.getObjUtilities().logReporter("Clicked on Specified Order Type", Menu,
						objPojo.getObjWrapperFunctions().click(OrderTypeButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigProductTypeDropDown")) {
				objPojo.getObjUtilities().logReporter("Click Product Type",
						objPojo.getObjWrapperFunctions().click(drpProduct));
				String Menu = EntityRunner.getStringValueForField("ChooseProductType");
				ProductTypeMenuButton = By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + Menu + "']");
				objPojo.getObjUtilities().logReporter("Clicked on  Specific Product Type", Menu,
						objPojo.getObjWrapperFunctions().click(ProductTypeMenuButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuantity")) {
				
				objPojo.getObjUtilities().logReporter("Setting Quantity", objPojo.getObjWrapperFunctions()
						.clearAndSendKeysFORDIGIT(quantityTextField, EntityRunner.getStringValueForField("Quantity")));
			}
			if (EntityRunner.getBooleanValueForField("ConfigClearQuantity")) {
				objPojo.getObjUtilities().logReporter("Clear Quantity",
						objPojo.getObjWrapperFunctions().clearElement(quantityTextField));

			}
			if (EntityRunner.getBooleanValueForField("ConfigClearPrice")) {
				objPojo.getObjUtilities().logReporter("Clear Price",
						objPojo.getObjWrapperFunctions().clearElement(priceTextField));

			}
			if (EntityRunner.getBooleanValueForField("ConfigPrice")) {
				String Menu = EntityRunner.getStringValueForField("Price");
				
				// Modify it 
				
//				for(int x=1;x<6;x++)
//				{
//					objPojo.getObjWrapperFunctions().click(BackSpaceButton);
//				}
				
				objPojo.getObjUtilities().logReporter("Set Price ", Menu, objPojo.getObjWrapperFunctions()
						.clearAndSendKeysFORDIGIT(priceTextField, EntityRunner.getStringValueForField("Price")));

			}
		
			if (EntityRunner.getBooleanValueForField("ConfigLowerCircuitValue")) {
				objPojo.getObjUtilities().logReporter("Set Lower Circuit Value", objPojo.getObjWrapperFunctions()
						.clearAndSendKeys(priceTextField, EntityRunner.getStringValueForField("LowerCircuitValue")));
			}
			if (EntityRunner.getBooleanValueForField("ConfigIncreasePriceValue")) {
				objPojo.getObjUtilities().logReporter("Click Increase Price Button",
						objPojo.getObjWrapperFunctions().click(increasePriceButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigDecreasePriceValue")) {
				objPojo.getObjUtilities().logReporter("Click Decrease Price Button",
						objPojo.getObjWrapperFunctions().click(decreasePriceButton));
			}

			if (EntityRunner.getBooleanValueForField("ConfigTriggerPriceSL")) {
				String Menu = EntityRunner.getStringValueForField("TriggerPriceRandomSL");
//				for(int x=1;x<6;x++)
//				{
//					objPojo.getObjWrapperFunctions().click(BackSpaceButton);
//				}
				
				objPojo.getObjUtilities().logReporter("Set Trigger Price",Menu,
						objPojo.getObjWrapperFunctions().clearAndSendKeysFORDIGIT(triggerPriceTextField,
								EntityRunner.getStringValueForField("TriggerPriceRandomSL")));
			}

			if (EntityRunner.getBooleanValueForField("ConfigLimitPriceOrder")) {

				if (EntityRunner.getBooleanValueForField("ConfigTradePrice")) {
					objPojo.getObjUtilities().logReporter("Set Price Teaxt Field", objPojo.getObjWrapperFunctions()
							.clearAndSendKeys(priceTextField, EntityRunner.getStringValueForField("TradePriceS")));
				}
			}
			if (EntityRunner.getBooleanValueForField("ConfigTrigger")) {
				objPojo.getObjUtilities().logReporter("Set Trigger Price", objPojo.getObjWrapperFunctions()
						.clearAndSendKeysFORDIGIT(triggerPriceTextField, EntityRunner.getStringValueForField("TriggerPrice")));
			}

			if (EntityRunner.getBooleanValueForField("ConfigTriggerClear")) {
				objPojo.getObjUtilities().logReporter("Clear Trigger Price",
						objPojo.getObjWrapperFunctions().clearElement(triggerPriceTextField));
			}

			if (EntityRunner.getBooleanValueForField("ConfigIncreaseTriggerPriceValue")) {
				objPojo.getObjUtilities().logReporter("Click Increase Trigger Price Button",
						objPojo.getObjWrapperFunctions().click(increaseTriggerPriceButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigDecreaseTriggerPriceValue")) {
				objPojo.getObjUtilities().logReporter("Click Decrease Trigger Price Button",
						objPojo.getObjWrapperFunctions().click(decreaseTriggerPriceButton));
			}
			/*
			 * else if (EntityRunner.getBooleanValueForField("ConfigTriggerPriceRandomSLM"))
			 * {
			 * 
			 * if(EntityRunner.getBooleanValueForField("ConfigBUY")) { String text =
			 * getText(limitListSlm); double txt = Double.parseDouble(text) - 1;
			 * System.out.println(txt); clearAndSendKeys(triggerPriceTextField, txt + "");
			 * String trigger = getText(triggerPriceTextField);
			 * EntityRunner.setStringValueForField("TradePriceSLM", trigger); }
			 * if(EntityRunner.getBooleanValueForField("ConfigSELL")) { String text =
			 * getText(limitListSlm); double txt = Double.parseDouble(text) + 1;
			 * System.out.println(txt); clearAndSendKeys(triggerPriceTextField, txt + "");
			 * String trigger = getText(triggerPriceTextField);
			 * EntityRunner.setStringValueForField("TradePriceSLM", trigger); } }
			 */
			/*
			 * else if (EntityRunner.getBooleanValueForField(
			 * "ConfigTriggerPriceRandomCoverOrder")) { String text = getText(limitListSlm);
			 * double txt = Double.parseDouble(text);
			 * EntityRunner.setStringValueForField("TradePriceCO", text);
			 * clearAndSendKeys(triggerPriceTextField,
			 * EntityRunner.getStringValueForField("TradePriceCO"));
			 */

			if (EntityRunner.getBooleanValueForField("ConfigAMOCheckBox")) {
				objPojo.getObjUtilities().logReporter("Click on AMO Check Box",
						objPojo.getObjWrapperFunctions().click(AMOCheckBox));
			}

			if (EntityRunner.getBooleanValueForField("ConfigDisclosedQty")) {
				String Menu = EntityRunner.getStringValueForField("DisclosedQty");
				objPojo.getObjUtilities().logReporter("Set Disclosed Quantity",Menu,
						objPojo.getObjWrapperFunctions().clearAndSendKeysFORDIGIT(disclosedQtyTextField,
								EntityRunner.getStringValueForField("DisclosedQty")));
			}
			if (EntityRunner.getBooleanValueForField("ConfigValidity")) {
				objPojo.getObjUtilities().logReporter("Clicked on Validity Dropdown",
						objPojo.getObjWrapperFunctions().click(drpValidity));
				String Menu = EntityRunner.getStringValueForField("ChooseValidityMenu");
				ValidityMenuButton = By.xpath("//XCUIElementTypeStaticText[@name=" + "'" + Menu + "'" + "]");
				objPojo.getObjUtilities().logReporter("Click on Validity Menu Option ", Menu,
						objPojo.getObjWrapperFunctions().click(ValidityMenuButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigAfterMarketOrderIcon")) {
				objPojo.getObjUtilities().logReporter("Select After Market Order Icon",
						objPojo.getObjWrapperFunctions().check(selectAfterMarketOrderIcon, true));
			}
			if (EntityRunner.getBooleanValueForField("ConfigPlaceOrder")) {
				objPojo.getObjUtilities().logReporter("Click Place Order Button",
						objPojo.getObjWrapperFunctions().click(placeOrderBTN));

				if (EntityRunner.getBooleanValueForField("ConfigPleaseEnterValidPrice")) {

					testData = EntityRunner.getStringValueForField("PleaseEnterValidPrice");
					testData2 = objPojo.getDriver().switchTo().alert().getText().split("\n")[1].trim();
					System.out.println(testData2);
					// testData2 =
					// objPojo.getObjWrapperFunctions().fetchValueFromFields(placeOrderBTN);
					objPojo.getObjUtilities().logReporter("Verify Enter Valid Price PopUp Text", testData, testData2,
							testData2.equals(testData));
					// objPojo.getObjUtilities().logReporter("",
					// objPojo.getObjWrapperFunctions().fetchValueFromFields(placeOrderBTN));
				}

			}
			if (EntityRunner.getBooleanValueForField("ConfigTransactionPassword")) {
				 {
					objPojo.getObjUtilities().logReporter("Set Transaction Password",
							objPojo.getObjWrapperFunctions().clearAndSendKeys(transactionPasswordField,
									EntityRunner.getStringValueForField("TransactionPassword")));
					if (EntityRunner.getBooleanValueForField("ConfigYes")) {
						objPojo.getObjUtilities().logReporter("Click Yes Button",
								objPojo.getObjWrapperFunctions().click(yesButton));
					}
				}
			}
			if (EntityRunner.getBooleanValueForField("ConfigConfirmOrder")) {
				objPojo.getObjUtilities().logReporter("Click Confirm Button",
						objPojo.getObjWrapperFunctions().click(confirmOrder));
			}
			if (EntityRunner.getBooleanValueForField("ConfigViewOrderStatus")) {
				objPojo.getObjUtilities().logReporter("Click View Order Status Button",
						objPojo.getObjWrapperFunctions().click(viewOrderStatus));
			}
		}
		

		else if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigPleaseEnterValidPrice")) {
				testData = EntityRunner.getStringValueForField("PleaseEnterValidPrice");
				testData2 = objPojo.getDriver().switchTo().alert().getText().split("\n")[1].trim();
				System.out.println(testData2);
				objPojo.getObjUtilities().logReporter("Verify Enter Valid Price PopUp Text", testData, testData2,
						testData2.equals(testData));

				// testData = EntityRunner.getStringValueForField("PleaseEnterValidPrice");
				// testData2 =
				// objPojo.getObjWrapperFunctions().fetchValueFromFields(lblAlertPopUp);
				// objPojo.getObjUtilities().logReporter("Verify Enter Valid Price PopUp Text",
				// testData, testData2,
				// testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigPleaseEnterValidTriggerPrice")) {
				testData = EntityRunner.getStringValueForField("PleaseEnterValidTriggerPrice");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(pleaseEnterValidTriggerPriceLabel);
				objPojo.getObjUtilities().logReporter("Verify Enter Valid Trigger Price PopUp Text", testData,
						testData2, testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigTriggerPriceShouldBeGreater")) {
				testData = EntityRunner.getStringValueForField("TriggerPriceShouldBeGreater");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(TriggerPriceShouldBeGreaterLabel);
				objPojo.getObjUtilities().logReporter("Verify Trigger Price Should be greater", testData, testData2,
						testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuantityCannotBeEmpty")) {
				testData = EntityRunner.getStringValueForField("QuantityCannotBeEmpty");
				testData2 = objPojo.getDriver().switchTo().alert().getText().split("\n")[1].trim();
			//	testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(quantityCannotBeEmptyLabel);
				objPojo.getObjUtilities().logReporter("Verify Quantity Cannot be greater", testData, testData2,
						testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigLimitPriceCannotBeEmpty")) {
				testData = EntityRunner.getStringValueForField("LimitPriceCannotBeEmpty");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(limitPriceCannotBeEmptyLabel);
				objPojo.getObjUtilities().logReporter("Verify Limit cannot be Empty", testData, testData2,
						testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigEnterValidQuantity")) {
				testData = EntityRunner.getStringValueForField("EnterValidQuantity");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(enterValidQuantityLabel);
				objPojo.getObjUtilities().logReporter("Verify Enter Valid Quantity", testData, testData2,
						testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigDisclosedQuantityGreaterVerify")) {
				testData = EntityRunner.getStringValueForField("DisclosedQuantityGreaterVerify");
				testData2 = objPojo.getDriver().switchTo().alert().getText().split("\n")[1].trim();
				System.out.println(testData2);
				objPojo.getObjUtilities().logReporter("Verify Quantity PopUp Text", testData, testData2,
						testData2.equals(testData));

			}
			if (EntityRunner.getBooleanValueForField("ConfigDisclosedQuantityMinimumVerify")) {
				testData = EntityRunner.getStringValueForField("DisclosedQuantityGreaterMinimumVerify");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(disclosedQuantityMinimumVerify);
				objPojo.getObjUtilities().logReporter("Verify Disclosed quantity Greater", testData, testData2,
						testData2.equals(testData));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuantityText")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(quantitytext);
				objPojo.getObjUtilities().logReporter("Verify quantity text Displayed as : " + str, !str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuantityIncreseText")) {
				objPojo.getObjUtilities().logReporter("Click Quantity Minus Button",
						objPojo.getObjWrapperFunctions().click(quantityminusbutton));
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(quantitytext);
				objPojo.getObjUtilities().logReporter("Verify after click on add button of quantity text : " + str,
						!str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigQuantityDecreseText")) {
				objPojo.getObjUtilities().logReporter("Click Quantity Plus Button",
						objPojo.getObjWrapperFunctions().click(quantityplusbutton));
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(quantitytext);
				objPojo.getObjUtilities().logReporter("Verify after click on sub button of quantity text : " + str,
						!str.equals(""));
			}
			if (EntityRunner.getBooleanValueForField("ConfigOkPopUp")) {
				objPojo.getObjWrapperFunctions().click(okPopUpButton);
			}
		}
	}

	public void clickOnLogoutAfterLogin() {
		if (EntityRunner.getBooleanValueForField("ConfigLogoutAfterLogin")) {
			objPojo.getObjUtilities().logReporter("Click User Icon Button",
					objPojo.getObjWrapperFunctions().click(userIcon));
			objPojo.getObjUtilities().logReporter("Click Logout Button",
					objPojo.getObjWrapperFunctions().click(logoutButton));

		}
	}

	public void fillAndSubmitPlaceOrderDetails() {

		fillPlaceOrderDetails();
		clickOnLogoutAfterLogin();

	}

}
