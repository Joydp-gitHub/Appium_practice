package recap;

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

public class CalculatorApp extends BaseTest{
	
	//priority ------ 0
	//priority is same ----- by default as per naming conv ----- as per ascii value
	
	
	@Test
	public void verifyAddTest() {
		
		System.out.println("add test case");
		
		//clear the result
		ad.findElement(By.id("clr")).click();
		
		//identification
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on plus icon
		ad.findElement(By.id("op_add")).click();
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		ad.findElement(By.id("eq")).click();
		
		
		String actualResult = ad.findElement(By.id("result_final")).getText();
		String attributeClass = ad.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Results are: " + actualResult);
		System.out.println("attributeClass are: " + attributeClass);	//android.widget.TextView
		
		Assert.assertTrue(attributeClass.contains("TextView"));
		Assert.assertEquals(actualResult, "1996");
	}
	
	@Test
	public void verifyMulTest() {
		
		System.out.println("Mul test case");
		
		//clear the result
		ad.findElement(By.id("clr")).click();
		
		//identification
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on multiply icon
		ad.findElement(By.id("op_mul")).click();
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		ad.findElement(By.id("eq")).click();
		
		
		String actualResult = ad.findElement(By.id("result_final")).getText();
		String attributeClass = ad.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Results are: " + actualResult);
		System.out.println("attributeClass are: " + attributeClass);	//android.widget.TextView
		
		Assert.assertTrue(attributeClass.contains("TextView"));
		Assert.assertEquals(actualResult, "996004");
	}
	
	@Test
	public void verifyDivTest() {
		
		System.out.println("Div test case");
		
		//clear the result
		ad.findElement(By.id("clr")).click();
		
		//identification
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on division icon
		ad.findElement(By.id("op_div")).click();
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on equal icon
		ad.findElement(By.id("eq")).click();
		
		
		String actualResult = ad.findElement(By.id("result_final")).getText();
		String attributeClass = ad.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Results are: " + actualResult);
		System.out.println("attributeClass are: " + attributeClass);	//android.widget.TextView
		
		Assert.assertTrue(attributeClass.contains("TextView"));
		Assert.assertEquals(actualResult, "1");
	}
	
	
	@Test
	public void verifySubTest() {
		
		System.out.println("Sub test case");
		
		//clear the result
		ad.findElement(By.id("clr")).click();
		
		//identification
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_8")).click();
		
		//click on Subtraction icon
		ad.findElement(By.id("op_sub")).click();
		
		ad.findElement(By.id("digit_9")).click();
		ad.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		ad.findElement(By.id("digit_7")).click();
		
		//click on equal icon
		ad.findElement(By.id("eq")).click();
		
		
		String actualResult = ad.findElement(By.id("result_final")).getText();
		String attributeClass = ad.findElement(By.id("result_final")).getAttribute("class");
		
		System.out.println("Results are: " + actualResult);
		System.out.println("attributeClass are: " + attributeClass);	//android.widget.TextView
		
		Assert.assertTrue(attributeClass.contains("TextView"));
		Assert.assertEquals(actualResult, "1");
	}

}
