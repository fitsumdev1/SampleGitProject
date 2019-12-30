package Maven;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MavenP {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cp.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cp.setCapability("appPackage", "com.google.android.apps.messaging");
		cp.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, cp);
		Thread.sleep(4000);
		driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("2144362331");
		Thread.sleep(2000);
		System.out.println("Checking the git code");
		
		
		
		
	}

}
