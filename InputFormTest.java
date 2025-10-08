package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputFormSubmitPage;

public class InputFormTest extends BaseTest {

    @Test
    public void testInputFormSubmit() {
        driver.findElement(org.openqa.selenium.By.linkText("Input Form Submit")).click();

        InputFormSubmitPage formPage = new InputFormSubmitPage(driver);

        // Step 1: Click Submit without data
        formPage.clickSubmit();
        String validationMsg = formPage.getValidationMessage();
        Assert.assertTrue(validationMsg.contains("Please fill out this field"), "Validation message missing!");

        // Step 2: Fill form and submit
        formPage.fillForm();
        formPage.clickSubmit();

        Assert.assertEquals(formPage.getSuccessMessage(),
                "Thanks for contacting us, we will get back to you shortly.",
                "Success message mismatch!");
    }
}
