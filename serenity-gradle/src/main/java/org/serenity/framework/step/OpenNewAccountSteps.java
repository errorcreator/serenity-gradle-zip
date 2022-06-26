package org.serenity.framework.step;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.serenity.framework.pages.OpenNewAccountPage;

public class OpenNewAccountSteps extends PageObject {

    private OpenNewAccountPage openNewAccountPage;

    @Step
    public void userCreateNewAccount(){
        openNewAccountPage.navigateToOpenNewAccount();
        openNewAccountPage.openNewAccount();
    }

    @Step
    public String isAccountOpened(){
       return openNewAccountPage.getNewAccNbr();
    }


}
