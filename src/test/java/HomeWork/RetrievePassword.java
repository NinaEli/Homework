package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {
    /*
    1.Open browser
    2.Go to https://the-internet.herokuapp.com/forgot_password
    3.Enter any email
    4.Click on Retrieve password
    5.Verifyurl contains email_sent
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        driver.findElement(By.id("email")).sendKeys("abc@abc.com");

        driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();

        String expect = "https://the-internet.herokuapp.com/email_sent";
        String actual = driver.getCurrentUrl();

        if (expect.contains("email_sent")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected result+expect");
            System.out.println("Actual result: " + actual);
        }
    }

}