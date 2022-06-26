package org.serenity.framework;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.serenity.framework.pages.LogoutPage;
import org.serenity.framework.step.LoginPageStep;
import org.serenity.framework.step.OpenNewAccountSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {


    @Managed(driver="chrome")
    private WebDriver browser;

    @Steps
    private LoginPageStep loginPageStep;

    @Steps
    private OpenNewAccountSteps openNewAccount;

    @Steps
    private LogoutPage logout;


//    @Title("Navigate to signIn page and enter user credentials")
//    @Test
//    public void isUserLoggedin(){
//        loginPageStep.loginAsUser("AutoUser", "AutoUser");
//        Assert.assertEquals("User should be able to login successfully", "Accounts Overview", loginPageStep.userShouldBeLogin());
//
//    }

    @Test
    public void accountCreation(){
        loginPageStep.loginAsUser("AutoUser", "AutoUser");
        Assert.assertEquals("User should be able to login successfully", "Accounts Overview", loginPageStep.userShouldBeLogin());
        openNewAccount.userCreateNewAccount();
        Assert.assertTrue(openNewAccount.isAccountOpened() != "");
    }

    @After
    public void userLogout(){
        logout.setLogOut();
    }


}
