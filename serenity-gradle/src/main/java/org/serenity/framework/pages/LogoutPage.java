package org.serenity.framework.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    By logOut = By.xpath("//a[contains(text(),'Log Out')]");

    @Step
    public void setLogOut(){
        find(logOut).click();
    }
}
