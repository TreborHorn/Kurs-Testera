package selectors;

import org.openqa.selenium.By;

public class DemoQATestSelectors {

    public static By FIRST_NAME = By.id("firstName");
    public static By LAST_NAME = By.id("lastName");
    public static By EMAIL = By.id("userEmail");
    public static By FEMALE = By.xpath("//label[@for='gender-radio-2']");
    public static  By Phone_Number = By.id("userNumber");
    public static By UPLOAD_File = By.id("uploadPicture");
    public static By Birthdate = By.xpath("//input[@value='16 Jan 2023']");
    public static By Hobby1 = By.xpath("//label[@for='hobbies-checkbox-1']");
    public static By Hobby2 = By.id("hobbies-checkbox-2");
    public static By Hobby3 = By.id("hobbies-checkbox-3");

}
