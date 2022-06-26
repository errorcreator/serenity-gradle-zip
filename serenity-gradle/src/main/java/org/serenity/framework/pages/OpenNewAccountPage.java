package org.serenity.framework.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenNewAccountPage extends PageObject {

    By openNewAcc = By.xpath("//a[contains(text(),'Open New Account')]");

    public void navigateToOpenNewAccount(){
        find(openNewAcc).click();
    }

    public void openNewAccount(){
        $(By.id("type")).selectByVisibleText("SAVINGS");
        element(By.id("//*[@id='fromAccountId']")).selectByIndex(1);
        find(By.xpath("//*[@value='Open New Account']")).click();
    }

    public String getNewAccNbr(){
        Serenity.takeScreenshot();
        return $("#newAccountId").getText();
    }

}
