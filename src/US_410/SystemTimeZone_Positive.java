package US_410;

import Utility.BaseDriver;
import org.testng.annotations.Test;

// Credentials:
// Username: admin
// Password: Admin123
// Website: https://demo.openmrs.org/openmrs/login.htm
public class SystemTimeZone_Positive extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

    @Test(priority = 1)
    public void login() {

        // Log in to the application homepage as an admin user.
        // Enter the valid credentials (valid credentials are specified above.)
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);
    }

}
