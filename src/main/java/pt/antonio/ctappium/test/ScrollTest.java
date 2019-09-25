package pt.antonio.ctappium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pt.antonio.ctappium.core.BasePage;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.core.DriverFactory;
import pt.antonio.ctappium.page.MenuPage;
import sun.nio.cs.ext.MacCentralEurope;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class ScrollTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private BasePage page = new BasePage();

    @Test
    public void shouldFindHiddenOptionTest(){

        WebDriverWait wait = new WebDriverWait(getDriver(),1);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='About...!']")));

        page.scroll(0.9, 0.1);
        menu.accessHiddenOption();

        Assert.assertTrue(page.isTextVisible("Você achou essa opção"));
    }
}
