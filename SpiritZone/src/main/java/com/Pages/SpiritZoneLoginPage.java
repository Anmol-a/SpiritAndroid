package com.Pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.spiritzone.EntityRunner;
import com.spiritzone.Pojo;
import com.spiritzone.TestScenarios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SpiritZoneLoginPage {

	TestScenarios TestScanerio;
	Pojo objPojo;
	EntityRunner EntityRunner;
	
	By userID;
	By passwd;
	By logInBtn;
	By AllowPopup;
	By AllownewVersionPopUp;
	By SkipBTN;
	By ForgetPasswd;
	By ForgetPasswdInput;
	By GetOtpBtn;
	By DateBtn;
	By SignUpBTN;
	By DateVal;
	By OKbtn;
	By TnCcheckBoc;
	By EnterBTN;
	By Name;
	By EmailID;
	By Phone;
	By SetPassword;
	By SetConfirmPassword;
	

	
	//Scroll DOWN
	By TncCheckBoc1;
	By TncCheckBoc2;
	By SignUpBtn;
	
	
	By cancelBTN;
	By ContinueBTN;
	
	
	public SpiritZoneLoginPage(Pojo objPojo) {
		this.objPojo = objPojo;
		EntityRunner = objPojo.getEntityRunner();

		userID = By.xpath("(//android.widget.EditText[@class='android.widget.EditText'])[1]");
		passwd = By.xpath("(//android.widget.EditText[@class='android.widget.EditText'])[2]");
		AllowPopup = By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']");
		AllownewVersionPopUp = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");
		logInBtn = By.xpath("//android.widget.Button");
		SkipBTN = By.xpath("(//*[@class='android.widget.TextView'])[1]");
		ForgetPasswd = By.xpath("//android.widget.TextView[@text='Forget your password?']");
		ForgetPasswdInput = By.xpath("//android.widget.EditText");
		GetOtpBtn = By.xpath("//android.widget.Button[@text='GET OTP']");
		
		
		SignUpBTN =  By.xpath("(//android.widget.TextView)[5]");
		DateBtn  =  By.xpath("(//android.widget.TextView)[2]");
		DateVal= By.xpath("//android.view.View[@text='1']");
		OKbtn = By.xpath("//android.widget.Button[@text='OK']");
		
		TnCcheckBoc = By.xpath("(//android.widget.ImageView)[2]");
		EnterBTN = By.xpath("//android.widget.Button[@text='ENTER']");
		
		Name = By.xpath("//android.widget.TextView[@text='Name']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		EmailID  = By.xpath("//android.widget.TextView[@text='Email']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		Phone = By.xpath("//android.widget.TextView[@text='Phone']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		SetPassword = By.xpath("//android.widget.TextView[@text='Password']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		SetConfirmPassword = By.xpath("//android.widget.TextView[@text='Confirm Password']/following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText");
		
		//Scroll DOwn
		//Thread.sleep
		TncCheckBoc1 = By.xpath("(//android.widget.ImageView)[2]");
		TncCheckBoc2 = By.xpath("(//android.widget.ImageView)[3]");
		SignUpBtn = By.xpath("//android.widget.Button[@text='SIGN UP']");
		
		//Thread.sleep
		cancelBTN = By.xpath("//android.widget.Button[@text='CANCEL']");
		ContinueBTN = By.xpath("//android.widget.Button[@text='CONFIRM']");
		
	}

	public void fillMemberIdAndLoginIdDetails() throws InterruptedException {
		
		
		Thread.sleep(2000);
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")).size()!=0)
		{
			objPojo.getObjWrapperFunctions().click(AllowPopup);
		}
		else if(objPojo.getDriver().findElements(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")).size()!=0)
		{
		objPojo.getObjWrapperFunctions().click(AllownewVersionPopUp);
		}
		
		//Skip 
		objPojo.getObjWrapperFunctions().click(SkipBTN);
		
		if (objPojo.getEntityRunner().getAction().equalsIgnoreCase("add")
				|| objPojo.getEntityRunner().getAction().equalsIgnoreCase("edit")) {

			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigUserId")) {
				
				objPojo.getObjUtilities().logReporter(" Entering Userid as "+ objPojo.getEntityRunner().getStringValueForField("UserId"),
				objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(userID,
						objPojo.getEntityRunner().getStringValueForField("UserId"),"UserID TextField"));

			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword")) {
				
				objPojo.getObjUtilities().logReporter(" Entering Password as "+ objPojo.getEntityRunner().getStringValueForField("Password"),
				objPojo.getObjWrapperFunctions().clearAndSendKeysCustomException(passwd,
						objPojo.getEntityRunner().getStringValueForField("Password"),"Password TextField"));

			}
			

		}
	}



	public void clickOnSubmit() {
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSubmit")) {
					objPojo.getObjUtilities().logReporter("Click on Submit",
					objPojo.getObjWrapperFunctions().clickException(logInBtn , "Login Button"));
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}					
	}
	

	public void clickonSignUP() {
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSignUP")) {
					objPojo.getObjUtilities().logReporter("Click on SignUpButton",
					objPojo.getObjWrapperFunctions().click(SignUpBTN));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(DateBtn));
	
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(DateVal));			
		
		objPojo.getObjUtilities().logReporter("Click on Date Value",
				objPojo.getObjWrapperFunctions().click(DateVal));
					
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(OKbtn));	
		
		objPojo.getObjUtilities().logReporter("Click on TnC CheckBOX",
				objPojo.getObjWrapperFunctions().click(TnCcheckBoc));	
		
		objPojo.getObjUtilities().logReporter("Click on Enter Button",
				objPojo.getObjWrapperFunctions().click(EnterBTN));
	

		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigName")) {
			
			objPojo.getObjUtilities().logReporter(" Entering Name as "+ objPojo.getEntityRunner().getStringValueForField("Name"),
			objPojo.getObjWrapperFunctions().clearAndSendKeys(Name,
					objPojo.getEntityRunner().getStringValueForField("Name")));
		}
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigEmail")) {
			
			objPojo.getObjUtilities().logReporter(" Entering Email as   "+ objPojo.getEntityRunner().getStringValueForField("Email"),
			objPojo.getObjWrapperFunctions().clearAndSendKeys(EmailID,
					objPojo.getEntityRunner().getStringValueForField("Email")));
		}
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPhone")) {
		
		objPojo.getObjUtilities().logReporter(" Entering Phone NO  as "+ objPojo.getEntityRunner().getStringValueForField("Phone"),
		objPojo.getObjWrapperFunctions().clearAndSendKeys(Phone,
				objPojo.getEntityRunner().getStringValueForField("Phone")));
	}
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword2")) {
		
		objPojo.getObjUtilities().logReporter(" Entering Password  as "+ objPojo.getEntityRunner().getStringValueForField("FirstPassword2"),
		objPojo.getObjWrapperFunctions().clearAndSendKeys(SetPassword,
				objPojo.getEntityRunner().getStringValueForField("FirstPassword2")));
	}
	
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword2")) {
		
		objPojo.getObjUtilities().logReporter(" Entering Confirmed Password  as "+ objPojo.getEntityRunner().getStringValueForField("SecondPassword2"),
		objPojo.getObjWrapperFunctions().clearAndSendKeys(SetConfirmPassword,
				objPojo.getEntityRunner().getStringValueForField("SecondPassword2")));
	}
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(TncCheckBoc1));
	
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(TncCheckBoc2));
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	objPojo.getObjWrapperFunctions().scrollDown();
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(SignUpBtn));

	

	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigContinue")) {
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(ContinueBTN));
	
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
		}
	}
	
}
	
	
	public void AssertLogin()
	{

		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative") & objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='HOME']")).size()==0) {
			
			objPojo.getObjUtilities().logReporter("Negtive Scanerio ", true);
		}
		
		
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive")) {
			String HomeElement = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='HOME']")).getText();
		if (HomeElement.equalsIgnoreCase("HOME")) {
			
			objPojo.getObjUtilities().logReporter("<B> Login Successful </B>", true);
		}
			
		else
		{
			objPojo.getObjUtilities().logReporter("<B> Scanerio Failed!!!! </B>", false);	
		}
			
	}
		
		
	}		
		
		

	public void fillAndSubmitLoginDetails() throws InterruptedException {
		fillMemberIdAndLoginIdDetails();
		clickOnSubmit();
		clickonSignUP();
		AssertLogin();

	}

}