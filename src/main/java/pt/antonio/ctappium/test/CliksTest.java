package pt.antonio.ctappium.test;

import org.junit.Assert;
import org.junit.Test;
import pt.antonio.ctappium.core.BasePage;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.ClicksPage;
import pt.antonio.ctappium.page.MenuPage;

public class CliksTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private ClicksPage page = new ClicksPage();
    private BasePage basePage = new BasePage();

    @Test
    public void shouldPerformLongClick(){

        menu.accessClicks();
        page.longClick();
        Assert.assertEquals("Clique Longo",page.getClickText());

    }

    @Test
    public void shouldClickTwice(){
        menu.accessClicks();
        page.clickTwice();
        Assert.assertTrue(basePage.isTextVisible("Duplo Clique"));
    }
}
