package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRS_Elements extends ParentPage{

    public OpenMRS_Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "username")
    public WebElement usernamePlc;
    @FindBy(id = "password")
    public WebElement passwordPlc;
    @FindBy(id = "loginButton")
    public WebElement loginButton;
}
