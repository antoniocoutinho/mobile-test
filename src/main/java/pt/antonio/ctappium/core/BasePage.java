package pt.antonio.ctappium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;

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
    public Boolean isTextVisible(String text){
        return getDriver().findElements(By.xpath("//*[@text='"+text+"']")).size() > 0;
    }
    public void tap(int x, int y){
        new TouchAction(getDriver()).tap(x, y).perform();
    }

    public void scrollDown(){
        scroll(0.1, 0.9);
    }

    public void scrollUp(){
        scroll(0.9, 0.1);
    }

    public void swipeRight(){
        swipe(0.9, 0.1);
    }

    public void swipeLeft(){
        swipe(0.1, 0.9);
    }

    public void scroll(double start, double end){
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width / 2;
        int start_y = (int)(size.height * start);
        int end_y = (int) (size.height  * end);

        new TouchAction(getDriver())
                .press(x, start_y)
                .waitAction(Duration.ofMillis(500))
                .moveTo(x, end_y)
                .release()
                .perform();
    }
    public void swipe(double start, double end){
        Dimension size = getDriver().manage().window().getSize();

        int y = size.height / 2;
        int start_x = (int)(size.width * start);
        int end_x = (int) (size.width * end);

        new TouchAction(getDriver())
                .press(start_x, y)
                .waitAction(Duration.ofMillis(500))
                .moveTo(end_x, y)
                .release()
                .perform();
    }
}
