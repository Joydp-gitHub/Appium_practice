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

public class CalcualtorNativeApp extends BaseTest{
	
	
	@Test
	public void verifyAppTest() {

		System.out.println("add test case");
		
		
		
		//
		
		
		
		//click on nine - 998
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		
		//click on plus icon
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		
		
		//889
		driver.findElement(By.id("digit_8")).click();
		
		driver.findElement(By.id("digit_9")).click();
		
		driver.findElement(By.id("digit_2")).click();
		
		//click on equal
		driver.findElement(By.id("eq")).click();
		
		
		
		//Validate Add Test Results
		
		String actualResult = driver.findElement(By.id("result_final")).getText();
		
		System.out.println("Addition test Results are: " + actualResult);
		
		Assert.assertEquals(actualResult, "1890");
		
	}

}
