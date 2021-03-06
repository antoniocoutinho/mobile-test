package pt.antonio.ctappium.core;

import io.appium.java_client.TouchAction;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class BaseTest {

    @Rule
    public TestName testName = new TestName();

    @Before
    public void getMobileElementAndroidDriver(){
        getDriver();
    }

    @After
    public void endClass(){
        generateScreenShot();
        getDriver().resetApp();
    }

    @AfterClass
    public static void tearnDown(){
        DriverFactory.killDriver();
    }

    public void generateScreenShot(){

        try {
            File image = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("target\\screenshot\\"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void waitInSec(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
