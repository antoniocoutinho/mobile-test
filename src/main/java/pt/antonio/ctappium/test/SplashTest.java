package pt.antonio.ctappium.test;

import org.junit.Assert;
import org.junit.Test;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.MenuPage;
import pt.antonio.ctappium.page.SplashPage;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage page = new SplashPage();

    @Test
    public void isSplashPageDisappearing(){

        menu.accessSplash();
        page.isSplashVisible();
        page.waitSplashDisappear();
        Assert.assertTrue(page.isTextVisible("Formulário"));
    }
}
