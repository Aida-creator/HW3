package com.company;

public class Main {

    public static void main(String[] args) {
        double[] digits = new double[]{1.1, 3.5, -2.5, 7.1, -5.2, 4.3, -8.8, 9.4, 0.5, 22.2, -1.9, 0.1, 182, -52, 30};
        double summ = 0.0;
        boolean negative = false;
        int q = 0;
        for (double i : digits) {
            if (i < 0) {
                negative = true;
            }
            if (negative) {
                if (i > 0) {
                    q++;
                    summ += i;
                }
            }
        }
        System.out.println(summ/q);


    }
}


















