package pt.antonio.ctappium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void getMobileElementAndroidDriver(){
        DriverFactory.getDriver();
    }

    @After
    public void endClass(){
        generateScreenShot();
        DriverFactory.getDriver().resetApp();
    }

    @AfterClass
    public static void tearnDown(){
        DriverFactory.killDriver();
    }

    public void generateScreenShot(){

        try {
            File image = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("target\\screenshot\\"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
