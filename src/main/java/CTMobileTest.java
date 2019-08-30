import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CTMobileTest {


    @Test
    public void testInputName() throws MalformedURLException{

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\IdeaProjects\\androidtest\\src\\main\\resources\\CTAppium-1-1.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select form
        //List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='Formulário']"));
        MobileElement formBtt =  driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
        formBtt.click();

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
        driver.quit();

    }
    @Test
    public void testComboBox() throws MalformedURLException{

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\IdeaProjects\\androidtest\\src\\main\\resources\\CTAppium-1-1.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select form
        //List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='Formulário']"));
        MobileElement formBtt =  driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
        formBtt.click();

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
        driver.quit();
    }

    @Test
    public void testCkeckInput() throws MalformedURLException{

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\User\\IdeaProjects\\androidtest\\src\\main\\resources\\CTAppium-1-1.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select form
        //List<MobileElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='Formulário']"));
        MobileElement formBtt =  driver.findElement(By.xpath("//android.widget.TextView[@text='Formulário']"));
        formBtt.click();

        //Verify Elements Status
        driver.findElement(MobileBy.AccessibilityId("check")).isDisplayed();

        //Click on Elements
        driver.findElement(MobileBy.AccessibilityId("check")).click();

        Assert.assertTrue(driver.findElement(MobileBy.AccessibilityId("check")).isEnabled());

        driver.quit();
    }
}
