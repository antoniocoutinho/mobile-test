package core;

import static core.DriverFactory.*;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class DSL {

    public void write(By by, String text){
        getDriver().findElement(by).sendKeys(text);

    }
    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public void clickByText(String text){
        getDriver().findElement(By.xpath("//*[@text='"+text+"']")).click();
    }
    public void selectComboOption(By by, String option){
        getDriver().findElement(by).click();
        clickByText(option);
    }
    public void clickByElement(By by){
        getDriver().findElement(by).click();
    }
    public boolean isChecked(By by){
        return getDriver().findElement(by)
                .getAttribute("checked")
                .equals("true");
    }
    public boolean isSwitched(By by){
        return getDriver().findElement(by)
                .getAttribute("checked")
                .equals("true");
    }
}
