package com.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;

import io.appium.java_client.MobileElement;

public class DashboardPage {
	Pojo objPojo;
	private EntityRunner EntityRunner;
	By toolbarTitle;
	By userIcon;
	By userName;
	By Quote;
	By DashboardBtn;
	By MarketWatch;
	By Markets;
	By menuButton;
	By orderStatus;
	By selectOrderStatus;
	By detailsTab;
	By cancelButton;
	By confirmCancelButton;
	By transactionPasswordField;
	By yesButton;
	By logs;
	By orderLogDetails;
	By logDropDownList;
	By newsDropDownList;
	By newsDropDownListDetails;
	By cashAvailableLabel;
	By marginUtilizedLabel;
	By netMarginAvailableLabel;
	By unrealizedPAndLLabel;
	By realizedPAndLLabel;
	By cashMarginAvailableLabel;
	By payinAmountLabel;
	By payoutAmountLabel;
	By directCollateralLabel;
	By ADHOCMarginLabel;
	By notionalCashLabel;
	By holdingCollateralLabel;
	By CNCSellBenefitLabel;
	By sellOptionsPremiumLabel;
	By adhocFOMarginLabel;
	By adhocCurrencyMarginLabel;
	By CNCLimitsLabel;
	By buyExposureLimitsLabel;
	By sellExposureLabel;
	By MTMLossLimitLabel;
	By grossExposureLimitsLabel;
	By grossExpLimitforDerivativesLabel;
	By buyExpLimitforFuturesLabel;
	By sellExpLimitforFuturesLabel;
	By buyExpLimitforOptionsLabel;
	By sellExpLimitforOptionsLabel;
	By grossEMPLabel;
	By spanMarginPresentLabel;
	By exposureMarginPresentLabel;
	By ELMValueLabel;
	By selectPositionDropDown;
	By scriptNameLabel;
	By buyQuantityLabel;
	By sellQuantityLabel;
	By netQuantityLabel;
	By preCloseLabel;
	By realizedPLLabel;
	By buyPriceLabel;
	By sellPriceLabel;
	By netAmountLabel;
	By LTPLabel;
	By unrealizedPLLabel;
	By buyValueLabel;
	By sellValueLabel;
	By DaysPLLabel;
	By breakEvenPointLabel;
	By userIDLabel;
	By crossButton;
	By t1HoldingQuantityLabel;
	By holdingQuantityLabel;
	By usedQuantityLabel;
	By MarketValueLabel;
	By dayPLLabel;
	By collateralValueLabel;
	By collateralQuantityLabel;
	By hairCutPerLabel;
	By acccountInformation;
	By changePassword;
	By help;
	By setting;
	By tittle;
	By clientID;
	By loginId;
	By accountDetails;
	By personalDetails;
	By name;
	By mobileNumber;
	By emailId;
	By brokerDetails;
	By brokerName;
	By brokerId;
	By exchangeRegistrationNo;
	By branchName;
	By appearancetxt;
	By dark;
	By light;
	By cancel;
	By chartSettingtxt;
	By chartType;
	By charttypetxt;
	By chartStyle;
	By backbutton;
	By notificationTxt;
	By notificationSound;
	By all;
	By trade;
	By news;
	By order;
	By logo;
	By pageTitle;
	private String testData;
	private String testData2;

	public DashboardPage(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		
		toolbarTitle = By.name("Dashboard");
		//toolbarTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Dashboard\"]");
		userIcon = By.xpath("//XCUIElementTypeNavigationBar[@name=\"XTS.DashboardView\"]/XCUIElementTypeButton[3]");
		userName = By.xpath("");
		DashboardBtn = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/XCUIElementTypeButton[3]");
		userName = By.xpath("");
		MarketWatch = By.xpath("");
		Markets = By.xpath("");
		Quote = By.name("Quotes");
		//Quote = By.xpath("//XCUIElementTypeButton[@name='Quotes']");
		menuButton = By.xpath("//XCUIElementTypeNavigationBar[@name='XTS.MarketView']/XCUIElementTypeButton[1]");
		orderStatus = By.name("Order Status");
		//orderStatus = By.xpath("//XCUIElementTypeStaticText[@name='Order Status']");
		
		selectOrderStatus = By.name("All");
		//selectOrderStatus = By.xpath("//XCUIElementTypeButton[@name='All']");
		detailsTab = By.xpath("");
		cancelButton = By.xpath("");
		confirmCancelButton = By.xpath("");
		transactionPasswordField = By.xpath("");
		yesButton = By.xpath("");
		orderLogDetails = By.xpath("");
		logDropDownList = By.xpath("");
		newsDropDownList = By.xpath("");

		cashAvailableLabel = By.xpath("");
		marginUtilizedLabel = By.xpath("");
		netMarginAvailableLabel = By.xpath("");
		unrealizedPAndLLabel = By.xpath("");
		realizedPAndLLabel = By.xpath("");
		cashMarginAvailableLabel = By.xpath("");
		payinAmountLabel = By.xpath("");
		payoutAmountLabel = By.xpath("");
		directCollateralLabel = By.xpath("");
		ADHOCMarginLabel = By.xpath("");
		notionalCashLabel = By.xpath("");
		holdingCollateralLabel = By.xpath("");

		CNCSellBenefitLabel = By.xpath("");
		sellOptionsPremiumLabel = By.xpath("");
		adhocFOMarginLabel = By.xpath("");
		adhocCurrencyMarginLabel = By.xpath("");
		CNCLimitsLabel = By.xpath("");
		buyExposureLimitsLabel = By.xpath("");
		sellExposureLabel = By.xpath("");
		MTMLossLimitLabel = By.xpath("");
		grossExposureLimitsLabel = By.xpath("");
		grossExpLimitforDerivativesLabel = By.xpath("");
		buyExpLimitforFuturesLabel = By.xpath("");
		sellExpLimitforFuturesLabel = By.xpath("");
		buyExpLimitforOptionsLabel = By.xpath("");
		sellExpLimitforOptionsLabel = By.xpath("");
		grossEMPLabel = By.xpath("");
		spanMarginPresentLabel = By.xpath("");
		exposureMarginPresentLabel = By.xpath("");
		ELMValueLabel = By.xpath("");
		scriptNameLabel = By.xpath("");
		buyQuantityLabel = By.xpath("");
		sellQuantityLabel = By.xpath("");
		netQuantityLabel = By.xpath("");
		preCloseLabel = By.xpath("");
		realizedPLLabel = By.xpath("");
		buyPriceLabel = By.xpath("");
		sellPriceLabel = By.xpath("");
		netAmountLabel = By.xpath("");
		LTPLabel = By.xpath("");
		unrealizedPLLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtUnrealizedPL']");
		buyValueLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtBuyValue']");
		sellValueLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtSellPrice']");
		DaysPLLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtDayPNL']");
		breakEvenPointLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtBEP']");
		userIDLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtBEP']");
		crossButton = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblClose']");

		t1HoldingQuantityLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtT1HoldingQty']");
		holdingQuantityLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtCollateralQty']");
		usedQuantityLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtUsedQty']");
		MarketValueLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtMarketValue']");
		dayPLLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtDayPL']");
		collateralValueLabel = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtCollateralValuation']");
		collateralQuantityLabel = By
				.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/collateralQuantityValue']");
		hairCutPerLabel = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/hairCutValue']");
		selectPositionDropDown = By.xpath("//android.widget.Spinner[@resource-id='com.sft.now:id/spinnerDayNet']");
		acccountInformation = By.xpath("//android.widget.TextView[@text='Account Information']");
		changePassword = By.xpath("//android.widget.TextView[@text='Change Password']");
		help = By.xpath("//android.widget.TextView[@text='Help']");
		setting = By.xpath("//android.widget.TextView[@text='Settings']");
		clientID = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/clientIdValue']");
		loginId = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/loginIdValue']");
		accountDetails = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/txtAccountDetails']");
		personalDetails = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblProfileDetails']");
		name = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/nameValue']");
		mobileNumber = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/mobileNumberValue']");
		emailId = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/emailIdValue']");
		branchName = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblBranchName']");
		brokerDetails = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lblBranchName']");
		brokerName = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/brokerNameValue']");
		brokerId = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/brokerIdValue']");
		exchangeRegistrationNo = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/nseRegIdValue']");
		appearancetxt = By.xpath("//android.widget.TextView[@text='Select Theme']");
		dark = By.xpath("//android.widget.CheckedTextView[@text='Dark (default)']");
		light = By.xpath("//android.widget.CheckedTextView[@text='Light']");
		cancel = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
		chartSettingtxt = By.xpath("//android.widget.TextView[@text='Select Chart Type']");
		chartType = By.xpath("//android.widget.TextView[@text='Default Chart']");
		chartStyle = By.xpath("//android.widget.TextView[@text='Line']");
		backbutton = By
				.xpath("//android.widget.TextView[@text='Chart Setting']//preceding::android.widget.ImageButton[1]");
		notificationTxt = By.xpath("//android.widget.TextView[@text='Select Notification Type']");
		notificationSound = By.xpath("//android.widget.TextView[@text='Notification Sound']");
		all = By.xpath("//android.widget.TextView[@text='All']");
		trade = By.xpath("//android.widget.TextView[@text='Trade']");
		news = By.xpath("//android.widget.TextView[@text='News']");
		order = By.xpath("//android.widget.TextView[@text='Order']");
		pageTitle = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/toolbar_title']");
		logo = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/appName']");
	}

	public void fillDashboardPageDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit"))
			if (EntityRunner.getBooleanValueForField("ConfigMarkets")) {
				objPojo.getObjUtilities().logReporter("Clicked on  on Markets",
						objPojo.getObjWrapperFunctions().click(Markets));
			}
		if (EntityRunner.getBooleanValueForField("ConfigMarketWatch")) {
			objPojo.getObjUtilities().logReporter("Clicked on  on MarketWatch",
					objPojo.getObjWrapperFunctions().click(MarketWatch));
		}
		if (EntityRunner.getBooleanValueForField("ConfigDashboardLabel")) {
			objPojo.getObjUtilities().logReporter("Clicked on  on Dashboard",
					objPojo.getObjWrapperFunctions().click(DashboardBtn));
		}

		if (EntityRunner.getBooleanValueForField("ConfigQutoe")) {
			objPojo.getObjUtilities().logReporter("Clicked on  on Quote",
					objPojo.getObjWrapperFunctions().click(Quote));
		}

		if (EntityRunner.getBooleanValueForField("ConfigHamburgerMenuSymbol")) {
			objPojo.getObjUtilities().logReporter("Clicked on  on menuButton",
					objPojo.getObjWrapperFunctions().click(menuButton));
		}

//		if (EntityRunner.getBooleanValueForField("ConfigHamburgerMenuSymbol")) {
//			objPojo.getObjUtilities().logReporter("Clicked on  on menuButton",
//					objPojo.getObjWrapperFunctions().click(menuButton));
//		}

		// if(EntityRunner.getBooleanValueForField("ConfigMarkets")){
		// click(Markets);
		// }
		// if(EntityRunner.getBooleanValueForField("ConfigMarketWatch")) {
		// click(MarketWatch);
		// }
		// if(EntityRunner.getBooleanValueForField("ConfigDashboard")) {
		// click(Dashboard);
		// }
		// if(EntityRunner.getBooleanValueForField("ConfigQutoe")){
		// click(Quote);
		// }
		// if(EntityRunner.getBooleanValueForField("ConfigHamburgerMenuSymbol")) {
		// click(menuButton);
		// }

		/*
		 * TO DO CODE FOR THIS
		 * 
		 * 
		 * if(EntityRunner.getBooleanValueForField("ConfigMenuTabs")) { scrollDown();
		 * try { String menuTabs=EntityRunner.getStringValueForField("MenuTabs");
		 * logs=By.xpath("//android.widget.TextView[@text="+"'"+menuTabs+"'"+"]")
		 * ,"Menu Tabs"+menuTabs, false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		 * click(logs); } catch (Exception e) { scrollUp(); click(logs); } }
		 * 
		 */
		System.out.println((EntityRunner.getAction().equalsIgnoreCase("verify")));
		if (EntityRunner.getAction().equalsIgnoreCase("verify"))

		{

			if (EntityRunner.getBooleanValueForField("ConfigDashboardLabel")) {
				testData = EntityRunner.getStringValueForField("DashboardLabel");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(toolbarTitle);
				objPojo.getObjUtilities().logReporter("Verify Dashboard Label", testData, testData2,
						testData.equals(testData2));
			}
			if (EntityRunner.getBooleanValueForField("ConfigUserIcon")) {
				objPojo.getObjUtilities().logReporter("Clicked on  User Icon",
						objPojo.getObjWrapperFunctions().click(userIcon));
			}
			if (EntityRunner.getBooleanValueForField("ConfigUserNameLabel")) {
				testData = EntityRunner.getStringValueForField("UserNameLabel");
				testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(userName);
				objPojo.getObjUtilities().logReporter("Verify User Name Label", testData, testData2,
						testData.equals(testData2));
			}
		}
	}

	void clickOnMenu() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			if (EntityRunner.getBooleanValueForField("ConfigMenu")) {
				objPojo.getObjUtilities().logReporter("Clicked on  Menu Button",
						objPojo.getObjWrapperFunctions().click(menuButton));

			}
			if (EntityRunner.getBooleanValueForField("ConfigOrderStatus")) {
				objPojo.getObjUtilities().logReporter("Clicked on  Order Status",
						objPojo.getObjWrapperFunctions().click(orderStatus));

			}
		}
	}

	void cancalOrder() {
		System.out.println(EntityRunner.getAction().equalsIgnoreCase("add"));
		if (EntityRunner.getAction().equalsIgnoreCase("add")) {
			// System.out.println(EntityRunner.getAction().equalsIgnoreCase("add"));
			if (EntityRunner.getBooleanValueForField("ConfigCancelAllOpenOrder")) {
				System.out.println(EntityRunner.getBooleanValueForField("ConfigCancelAllOpenOrder"));
				objPojo.getObjUtilities().logReporter("Clicked on  Menu Button",
						objPojo.getObjWrapperFunctions().click(menuButton));
				if (objPojo.getObjWrapperFunctions().checkElementDisplayed(orderStatus)) {
					objPojo.getObjUtilities().logReporter("Clicked on  Order Status",
							objPojo.getObjWrapperFunctions().click(orderStatus));

					if (objPojo.getObjWrapperFunctions().checkElementDisplayed(selectOrderStatus)) {
						objPojo.getObjUtilities().logReporter("Clicked on  Select Order Status",
								objPojo.getObjWrapperFunctions().click(selectOrderStatus));

						String SelectStatus = EntityRunner.getStringValueForField("SelectStatus");
						// check if xpath working
						////XCUIElementTypeStaticText[@name="Open"]
						By selectStatus = By
								.xpath("//XCUIElementTypeStaticText[@name=" + "'" + SelectStatus + "'" + "]");
						// By selectStatus = By.xpath("//android.widget.TextView[@text=" + "'" +
						// SelectStatus + "'" + "]");
						if (objPojo.getObjWrapperFunctions().checkElementDisplayed(selectStatus)) {
							objPojo.getObjUtilities().logReporter("Clicked on  Specific Select Status", SelectStatus,
									objPojo.getObjWrapperFunctions().click(selectStatus));

							List<MobileElement> openOrders = (List<MobileElement>) objPojo.getDriver().findElements(
									By.xpath("//android.view.ViewGroup[@resource-id='com.sft.now:id/container']"));
							// List<MobileElement> openOrders= (List<MobileElement>)
							// driver.findElements(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.sft.now:id/recycler_view']"));

							for (MobileElement openOrder : openOrders) {
								objPojo.getDriver().findElement(By.xpath(
										"//android.widget.TextView[@resource-id='com.sft.now:id/txtOrderStatus']"))
										.click();
								objPojo.getObjUtilities().logReporter("Clicked on  Details Tab",
										objPojo.getObjWrapperFunctions().click(detailsTab));
								objPojo.getObjUtilities().logReporter("Clicked on  Cancel Button",
										objPojo.getObjWrapperFunctions().click(cancelButton));
								objPojo.getObjUtilities().logReporter("Clicked on  Confirm Cancel Button",
										objPojo.getObjWrapperFunctions().click(confirmCancelButton));
								if (objPojo.getObjWrapperFunctions().checkElementDisplayed(yesButton)) {
									objPojo.getObjUtilities().logReporter("Set Transaction Password",
											objPojo.getObjWrapperFunctions().clearAndSendKeys(transactionPasswordField,
													EntityRunner.getStringValueForField("TransactionPassword")));
									objPojo.getObjUtilities().logReporter("Clicked on  Confirm Yes Button",
											objPojo.getObjWrapperFunctions().click(yesButton));
								}
								objPojo.getObjUtilities().logReporter("Clicked on  Select Order Status",
										objPojo.getObjWrapperFunctions().click(selectOrderStatus));
								SelectStatus = EntityRunner.getStringValueForField("SelectStatus");
								if (objPojo.getObjWrapperFunctions().checkElementDisplayed(selectStatus)) {
									selectStatus = By
											.xpath("//android.widget.TextView[@text=" + "'" + SelectStatus + "'" + "]");
									objPojo.getObjUtilities().logReporter("Clicked on  Specific Select Status",
											SelectStatus, objPojo.getObjWrapperFunctions().click(selectStatus));
								} else {
									break;
								}
							}
						} // all xpath-(hardcoded)
						objPojo.getDriver().findElement(By.xpath(
								"//*[@name=\"drop_down\"]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]"))
								.click();
					}
				}
			}
		}
	}

	void verifyLogsDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigOrderLogsDropDown")) {
				objPojo.getObjUtilities().logReporter("Clicked on  Log Dropdown List",
						objPojo.getObjWrapperFunctions().click(logDropDownList));
				String selectOrderLogs = EntityRunner.getStringValueForField("SelectOrderLogs");
				By selectOrderLog = By.xpath("//android.widget.TextView[@text=" + "'" + selectOrderLogs + "'" + "]");
				objPojo.getObjUtilities().logReporter("Clicked on  Select Order Log",
						objPojo.getObjWrapperFunctions().click(selectOrderLog));
			}
			if (EntityRunner.getBooleanValueForField("ConfigOrderLogDetails")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(orderLogDetails);
				objPojo.getObjUtilities().logReporter("Verify Order Log Details : " + str, !str.equals(""));
			}

		}

	}

	void verifyNewsDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigNewsDropDown")) {
				objPojo.getObjUtilities().logReporter("Clicked on  News Dropdown",
						objPojo.getObjWrapperFunctions().click(newsDropDownList));
				ArrayList<MobileElement> NewsDetails = (ArrayList<MobileElement>) objPojo.getDriver()
						.findElements(By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/textView1']"));
				for (MobileElement NewsDetail : NewsDetails) {
					MobileElement str = NewsDetail;
					String str1 = str.getText();
					objPojo.getObjUtilities().logReporter("News Details: " + str1, !str1.equals(""));

				}
			}
		}
	}

	void verifyFundsDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigSubLimit")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(cashAvailableLabel);
				objPojo.getObjUtilities().logReporter("Verify cash Available Value: " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(marginUtilizedLabel);
				objPojo.getObjUtilities().logReporter("Verify margin Utilized Value: " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(netMarginAvailableLabel);
				objPojo.getObjUtilities().logReporter("Verify net Margin Available Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(unrealizedPAndLLabel);
				objPojo.getObjUtilities().logReporter("Verify unrealized P And L Value: " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(realizedPAndLLabel);
				objPojo.getObjUtilities().logReporter("Verify realized P And L Value : " + str, !str.equals(""));

			}
			if (EntityRunner.getBooleanValueForField("ConfigCredits")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(cashMarginAvailableLabel);
				objPojo.getObjUtilities().logReporter("Verify cash Margin Available Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(payinAmountLabel);
				objPojo.getObjUtilities().logReporter("Verify payin Amount Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(payoutAmountLabel);
				objPojo.getObjUtilities().logReporter("Verify payout Amount Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(directCollateralLabel);
				objPojo.getObjUtilities().logReporter("Verify direct Collateral Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(ADHOCMarginLabel);
				objPojo.getObjUtilities().logReporter("Verify ADHOC Margin Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(notionalCashLabel);
				objPojo.getObjUtilities().logReporter("Verify notional Cash Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(holdingCollateralLabel);
				objPojo.getObjUtilities().logReporter("Verify holding Collateral Value : " + str, !str.equals(""));

				// scrollDown(cashAvailableLabel, holdingCollateralLabel);

				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(CNCSellBenefitLabel);
				objPojo.getObjUtilities().logReporter("Verify CNC Sell Benefit Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellOptionsPremiumLabel);
				objPojo.getObjUtilities().logReporter("Verify sell Options Premium Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(adhocFOMarginLabel);
				objPojo.getObjUtilities().logReporter("Verify adhoc FO Margin Value: " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(adhocCurrencyMarginLabel);
				objPojo.getObjUtilities().logReporter("Verify adhoc Currency Margin Value : " + str, !str.equals(""));

			}
			if (EntityRunner.getBooleanValueForField("ConfigLimitsAssigned")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(CNCLimitsLabel);
				objPojo.getObjUtilities().logReporter("Verify CNC Limits Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyExposureLimitsLabel);
				objPojo.getObjUtilities().logReporter("Verify buy Exposure Limits Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellExposureLabel);
				objPojo.getObjUtilities().logReporter("Verify sell Exposure Value: " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(MTMLossLimitLabel);
				objPojo.getObjUtilities().logReporter("Verify MTM Loss Limit Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(grossExposureLimitsLabel);
				objPojo.getObjUtilities().logReporter("Verify gross Exposure Limits Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(grossExpLimitforDerivativesLabel);
				objPojo.getObjUtilities().logReporter("Verify gross ExpLimit for Derivatives Value: " + str,
						!str.equals(""));
				// scrollDown(holdingCollateralLabel, grossExpLimitforDerivativesLabel);

				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyExpLimitforFuturesLabel);
				objPojo.getObjUtilities().logReporter("Verify buy Exp Limit for Futures Value : " + str,
						!str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellExpLimitforFuturesLabel);
				objPojo.getObjUtilities().logReporter("Verify sell Exp Limit for Futures Value : " + str,
						!str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyExpLimitforOptionsLabel);
				objPojo.getObjUtilities().logReporter("Verify buy Exp Limit for Options Value : " + str,
						!str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellExpLimitforOptionsLabel);
				objPojo.getObjUtilities().logReporter("Verify sell Exp Limit for Options Value : " + str,
						!str.equals(""));

			}
			if (EntityRunner.getBooleanValueForField("ConfigUtilized")) {
				String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(grossEMPLabel);
				objPojo.getObjUtilities().logReporter("Verify gross EMP Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(spanMarginPresentLabel);
				objPojo.getObjUtilities().logReporter("Verify span Margin Present Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exposureMarginPresentLabel);
				objPojo.getObjUtilities().logReporter("Verify exposure Margin Present Value : " + str, !str.equals(""));
				str = objPojo.getObjWrapperFunctions().fetchValueFromFields(ELMValueLabel);
				objPojo.getObjUtilities().logReporter("Verify ELM Value Value : " + str, !str.equals(""));

			}
		}
	}

	void verifyPositionDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigPosition")) {
				objPojo.getObjUtilities().logReporter("Clicked on  Select Position dropdown",
						objPojo.getObjWrapperFunctions().click(selectPositionDropDown));
				String selectPosition = EntityRunner.getStringValueForField("SelectPosition");
				By selectOrderLog = By.xpath("//android.widget.TextView[@text=" + "'" + selectPosition + "'" + "]");
				objPojo.getObjUtilities().logReporter("Clicked on  Select Order Log",
						objPojo.getObjWrapperFunctions().click(selectOrderLog));
				List<MobileElement> positionDetails = (List<MobileElement>) objPojo.getDriver()
						.findElements(By.xpath("//android.view.ViewGroup[@resource-id='com.sft.now:id/container']"));
				positionDetails.remove(0);
				for (MobileElement positionDetail : positionDetails) {
					MobileElement str = positionDetail;
					str.click();
					objPojo.getObjUtilities().logReporter("Clicked on  Details Tab",
							objPojo.getObjWrapperFunctions().click(detailsTab));
					verifyPositionDetail();
				}
			}
		}
	}

	void verifyPositionDetail() {
		if (EntityRunner.getBooleanValueForField("ConfigScriptNameLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(scriptNameLabel);
			objPojo.getObjUtilities().logReporter("Verify Script Name Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigBuyQuantityLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Buy Quantity Displayed as : " + str, !str.equals(""));
		}

		if (EntityRunner.getBooleanValueForField("ConfigSellQuantityLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Sell Quantity Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigNetQuantityLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(netQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Net Quantity Displayed as : " + str, !str.equals(""));
		}

		if (EntityRunner.getBooleanValueForField("ConfigPreCloseLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(preCloseLabel);
			objPojo.getObjUtilities().logReporter("Verify Pre Close Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigRealizedPLLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(realizedPLLabel);
			objPojo.getObjUtilities().logReporter("Verify Realized P/L Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigBuyPriceLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyPriceLabel);
			objPojo.getObjUtilities().logReporter("Verify Buy Price Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigSellPriceLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellPriceLabel);
			objPojo.getObjUtilities().logReporter("Verify Sell Price  Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigNetAmountLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(netAmountLabel);
			objPojo.getObjUtilities().logReporter("Verify Net Amount Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigLTPLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(LTPLabel);
			objPojo.getObjUtilities().logReporter("Verify LTPL Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigUnrealizedPLLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(unrealizedPLLabel);
			objPojo.getObjUtilities().logReporter("Verify Unrealized P/L Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigBuyValueLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(buyValueLabel);
			objPojo.getObjUtilities().logReporter("Verify Buy Value Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigSellValueLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(sellValueLabel);
			objPojo.getObjUtilities().logReporter("Verify Sell Value Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigDaysPLLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(DaysPLLabel);
			objPojo.getObjUtilities().logReporter("Verify Days P&L Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigBreakEvenPointLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(breakEvenPointLabel);
			objPojo.getObjUtilities().logReporter("Verify Break Even Point Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigUserIDLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(userIDLabel);
			objPojo.getObjUtilities().logReporter("Verify User ID Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigCrossButton")) {
			objPojo.getObjUtilities().logReporter("Clicked on  on close button",
					objPojo.getObjWrapperFunctions().click(crossButton));
		}
	}

	void verifyHoldingDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigHolding")) {
				List<MobileElement> holdingDetails = (List<MobileElement>) objPojo.getDriver()
						.findElements(By.xpath("//android.view.ViewGroup[@resource-id='com.sft.now:id/container']"));
				holdingDetails.remove(0);
				for (MobileElement positionDetail : holdingDetails) {
					MobileElement str = positionDetail;
					str.click();
					objPojo.getObjUtilities().logReporter("Clicked on  details tab",
							objPojo.getObjWrapperFunctions().click(detailsTab));
					verifyHoldingDetail();
				}
			}
		}
	}

	void verifyHoldingDetail() {
		if (EntityRunner.getBooleanValueForField("ConfigScriptNameLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(scriptNameLabel);
			objPojo.getObjUtilities().logReporter("Verify Script Name Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigT1HoldingQuantity")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(t1HoldingQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify T1 Holding Quantity Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigLTPLabel")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(LTPLabel);
			objPojo.getObjUtilities().logReporter("Verify LTPL Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigHoldingQuantity")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(holdingQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Holding Quantity Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigUsedQuantity")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(usedQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Used Quantity Displayed as : " + str, !str.equals(""));
		}

		if (EntityRunner.getBooleanValueForField("ConfigMarketValue")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(MarketValueLabel);
			objPojo.getObjUtilities().logReporter("Verify Market Value Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigDayPAndL")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(dayPLLabel);
			objPojo.getObjUtilities().logReporter("Verify Day P&L Label Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigCollateralValue")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(collateralValueLabel);
			objPojo.getObjUtilities().logReporter("Verify Collateral Value Label Displayed as : " + str,
					!str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigCollateralQuantity")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(collateralQuantityLabel);
			objPojo.getObjUtilities().logReporter("Verify Collateral Quantity Label  Displayed as : " + str,
					!str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigHairCutPer")) {
			String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(hairCutPerLabel);
			objPojo.getObjUtilities().logReporter("Verify Hair Cut(%) Label Displayed as : " + str, !str.equals(""));
		}
		if (EntityRunner.getBooleanValueForField("ConfigCrossButton")) {
			objPojo.getObjUtilities().logReporter("Clicked on  close Button",
					objPojo.getObjWrapperFunctions().click(crossButton));
		}

	}

	void verifyUserIconLinks() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			if (EntityRunner.getBooleanValueForField("ConfigUserIcon")) {
				objPojo.getObjUtilities().logReporter("Clicked on  User Icon",
						objPojo.getObjWrapperFunctions().click(userIcon));

				if (EntityRunner.getBooleanValueForField("ConfigAcccountInformation")) {
					objPojo.getObjUtilities().logReporter("Clicked on  Account Information",
							objPojo.getObjWrapperFunctions().click(acccountInformation));
					if (EntityRunner.getBooleanValueForField("ConfigAccountDetails")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(accountDetails);
						objPojo.getObjUtilities().logReporter("Verify title Name Displayed as : " + str,
								!str.equals(""));

						if (EntityRunner.getBooleanValueForField("ConfigClientID")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(clientID);
							objPojo.getObjUtilities().logReporter("Verify clientID Name Displayed as : " + str1,
									!str.equals(""));

						}
						if (EntityRunner.getBooleanValueForField("ConfigLoginId")) {
							String str2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(loginId);
							objPojo.getObjUtilities().logReporter("Verify clientID Name Displayed as : " + str2,
									!str.equals(""));

						}
					}
					if (EntityRunner.getBooleanValueForField("ConfigPersonalDetails")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(personalDetails);
						objPojo.getObjUtilities().logReporter("Verify PersonalDetails Displayed as : " + str,
								!str.equals(""));

						if (EntityRunner.getBooleanValueForField("ConfigName")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(name);
							objPojo.getObjUtilities().logReporter("Verify Name Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigMobileNumber")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(mobileNumber);
							objPojo.getObjUtilities().logReporter("Verify mobileNumber Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigEmailId")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(emailId);
							objPojo.getObjUtilities().logReporter("Verify mobileNumber Displayed as : " + str1,
									!str1.equals(""));
						}

					}
					// scrollDown(clientID, branchName);
					if (EntityRunner.getBooleanValueForField("ConfigBrokerDetails")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(brokerDetails);
						objPojo.getObjUtilities().logReporter("Verify BrokerDetails Displayed as : " + str,
								!str.equals(""));
						if (EntityRunner.getBooleanValueForField("ConfigBrokerName")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(brokerName);
							objPojo.getObjUtilities().logReporter("Verify BrokerName Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigBrokerId")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(brokerId);
							objPojo.getObjUtilities().logReporter("Verify BrokerId Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigExchangeRegistrationNo")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeRegistrationNo);
							objPojo.getObjUtilities().logReporter(
									"Verify ExchangeRegistrationNo Displayed as : " + str1, !str1.equals(""));
						}
					}
				}
				if (EntityRunner.getBooleanValueForField("ConfigChangePassword")) {
					objPojo.getObjUtilities().logReporter("Clicked on  Change Password Button",
							objPojo.getObjWrapperFunctions().click(changePassword));
				}
				if (EntityRunner.getBooleanValueForField("ConfigHelp")) {
					objPojo.getObjUtilities().logReporter("Clicked on  Help Icon",
							objPojo.getObjWrapperFunctions().click(help));
					if (EntityRunner.getBooleanValueForField("ConfigPageTitle")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(pageTitle);
						objPojo.getObjUtilities().logReporter("Verify page title Displayed as : " + str,
								!str.equals(""));
					}
					if (EntityRunner.getBooleanValueForField("ConfigLogo")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(logo);
						objPojo.getObjUtilities().logReporter("Verify Logo Name Displayed as : " + str,
								!str.equals(""));
					}

				}
				if (EntityRunner.getBooleanValueForField("ConfigSetting")) {
					objPojo.getObjUtilities().logReporter("Clicked on  Settings Icon",
							objPojo.getObjWrapperFunctions().click(setting));
					if (EntityRunner.getBooleanValueForField("ConfigAppearance")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(appearancetxt);
						objPojo.getObjUtilities().logReporter("Verify appearance text Displayed as : " + str,
								!str.equals(""));
						objPojo.getObjUtilities().logReporter("Clicked on  Appearance",
								objPojo.getObjWrapperFunctions().click(appearancetxt));
						if (EntityRunner.getBooleanValueForField("ConfigDark")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(dark);
							objPojo.getObjUtilities().logReporter("Verify theme Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigLight")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(light);
							objPojo.getObjUtilities().logReporter("Verify theme Displayed as : " + str1,
									!str1.equals(""));
						}
						objPojo.getObjUtilities().logReporter("Clicked on  Cancel Button",
								objPojo.getObjWrapperFunctions().click(cancel));
					}
					if (EntityRunner.getBooleanValueForField("ConfigChartSetting")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(chartSettingtxt);
						objPojo.getObjUtilities().logReporter("Verify ChartSetting Text Displayed as : " + str,
								!str.equals(""));
						objPojo.getObjUtilities().logReporter("Chart Setting Text",
								objPojo.getObjWrapperFunctions().click(chartSettingtxt));
						if (EntityRunner.getBooleanValueForField("Configcharttypetxt")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(chartType);
							objPojo.getObjUtilities().logReporter("Verify Chart Type Text Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigChartStyle")) {
							String str2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(chartStyle);
							objPojo.getObjUtilities().logReporter("Verify chartStyle Displayed as : " + str2,
									!str2.equals(""));

						}
						objPojo.getObjUtilities().logReporter("Clicked on  Back Button",
								objPojo.getObjWrapperFunctions().click(backbutton));
					}
					if (EntityRunner.getBooleanValueForField("ConfigNotification")) {
						String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(notificationTxt);
						objPojo.getObjUtilities().logReporter("Verify Notification text Displayed as : " + str,
								!str.equals(""));
						objPojo.getObjUtilities().logReporter("Clicked on  Notification Text",
								objPojo.getObjWrapperFunctions().click(notificationTxt));
						if (EntityRunner.getBooleanValueForField("ConfigNotificationSound")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(notificationSound);
							objPojo.getObjUtilities().logReporter("Verify text of Notification Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigAll")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(all);
							objPojo.getObjUtilities().logReporter("Verify text of Notification Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigTrade")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(trade);
							objPojo.getObjUtilities().logReporter("Verify text of Notification Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigNews")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(news);
							objPojo.getObjUtilities().logReporter("Verify text of Notification Displayed as : " + str1,
									!str1.equals(""));
						}
						if (EntityRunner.getBooleanValueForField("ConfigOrder")) {
							String str1 = objPojo.getObjWrapperFunctions().fetchValueFromFields(order);
							objPojo.getObjUtilities().logReporter("Verify text of Notification Displayed as : " + str1,
									!str1.equals(""));
						}

					}
				}
			}
		}
	}

	public void fillAndSubmitDashboardPageDetails() {

		// if (isConfigTrue(EntityRunner.getConfigExecute())) {
		cancalOrder();
		fillDashboardPageDetails();
		clickOnMenu();
		// clicOnMenu();
		verifyLogsDetails();
		verifyNewsDetails();
		verifyFundsDetails();
		verifyPositionDetails();
		verifyHoldingDetails();
		verifyUserIconLinks();

		// }
	}

}
