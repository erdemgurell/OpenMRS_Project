package US_410;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

// Credentials:
// Username: admin
// Password: Admin123
// Website: https://demo.openmrs.org/openmrs/login.htm
public class SystemTimeZone extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";

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
    public void appointmentWithIncorrectTimeZone() {

        wait.until(ExpectedConditions.elementToBeClickable(ome.appointmentScheduling));
        ome.myClick(ome.appointmentScheduling);

        wait.until(ExpectedConditions.elementToBeClickable(ome.manageAppointments));
        ome.myClick(ome.manageAppointments);

        ome.mySendKeys(ome.patientSearchBox, "Robert Smith" + Keys.ENTER);
        ome.myClick(ome.getSearchedPatientForApt);

        wait.until(ExpectedConditions.elementToBeClickable(ome.timeZoneWarningMessage));
        Assert.assertTrue(ome.timeZoneWarningMessage.isDisplayed(), "No warning message is present!");
        logger.info("Warning message: " + ome.timeZoneWarningMessage.getText());
    }
    @Test
    public void appointmentWithCorrectTimeZone(){

    }
}
