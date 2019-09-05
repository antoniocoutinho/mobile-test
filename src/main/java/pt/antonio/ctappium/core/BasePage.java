package pt.antonio.ctappium.core;

import org.openqa.selenium.By;

import static pt.antonio.ctappium.core.DriverFactory.getDriver;

public class BasePage {
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
