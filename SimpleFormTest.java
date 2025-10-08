package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormTest extends BaseTest {

    @Test
    public void testSimpleFormDemo() {
        driver.findElement(By.linkText("Simple Form Demo")).click();

        driver.findElement(By.id("user-message")).sendKeys("Hello LambdaTest");
        driver.findElement(By.id("showInput")).click();

        String message = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(message, "Hello LambdaTest", "Message validation failed!");
    }
}
