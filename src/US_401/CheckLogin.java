package US_401;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckLogin extends BaseDriver {

    String usernameStr = "admin";
    String passwordStr = "Admin123";
    String unvalidUserameStr="admin1";
    String unvalidPasswordStr = "admin1.";

    @Test(priority = 1)
    public void checkLoginFirst(){
        ome.mySendKeys(ome.usernamePlc, unvalidUserameStr);
        ome.mySendKeys(ome.passwordPlc, unvalidPasswordStr);
        ome.myClick(ome.loginButton);
        Assert.assertTrue(ome.sessionLocationError.isDisplayed(),"Not Found");
        System.out.println("Warning Message:  " + ome.sessionLocationError.getText());
        ome.myClick(ome.inpatientWard);

    }

    @Test(dataProvider = "information", priority = 2)
    public void checkLogin(String username, String password) {

        ome.mySendKeys(ome.usernamePlc, username);
        ome.mySendKeys(ome.passwordPlc, password);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);
        Assert.assertTrue(ome.errorMessage.isDisplayed(),"Not Found");
        System.out.println("Warning Message:  " + ome.errorMessage.getText());
    }

    @DataProvider
    Object[][] information() {
        Object[][] usernamePassword =
                {
                        {"admin2", "admin2."},
                        {"admin3", "admin3."},
                        {"admin4", "admin4."},
                        {"admin5", "admin5."},
                        {"admin6", "admin6."}
                };
        return usernamePassword;
    }

    @Test(priority = 3)
    public void succesLogin(){
       ome.mySendKeys(ome.usernamePlc, usernameStr);
       ome.mySendKeys(ome.passwordPlc, passwordStr);
       ome.myClick(ome.inpatientWard);
       ome.myClick(ome.loginButton);
    }
}
