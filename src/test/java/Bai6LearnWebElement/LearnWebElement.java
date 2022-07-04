package Bai6LearnWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;  // khai báo driver
        //khởi tạo driver cho trình duyệt cụ thể cần automation
        WebDriverManager.chromedriver().setup();  // Cú pháp cài đặt Driver cho Chorme Browser thíc hợp (nếu là fifox thì khởi tạo firefox
        driver = new ChromeDriver(); // Cú pháp khởi tạo driver cho Chorme Browser
        driver.manage().window().maximize(); // Hiển thị full màn hình
        Thread.sleep(2000);
        driver.get("https://crm.anhtester.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")); //Câu này tương đương với câu dưới

//        // gán giá trị của 1 element vào 1 đối tượng WebElement có đặt tên rõ ràng . Nên dùng cách 2
//        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
//
//        inputEmail.sendKeys(""); // Nhập giá trị vào cho 1 phần tử dạng input hoặc area
//        driver.findElement(By.xpath("//input[@id='email']")).click();
//        inputEmail.sendKeys("");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("admin02@mailinator.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.click();
        Thread.sleep(2000);
        inputPassword.sendKeys("123456");
        Thread.sleep(2000);

        WebElement buttonSignin  =driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSignin.submit(); //Submit tương ứng với nút enter mà không cần click button Save => nhưng ưu tiên dùng  hàm click hơn
//        buttonSignin.click();

        Thread.sleep(2000);
        driver.quit();  // đóng browser


    }
}
