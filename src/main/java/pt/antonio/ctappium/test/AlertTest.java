package pt.antonio.ctappium.test;


import org.junit.Assert;
import org.junit.Test;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.AlertPage;
import pt.antonio.ctappium.page.MenuPage;

public class AlertTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertPage page = new AlertPage();

    @Test
    public void testAlerts(){

        menu.accessAlerts();
        page.clickSimpleAlert();
        waitInSec(1);
        page.clickOutsideBox();
        Assert.assertFalse(page.isTextVisible("Pode clicar no OK ou fora da caixa para sair"));
    }
}
