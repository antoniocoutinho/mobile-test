package pt.antonio.ctappium.page;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import pt.antonio.ctappium.core.BasePage;

import java.time.Duration;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class SwipePage extends BasePage {

    public boolean checkFistSwipeScreen(){
        return isTextVisible("Mova a tela para");
    }
    public boolean checkSecondSwipeScreen(){
        return isTextVisible("E veja se");
    }
    public boolean checkLastSwipeScreen(){
        return isTextVisible("Chegar até o fim!");
    }
}
