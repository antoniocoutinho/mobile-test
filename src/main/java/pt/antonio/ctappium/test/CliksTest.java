package pt.antonio.ctappium.test;

import org.junit.Assert;
import org.junit.Test;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.ClicksPage;
import pt.antonio.ctappium.page.MenuPage;

public class CliksTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private ClicksPage page = new ClicksPage();

    @Test
    public void shouldPerformLongClick(){

        menu.accessClicks();
        page.longClick();

        Assert.assertEquals("Clique Longo",page.getClickText());

    }
}
