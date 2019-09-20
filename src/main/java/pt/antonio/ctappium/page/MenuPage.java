package pt.antonio.ctappium.page;

import pt.antonio.ctappium.core.BasePage;

public class MenuPage extends BasePage {

    public void accessForm(){
        clickByText("Formulário");
    }
    public void accessSplash(){
        clickByText("Splash");
    }
    public void accessAlerts(){
        clickByText("Alertas");
    }

}
