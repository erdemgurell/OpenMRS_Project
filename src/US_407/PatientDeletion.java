package US_407;

import Utility.BaseDriver;
import org.testng.annotations.Test;

// Credentials:
// Username: admin
// Password: Admin123
public class PatientDeletion extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    @Test(priority = 1)
    public void login() {
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);
    }
}
