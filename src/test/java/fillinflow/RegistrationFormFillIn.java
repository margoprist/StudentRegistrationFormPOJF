package fillinflow;

import data.StudentData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormFillIn {

    StudentData student = new StudentData();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    public void fillData() {
        $("#firstName").setValue(student.firstName);
        $("#lastName").setValue(student.lastName);
        $("#userEmail").setValue(student.userEmail);
        $("label[for='gender-radio-2']").click();
        $("#userNumber").setValue(student.userNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(student.monthOfBirth);
        $(".react-datepicker__year-select").selectOption(student.yearOfBirth);
        $(".react-datepicker__day--016").click();
        $("#subjectsInput").setValue(student.subjectsInput).pressEnter();
        $(byText("Sports")).click();
        //  $("input#uploadPicture").uploadFile(new File("src/test/resources/default_avatar.png"));
        $("#uploadPicture").uploadFromClasspath("default_avatar.png");
        $("#currentAddress").setValue(student.currentAddress);
        $("#react-select-3-input").setValue(student.state).pressEnter();
        $("#react-select-4-input").setValue(student.city).pressEnter();
        $("#submit").click();

    }

    public void checkData() {
        $(".modal-content").shouldHave(
                text(student.lastName),
                text(student.firstName),
                text(student.userNumber),
                text(student.subjectsInput),
                text(student.hobby),
                text(student.userEmail),
                text(student.currentAddress),
                text(student.state),
                text(student.city),
                text("16 March,1965")
        );

    }
}
