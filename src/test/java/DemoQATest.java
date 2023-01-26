import org.junit.Test;

import static strings.DemoQATestStrings.DEMO_URL;
import static strings.DemoQATestStrings.SAMPLE_PDF;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static selectors.DemoQATestSelectors.*;


public class DemoQATest {


    @Test
    public void test1() {
        //1. Włącz przeglądarkę i powiększ ekran.
        driver.get(DEMO_URL);
        assertEquals(DEMO_URL, driver.getCurrentUrl());
        maxBrowser();


        //2. Wpisz imię i nazwisko
        type(FIRST_NAME, getRandomName(6).toLowerCase());
        type(LAST_NAME, getRandomName(6).toUpperCase());


        //3. Wypisz maila i wybierz płeć
        type(EMAIL, getRandomMail());
        click(FEMALE);
        //4. Wpisz numer telefonu
        type(Phone_Number, getRandomNumber(10));
        //5. Wpisz datę urodzenia
       // type(Birthdate, ("16.05.2039"));
        //6.Wybirz hobby
       // click(Hobby1);
       // click(Hobby2);
        //click(Hobby3);
        //7. Załaduj plik
        uploadFile(UPLOAD_File, SAMPLE_PDF);


    }

}


//

