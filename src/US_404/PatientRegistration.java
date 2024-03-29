package US_404;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PatientRegistration extends BaseDriver {

    String usernameStr = "admin";
    String passwordStr = "Admin123";

    String nameStr = "Alessio";
    String secondname= "Callisto";
    String lastNameStr = "Tholomyes";

    String birthDayStr = "26";
    String birtYearStr = "2002";
    String addressStr = "319-321 Chorley New Rd";
    String cityStr = "Bolton";
    String provinceStr = "Lancashire";
    String countryStr = "United Kingdom";
    String postalCodeStr = "BL1 5BP";

    String phoneNumberStr = "+01204 849313";
    String patientRelativeStr = "Jean Valjean";
    String patientCredentialsStr = "Cosette Tholomyes";


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

    public void enterpatientinformation(){
       ome.mySendKeys(ome.givenNamePlc,nameStr);
       ome.mySendKeys(ome.middleNamePlc,secondname);
       ome.mySendKeys(ome.familyNamePlc,lastNameStr);
        ome.myClick(ome.nextButton);

        Select select = new Select(ome.genderSelect);
        select.selectByVisibleText("Male");
        ome.myClick(ome.nextButton);

        ome.mySendKeys(ome.birthDay, birthDayStr);
        select = new Select(ome.birthMonthSelect);
        select.selectByVisibleText("August");
        ome.mySendKeys(ome.birthYear, birtYearStr);
        ome.myClick(ome.nextButton);

        ome.mySendKeys(ome.address1, addressStr);
        ome.mySendKeys(ome.cityVillage, cityStr);
        ome.mySendKeys(ome.stateProvince, provinceStr);
        ome.mySendKeys(ome.country, countryStr);
        ome.mySendKeys(ome.postalCode, postalCodeStr);
        ome.myClick(ome.nextButton);

        ome.mySendKeys(ome.phoneNumber, phoneNumberStr);
        ome.myClick(ome.nextButton);

        select = new Select(ome.relationshipTypeSelect);
        select.selectByVisibleText("Parent");

        ome.mySendKeys(ome.personName, patientRelativeStr);
        ome.myClick(ome.nextButton);
        ome.myClick(ome.confirmButton);










    }


}
