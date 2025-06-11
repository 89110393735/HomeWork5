package ru.netology.rest.javaqa.javaqamvn.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class restServiceTest {
    @Test
    public void test1Calculate() {
        restService service = new restService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    public void test2Calculate() {
        restService service = new restService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        assertEquals(expected, actual);
    }

}
