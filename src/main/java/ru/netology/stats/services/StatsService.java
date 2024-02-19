package ru.netology.stats.services;

public class StatsService {

    public long SumSales(long[] sales) {
        int Sum = 0;
        for (long sale : sales) {
            Sum += sale;
        }
        return Sum;
    }

    public long AverageValueSales(long[] sales) {
        int Sum = 0;
        for (long sale : sales) {
            Sum += sale;
        }

        return Sum / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public long BelowAverageValueSales(long[] sales) {
        long avg = AverageValueSales(sales);
        int Month = 0;
        for (long sale : sales) {
            if (sale < avg) {
                Month++;
            }

        }
        return Month;
    }
    public long higherAverageValueSales(long[] sales) {
        long avg = AverageValueSales(sales);
        int Month = 0;
        for (long sale : sales) {
            if (sale > avg) {
                Month++;
            }

        }
        return Month;
    }

}

