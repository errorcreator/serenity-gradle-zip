package org.serenity.framework.step;

import net.thucydides.core.annotations.Step;
import org.serenity.framework.pages.LoginPage;

public class LoginPageStep {


    private LoginPage loginPage;

    @Step
    public void loginAsUser(String username, String password){
        loginPage.open();
        loginPage.doLogin(username, password);
    }

    @Step
    public String  userShouldBeLogin(){
        return loginPage.getAccountServicesUser();
    }

}
