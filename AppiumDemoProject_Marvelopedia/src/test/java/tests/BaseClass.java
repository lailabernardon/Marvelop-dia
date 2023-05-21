package tests;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass<MobileElement> {
	AppiumDriver driver;
	@BeforeTest
	public void setup() {
		
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("Marvelopédia", "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S10");
		caps.setCapability(MobileCapabilityType.UDID, "RQ8M30AR93T");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Laila Bernardon\\Downloads\\marvelopedia.apk");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		///URL url = new URL("http://0.0.0.0:4723/wd/hub");
		//driver = new AppiumDriver(url, caps);
		//driver = new AndroidDriver(url, caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is: "+exp.getCause());
			System.out.println("Cause is: "+exp.getMessage());
			exp.printStackTrace();
			
		}
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
