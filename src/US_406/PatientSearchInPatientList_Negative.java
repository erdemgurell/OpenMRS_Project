package US_406;

import Utility.BaseDriver;
import Utility.ParentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientSearchInPatientList_Negative extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    String fenceName = "Bruce Wayne";
    String CorrectText = "No entries to display";
    ParentPage pp = new ParentPage();

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
        //Unregistered visits name search
        ome.mySendKeys(ome.fenceBox, fenceName);
        //Information and verification that there is no visits record
        pp.verifyContainsText(ome.NoEntriesText, CorrectText);

    }

}
