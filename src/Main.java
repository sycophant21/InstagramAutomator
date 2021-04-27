import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String chromeDriverAddress = "";
        System.setProperty("webdriver.chrome.driver", chromeDriverAddress);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]/button/span[2]")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(args[0]);
        webDriver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(args[1]);
        webDriver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        Thread.sleep(10000);
        webDriver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).click();


        WebElement webElement = webDriver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input"));
        webElement.sendKeys("#instagram");
        Thread.sleep(2000);
        WebElement webElement1 = webDriver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div"));
        webElement1.click();
    }
}
