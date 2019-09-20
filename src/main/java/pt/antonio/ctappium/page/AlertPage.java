package pt.antonio.ctappium.page;

import pt.antonio.ctappium.core.BasePage;

public class AlertPage extends BasePage {

    public void clickSimpleAlert(){
        clickByText("ALERTA SIMPLES");
    }
    public void clickOutsideBox(){
        tap(100, 150);
    }
}
