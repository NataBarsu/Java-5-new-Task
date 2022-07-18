package ru.netology.sqr;

public class CalcSqrtService {
    public int calcSqrt(int minvalue, int maxvalue) {
        int quantityOfSqrt = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minvalue && i * i <= maxvalue) {
                quantityOfSqrt++;

            }
        }
        return quantityOfSqrt;
    }
}
