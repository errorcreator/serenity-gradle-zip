package org.serenity.framework.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {

    public void isLogoVisible() {
        shouldBeVisible(By.className("logo img-responsive"));
    }

    public void doProductSearch(){
        typeInto($("#search_query_top"), "Jeans");
        $("form#searchbox").click();
        waitABit(5000);
    }
}
