package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

public class RegistrationFormTest {

    RegistrationFormPage practiceFormPage = new RegistrationFormPage();


    @Test
    void formTest() {
        practiceFormPage.openPage();
        practiceFormPage.fillData();
        practiceFormPage.checkData();
    }

}