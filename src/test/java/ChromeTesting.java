import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTesting {
    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver.manage().window().maximize();

        driver.get("http://google.com/");

        WebElement khaiElement =  driver.findElement(By.name("q"));
        khaiElement.sendKeys("khai");
        khaiElement.sendKeys(Keys.ENTER);

        WebElement firstLink = driver.findElement(By.className("LC20lb"));

        Assert.assertEquals(firstLink.getText(), "Головна | ХАИ");
    }
}
