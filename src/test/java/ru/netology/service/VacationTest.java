package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/vacation.csv")
    public void VacationNextYear (int income, int expenses, int threshold, int expected) {
        Vacation service = new Vacation();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }



}
