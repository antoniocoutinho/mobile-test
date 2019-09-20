package pt.antonio.ctappium.page;

        import io.appium.java_client.MobileBy;
        import io.appium.java_client.MobileElement;
        import org.openqa.selenium.By;
        import pt.antonio.ctappium.core.BasePage;

        import static pt.antonio.ctappium.core.DriverFactory.getDriver;


public class FormPage extends BasePage {

    public void writeName(String name){
        write(MobileBy.AccessibilityId("nome"), name);
    }
    public String getInputName(){
        return getText(MobileBy.AccessibilityId("nome"));
    }
    public void selectComboOpt(String opt){
        selectComboOption(MobileBy.AccessibilityId("console"), opt);
    }
    public String getSelectedOpt(){
        return getText(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }
    public void selectInput(){
        clickByElement(MobileBy.AccessibilityId("check"));
    }
    public void selectSwitch(){
        clickByElement(MobileBy.AccessibilityId("switch"));
    }
    public Boolean isInputChecked(){
        return isChecked(MobileBy.AccessibilityId("check"));
    }
    public Boolean isSwitchOn(){
        return isSwitched(MobileBy.AccessibilityId("switch"));
    }
    public void clickSave(){ clickByText("SALVAR"); }
    public void clickSeekBar(double position){
        int delta = 50;
        MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        System.out.println(y);
        int xinitial = seek.getLocation().x + delta;
        int x = (int) (xinitial + ((seek.getSize().width - 2 * delta) * position));
        System.out.println(x);
        tap(x,y);

    }
}
