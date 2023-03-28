package realDevice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
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
		caps.setCapability("udid", "");
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
		//mCurrentFocus=Window{ab1bd3 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		
		
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		
		// launch a browser and create a session
//		driver = new ChromeDriver();  
		
		
		//Create a appium Seesion
		
		
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		

		
		
		
	}
	

}
