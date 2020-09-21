package com.Pages;

import org.openqa.selenium.By;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;

public class NseLoginPage_backedup {
	Pojo objPojo;
	private EntityRunner EntityRunner;
	By userIcon;
	By logInBtn;
	By memberIdTextField;
	By UserIdTextField;
	By validateButton;
	By selectImageIcon;
	By passwordTextField;
	By validatePasswordButton;
	By LoginButton;
	By firstLoginAnswerTextField;
	By secondLoginAnswerTextField;
	By Submit2FaBtn;
	By logoutButton;
	By forgotPasswordLink;
	By termsAndConditionsLink;
	By wrngMemberErrorMsg;
	By fpDobTextField;
	By dateField;
	By yearField;
	By okField;
	By FPPANNumberTextField;
	By submitButtonForFP;
	By fpUserIdTextField;
	By btnPopUpOK;
	By PanErrorMsg;
	By fpMemberIdTextField;
	By lblAlertPopUp;
	By lblUsernameLHSSlide;

	public NseLoginPage_backedup(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();
		userIcon = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[4]");
		logInBtn = By.name("Login");
		memberIdTextField = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[1]");
		UserIdTextField = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[2]");
		validateButton = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeButton[1]");
		selectImageIcon = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
		passwordTextField = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]");

		validatePasswordButton = By.xpath("");
		LoginButton = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]");
		firstLoginAnswerTextField = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeSecureTextField[1]");
		secondLoginAnswerTextField = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeSecureTextField[1]");
		Submit2FaBtn = By.xpath(
				"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
		logoutButton = By.xpath("");

		forgotPasswordLink = By.xpath("");

		termsAndConditionsLink = By.xpath("");

		wrngMemberErrorMsg = By.xpath("");

		fpDobTextField = By.xpath("");

		dateField = By.xpath("");

		okField = By.xpath("");

		yearField = By.xpath("");

		FPPANNumberTextField = By.xpath("");

		submitButtonForFP = By.xpath("");

		fpUserIdTextField = By.xpath("");

		btnPopUpOK = By.xpath("");

		PanErrorMsg = By.xpath("");

		fpMemberIdTextField = By.xpath("");

		lblAlertPopUp = By.xpath("");

		lblUsernameLHSSlide = By.xpath("");
	}

	public void fillMemberIdAndLoginIdDetails() {
		if (EntityRunner.getAction().equalsIgnoreCase("add") || EntityRunner.getAction().equalsIgnoreCase("edit")) {
			if (EntityRunner.getBooleanValueForField("ConfigMemberId")) {
				objPojo.getObjUtilities().logReporter("Set Member ID",
						objPojo.getObjWrapperFunctions().clearAndSendKeys(LoginButton, ""));

			}
			if (EntityRunner.getBooleanValueForField("ConfigUserId")) {
				objPojo.getObjWrapperFunctions().clearAndSendKeys(memberIdTextField,
						EntityRunner.getStringValueForField("UserId"));
			}
			if (EntityRunner.getBooleanValueForField("ConfigValidate")) {
				objPojo.getObjUtilities().logReporter("Click Validate Button",
						objPojo.getObjWrapperFunctions().click(validateButton));
			}
			if (EntityRunner.getBooleanValueForField("ConfigImageIcon")) {
				objPojo.getObjUtilities().logReporter("Click Image Icon",
						objPojo.getObjWrapperFunctions().click(selectImageIcon));
			}
			if (EntityRunner.getBooleanValueForField("ConfigPassword")) {
				objPojo.getObjWrapperFunctions().clearAndSendKeys(passwordTextField,
						EntityRunner.getStringValueForField("Password"));
			}
		}

		else if (EntityRunner.getAction().equalsIgnoreCase("verify")) {
			if (EntityRunner.getBooleanValueForField("ConfigMemberId")) {
				String testData = EntityRunner.getStringValueForField("MemberId");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(memberIdTextField);
				objPojo.getObjUtilities().logReporter("Verify Member ID", testData, testData2,
						testData.equals(testData2));

			}
			if (EntityRunner.getBooleanValueForField("ConfigUserId")) {
				String testData = EntityRunner.getStringValueForField("UserId");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(UserIdTextField);
				objPojo.getObjUtilities().logReporter("Verify User ID", testData, testData2,
						testData.equals(testData2));
			}

			if (EntityRunner.getBooleanValueForField("ConfigWrongMemberIdMsg")) {
				String testData = EntityRunner.getStringValueForField("WrongMemberIdMsg");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(wrngMemberErrorMsg);
				objPojo.getObjUtilities().logReporter("Verify Wrong Member ID Message", testData, testData2,
						testData.equals(testData2));
			}
		}

	}

	public void fillForgotPasswordDetails() {
		if (objPojo.getEntityRunner().getAction().equalsIgnoreCase("add")
				|| objPojo.getEntityRunner().getAction().equalsIgnoreCase("edit")) {

			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPDOB")) {
				objPojo.getObjWrapperFunctions().click(fpDobTextField);
				objPojo.getObjWrapperFunctions().click(dateField);
				// ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_8));
				// objPojo.getObjWrapperFunctions().click(yearField);
				// ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
				// ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
				// ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
				// ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_5));
				objPojo.getObjWrapperFunctions().click(okField);
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPPANNumber")) {
				objPojo.getObjWrapperFunctions().clearAndSendKeys(FPPANNumberTextField,
						objPojo.getEntityRunner().getStringValueForField("FPPANNumber"));
				// click(submitButton);
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPPANNumber")) {
				objPojo.getObjUtilities().logReporter("Click Submit Button For FP",
						objPojo.getObjWrapperFunctions().click(submitButtonForFP));
			}
		} else if (objPojo.getEntityRunner().getAction().equalsIgnoreCase("verify")) {
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPUserID")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("FPUserID");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(fpUserIdTextField);
				objPojo.getObjUtilities().logReporter("Verify FPUser ID", testData, testData2,
						testData.equals(testData2));

			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPMemberId")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("FPMemberId");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(fpMemberIdTextField);
				objPojo.getObjUtilities().logReporter("Verify FPMember ID", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPDOB")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("FPDOB");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(fpDobTextField);
				objPojo.getObjUtilities().logReporter("Verify FP D-O-B", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFPPANNumber")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("FPPANNumber");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(FPPANNumberTextField);
				objPojo.getObjUtilities().logReporter("Verify FP PAN Number", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPanErrorMsg")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("PanErrorMsg");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(PanErrorMsg);
				objPojo.getObjUtilities().logReporter("Verify PanError Msg", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigAlertMessageText")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("AlertMessagetext");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(lblAlertPopUp);
				objPojo.getObjUtilities().logReporter("Verify Alert Message text", testData, testData2,
						testData.equals(testData2));
				objPojo.getObjUtilities().logReporter("Click Ok Button on PopUp",
						objPojo.getObjWrapperFunctions().click(btnPopUpOK));
			}
		}
	}

	public void fillQuestionAndAnswerDetails() {
		if (objPojo.getEntityRunner().getAction().equalsIgnoreCase("add")
				|| objPojo.getEntityRunner().getAction().equalsIgnoreCase("edit")) {
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFirstAnswer")) {
				objPojo.getObjWrapperFunctions().clearAndSendKeys(firstLoginAnswerTextField,
						objPojo.getEntityRunner().getStringValueForField("FirstAnswer"));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSecondAnswer")) {
				objPojo.getObjWrapperFunctions().clearAndSendKeys(secondLoginAnswerTextField,
						objPojo.getEntityRunner().getStringValueForField("SecondAnswer"));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSubmit2FA")) {
				objPojo.getObjUtilities().logReporter("Click Submit 2FA Button",
						objPojo.getObjWrapperFunctions().click(Submit2FaBtn));
			}
		} else if (objPojo.getEntityRunner().getAction().equalsIgnoreCase("verify")) {
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigFirstAnswer")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("FirstAnswer");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(firstLoginAnswerTextField);
				objPojo.getObjUtilities().logReporter("Verify FirstAnswer", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSecondAnswer")) {
				String testData = objPojo.getEntityRunner().getStringValueForField("SecondAnswer");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(secondLoginAnswerTextField);
				objPojo.getObjUtilities().logReporter("Verify Second Answer", testData, testData2,
						testData.equals(testData2));
			}
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigUsernameLHSSlide")) {

				String testData = objPojo.getEntityRunner().getStringValueForField("UserNameLHSSlide");
				String testData2 = objPojo.getObjWrapperFunctions().fetchValueFromFields(lblUsernameLHSSlide);
				objPojo.getObjUtilities().logReporter("Verify UserName LHS Slide", testData, testData2,
						testData.equals(testData2));
			}
		}

	}

	public void fillPasswordDetails() {
		// coming soon......
	}

	public void clickOnMenu() {
		if (EntityRunner.getBooleanValueForField("ConfigUserIcon")) {
			objPojo.getObjUtilities().logReporter("Click on Menu Button",
					objPojo.getObjWrapperFunctions().click(userIcon));
		}
	}

	public void clickOnLogin() {
		if (EntityRunner.getBooleanValueForField("ConfigUserIcon")) {
			objPojo.getObjUtilities().logReporter("Click on User Icon",
					objPojo.getObjWrapperFunctions().click(userIcon));

		}
		if (EntityRunner.getBooleanValueForField("ConfigloginBtn")) {
			objPojo.getObjUtilities().logReporter("Click on Login Button",
					objPojo.getObjWrapperFunctions().click(logInBtn));
		}
	}

	public void clickOnLogoutAfterLogin() {
		if (EntityRunner.getBooleanValueForField("ConfigLogoutAfterLogin")) {
			objPojo.getObjUtilities().logReporter("Click on User Icon",
					objPojo.getObjWrapperFunctions().click(userIcon));
			objPojo.getObjUtilities().logReporter("Click on Logout Icon",
					objPojo.getObjWrapperFunctions().click(logoutButton));
		}
	}

	public void clickOnValidatePassword() {
		if (EntityRunner.getBooleanValueForField("ConfigValidatePassword")) {
			objPojo.getObjUtilities().logReporter("Click on validate Password Button",
					objPojo.getObjWrapperFunctions().click(validatePasswordButton));
		}
	}

	public void clickOnSubmit() {
		if (EntityRunner.getBooleanValueForField("ConfigLogin")) {
			objPojo.getObjUtilities().logReporter("Click on Submit",
					objPojo.getObjWrapperFunctions().click(LoginButton));
		}
	}

	public void clickOnForgotPassword() {
		if (EntityRunner.getBooleanValueForField("ConfigForgotPassword")) {
			objPojo.getObjUtilities().logReporter("Click on Forgot Password",
					objPojo.getObjWrapperFunctions().click(forgotPasswordLink));
		}
	}

	public void clickOnTermsAndConditions() {
		if (EntityRunner.getBooleanValueForField("ConfigLogin")) {
			objPojo.getObjUtilities().logReporter("Click on Terms And Conditions",
					objPojo.getObjWrapperFunctions().click(termsAndConditionsLink));
		}
	}

	public void fillAndSubmitLoginDetails() {
		clickOnMenu();
		clickOnLogin();
		fillMemberIdAndLoginIdDetails();
		fillPasswordDetails();
		clickOnValidatePassword();
		clickOnSubmit();
		fillQuestionAndAnswerDetails();
		clickOnForgotPassword();
		fillForgotPasswordDetails();
		clickOnLogoutAfterLogin();
	}

}