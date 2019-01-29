package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.soap.SOAPBinding;

public class SearchAmozon {
    //Tag,Attribute.,value
    /*
    1.Open browser
    2.Go to https://amazon.com
    3.Enter any search term
    4.Click on search button
    5.Verify title contains the search term
     */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get(" https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Blackpink" + Keys.ENTER);

        String expect= "Blackpink";
        String actual = driver.findElement(By.id("twotabsearchtextbox")).getText();
        if (actual.equals(expect)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expect Result: "+expect);
            System.out.println("Actual result: "+actual);
        }

       driver.close();







    }
}
