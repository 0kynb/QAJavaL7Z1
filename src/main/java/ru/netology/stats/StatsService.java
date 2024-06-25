package ru.netology.stats;

public class StatsService {

    public long calculateTotalSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long calculateAverageMonthSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        long averageMonthSale = totalSale / 12;
        return averageMonthSale;
    }

    public int calculateMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int calculateMonthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int calculateMonthsLowAverage(long[] sales) {
        long averageSale = calculateAverageMonthSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }
    public int calculateMonthsHighAverage(long[] sales) {
        long averageSale = calculateAverageMonthSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

