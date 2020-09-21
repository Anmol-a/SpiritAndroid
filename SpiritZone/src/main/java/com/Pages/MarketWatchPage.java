package com.Pages;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;

public class MarketWatchPage {

	private By scriptName;
	private By instumentType;
	private By exchangeType;
	private By price;
	private By volume;
	private By percentageChange;
	private By watchList;
	private By setting;

	private By WatchListNameTextField;
	private By cancelBtn;
	private By createBtn;
	private By setingDropdown;
	Pojo objPojo;
	private EntityRunner EntityRunner;

	public MarketWatchPage(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		scriptName = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_symbol_name']");
		instumentType = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_sector']");
		exchangeType = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_exchange']");
		price = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_symbol_amt']");
		volume = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_amt']");
		percentageChange = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/lbl_amt_percent']");
		setting = By.xpath("//android.widget.TextView[@resource-id='com.sft.now:id/icon_setting']");
		WatchListNameTextField = By
				.xpath("//android.widget.EditText[@resource-id='com.sft.now:id/edit_watchlist_name']");
		cancelBtn = By.xpath("//android.widget.Button[@resource-id='com.sft.now:id/btnCancelWL']");
		createBtn = By.xpath("//android.widget.Button[@resource-id='com.sft.now:id/btnCreateWL']");

	}

	public void verifyMarketWatchDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			if (EntityRunner.getBooleanValueForField("ConfigSetting")) {
				objPojo.getObjUtilities().logReporter("Click Setting Ison",
						objPojo.getObjWrapperFunctions().click(setting));
				if (EntityRunner.getBooleanValueForField("ConfigSetingDropdown")) {
					String testData = EntityRunner.getStringValueForField("SetingDropdown");
					setingDropdown = By.xpath("//android.view.ViewGroup[@text=" + "'" + testData + "'" + "]");
					objPojo.getObjUtilities().logReporter("Select Setting dropdown option", testData,
							objPojo.getObjWrapperFunctions().click(setingDropdown));

					if (EntityRunner.getBooleanValueForField("ConfigCreateNew")) {

						if (EntityRunner.getBooleanValueForField("ConfigWatchListName")) {
							objPojo.getObjUtilities().logReporter("Select watch list name option", testData,
									objPojo.getObjWrapperFunctions().clearAndSendKeys(WatchListNameTextField,
											EntityRunner.getStringValueForField("WatchListName")));
							if (EntityRunner.getBooleanValueForField("ConfigCreate")) {
								objPojo.getObjUtilities().logReporter("Click create Button",
										objPojo.getObjWrapperFunctions().click(createBtn));
							}
							if (EntityRunner.getBooleanValueForField("ConfigCancel")) {
								objPojo.getObjUtilities().logReporter("Click Cancel button",
										objPojo.getObjWrapperFunctions().click(cancelBtn));
							}
						}
					}

				}

			}
			if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
				if (EntityRunner.getBooleanValueForField("ConfigWatchDropdown")) {
					String testData = EntityRunner.getStringValueForField("WatchList");
					watchList = By.xpath("//android.widget.Spinner[@text=" + "'" + testData + "'" + "]");
					objPojo.getObjUtilities().logReporter("Click Watch List button",
							objPojo.getObjWrapperFunctions().click(watchList));
				}
				if (EntityRunner.getBooleanValueForField("ConfigScriptName")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(scriptName);
					objPojo.getObjUtilities().logReporter("Verify Script Name Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigInstumentType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(instumentType);
					objPojo.getObjUtilities().logReporter("Verify Instument Type Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigExchangeType")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(exchangeType);
					objPojo.getObjUtilities().logReporter("Verify Exchange Type Displayed as : " + str,
							!str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigPrice")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(price);
					objPojo.getObjUtilities().logReporter("Verify price Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigVolume")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(volume);
					objPojo.getObjUtilities().logReporter("Verify volume Displayed as : " + str, !str.equals(""));
				}
				if (EntityRunner.getBooleanValueForField("ConfigPercentageChange")) {
					String str = objPojo.getObjWrapperFunctions().fetchValueFromFields(percentageChange);
					objPojo.getObjUtilities().logReporter("Verify PercentageChange Displayed as : " + str,
							!str.equals(""));
				}
			}
		}
	}

	public void fillAndSubmitMarketWatchDetails() {
		verifyMarketWatchDetails();

	}
}
