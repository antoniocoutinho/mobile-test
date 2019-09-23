package pt.antonio.ctappium.page;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import pt.antonio.ctappium.core.BasePage;
import pt.antonio.ctappium.core.DriverFactory;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class ClicksPage extends BasePage {

    public void longClick(){
        new TouchAction(getDriver()).
                longPress(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))).
                perform();
    }
    public void clickTwice(){
        clickByText("Clique duplo");
        clickByText("Clique duplo");
    }
    public String getClickText(){
        return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
