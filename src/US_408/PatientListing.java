package US_408;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class PatientListing extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    @Test
    public void login(){
        ome.mySendKeys(ome.usernamePlc,usernameStr);
        ome.mySendKeys(ome.passwordPlc,usernameStr);

    }

}
