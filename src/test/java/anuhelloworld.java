import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class anuhelloworld {


WebDriver driver;

@Test
        public void test1(){
    //set up a browser
    WebDriverManager.chromedriver().setup();
    //open a browser
    WebDriver driver = new ChromeDriver();
    // navigate to acc site
    driver.navigate().to("https://www.acc.co.nz/");
    driver.manage().window().maximize();
    //click on online service
    WebElement btnonlineservice = driver.findElement(By.xpath("//a[@class='c-global-header__tablet-aux-menu-link'][contains(.,'Online services')]"));
    btnonlineservice.click();

    // verify online service

    WebElement txtonlineservice = driver.findElement(By.xpath("//h1[contains(.,'Our online services')]"));
    //assertion
    Assert.assertEquals(txtonlineservice.getText(),"Our online services");





}






}

