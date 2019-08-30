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
    public void testAppium() throws MalformedURLException{

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

        //Write Name
        MobileElement name = driver.findElement(MobileBy.AccessibilityId("nome"));
        name.sendKeys("Antonio");

        //Check Name
        Assert.assertEquals(name.getText(), "Antonio");
        driver.quit();


    }
}
