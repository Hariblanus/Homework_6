package ru.netology;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Общая сумма продаж: " + service.calculateTotalSales(sales));
        System.out.println("Средняя продажа за месяц: " + service.calculateAverageSale(sales));
        System.out.println("Лучший месяц: " + service.calculateBestMonth(sales));
        System.out.println("Худший месяц: " + service.calculateWorstMonth(sales));
        System.out.println("Месяцев с уровнем продаж ниже среднего: " + service.calculateMonthsBelowAverage(sales));
        System.out.println("Месяцев с уровнем продаж выше среднего: " + service.calculateMonthsAboveAverage(sales));

    }
}
