package pt.antonio.ctappium.test;

import pt.antonio.ctappium.core.DSL;
import pt.antonio.ctappium.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import pt.antonio.ctappium.page.MenuPage;

public class CTMobileTest {

    private AndroidDriver<MobileElement> driver;
    private DSL dsl = new DSL();
    private MenuPage menuPage = new MenuPage();

    @Before
    public void getMobileElementAndroidDriver(){
        driver =DriverFactory.getDriver();
        menuPage.accessForm();
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
