package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.soap.SOAPBinding;

public class BasicAuthenticationAddressBook {
    /*
    Basic authentication Address book
    1.Open browser
    2.Go tohttp://a.testaddressbook.com/sign_in
    3.Enter username kexesobepu@zsero.com
    4.Enter password password
    5.Click sign in button
    6.Verify username is displayed on page
    7.Verifythe title does not include Sign In
     */

    public static void main(String[] args) {
        //before automation,we need to do manual test first
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");

        driver.findElement(By.id("session_password")).sendKeys("password");

        driver.findElement(By.name("commit")).click();//click sign in button

       String expect ="kexesobepu@zsero.com";
        String actual = driver.findElement(By.className("navbar-text")).getText();//.getText make this line'S
        //data type String,webelement ni String kilwitidu

        if(expect.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected result: "+expect);
            System.out.println("Actual result: "+actual);
        }

        //Verifythe title does not include Sign In
        String expectTitle = "Adress Book";
        String actualTitle = driver.getTitle();

        if(expectTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected result: " + expectTitle);
            System.out.println("Actual result: " + actualTitle);
        }



    }
}