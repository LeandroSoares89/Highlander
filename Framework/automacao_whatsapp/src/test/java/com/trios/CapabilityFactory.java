package com.trios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CapabilityFactory {
    
   public static AndroidDriver<?> driver;


    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("Whatsapp", "G:\\Documents\\WhatsApp.apk");
        desiredCapabilities.setCapability("deviceName", "SM_A205G");
        desiredCapabilities.setCapability("uidid", "RX8M50LQW1T");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<>(remoteUrl, desiredCapabilities);
    }


}
