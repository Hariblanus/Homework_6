package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void testTotalSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateTotalSales(sales);

        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateAverageSale(sales);

        long expected = 15;
    }

    @Test
    public void testBestMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateBestMonth(sales);

        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWorstMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateWorstMonth(sales);

        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateMonthsBelowAverage(sales);

        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calculateMonthsBelowAverage(sales);

        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

