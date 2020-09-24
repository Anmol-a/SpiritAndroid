package com.Pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	By YearDatePickerClick;
	By SelectOurYearAge;
	
   //FOrget Password
	By requestOTP;
	By PhoneNoInput;
	By verifyBtn;
	By NewPasswdField;
	By ConfirmNewPasswdField;
	By ResetPasswdBtn;
	
	
	
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
		ForgetPasswd = By.xpath("//android.widget.TextView[@text='Forgot your password?']");
		ForgetPasswdInput = By.xpath("//android.widget.EditText");
		GetOtpBtn = By.xpath("//android.widget.Button[@text='GET OTP']");
		
		//ForgetPassword
		PhoneNoInput = By.className("android.widget.EditText");
		requestOTP = By.xpath("//android.widget.Button[@text='REQUEST OTP']");
		verifyBtn = By.xpath("//android.widget.Button[@text='VERIFY']");
		NewPasswdField = By.xpath("(//android.widget.EditText)[1]");
		ConfirmNewPasswdField = By.xpath("(//android.widget.EditText)[2]");
		ResetPasswdBtn = By.xpath("//android.widget.Button[@text='RESET PASSWORD']");
		
		
		SignUpBTN =  By.xpath("//android.widget.TextView[@text='What are you waiting for? Sign up here']");
		DateBtn  =  By.xpath("//android.widget.TextView[@text='DD/MM/YYYY']");
		YearDatePickerClick = By.xpath("//android.widget.TextView[@text='1995']");
		SelectOurYearAge = By.xpath("//android.widget.TextView[@text='1992']");
		DateVal= By.xpath("//android.view.View[@text='1']");
		OKbtn = By.xpath("//android.widget.Button[@text='OK']");
		
		TnCcheckBoc = By.xpath("//android.widget.TextView[@text='I agree with the terms & condition and the privacy policy']//preceding::android.widget.ImageView[1]");
		EnterBTN = By.xpath("//android.widget.Button[@text='ENTER']");
		
		Name = By.xpath("//android.widget.TextView[@text='Name']//preceding::android.widget.EditText[1]");
		EmailID  = By.xpath("//android.widget.TextView[@text='Email']//preceding::android.widget.EditText[1]");
		Phone = By.xpath("//android.widget.TextView[@text='Phone']//preceding::android.widget.EditText[1]");
		SetPassword = By.xpath("//android.widget.TextView[@text='Password']//preceding::android.widget.EditText[1]");
		SetConfirmPassword = By.xpath("//android.widget.TextView[@text='Confirm Password']//preceding::android.widget.EditText[1]");
		
		//Scroll DOwn
		//Thread.sleep
		TncCheckBoc1 = By.xpath("//android.widget.TextView[@text='I hereby confirm all the details provided are true to the best of my knowledge.']//preceding::android.widget.ImageView[1]");
		TncCheckBoc2 = By.xpath("//android.widget.TextView[@text='I hereby confirm the information regarding my age is true and I am legally eligible to consume liquor according to section 40 of the Bombay Prohibition Act, 1949.']//preceding::android.widget.ImageView[1]");
		SignUpBtn = By.xpath("//android.widget.Button[@text='SIGN UP']");
		
		//Thread.sleep
		cancelBTN = By.xpath("//android.widget.Button[@text='CANCEL']");
		ContinueBTN = By.xpath("//android.widget.Button[@text='CONFIRM']");
		
	}

	public void fillMemberIdAndLoginIdDetails() throws InterruptedException {
		
		
		Thread.sleep(4000);
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
						
				objPojo.getObjUtilities().logReporter(" Entering Userid as "+ objPojo.getEntityRunner().getStringValueForField("UserId"),true);
				objPojo.getObjWrapperFunctions().clearAndSendKeysNull(userID,
						objPojo.getEntityRunner().getStringValueForField("UserId"),
						"UserID  TextField");
				

			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword")) {
				

				objPojo.getObjUtilities().logReporter(" Entering Password as "+ objPojo.getEntityRunner().getStringValueForField("Password"),true);
				objPojo.getObjWrapperFunctions().clearAndSendKeysNull(passwd,
						objPojo.getEntityRunner().getStringValueForField("Password"),
						"Password  TextField");
			
			
			}
			

		}
	}



	public void clickOnSubmit() throws InterruptedException {
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSubmit")) {
					objPojo.getObjUtilities().logReporter("Click on Submit",
					objPojo.getObjWrapperFunctions().clickException(logInBtn , "Login Button"));
					
						Thread.sleep(3000);
					
			}					
	}
	

	public void clickonSignUP() throws InterruptedException {
		
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigSignUP"))
		{
					//Wait for 2 secs
					Thread.sleep(2000);
					objPojo.getObjUtilities().logReporter("Click on SignUpButton",
					objPojo.getObjWrapperFunctions().click(SignUpBTN));
						
						//Wait for 1 sec
						Thread.sleep(1000);
						
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(DateBtn));
	
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(YearDatePickerClick));			
		
		objPojo.getObjUtilities().logReporter("Click on Date Value",
				objPojo.getObjWrapperFunctions().click(SelectOurYearAge));
					
		objPojo.getObjUtilities().logReporter("Click on Date Button",
				objPojo.getObjWrapperFunctions().click(OKbtn));	
		
//		objPojo.getObjUtilities().logReporter("Click on TnC CheckBOX",
//				objPojo.getObjWrapperFunctions().click(TnCcheckBoc));	
		
		objPojo.getObjUtilities().logReporter("Click on Enter Button",
				objPojo.getObjWrapperFunctions().click(EnterBTN));
	

		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigName")) 
		{
			//Wait for 1 sec
			Thread.sleep(1000);
			objPojo.getObjUtilities().logReporter(" Entering Name as "+ objPojo.getEntityRunner().getStringValueForField("Name"),true);	
			objPojo.getObjWrapperFunctions().clearAndSendKeysNull(Name,
					objPojo.getEntityRunner().getStringValueForField("Name"),
					"Name TextField");
		}
	
		//Wait for 2 secs
			Thread.sleep(2000);

		
		
		
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigEmail")) 
	{
		objPojo.getObjUtilities().logReporter(" Entering Email as "+ objPojo.getEntityRunner().getStringValueForField("Email"),true);	
	
		
			objPojo.getObjWrapperFunctions().clearAndSendKeysNull(EmailID,
					objPojo.getEntityRunner().getStringValueForField("Email"),
					"Email TextField");
		}
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPhone"))
	{
	
		objPojo.getObjUtilities().logReporter(" Entering Phone as "+ objPojo.getEntityRunner().getStringValueForField("Phone"),true);	
		
		objPojo.getObjWrapperFunctions().clearAndSendKeysNull(Phone,
				objPojo.getEntityRunner().getStringValueForField("Phone"),
				"Phone TextField");
	}
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword2")) {
		
		//Wait for 1 sec
		Thread.sleep(1000);
		objPojo.getObjUtilities().logReporter(" Entering FirstPassword as "+ objPojo.getEntityRunner().getStringValueForField("FirstPassword2"),true);		
		objPojo.getObjWrapperFunctions().clearAndSendKeysNull(SetPassword,
				objPojo.getEntityRunner().getStringValueForField("FirstPassword2"),
				"FirstPassword TextField");
	}
	
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPassword2")) {
		//Wait for 1 sec
		Thread.sleep(1000);
        objPojo.getObjWrapperFunctions().scrollDown();
		
		objPojo.getObjUtilities().logReporter(" Entering SecondPassword as "+ objPojo.getEntityRunner().getStringValueForField("SecondPassword2"),true);		
		objPojo.getObjWrapperFunctions().clearAndSendKeysNull(SetConfirmPassword,
				objPojo.getEntityRunner().getStringValueForField("SecondPassword2"),
				"SecondPassword TextField");
		
		
	}
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(TncCheckBoc1));
	
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(TncCheckBoc2));
	
	
	   //Wait for 3 secs
		Thread.sleep(2000);

	
	objPojo.getObjWrapperFunctions().scrollDown();
	
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(SignUpBtn));

	
	if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("SignUpPositive")) 
	{
		
		Thread.sleep(3000);
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='VERIFY MOBILE NUMBER']")).size()!=0)
		{
			objPojo.getObjUtilities().logReporter(" SignUp Successful ", true);	
		}
		else
		{
			objPojo.getObjUtilities().logReporter("Failed", false);		
		}
	}
	
	
	if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("SignUpNegative")) 
	{
		if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='VERIFY MOBILE NUMBER']")).size()==0)
		{
			objPojo.getObjUtilities().logReporter(" SignUp Successful for Negative ", true);	
		}
		else
		{
			objPojo.getObjUtilities().logReporter("Failed", false);			
		}
	}
	
	
	if (objPojo.getEntityRunner().getBooleanValueForField("ConfigContinue")) {
	objPojo.getObjUtilities().logReporter("Click on TnC CheckBox ",
			objPojo.getObjWrapperFunctions().click(ContinueBTN));
	
	
	
		Thread.sleep(10000);

		}
	}
	
}
	
	
	//Forget Password
	public void clickconfigForgetPassword()
	{
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigForgetPassword"))
		{
			objPojo.getObjWrapperFunctions().click(ForgetPasswd);
		
		
		//Enter Phone Number
		if (objPojo.getEntityRunner().getBooleanValueForField("ConfigPhone"))
		{
		objPojo.getObjWrapperFunctions().clearAndSendKeys(PhoneNoInput, objPojo.getEntityRunner().getStringValueForField("Phone"));
		}
		
		//Request OTP Button
		objPojo.getObjWrapperFunctions().click(requestOTP);
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive"))
		{
			
			String OTPText = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='ENTER YOUR OTP']")).getText();
			
			String OTPValue = objPojo.getEntityRunner().getStringValueForField("OTP");
			
			
			//OTP input Field sendKEYS
			for(int x = 1 ; x<7 ;x++)
			{
				//SendKeys from Excel in a loop 
			objPojo.getDriver().findElement(By.xpath("(//android.widget.EditText)["+x+"]")).
														sendKeys(Character.toString(OTPValue.charAt(x)));
					
			}
			
			
			
			
			
			//click on Verify Button
			objPojo.getObjWrapperFunctions().click(verifyBtn);
			
			String ChangePasswordText = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='CHANGE PASSWORD']")).getText();
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigNewPwd"))
			{
				objPojo.getObjWrapperFunctions().clearAndSendKeys(Phone, objPojo.getEntityRunner().getStringValueForField("NewPwd"));	

			}
			
			if (objPojo.getEntityRunner().getBooleanValueForField("ConfigConfirmNewPwd"))
			{
				objPojo.getObjWrapperFunctions().clearAndSendKeys(Phone, objPojo.getEntityRunner().getStringValueForField("ConfirmNewPwd"));	
			}
			
			
			//click on RESET PASSWORD
			objPojo.getObjWrapperFunctions().click(ResetPasswdBtn);
			
			
			
			//Negative ResetPassword
			if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("NegativePassword"))
			{
				if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text()='New Password should contain minimum 6 characters.']")).size()!=0)
				{
					objPojo.getObjUtilities().logReporter("<B>  Please Enter Same Password and Characters more than 6 </B>", true);
				}
				else
				{
					objPojo.getObjUtilities().logReporter("Failed Negative Password Testcase", false);
				}
				
			}
			
			
			
			
			//Assert Change Password
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='OK']")).size()!=0)
			{
				objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='OK']")).click();
				objPojo.getObjUtilities().logReporter(" Password Changed Successful ", true);
				
				
			}
				
		}
		
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative"))
		{
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Not a valid mobile number. Should be 10 digits']")).size()!=0)
			{
				objPojo.getObjUtilities().logReporter(" Please enter 10 Digits Mobile Number ", true);
			}
			
			if(objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='Customer does not exist with this Phone Number.']")).size()!=0)
			{
				objPojo.getObjUtilities().logReporter(" Please enter Registered Mobile Number ", true);
			}	
		}
	  }
	}
//----------------------------------------------------------------------------------Forget Password
	
	
	
	
	public void AssertLogin()
	{

		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Positive")) 
		{
			String HomeElement = objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='HOME']")).getText();
		if (HomeElement.equalsIgnoreCase("HOME")) {
			
			objPojo.getObjUtilities().logReporter(" Login Successful ", true);
		}
			
		else
		{
			objPojo.getObjUtilities().logReporter(" Scanerio Failed!!!! ", false);	
		}
			
	}
	
		if (objPojo.getEntityRunner().getStringValueForField("TestType").equalsIgnoreCase("Negative") && objPojo.getDriver().findElements(By.xpath("//android.widget.TextView[@text='HOME']")).size()==0) 
		{
			
			objPojo.getObjUtilities().logReporter("Negtive Scanerio ", true);
		}
		
	}		
		
		

	public void fillAndSubmitLoginDetails() throws InterruptedException {
		fillMemberIdAndLoginIdDetails();
		clickOnSubmit();
		clickconfigForgetPassword();
		clickonSignUP();
		AssertLogin();

	}

}