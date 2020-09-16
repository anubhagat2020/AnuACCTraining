import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class adduserpage {
    public void adduser(WebDriver driver) {

        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Steven Edwards");
        driver.findElement(By.id("systemUser_userName")).sendKeys("steventest3");
        driver.findElement(By.id("systemUser_password")).sendKeys("Steventest123*");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Steventest123*");
        driver.findElement(By.id("btnSave")).click();
    }
}
