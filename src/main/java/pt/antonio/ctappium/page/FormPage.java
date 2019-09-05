package pt.antonio.ctappium.page;

        import io.appium.java_client.MobileBy;
        import org.openqa.selenium.By;
        import pt.antonio.ctappium.core.DSL;


public class FormPage {
    private DSL dsl = new DSL();

    public void writeName(String name){
        dsl.write(MobileBy.AccessibilityId("nome"), name);
    }
    public String getInputName(){
        return dsl.getText(MobileBy.AccessibilityId("nome"));
    }
    public void selectComboOpt(String opt){
        dsl.selectComboOption(MobileBy.AccessibilityId("console"), opt);
    }
    public String getSelectedOpt(){
        return dsl.getText(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }
    public void selectInput(){
        dsl.clickByElement(MobileBy.AccessibilityId("check"));
    }
    public void selectSwitch(){
        dsl.clickByElement(MobileBy.AccessibilityId("switch"));
    }
    public Boolean isInputChecked(){
        return dsl.isChecked(MobileBy.AccessibilityId("check"));
    }
    public Boolean isSwitchOn(){
        return dsl.isSwitched(MobileBy.AccessibilityId("switch"));
    }
}
