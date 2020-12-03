package com.spiritzone;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class WrapperFunctions {
//	PlaceOrderPage Placeorderobj;
	FrameworkServices Frameobj;
	Pojo objPojo;

	WebDriverWait objWebDriverWait;
	private int webDriverWait = 10;
	private int fluentPooling = 1;
	
	

	

	

	public WrapperFunctions(Pojo objPojo) {
		this.objPojo = objPojo;
		objWebDriverWait = new WebDriverWait(objPojo.getDriver(), webDriverWait);
	}
	
	
	
	
	
	public void Ratings(String RatingsStr,int Stars) throws InterruptedException
	{
		TouchAction action = new TouchAction(objPojo.getDriver());
		if(Stars==4)
		{
			action.press(PointOption.point(920, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(720, 1140)).release().perform();
			
			Thread.sleep(700);
		}
		if(Stars==3)
		{
			action.press(PointOption.point(920, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(720, 1140)).release().perform();
			Thread.sleep(700);
			
			action.press(PointOption.point(728, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(545, 1140)).release().perform();
			Thread.sleep(700);
			
		}
		if(Stars==2)
		{
			
			action.press(PointOption.point(920, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(720, 1140)).release().perform();
			Thread.sleep(700);
			
			action.press(PointOption.point(728, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(545, 1140)).release().perform();
			Thread.sleep(700);
			
			
			action.press(PointOption.point(372, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(545, 1140)).release().perform();
			Thread.sleep(700);
			
		}
		if(Stars==1)
		{
			action.press(PointOption.point(920, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(720, 1140)).release().perform();
			Thread.sleep(700);
			
			action.press(PointOption.point(728, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(545, 1140)).release().perform();
			Thread.sleep(700);
			
			action.press(PointOption.point(372, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(545, 1140)).release().perform();
			Thread.sleep(700);
			
			action.press(PointOption.point(382, 1140)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
			.moveTo(PointOption.point(336, 1140)).release().perform();
			Thread.sleep(700);
			
		}
		
		if(RatingsStr.equalsIgnoreCase("Super-Fast Delivery") || RatingsStr.equalsIgnoreCase("Amazing Deals") || RatingsStr.equalsIgnoreCase("Good Options"))
		{
			
			objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+RatingsStr+"']")).click();
		}
		
		if(RatingsStr.equalsIgnoreCase("Had to wait a lot") || RatingsStr.equalsIgnoreCase("Delivery guy was lost") || RatingsStr.equalsIgnoreCase("Not what I ordered") || RatingsStr.equalsIgnoreCase("My order was tampered"))
		{
			
			objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='"+RatingsStr+"']")).click();
		}
		
		if(RatingsStr.equalsIgnoreCase("Other"))
		{
			objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Other']")).click();
			objPojo.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Other']")).sendKeys("This isn't very good style, though, and can lead to some devilish bugs that are hard to find. People aren't used to looking for modifications to the loop control variable inside the for loop because it's one of those things that You. Just. Don't. Do.");	
		}
		
		//Clicking Submit
		objPojo.getDriver().findElement(By.xpath("//android.widget.Button[@text='SUBMIT']")).click();
	}
	
	
	
	
	
	
	public void SendKeysinConcernINput() throws InterruptedException
	{
		objPojo.getObjWrapperFunctions().waitForElementPresence(By.xpath("//android.widget.EditText[@text='Type here']"));
		objPojo.getObjWrapperFunctions().clearAndSendKeysNull(By.xpath("//android.widget.EditText[@text='Type here']"), "XYZ", "Concern Input");
		objPojo.getObjWrapperFunctions().click(By.xpath("//android.widget.EditText[@text='XYZ']//parent::android.view.ViewGroup[1]//following-sibling::android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"));
		Thread.sleep(5000);
	}
	
	

	public void waitForElementPresence(By locator) throws NotFoundException {
		objWebDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void waitForElementVisibilityLocated(By locator) throws NotFoundException {
		objWebDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitForElementVisibility(WebElement webElement) throws NotFoundException {
		objWebDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public void waitForElementToBeClickable(By locator) throws NotFoundException {
		objWebDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitForElementInVisibilityLocated(By locator) throws NotFoundException {
		objWebDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

	}

	
	public void highlighter(MobileElement webElement) 
	{
		//MobileElement webElement = getElementFluent(locator);
		((JavascriptExecutor)objPojo.getDriver()).executeScript("arguments[0].style.border='3px solid red'",webElement);
	}
	
	
	
	public boolean clearAndSendKeysFORDIGIT(By locator, String fieldValue) {
		try {
			MobileElement webElement = getElementFluent(locator);
			webElement.click();
			// for iphone 6+
			TouchAction touch = new TouchAction(objPojo.getDriver());
			touch.longPress(PointOption.point(276, 679)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000)))
					.release().perform();
			/*
			 * String value = ((WebElement) locator).getAttribute("value").toString();
			 * System.out.println(value); int val = value.length();
			 */
			// int val1 =9;
			/*
			 * for (int xa = 1; xa < val1; xa++) {
			 * objPojo.getDriver().findElementByXPath("//XCUIElementTypeKey[@name='Delete']"
			 * ).click(); }
			 */
			webElement.clear();
			webElement.setValue(fieldValue);
			objPojo.getDriver().findElementByXPath("//XCUIElementTypeButton[@name='Toolbar Done Button']").click();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;

		}

	}

	public boolean clearAndSendKeyssamp(By locator, String fieldValue) {
		try {
			/*
			 * waitForElementPresence(locator); waitForElementVisibilityLocated(locator);
			 */
			MobileElement webElement = getElementFluent(locator);
			clearElement(webElement);
			// webElement.clear();
			webElement.sendKeys(fieldValue);
			objPojo.getDriver().hideKeyboard();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}

	// Anmol for classchainIOS
	public boolean clearAndSendKeysclassChain(MobileElement memberIDios, String fieldValue) {
		try {
			MobileElement webElement = memberIDios;
			clearElement(webElement);
			// webElement.clear();
			webElement.setValue(fieldValue);
			objPojo.getDriver().hideKeyboard();
			return true;
		} catch (Exception exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			return false;
		}
	}

	//Custom Clear and SendKeys For Custom Exception
	public boolean clearAndSendKeysCustomException(By locator, String fieldValue, String FieldName) {
		try {
			MobileElement webElement = getElementFluent(locator);
			clearElement(webElement);
			webElement.clear();
			webElement.setValue(fieldValue);
			objPojo.getDriver().hideKeyboard();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at "+FieldName);
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at "+FieldName);
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception at "+FieldName);
			exception.printStackTrace();
			return false;
		}
	}

	
	
	
	
	
	public boolean clearAndSendKeys(By locator, String fieldValue) {
		try {
			MobileElement webElement = getElementFluent(locator);
			clearElement(webElement);
			webElement.clear();
			webElement.setValue(fieldValue);
			objPojo.getDriver().hideKeyboard();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}

	
	
	
	// Send keys anmol
	public boolean clearAndSendKeysNull(By locator, String fieldValue ,String FieldName) {
		try
		{
		MobileElement webElement = getElementFluent(locator);
		clearElement(webElement);
		webElement.clear();
		webElement.sendKeys(fieldValue);
		objPojo.getDriver().hideKeyboard();
		return true;
		}
		catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception at "+FieldName);
			exception.printStackTrace();
			return false;
		}
	}

	// sample -anmol
	public boolean clearAndSendKeyFnO(By locator, String fieldValue) {
		try {

//			waitForElementPresence(locator);
//			waitForElementVisibilityLocated(locator);
			MobileElement webElement = getElementFluent(locator);
//			clearElement(webElement);
//			webElement.clear();
			webElement.setValue(fieldValue);
//			objPojo.getDriver().hideKeyboard();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}

	// anmol
	public boolean clearAndSendKeysDoneButton(By locator, String fieldValue) {
		try {
			MobileElement webElement = getElementFluent(locator);
			clearElement(webElement);
			// webElement.clear();
			webElement.setValue(fieldValue);
			objPojo.getDriver().findElementByXPath("//XCUIElementTypeButton[@name='Toolbar Done Button']").click();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}

	}

	public void clearElement(MobileElement webElement) {
		/*
		 * Actions navigator = new Actions(objPojo.getDriver());
		 * navigator.click(webElement) .sendKeys(Keys.END) .keyDown(Keys.SHIFT)
		 * .sendKeys(Keys.HOME) .keyUp(Keys.SHIFT) .sendKeys(Keys.BACK_SPACE)
		 * .perform();
		 */
		// webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		webElement.clear();
	}

	public boolean clearElement(By locator) {
		/*
		 * Actions navigator = new Actions(objPojo.getDriver());
		 * navigator.click(webElement) .sendKeys(Keys.END) .keyDown(Keys.SHIFT)
		 * .sendKeys(Keys.HOME) .keyUp(Keys.SHIFT) .sendKeys(Keys.BACK_SPACE)
		 * .perform();
		 */
		// webElement.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		try {
			getElementFluent(locator).clear();
			return true;

		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception");
			exception.printStackTrace();
			return false;
		}
	}

	
	public String fetchValueFromFieldsException(By locator , String FieldName) {
		String text = null;
		try {
			waitForElementPresence(locator);
			WebElement element = getElementFluent(locator);
			text = element.getText().trim();
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception "+FieldName);
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception "+FieldName);
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception "+FieldName);
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException "+FieldName);
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception "+FieldName);
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception "+ FieldName);
		}
		return text;

	}
	
	public String fetchValueFromFields(By locator) {
		String text = null;
		try {
			waitForElementPresence(locator);
			WebElement element = getElementFluent(locator);
			text = element.getText().trim();
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception");
		}
		return text;

	}

	public boolean clickException(By locator ,String LocatorName) {

		try {
			MobileElement webElement = getElementFluent(locator);
			waitForElementPresence(locator);
			waitForElementToBeClickable(locator);
			getElementFluent(locator).click();
			// waitAfterEachClick();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at "+LocatorName);
			System.out.println("I got no such " + exception.getMessage());

			//exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at "+LocatorName);
			System.out.println("I got timeout " + exception.getMessage());
			//exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			objPojo.setCustomException("Element NotFound Exception at "+LocatorName);
			System.out.println("I got timeout " + exception.getMessage());
			//exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException at "+ LocatorName);
			System.out.println("I got timeout " + exception.getMessage());
			//exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception at "+LocatorName);
			System.out.println("I got timeout " + exception.getMessage());
			//exception.printStackTrace();
			return false;
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception at "+LocatorName);
			return false;
		}
	}
	
	public boolean clickWebElement (WebElement web)
	{


		try {

			waitForElementVisibility(web);
			web.click();
			// waitAfterEachClick();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at this point");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception");
			return false;
		}
	
	}
	
	
	
	public boolean click(By locator) {

		try {

			waitForElementPresence(locator);
			waitForElementToBeClickable(locator);
			getElementFluent(locator).click();
			// waitAfterEachClick();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception at this point");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception");
			return false;
		}
	}

//anmol 
	public Boolean clickDone(By locator) {
		try {
			getElementFluent(locator).click();
			objPojo.getDriver().findElementByXPath("//XCUIElementTypeButton[@name='Toolbar Done Button']").click();
			return true;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exceptionJavascript) {
			objPojo.setCustomException("NoSuchElement Exception");
			return false;
		}

	}

	@SuppressWarnings("deprecation")
	public MobileElement getElementFluent(final By locator) throws NoSuchElementException, TimeoutException {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(objPojo.getDriver())
				.withTimeout(webDriverWait, TimeUnit.SECONDS).pollingEvery(fluentPooling, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class).ignoring(InvalidElementStateException.class);
		WebElement webElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return (MobileElement) webElement;
	}

	public boolean checkElementDisplayed(By locator) {
		try {
			this.waitForElementVisibilityLocated(locator);
			return objPojo.getDriver().findElement(locator).isDisplayed();
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public void scrollDown() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.6;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(objPojo.getDriver());
		
		action.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	
	@SuppressWarnings("rawtypes")
	public void scrollDownLong() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.85;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(objPojo.getDriver());
		action.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	
	@SuppressWarnings("rawtypes")
	public void scrollDownForOrders() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.50;
		int scrollStart = screenHeightStart.intValue();
		
		
		Double screenHeightEnd = dimensions.getHeight() * 0.30;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(objPojo.getDriver());
		action.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	
	
	
	public void scrollDownSmall() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.4;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		TouchAction action = new TouchAction(objPojo.getDriver());
		action.longPress(PointOption.point(0, scrollStart)).moveTo(PointOption.point(0, scrollEnd)).release().perform();
	}
	
	
	
	
	
	
	public void scrollDownCustomForProuctList() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.6;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		
		
		Double ScrollxConstant = dimensions.getWidth() * 0.5;
		int scrollWidth = ScrollxConstant.intValue();
		
		TouchAction action = new TouchAction(objPojo.getDriver());
		action.longPress(PointOption.point(scrollWidth, scrollStart)).moveTo(PointOption.point(scrollWidth, scrollEnd)).release().perform();
	}
	
	public void scrollDownLongProuctList() {
		Dimension dimensions = objPojo.getDriver().manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.9;
		int scrollStart = screenHeightStart.intValue();
		Double screenHeightEnd = dimensions.getHeight() * 0.1;
		int scrollEnd = screenHeightEnd.intValue();
		
		
		Double ScrollxConstant = dimensions.getWidth() * 0.5;
		int scrollWidth = ScrollxConstant.intValue();
		
		TouchAction action = new TouchAction(objPojo.getDriver());
		action.longPress(PointOption.point(scrollWidth, scrollStart)).moveTo(PointOption.point(scrollWidth, scrollEnd)).release().perform();
	}
	

	@SuppressWarnings("rawtypes")
	public void scrollRightForCategory(By locator) {
		waitForElementPresence(locator);
		TouchAction action = new TouchAction(objPojo.getDriver());
		MobileElement mobileElement = objPojo.getDriver().findElement(locator);
		int i = mobileElement.getLocation().getY() + (mobileElement.getSize().getHeight() / 2);
		int j = mobileElement.getSize().getWidth() - 200;
		action.press(PointOption.point(j, i)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
				.moveTo(PointOption.point(200, i)).release().perform();
	}
	
	public void scrollRightForPopularBrand(By locator)
	{
		try
		{
		waitForElementPresence(locator);
		Thread.sleep(1000);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(objPojo.getDriver());
		MobileElement mobileElement = objPojo.getDriver().findElement(locator);
		int i = mobileElement.getLocation().getY() + (mobileElement.getSize().getHeight() / 2);
		int j = mobileElement.getSize().getWidth() + 100;
		
		action.press(PointOption.point(j, i)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
				.moveTo(PointOption.point(200, i)).release().perform();
		}
		catch (Exception e) 
		{
			objPojo.setCustomException("Unable to Scroll Right");
		}
	}
	
	public void scrollRightForPopularBrandSample(By locator)
	{
		try
		{
		waitForElementPresence(locator);
		Thread.sleep(1000);
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(objPojo.getDriver());
		MobileElement mobileElement = objPojo.getDriver().findElement(locator);
		int i = mobileElement.getLocation().getY() + (mobileElement.getSize().getHeight() / 2);
		int j = mobileElement.getSize().getWidth() + 80;
		
		action.press(PointOption.point(j, i)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
				.moveTo(PointOption.point(200, i)).release().perform();
		}
		catch (Exception e) 
		{
			objPojo.setCustomException("Unable to Scroll Right");
		}
	}
	
	public void SwipeForCategoryFilter(By locator)
	{
		try
		{
			waitForElementPresence(locator);
			TouchAction action = new TouchAction(objPojo.getDriver());
			MobileElement mobileElement = objPojo.getDriver().findElement(locator);
			int i = mobileElement.getLocation().getY() + (mobileElement.getSize().getHeight() / 5);
			int j = mobileElement.getSize().getWidth() - 300;
			action.press(PointOption.point(j, i)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
					.moveTo(PointOption.point(200, i)).release().perform();
		}
		catch (Exception e) {
			objPojo.setCustomException("Unable to Scroll Right");
		}
	}
	

	public boolean check(By locator, boolean status) {
		try {
			waitForElementPresence(locator);
			MobileElement webElement = objPojo.getDriver().findElement(locator);
			if (webElement.getAttribute("type").equals("checkbox")) {
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					webElement.click();
				if ((webElement.isSelected() && !status) || (!webElement.isSelected() && status))
					this.click(locator);
				return true;
			} else
				return false;
		} catch (NoSuchElementException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got no such " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (TimeoutException exception) {
			objPojo.setCustomException("Timeout & NoSuchElement Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (NotFoundException exception) {
			objPojo.setCustomException("NotFound Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotVisibleException exception) {
			objPojo.setCustomException("ElementNotVisibleException");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotInteractableException exception) {
			objPojo.setCustomException("ElementNotInteractableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (ElementNotSelectableException exception) {
			objPojo.setCustomException("ElementNotSelectableException Exception");
			System.out.println("I got timeout " + exception.getMessage());
			exception.printStackTrace();
			return false;
		} catch (Exception exception) {
			objPojo.setCustomException("NoSuchElement Exception");
			return false;
		}
	}

}
