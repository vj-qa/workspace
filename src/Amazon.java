package mobile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Amazon {

	public void testApp(){
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Samsung c08084c12320daf");
	}


}
