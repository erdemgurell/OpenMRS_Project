package US_405;

import Utility.BaseDriver;
import Utility.OpenMRS_Elements;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccount extends BaseDriver {

    @Test
    public void myAccountTest(){
        Actions act=new Actions(driver);
        ome.mySendKeys(ome.usernamePlc,"admin");
        ome.mySendKeys(ome.passwordPlc,"Admin123");

        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);

        act.moveToElement(ome.adminButton).build().perform();
        ome.myClick(ome.myAccount);

        Assert.assertTrue(ome.changePassword.isDisplayed());
        Assert.assertTrue(ome.myLanguages.isDisplayed());










    }
}
