package US_408;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PatientListing extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

    @Test
    public void patientListing() {
        // Login procedure
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.inpatientWard);
        ome.myClick(ome.loginButton);

        // Click "Find Patient Record" button
        ome.myClick(ome.findPatientRecord);


        int listTotal = 0; // patient list total size

        // While still next page continue
        while (true) {
            // Take the list of entries info and delete everything except numbers
            String substring = ome.patientListInfo.getText().replaceAll("[^0-9 ]", "");

            // Create String[] from it
            String[] listArr = substring.trim().split("\\s+");

            // Take entry number current page and check if its showing correct number info
            int pageEntryNum = Integer.parseInt(listArr[1]);

            listTotal += ome.patientList.size();
            Assert.assertEquals(pageEntryNum, listTotal);

            // Check if we reached last page
            if (listArr[1].equals(listArr[2])) {
                break;
            } else {
                ome.myClick(ome.patientListNextBtn);
            }
        }

    }

}
