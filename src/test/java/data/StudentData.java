package data;

import com.github.javafaker.Faker;

public class StudentData {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.number().digits(10),
            currentAddress = faker.address().streetAddress(),
            gender = "Male",
            monthOfBirth = "March",
            yearOfBirth = "1965",
            subjectsInput = "Arts",
            hobby = "Sports",
            state = "Haryana",
            city = "Karnal";

}