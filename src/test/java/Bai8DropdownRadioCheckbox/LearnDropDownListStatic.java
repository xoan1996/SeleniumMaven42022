package Bai8DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownListStatic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
        Select select= new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Thursday"); // Theo hướng người dùng thì lấy theo selectByVisibleText
        Thread.sleep(2000);

        // Đoạn code kiểm tra multi select
        Select select1= new Select(driver.findElement(By.id("multi-select")));
        Boolean check= select1.isMultiple();
        System.out.println(check);

        closeDriver();
    }
}
