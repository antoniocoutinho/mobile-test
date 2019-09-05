package pt.antonio.ctappium.page;

        import io.appium.java_client.MobileBy;
        import org.openqa.selenium.By;
        import pt.antonio.ctappium.core.BasePage;


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
}
