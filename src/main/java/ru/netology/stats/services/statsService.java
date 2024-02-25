package ru.netology.stats.services;

public class statsService {

    public long sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageValueSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }

        return sum / sales.length;
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
        long avg = averageValueSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < avg) {
                month++;
            }

        }
        return month;
    }
    public long higherAverageValueSales(long[] sales) {
        long avg = averageValueSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > avg) {
                month++;
            }

        }
        return month;
    }

}

