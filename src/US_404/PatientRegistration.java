package US_404;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class PatientRegistration extends BaseDriver {

    String usernameStr = "admin";
    String passwordStr = "Admin123";
   @Test
    public void Login(){
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);
    }
    public void RegisteraPatientbtn(){
       ome.myClick(ome.registerAPatient);

    }


}
