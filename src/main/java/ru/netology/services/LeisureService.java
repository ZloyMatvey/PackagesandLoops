package ru.netology.services;

public class LeisureService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                count++;
                int remainder = money - expenses;
                money = money - expenses - (remainder / 3 * 2);
            } else {
                money = money + income - expenses;
            }
        }
        return (count);
    }
}
