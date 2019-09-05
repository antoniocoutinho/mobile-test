package pt.antonio.ctappium.core;

import org.junit.After;
import org.junit.AfterClass;

public class BaseTest {

    @After
    public void endClass(){
        DriverFactory.getDriver().resetApp();
    }

    @AfterClass
    public static void tearnDown(){
        DriverFactory.killDriver();
    }
}
