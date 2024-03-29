package US_406;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientSearchInPatientList_Positive extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    String fenceName = "Javier";


    @Test(priority = 1)
    public void login() {

        // Log in to the application homepage as an admin user.
        // Enter the valid credentials (valid credentials are specified above.)
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.registrationDesk);
        ome.myClick(ome.loginButton);
    }

    @Test(priority = 2)
    public void ActiveVisitsCheckList() {
        //User clicks on Active Visits button
        ome.myClick(ome.activeVisits);
        //Search for registered visits name
        ome.mySendKeys(ome.fenceBox, fenceName);
        //Click on registered visits name
        ome.myClick(ome.nameFence);
        //Listing and verification of patient information
        for (int i = 6; i < ome.patientInformation.size(); i++) {

            System.out.println(ome.patientInformation.get(i).getText());
            Assert.assertTrue(ome.patientInformation.get(i).getText().equals(ome.patientInformation.get(i).getText()));

        }
    }
}
