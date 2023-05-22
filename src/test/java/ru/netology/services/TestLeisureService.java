package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLeisureService {
    @Test
    void FirstRestTest() {
        LeisureService service = new LeisureService();

        // Вводные параметры
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // Вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // Производим проверку
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void SecondRestTest() {
        LeisureService service = new LeisureService();
        // Вводные параметры
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        // Вызываем целевой метод
        int actual = service.calculate(income, expenses, threshold);

        // Производим проверку
        Assertions.assertEquals(expected, actual);
    }
}
