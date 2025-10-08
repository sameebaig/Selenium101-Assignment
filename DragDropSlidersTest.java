package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropSlidersTest extends BaseTest {

    @Test
    public void testSliderTo95() {
        driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");

        WebElement slider = driver.findElement(By.xpath("//input[@value='15']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 215, 0).perform();

        String range = driver.findElement(By.id("rangeSuccess")).getText();
        Assert.assertEquals(range, "95");
    }
}
