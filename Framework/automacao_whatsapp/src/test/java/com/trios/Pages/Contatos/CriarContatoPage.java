package com.trios.Pages.Contatos;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
//import junit.framework.TestCase;
//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CriarContatoPage {

    static AndroidDriver<?> driver;

    @Before
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

    @Test
    public void sampleTest() {
        (new TouchAction<>(driver)).tap(PointOption.point(639, 1385)).perform();
        (new TouchAction<>(driver)).tap(PointOption.point(184, 325)).perform();
        MobileElement nameEdit = (MobileElement) driver.findElementById("com.samsung.android.app.contacts:id/nameEdit");
        nameEdit.sendKeys("Lars Ulrich");
        
        (new TouchAction<>(driver)).tap(PointOption.point(168, 597)).perform();
        MobileElement phoneNumber = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
        phoneNumber.sendKeys("62996255056");
        
        MobileElement salvar = (MobileElement) driver.findElementById("com.samsung.android.app.contacts:id/smallLabel");
        salvar.click();
        
        (new TouchAction<>(driver)).tap(PointOption.point(61, 112)).perform();
        (new TouchAction<>(driver)).tap(PointOption.point(52, 110)).perform();
        MobileElement voltar = (MobileElement) driver.findElementByAccessibilityId("Navegar para cima");
        voltar.click();
    }
}
