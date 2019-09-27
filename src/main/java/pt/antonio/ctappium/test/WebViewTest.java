package pt.antonio.ctappium.test;

import org.junit.Test;
import pt.antonio.ctappium.core.BaseTest;
import pt.antonio.ctappium.page.MenuPage;
import pt.antonio.ctappium.page.WebViewPage;

public class WebViewTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private WebViewPage page = new WebViewPage();

    @Test
    public void webViewTest(){

        //Access menu
        menu.accessHybrid();

        //fill name field
        page.contextHandler();

        //fill email field

        //fill password field

        //Clik on Cadastrar
    }

}
