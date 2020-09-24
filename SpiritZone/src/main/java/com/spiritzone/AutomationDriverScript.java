package com.spiritzone;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.TestHTMLReporter;

import com.Pages.SpiritZoneHomeAddress;
import com.Pages.SpiritZoneHomeOrder;
import com.TestSpiritZone.TestLauncher;

public class AutomationDriverScript extends FunctionalKeyword {
	
	java.util.Date date=new java.util.Date();
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
	String folderDate=simpleDateFormat.format(date);
	StorePassWord storedPassword;

	@Parameters({ "executionTestSuite_Reference", "executionAutomationScriptReference",
			"executionAutomationScripterName", "executionAutomationDescription" })
	// @Test(groups = { "functional" })
	@Test
	public void scriptExecutioner(String executionTestSuite_Reference, String executionAutomationScriptReference,
			String executionAutomationScripterName, String executionDescription) throws Exception {
		System.out.println("executionTestSuite_Reference  - " + executionTestSuite_Reference);
		System.out.println("executionAutomationScriptReference - " + executionAutomationScriptReference);
		System.out.println("executionAutomationScripterName - " + executionAutomationScripterName);
		System.out.println("executionAutomationDescription - " + executionDescription);
		this.setResourceName(executionAutomationScripterName);
		this.setTestStepDescription(executionDescription);
		this.setDriver(FrameworkServices.getWebDriverInstance());
		// MasterAutomationScriptSteps MasterAutomationScriptSteps =
		// Uploader.arrMasterAutomationScriptSteps.get(executionAutomationScriptReference);
		MasterAutomationScriptSteps MasterAutomationScriptSteps = Uploader.arrMasterAutomationScriptSteps
				.get(executionAutomationScriptReference);
		this.setTestCaseID(executionTestSuite_Reference);
		this.setObjWrapperFunctions(new WrapperFunctions(this));
		this.setObjUtilities(new Utilities(this));
		try {
			executeStep(MasterAutomationScriptSteps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("unable to call executeStep() in FUNCTIONAL KEYWORD");
		}

	}

	

	@AfterClass
	public void quitDriver() 
	{	
		this.getDriver().quit();
	}

	
	@AfterSuite
	public void afterSuite() throws Exception {
		
		String ConfigMailReport = ConfigReader.getInstance().getValue(PropertyConfigs.ConfigEmail);
		
		if (ConfigMailReport.equalsIgnoreCase("Yes"))
		{
			
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("---------Starting Procedure to Send Mail------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		String SOURCE_FOLDER = TestLauncher.excutionFolderEXCELFile;
		//String SOURCE_FOLDER= ConfigReader.getInstance().getValue(PropertyConfigs.SOURCE_FOLDER_TO_ZIP);
		String OUTPUT_ZIP_FILE=ConfigReader.getInstance().getValue(PropertyConfigs.OUTPUT_ZIP_FILE);
		
		ZipUtils appZip = new ZipUtils();
        appZip.generateFileList(new File(SOURCE_FOLDER));
        appZip.zipIt(OUTPUT_ZIP_FILE);
		
		String MyEmailID = ConfigReader.getInstance().getValue(PropertyConfigs.MyEmailID);
		String MyName = ConfigReader.getInstance().getValue(PropertyConfigs.MyName);
		String ToEmail = ConfigReader.getInstance().getValue(PropertyConfigs.ToEmailID);
		
		
		storedPassword = new StorePassWord();
		Properties mailProp=System.getProperties();
		String mailHost=ConfigReader.getInstance().getValue(PropertyConfigs.mailHost);
		int mailPort=Integer.parseInt(ConfigReader.getInstance().getValue(PropertyConfigs.mailPort));
		mailProp.put("mail.smtp.auth", "true");
		mailProp.put("mail.smtp.starttls.enable", "true");
		//mailProp.put("mail.smtp.starttls.enable", "true");
		mailProp.put("mail.smtp.host", mailHost);
		mailProp.put("mail.smtp.port", mailPort);
		// outMail login Details
		final String outmailUsername = MyEmailID;
		final String outmailPassword = storedPassword.decrypt("AhYqFi8DFBQy6Jm5gI3upw==");
		//final String outmailPassword = "Kox44414";
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(outmailUsername, outmailPassword);
			}
		};

		Session session = Session.getInstance(mailProp, auth);

		try
		{
			MimeMessage msg = new MimeMessage(session);

			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("Content-Transfer-Encoding", "8bit");
			msg.setSentDate(new Date());
			msg.setFrom(new InternetAddress(MyEmailID,MyEmailID));
			msg.setReplyTo(InternetAddress.parse(MyName, false));
			msg.setSubject("Result For Your Execution Is Here", "UTF-8");	
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(ToEmail, false));
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("Hello, Good day! \n"
					+ "\n"
					+ "All scenarios have been executed. Please find the attached report of the execution.  \n"
					+ "\n"
					+ "Thanks,\n"
					+ "Anmol.");
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);
			// Second part is attachment
			messageBodyPart = new MimeBodyPart();
			
			//DataSource sourceZip = new FileDataSource(zip.toString());
			File file2 = new File(OUTPUT_ZIP_FILE);
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(file2.getAbsolutePath());	
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(folderDate+"OUTPUT");
			multipart.addBodyPart(messageBodyPart);
			// Send the complete message parts
			msg.setContent(multipart);
			Transport.send(msg);  
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//zip.delete();
	}	
		
	}


}
