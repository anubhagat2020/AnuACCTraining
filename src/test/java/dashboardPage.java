import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {


    public void clickadmin(WebDriver driver) {

        driver.findElement(By.xpath("//b[contains(.,'Admin')]")).click();
    }
}
