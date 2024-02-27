package Wrapper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import rok.qa.Utilities.BaseClass;

public class Asert extends BaseClass {

    public static void asserttoEquals(String actual, String expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
            System.out.println("Assertion Passed: " + message);
        } catch (AssertionError e) {
            System.err.println("Assertion Failed: " + message);
            throw e;
        }
    }


}
