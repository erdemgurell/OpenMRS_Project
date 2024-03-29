package US_402;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PerformLogin extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

    @Test
    public void performLogin() {
        // Log in to the application homepage as an admin user.
        // Enter the valid credentials (valid credentials are specified above.)
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);

        Assert.assertTrue(ome.adminButton.getText().contains("admin"));

    }

}
