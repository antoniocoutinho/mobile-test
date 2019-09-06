package pt.antonio.ctappium.page;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pt.antonio.ctappium.core.BasePage;

import java.util.concurrent.TimeUnit;

import static pt.antonio.ctappium.core.DriverFactory.*;

public class SplashPage extends BasePage {

    public Boolean isSplashVisible(){
       return isTextVisible("Splash!");
    }
    public void waitSplashDisappear(){
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(),20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
    }
}
