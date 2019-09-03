package appium;

import core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CTMobileTest {

    private AndroidDriver<MobileElement> driver;

    @Before
    public void getMobileElementAndroidDriver(){
        driver =DriverFactory.getDriver();
        MobileElement formBtt =  driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
        formBtt.click();
    }

    @After
    public void tearDown(){
        DriverFactory.getDriver().resetApp();
    }
    @AfterClass
    public static void endClass(){
        DriverFactory.killDriver();
    }

    @Test
    public void testInputName(){

        //Select desired option
        driver.findElement(MobileBy.AccessibilityId("nome")).sendKeys("Antonio");

        String inputName = driver.findElement(MobileBy.AccessibilityId("nome")).getText();

        //Check
        Assert.assertEquals("Antonio" , inputName );

    }


    @Test
    public void testComboBox() {

        //Click Combo
        driver.findElement(MobileBy.AccessibilityId("console")).click();

        //Select desired option
        driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']")).click();

        /*
        String optionSelected = driver.findElement(MobileBy.AccessibilityId("console")).findElement(By.className("android.widget.TextView")).getText();
        or
        String optionSelected = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
        */

        String optionSelected = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();

        //Check
        Assert.assertEquals("PS4" , optionSelected);
    }

    @Test
    public void testCkeckInput(){

        //Verify Elements Status
        MobileElement ch = driver.findElement(MobileBy.AccessibilityId("check"));
        MobileElement sw = driver.findElement(MobileBy.AccessibilityId("switch"));

        //Click on Elements
        ch.click();
        sw.click();

        //Assertion
        Assert.assertTrue(ch.getAttribute("checked").equals("true"));
        Assert.assertTrue(sw.getAttribute("checked").equals("false"));
    }
}
