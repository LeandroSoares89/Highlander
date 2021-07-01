package com.trios.Pages.CriarContato;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ValidarCriarContato {

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
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @Test
        public void validarRedirecionamentoCriarContato() {
                MobileElement el1 = (MobileElement) driver
                                .findElementByXPath("(//android.widget.TextView[@content-desc=\"WhatsApp\"])[2]");
                el1.click();
                MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("New chat");
                el2.click();
                MobileElement el3 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
                el3.click();
                MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Cancel");
                el4.click();

        }

        @Test
        public void VerificarCriarContato() {
                MobileElement createChat = (MobileElement) driver.findElementByAccessibilityId("New chat");
                createChat.click();
                MobileElement el1 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
                el1.click();
                MobileElement el2 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[1]");
                el2.sendKeys("Tamires");
                MobileElement el3 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]");
                el3.sendKeys("Cruz");
                MobileElement el4 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
                el4.sendKeys("81997352866");
                MobileElement el5 = (MobileElement) driver
                                .findElementById("com.android.contacts:id/editor_menu_save_button");
                el5.click();

        }

        @Test
        public void validarSalvarApenasTelefone() {
                MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New chat");
                el1.click();
                MobileElement el2 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");
                el2.click();
                MobileElement el3 = (MobileElement) driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
                el3.sendKeys("81 98564-0000");
                MobileElement el4 = (MobileElement) driver
                                .findElementById("com.android.contacts:id/editor_menu_save_button");
                el4.click();

        }

        @After
        public void tearDown() {
                driver.quit();
        }
}