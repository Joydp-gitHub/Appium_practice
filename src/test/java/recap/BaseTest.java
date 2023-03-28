package recap;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
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
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		//Server Details
		//creating a appiumDriver session
		
		ad = new AppiumDriver<MobileElement>(new URL(appiumServer), caps );
		
		
		
	}

}
