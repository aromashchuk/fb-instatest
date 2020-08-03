import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebooTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("test@r");
        driver.findElement(By.id("pass")).sendKeys("1111");
        driver.findElement(By.linkText("Instagram")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("dfg@dfg.wer");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("dfg@dfg.wer");



     //   driver.findElement(By.name("did_submit")).click();
    }

}


