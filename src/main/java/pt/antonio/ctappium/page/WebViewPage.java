package pt.antonio.ctappium.page;

import pt.antonio.ctappium.core.BasePage;
import pt.antonio.ctappium.core.DriverFactory;

import java.util.Set;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class WebViewPage extends BasePage {

    public void contextHandler(){
        Set<String> contexts = getDriver().getContextHandles();
        for(String context: contexts){
            System.out.println(context);
        }
    }
}
