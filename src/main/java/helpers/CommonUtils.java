package helpers;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.time.Duration;

import static drivers.DriverFactory.driver;


public class CommonUtils {
    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(25));
    }


    public static void type(By locator, String text) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);

    }

    public static void click(By locator) {

        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void uploadFile(By locator, String fileName) {

        driver.findElement(locator).sendKeys(fileName);
    }

    public static void maxBrowser() {
        driver.manage().window().maximize();
    }

    public static String getRandomNumberBetween(int min, int max) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(min + Math.floor(max - min) * Math.random());
    }

    public static String getRandomPhone() {
        return getRandomNumberBetween(1111111111, 999999999);
    }

    public static String getRandomName(int number) {
        String randomName = RandomString.make(number).toLowerCase();
        return RandomStringUtils.randomAlphabetic(number).toLowerCase();
    }

    public static String getRandomMail() {
        return getRandomName(5) + getRandomNumberBetween(100, 1000) + "@op.pl";
    }

    public static String getRandomNumber(int numberAmount) {
        return RandomStringUtils.randomNumeric(numberAmount);
    }

    public static String getHref(By locator) {
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).getAttribute("href");
    }

    public static void openCategory(int number) {
        String CATEGORY_URL = getHref(By.xpath("(//li[contains(@class,'product-category product')]/a)[" + number + "]"));
        driver.get(CATEGORY_URL);
    }
public static boolean IsEnabled(By locator) {
    return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).isEnabled();
}

public static void typeIfEmptyInput(By locator,String text){
     //   If(driver.findElement(locator).getAttribute("value").isEmpty()){
            type(locator, text);}

}
//public static void clearAndTypeIfNotEmptyInput(By locator,String text){
     //   If(driver.findElement(locator).getAttribute("value").isEmpty()){
            //driver.findElement(locator).clear();
            //type(locator,text);}











