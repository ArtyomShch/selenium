import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOgin {
    public static void main(String[] args) {
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\shche\\IdeaProjects\\demoweb\\Tools\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        webDriver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[1]/div[3]/div[1]/p/a")).click();
        webDriver.findElement(By.id("auth_email")).click();
        webDriver.findElement(By.id("auth_email")).sendKeys("testteam1@bigmir.net");
        webDriver.findElement(By.id("auth_pass")).click();
        webDriver.findElement(By.id("auth_pass")).sendKeys("pass123.Q");
        webDriver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[2]/user-identification/auth/div/form/div[2]/button")).click();
        Thread.sleep(4000);

        webDriver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[1]/div[3]/div[1]/p/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"profile_signout\"]")).click();
        webDriver.quit();

    }



}
