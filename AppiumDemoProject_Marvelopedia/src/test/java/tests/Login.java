import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
    public static void main(String[] args) {
        // Set the desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S10");
		caps.setCapability(MobileCapabilityType.UDID, "RQ8M30AR93T");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Laila Bernardon\\Downloads\\marvelopedia.apk");

        // Initialize the Android driver
        AndroidDriver<MobileElement> driver;
        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        // Find the login elements
        MobileElement usernameField = driver.findElement(By.id("usernameField"));
        MobileElement passwordField = driver.findElement(By.id("passwordField"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        // Enter the login credentials
        usernameField.sendKeys("laila.bernardon@outlook.com");
        passwordField.sendKeys("123456");

        // Click on the login button
        loginButton.click();

        // Verify the successful login
        MobileElement welcomeMessage = driver.findElement(By.id("com.example.app:id/welcomeMessage"));
        String message = welcomeMessage.getText();
        if (message.equals("Welcome, User!")) {
            System.out.println("Login test passed!");
        } else {
            System.out.println("Login test failed!");
        }

        // Close the driver
        driver.quit();
    }
}
