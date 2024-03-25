package US_408;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


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

        // Click "Find Patient Record" button
        ome.myClick(ome.findPatientRecord);

        // Take the list of entries info and delete everything except numbers
        String substring = ome.patientListInfo.getText().replaceAll("[^0-9 ]","");

        // Create String[] from it
        String[] listArr = substring.trim().split("\\s+");

        // Take entry number current page and check if its showing correct number info
        int pageEntryNum = Integer.parseInt(listArr[1]);

        Assert.assertEquals(pageEntryNum, ome.patientList.size());



    }

}
