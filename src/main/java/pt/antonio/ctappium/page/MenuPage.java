package pt.antonio.ctappium.page;

import pt.antonio.ctappium.core.DSL;

public class MenuPage {
    private DSL dsl = new DSL();

    public void accessForm(){
        dsl.clickByText("Formulário");
    }

}
