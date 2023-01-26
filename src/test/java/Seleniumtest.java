import org.junit.Test;
import org.openqa.selenium.Alert;

import static strings.SeleniumTestStrings.*;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.SeleniumTestSelectors.*;

public class Seleniumtest {


    @Test


    public void test1() {

        //1.Włacz przeglądarke i pobierz stronę

        driver.get(Url_Demo);
        driver.manage().window().maximize();
        assertEquals(Url_Demo, driver.getCurrentUrl());
        //2.Znajdż element i kliknij
        click(OnClick);

        //3.Pobierz tekst i zamknij alert
        Alert alert = driver.switchTo().alert();
        assertEquals("Hello world!", alert.getText());
        System.out.println(alert.getText());
        alert.accept();

        //4.Znajdź element i wpisz tekst
        type(fname, Name);

        //5. Kliknij w link i wróć
        click(Google);
        driver.navigate().back();
        //6.Wejdź w link
        click(Schools);
        assertEquals(School_Url, driver.getCurrentUrl());
        driver.navigate().back();
        //7. Znajdź element i kliknij
        click(Select);
        click(Mercedes);
        assertTrue(driver.findElement(Mercedes).isDisplayed());
        //8. Znajdź element i kliknij
        click(MALE);
        assertTrue(driver.findElement(MALE).isDisplayed());
        //9. Znajdż i kliknij, wpisz tekst
        click(Username);
        driver.findElement(Username).clear();
        type(Username, "Robus");
        //10. Zaznacz checkboxa
        click(Check);
        //11. Kliknij Submit
        click(Submit);
        //12. Alert2 i alert3
        Alert alert2 = driver.switchTo().alert();
        assertEquals("Formularz wyslany", alert2.getText());
        System.out.println(alert2.getText());
        alert2.accept();
        Alert alert3 = driver.switchTo().alert();
        assertEquals("On submit method", alert3.getText());
        System.out.println(alert3.getText());
        alert3.accept();


        //13. Zamknij
         driver.quit();
    }




}






