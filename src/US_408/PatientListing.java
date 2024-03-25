package US_408;

import Utility.BaseDriver;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class PatientListing extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    @Test
    public void login(){
        // Login procedure
        ome.mySendKeys(ome.usernamePlc,usernameStr);
        ome.mySendKeys(ome.passwordPlc,passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);


    }

}
