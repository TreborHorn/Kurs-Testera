package selectors;

import org.openqa.selenium.By;

public class SeleniumTestSelectors {
    public static By OnClick = By.id("clickOnMe");
    public static By Google = By.xpath("//a[@href='https://www.google.com']");
    public static By Schools = By.xpath("//a[@href='https://www.w3schools.com']");
    public static By Select = By.xpath("//select");
    public static By Mercedes = By.xpath("//option[@value='mercedes']");
    public static By MALE = By.xpath("//input[@value='male']");
    public static By fname = By.id("fname");
    public static By Username = By.xpath("//input[@name='username']");
    public static By Submit = By.xpath("//input[@type='submit']");
    public static By Check = By.xpath("//input[@type='checkbox']");

}
