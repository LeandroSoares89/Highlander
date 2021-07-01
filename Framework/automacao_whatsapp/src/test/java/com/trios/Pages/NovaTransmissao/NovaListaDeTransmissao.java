package com.trios.Pages.NovaTransmissao;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NovaListaDeTransmissao {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("AplicacaoWhatsapp", "C:\\Users\\Tamires Cruz\\Downloads\\com.whatsapp_210915007_apps.evozi.com.apk");
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
  public void novaTransmissao() {
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("More options");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView[1]");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[7]/android.widget.LinearLayout/android.widget.TextView[1]");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[6]/android.widget.LinearLayout/android.widget.TextView[1]");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Create");
    el6.click();
    MobileElement el7 = (MobileElement) driver.findElementById("com.whatsapp:id/whatsapp_toolbar_home");
    el7.click();
    
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
