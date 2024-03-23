package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriver {
    Logger logger = LogManager.getLogger(); // logları ekleyeceğim nesneyi başlattık.

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static OpenMRS_Elements ome;

    @BeforeClass
    public void InitialProcedure() { // TearStart böyle deniyor

        driver = new ChromeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ome = new OpenMRS_Elements();
        LoginTest();
    }

    @AfterClass
    public void CloseProcedure() { // TearDown
        Tools.wait(2);
        driver.quit();

        logger.info("Driver Closed"); // normal bir info

    }

    public void LoginTest() {
        logger.info("Login Page Procedure Started"); // normal bir info

        driver.get("https://demo.openmrs.org/openmrs/");

        logger.info("Login Page Procedure Finished"); // normal bir info
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.info("Method started");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) { // testin sonuç ve isim bilgisini olduğu değişkeni
        logger.info(result.getName() + " Method finished " + (result.getStatus() == 1 ? "Passed" : "failed"));
    }


}
