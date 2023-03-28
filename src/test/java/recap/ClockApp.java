package recap;

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
	AppiumDriver<MobileElement> ad ;
	
	@BeforeTest
	public void setup() throws Exception {
		
		System.out.println("setup configuration");
		
		String appiumServer = "http://192.168.1.5:4723/wd/hub";
		
		
		
		//adb command
//		adb devices
//		List of devices attached
//		emulator-5554   device
		
		
		//Device Details
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		
		//Application Details
		
		//app1 ---- using APK info
		
		//app2 ---- adb shell dumpsys window | find "mCurrentFocus"
//		adb shell dumpsys window | find "mCurrentFocus"
//		  mCurrentFocus=Window{cf0ac71 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		//com.google.android.deskclock/com.android.deskclock.DeskClock
		
		caps.setCapability("appPackage", "com.google.android.deskclock");
		caps.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		
		//Server Details
		//creating a appiumDriver session
		
		ad = new AppiumDriver<MobileElement>(new URL(appiumServer), caps );
		
		
		
	}
	
	@Test
	public void verifyDateTest() {
		
		String actualDate = ad.findElement(By.id("date")).getText();
	
		System.out.println("Current date: " + actualDate);

		
		Assert.assertTrue(actualDate.contains("Mar"));
	}

}
