package com.trios.Pages.Pesquisa;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PesquisarPorAssunto {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("AplicacaoWhatsapp",
                "C:\\Users\\Tamires Cruz\\Downloads\\com.whatsapp_210915007_apps.evozi.com.apk");
        desiredCapabilities.setCapability("deviceName", "Pixel_3_XL_API_28");
        desiredCapabilities.setCapability("uidid", "30.7.4-7453540");
        desiredCapabilities.setCapability("authenticationName", "5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0 (Pie) - API 28");
        desiredCapabilities.setCapability("emulatorVersion", "29.0.11-5598178");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void pesquisarAssunto() {
        MobileElement el2 = (MobileElement) driver.findElementById("com.whatsapp:id/search_input");
        el2.sendKeys("Bola");
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Clear");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.whatsapp:id/search_input");
        el4.sendKeys("Gamgorra");
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Clear");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.whatsapp:id/search_input");
        el6.sendKeys("Churrasco");
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Back");
        el7.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}