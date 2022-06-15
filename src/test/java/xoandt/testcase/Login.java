package xoandt.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hrm.anhtester.com");

        Thread.sleep(1000);

        //Tìm element bằng thuộc tính
        driver.findElement(By.id("iusername")).sendKeys("admin01");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(1000);
        //Tìm element bằng Xpath tuyệt đối
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[2]/button")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[5]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/div[2]/div[1]/div/a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("task_name")).sendKeys("Task Name 01");

        Thread.sleep(2000);
        driver.quit();
    }
}
