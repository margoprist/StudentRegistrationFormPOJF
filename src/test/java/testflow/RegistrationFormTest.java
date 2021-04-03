package testflow;

import org.junit.jupiter.api.Test;
import fillinflow.RegistrationFormFillIn;

public class RegistrationFormTest {

    RegistrationFormFillIn practiceFormPage = new RegistrationFormFillIn();


    @Test
    void formTest() {
        practiceFormPage.openPage();
        practiceFormPage.fillData();
        practiceFormPage.checkData();
    }

}