package com.mobApp.Tabyt;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

/**
 * Hello world!
 *
 */
public class Baseclass {
	
	
	@BeforeMethod
	public void main() throws MalformedURLException, URISyntaxException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 3a XL API 35");
		options.setApp(System.getProperty("user.dir") + "\\src\\test\\resource\\builds\\ORG 31-July.apk");

		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);

	}
}
