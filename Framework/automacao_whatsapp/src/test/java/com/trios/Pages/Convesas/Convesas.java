package com.trios.Pages.Convesas;

import java.net.MalformedURLException;

import com.trios.CapabilityFactory;

import org.junit.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Convesas {
        
        CapabilityFactory capability = new CapabilityFactory();

        @Test
        public void criarNovoContato() throws MalformedURLException {
                capability.setUp();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(639, 1385)).perform();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(184, 325)).perform();
                MobileElement nameEdit = (MobileElement) CapabilityFactory.driver
                                .findElementById("com.samsung.android.app.contacts:id/nameEdit");
                nameEdit.sendKeys("Robert Hammet");

                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(168, 597)).perform();
                MobileElement phoneNumber = (MobileElement) CapabilityFactory.driver.findElementByXPath(
                                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
                phoneNumber.sendKeys("62996275086");

                MobileElement salvar = (MobileElement) CapabilityFactory.driver
                                .findElementById("com.samsung.android.app.contacts:id/smallLabel");
                salvar.click();

                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(61, 112)).perform();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(52, 110)).perform();
                MobileElement voltar = (MobileElement) CapabilityFactory.driver
                                .findElementByAccessibilityId("Navegar para cima");
                voltar.click();
        }

        @Test
        public void NovaConversa() throws MalformedURLException {
                capability.setUp();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(639, 1385)).perform();
                MobileElement voltar = (MobileElement) CapabilityFactory.driver
                                .findElementByAccessibilityId("Navegar para cima");
                voltar.click();
        }

        @Test
        public void EnviarConversa() throws MalformedURLException {
                capability.setUp();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(637, 1388)).perform();
                (new TouchAction<>(CapabilityFactory.driver)).press(PointOption.point(714, 204))
                                .moveTo(PointOption.point(714, 296)).release().perform();

                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(183, 1000)).perform();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(160, 1421)).perform();
                MobileElement mensagem = (MobileElement) CapabilityFactory.driver
                                .findElementById("com.whatsapp:id/entry");
                mensagem.sendKeys("TestandoEnvio da Mensagem");
                MobileElement envio = (MobileElement) CapabilityFactory.driver.findElementByAccessibilityId("Enviar");
                envio.click();
        }

        @Test
        public void ValidarEnvioAudio() throws MalformedURLException {
                capability.setUp();
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(203, 1422)).perform();
                (new TouchAction<>(CapabilityFactory.driver))
                  .press(PointOption.point(670,1422))
                  .moveTo(PointOption.point(667,1276)).release()
                  .perform();
                  
                (new TouchAction<>(CapabilityFactory.driver))
                  .press(PointOption.point(null))
                  .moveTo(PointOption.point(670, 1415))
                  .release()
                  .perform();
                  
                (new TouchAction<>(CapabilityFactory.driver))
                  .press(PointOption.point(670, 1411))
                  .moveTo(PointOption.point(652,1233))
                  .release()
                  .perform();
                  
                (new TouchAction<>(CapabilityFactory.driver))
                  .press(PointOption.point(663, 1415))
                  .moveTo(PointOption.point(656,1176))
                  .release()
                  .perform();
                  
                (new TouchAction<>(CapabilityFactory.driver)).tap(PointOption.point(652, 1422)).perform();    
        }
}
