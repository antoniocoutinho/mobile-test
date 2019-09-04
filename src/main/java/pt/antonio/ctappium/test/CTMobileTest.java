package test;

import core.DSL;
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
    private DSL dsl = new DSL();

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
        dsl.write(MobileBy.AccessibilityId("nome"), "Antonio");
        String inputName = dsl.getText(MobileBy.AccessibilityId("nome"));
        //Check
        Assert.assertEquals("Antonio" , inputName );

    }


    @Test
    public void testComboBox() {

        //Click Combo
        dsl.selectComboOption(MobileBy.AccessibilityId("console"), "PS4");

        /*
        String optionSelected = driver.findElement(MobileBy.AccessibilityId("console")).findElement(By.className("android.widget.TextView")).getText();
        or
        String optionSelected = driver.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
        */

        String optionSelected = dsl.getText(By.xpath("//android.widget.Spinner/android.widget.TextView"));

        //Check
        Assert.assertEquals("PS4" , optionSelected);

    }

    @Test
    public void testCkeckInput(){

        //Click on Elements
        dsl.clickByElement(MobileBy.AccessibilityId("check"));
        dsl.clickByElement(MobileBy.AccessibilityId("switch"));

        //Assertion
        Assert.assertTrue(dsl.isChecked(MobileBy.AccessibilityId("check")));
        Assert.assertFalse(dsl.isSwitched(MobileBy.AccessibilityId("switch")));
    }
}
