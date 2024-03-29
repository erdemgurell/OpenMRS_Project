package US_402;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class PerformLogin extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

    @Test
    public void login() {
        // Log in to the application homepage as an admin user.
        // Enter the valid credentials (valid credentials are specified above.)
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.registrationDesk);
        ome.myClick(ome.loginButton);
    }

}
