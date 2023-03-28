package virtualDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ClockApp {
	
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("setup configuration");
		
		String appiumServer = "http://localhost:4723/wd/hub";
		
		
		
		//Device speicific info
		//adb devices
//		List of devices attached
//		emulator-5554   device 
		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		
		
		
		//Application specific info
		
		//app1
		//using APK info --- playstore
		
		//appPackage
		//appActivity
		
		
		
		
		//app2
		//adb shell dumpsys window | find "mCurrentFocus"
		
		//Calculator
		//mCurrentFocus=Window{ab1bd3 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		
		//clock
		// mCurrentFocus=Window{1c50d17 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		
		
		// launch a browser and create a session
//		driver = new ChromeDriver();  
		
		
		//Create a appium Seesion
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		

		
		
		
	}
	
	
	
	@Test
	public void verifyAppTest() {

		System.out.println("clock test case");
		
		String actualDate = driver.findElement(By.id("date")).getText();
		System.out.println("Actual Date: " + actualDate);
		
		Assert.assertTrue(actualDate.contains("Mar"));
		
		
	}

}
