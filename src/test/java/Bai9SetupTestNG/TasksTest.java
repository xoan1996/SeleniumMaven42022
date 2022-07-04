package Bai9SetupTestNG;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TasksTest extends BaseTest {

    @Test(priority = 1,description="Login HRM system")  // description: dùng để thêm thông tin cho test.
    public void loginCRM(){
        createDriver();
        driver.get("https://hrm.anhtester.com/");
        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("admin01");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        closeDriver();
    }

    @Test(priority = 2)
    public void openProjectPage() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Dự án']")).click();
    }
}
