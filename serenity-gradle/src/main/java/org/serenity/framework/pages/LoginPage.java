package org.serenity.framework.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {


    By userNameInput = By.xpath("//input[@name='username']");
    By passwordInput = By.xpath("//input[@name='password']");
    By loginBtn = By.cssSelector("input.button");

    By welcome = By.xpath("//h1[@class='title'] ");


    public void doLogin(String username, String password){
        find(userNameInput).sendKeys(username);
        find(passwordInput).type(password);
        find(loginBtn).click();
    }

    public String getAccountServicesUser(){
        return find(welcome).getText();
    }


}
