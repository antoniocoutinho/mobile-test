package pt.antonio.ctappium.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.core.DriverFactory;
import pt.antonio.ctappium.page.FormPage;
import pt.antonio.ctappium.page.MenuPage;

public class FormTest extends BaseTest {
    private AndroidDriver<MobileElement> driver;
    private MenuPage menuPage = new MenuPage();
    private FormPage page = new FormPage();

    @Before
    public void getMobileElementAndroidDriver(){
        driver = DriverFactory.getDriver();
        menuPage.accessForm();
    }

    @Test
    public void testInputName(){

        page.writeName("Antonio");
        Assert.assertEquals("Antonio" , page.getInputName());

    }


    @Test
    public void testComboBox() {

        page.selectComboOpt("PS4");
        Assert.assertEquals("PS4" , page.getSelectedOpt());

    }

    @Test
    public void testCkeckInput(){

        page.selectInput();
        page.selectSwitch();

        Assert.assertTrue(page.isInputChecked());
        Assert.assertFalse(page.isSwitchOn());
    }

}