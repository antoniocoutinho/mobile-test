package pt.antonio.ctappium.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.MenuPage;
import pt.antonio.ctappium.page.SwipePage;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class SwipeTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SwipePage page = new SwipePage();

    @Test
    public void swipeTest(){
        menu.accessSwipe();
        Assert.assertTrue(page.checkFistSwipeScreen());
        swipe(0.9, 0.1);
        Assert.assertTrue(page.checkSecondSwipeScreen());
        page.clickByText("›");
        Assert.assertTrue(page.checkLastSwipeScreen());
        swipe(0.1, 0.9);
        page.clickByText("‹");
        Assert.assertTrue(page.checkFistSwipeScreen());
    }

}
