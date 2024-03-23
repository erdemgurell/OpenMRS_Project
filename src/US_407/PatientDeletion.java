package US_407;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

// Credentials:
// Username: admin
// Password: Admin123
public class PatientDeletion extends BaseDriver {
    String usernameStr = "admin";
    String passwordStr = "Admin123";
    String patientIdStr = "100KCK";
    String nameStr = "Cosette";
    String lastNameStr = "Tholomyes";
    String birthDayStr = "1";
    String birtYearStr = "2014";
    String addressStr = "rue blumet avenue purple st. 4/5";
    String cityStr = "Paris";
    String provinceStr = "Ile-de France";
    String countryStr = "France";
    String postalCodeStr = "75000";
    String phoneNumberStr = "+123 222 33 44";
    String patientRelativeStr = "Jean Valjean";
    String patientCredentialsStr = "Cosette Tholomyes";

    @Test(priority = 1)
    public void login() {
        ome.mySendKeys(ome.usernamePlc, usernameStr);
        ome.mySendKeys(ome.passwordPlc, passwordStr);
        ome.myClick(ome.registrationDesk);
        ome.myClick(ome.loginButton);
    }
}
