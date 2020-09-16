import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrm {


        WebDriver driver;

        @Test
        public void AddDeleteUser() {

            //Create an instance of web driver

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

// login to orange HRM

            loginPage login = new loginPage(driver);
            login.loginsuccess(driver);

            //driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
           // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
           // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
            //driver.findElement(By.id("btnLogin")).click();

            // Admin dashboard
            dashboardPage dash = new dashboardPage();
            dash.clickadmin(driver);


            driver.findElement(By.xpath("//b[contains(.,'Admin')]")).click();

            //Add user ID
            adduserpage add = new adduserpage();
            add.adduser(driver);


            driver.findElement(By.id("btnAdd")).click();
            driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Steven Edwards");
            driver.findElement(By.id("systemUser_userName")).sendKeys("steventest3");
            driver.findElement(By.id("systemUser_password")).sendKeys("Steventest123*");
            driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Steventest123*");
            driver.findElement(By.id("btnSave")).click();

            //delete user
            //String user = driver.findElement(By.id())

            driver.findElement(By.id("ohrmList_chkSelectRecord_17")).getText();
            driver.findElement(By.id("btnDelete")).click();
            driver.findElement(By.id("dialogDeleteBtn")).click();



        }




        }





