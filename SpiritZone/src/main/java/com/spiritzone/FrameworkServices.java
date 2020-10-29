package com.spiritzone;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FrameworkServices {

	//private static String packageName;
	public static AndroidDriver<MobileElement> driver;

//	public static String getPackageName() {
//		return packageName;
//	}

//	public static void setPackageName(String packageName) {
//		FrameworkServices.packageName = packageName;
//	}


	public static AppiumDriver<MobileElement> getWebDriverInstance() throws Exception {
		
		String BrowserStackDevice = ConfigReader.getInstance().getValue(PropertyConfigs.BrowserStackDevice);
		
		String userName = "anmol64";
		String accessKey = "ZPYpJ2azCLPhVEBZmSZW";
		String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
		String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
		
		String apkpath=System.getProperty("user.dir")+"/Application-APK/SpiritZoneAlpha1.5.40.apk";
		File app=new File(apkpath);
		System.out.println("CAPABILITIES  ------------");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		
//		cap.setCapability("deviceName", "Vidit");
//		cap.setCapability("platformVersion", "8.1.0");	
//		cap.setCapability("udid", "5203f32cc072b421");
		
//		cap.setCapability("deviceName", "Pixel_2_API_27");
//		cap.setCapability("platformVersion", "8.1.0");
//		cap.setCapability("udid", "emulator-5554");
		
	
		
		if(BrowserStackDevice.equalsIgnoreCase("Yes"))
		{
			System.out.println("-------------Browsertack-Device-------------");
		cap.setCapability("app", "bs://2d741d118db41b7ccababe643543a01858cdbe79");
		cap.setCapability("device", "Google Pixel 3");
		cap.setCapability("os_version", "9.0");
		cap.setCapability("browserstack.local", browserstackLocal);
		cap.setCapability("browserstack.localIdentifier", browserstackLocalIdentifier);
		}
		
		else if (BrowserStackDevice.equalsIgnoreCase("No"))
		{
			System.out.println("-------------Real-Device-------------");
			cap.setCapability("deviceName", "OnePlus 6t");
			cap.setCapability("platformVersion", "10.0");
			cap.setCapability("udid", "eba48b80");
			cap.setCapability("app",apkpath);
		}
		
		cap.setCapability("gpsEnabled", true);
		cap.setCapability("newCommandTimeout", 320);
		cap.setCapability("appPackage", "com.boxwishlabs.spiritzone");
		cap.setCapability("noReset", false);



		

		String gridURL = Uploader.prop.getProperty("GridURL");

		try {
			
			if(BrowserStackDevice.equalsIgnoreCase("Yes"))
			{
			driver = new AndroidDriver<MobileElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), cap);
			}
			else if(BrowserStackDevice.equalsIgnoreCase("No"))
			{
				driver = new AndroidDriver<MobileElement>(new URL(gridURL), cap);
			}
			
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;

	}

	public static void pageWait(int value) throws InterruptedException {
		try {
			Thread.sleep(value);
		} catch (Exception e) {
		}
	}

}
