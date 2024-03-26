package US_409;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientRecordMerge extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    @Test()
    public void patientRecordMerge(){
        // Login procedure
        ome.mySendKeys(ome.usernamePlc,usernameStr);
        ome.mySendKeys(ome.passwordPlc,passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);

        // Click "Register a Patient" button
        ome.myClick(ome.registerAPatient);

        // Patient full name info
        ome.mySendKeys(ome.givenNamePlc,"Roshaunda");
        ome.mySendKeys(ome.middleNamePlc,"Kenyanna");
        ome.mySendKeys(ome.familyNamePlc,"Petitt");
        ome.myClick(ome.nextButton);



    }


}
