package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9PKQ1.180917.001");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "REDMI 6_PRO");
		dc.setCapability(MobileCapabilityType.UDID, "4c88ce520905");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//dc.setCapability(MobileCapabilityType.APP, "");
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"CHROME");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
		dc.setCapability("appPackage", "com.whatsapp");
		dc.setCapability("appActivity", "com.whatsapp.MessageReplyActivity-Whatsapp");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\manish\\Desktop");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
	
		driver=new AppiumDriver<MobileElement>(url, dc);
		Thread.sleep(5000);
	//	driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
		//driver.get("https://m.facebook.com/");
	}
	

	
	@AfterTest
	public void TearDown() {
		
		
	}
	
	
}
