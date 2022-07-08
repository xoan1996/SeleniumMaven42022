package Bai12ActionRobotClass;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class LearnActionClass extends BaseTest {
    @Test
    public void TestSendKeys() throws InterruptedException {

        //driver kế thừa từ class SetupBrowser
        driver.get("https://www.google.com/");

        // Element search box
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

        // Tạo đối tượng của Actions class và để driver vào
        Actions action = new Actions(driver);

        // Dùng action để gọi hàm sendkeys điền dữ liệu. Không dùng sendKeys của WebElement
        action.sendKeys(element, "Anh Tester").build().perform();
        Thread.sleep(2000);

        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();  // SendKey lệnh enter

        // Get element title of page
        WebElement elementTitlePage = driver.findElement(By.xpath("//h3[normalize-space()='Anh Tester - Automation Testing']"));
        elementTitlePage.click();
        // Gọi hàm click để click element trên
        action.click(elementTitlePage).build().perform();

        Thread.sleep(2000);
    }

    @Test
    public void testClickAndHold() throws InterruptedException {
        driver.get("https://anhtester.com/");
        WebElement loginButon= driver.findElement(By.id("btn-login"));
        Actions action =new Actions(driver);
        action.moveToElement(loginButon).pause(Duration.ofSeconds(3)).clickAndHold().build().perform(); // Hàm pause dùng để tạm dừng 1 khoảng thời gian nhất định, sau 1 lệnh nào đó
        Thread.sleep(2000);

    }

    @Test
    public void testRightClick() throws InterruptedException {
        driver.get("https://anhtester.com/");
        WebElement inputSearchCource= driver.findElement(By.xpath("//input[@placeholder='Bạn muốn học gì?']"));
        Actions action =new Actions(driver);
        action.contextClick(inputSearchCource).perform();
        Thread.sleep(2000);
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        // Element which needs to drag.
        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        // Element on which need to drop.
        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

        Actions action = new Actions(driver);

        // Gọi hàm dragAndDrop giữa Element
        action.dragAndDrop(From, To).build().perform();

        Thread.sleep(1000);

        // Drag and Drop by Pixel.
        WebElement from_5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        action.dragAndDropBy(from_5000, 168, 40).build().perform();

        Thread.sleep(2000);
    }
    @Test
    public void inputTextUppercase() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

        Actions action = new Actions(driver);

        // Đè giữ phím SHIFT và nhập text -> Chữ in hoa
        action.keyDown(element, Keys.SHIFT).sendKeys("anh tester").keyUp(Keys.SHIFT).keyUp(Keys.SPACE).sendKeys("accc").build().perform();
        Thread.sleep(2000);
    }

}
