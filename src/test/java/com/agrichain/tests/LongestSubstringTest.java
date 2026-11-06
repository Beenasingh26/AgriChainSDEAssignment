package com.agrichain.tests;

import com.agrichain.BaseTest;
import com.agrichain.pages.HomePage;
import com.agrichain.pages.ResultPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestSubstringTest extends BaseTest {

    @Test
    public void verifyLongestSubstringLength() {

        // Step 1: Open the AgriChain website
        driver.get("https://agrichain.com");

        // Step 2: Create objects of the Page classes
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);

        // Step 3: Enter the input and click Submit
        homePage.submitInput("abcabcbb");

        // Step 4: Get the result displayed on the result page
        String actualResult = resultPage.getResult();

        // Step 5: Define the expected result
        String expectedResult = "3";

        // Step 6: Verify the actual result against the expected result
        Assert.assertEquals(
                actualResult,
                expectedResult,
                "Incorrect longest substring length"
        );
    }
}