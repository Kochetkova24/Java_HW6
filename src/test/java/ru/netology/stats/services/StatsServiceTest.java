package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SumSalesTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.SumSales(Sales);


        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void AverageValueSalesTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageValueSales = 15;
        long actualAverageValueSales = service.AverageValueSales(Sales);


        Assertions.assertEquals(expectedAverageValueSales, actualAverageValueSales);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(Sales);


        Assertions.assertEquals(expectedMaxSales, actualMaxSales);

    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.minSales(Sales);


        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void BelowAverageValueTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowAverageValueSales = 5;
        long actualBelowAverageValueSales = service.BelowAverageValueSales(Sales);


        Assertions.assertEquals(expectedBelowAverageValueSales, actualBelowAverageValueSales);
    }

    @Test
    public void higherAverageValueTest() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedHigherAverageValueSales = 5;
        long actualHigherAverageValueSales = service.higherAverageValueSales(Sales);


        Assertions.assertEquals(expectedHigherAverageValueSales, actualHigherAverageValueSales);
    }
}