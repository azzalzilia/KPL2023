package appiumtes;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class calculatorTesting extends tescal {
	

	public static <MobileElement> void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.findElementById("com.android.calculator2:id/digit_1").click();
		driver.findElementById("com.android.calculator2:id/digit_2").click();
		driver.findElementById("com.android.calculator2:id/op_mul").click();
		driver.findElementById("com.android.calculator2:id/digit_3").click();
		driver.findElementById("com.android.calculator2:id/digit_4").click();
		driver.findElementById("com.android.calculator2:id/digit_5").click();
		driver.findElementById("com.android.calculator2:id/eq").click();


	}
}
