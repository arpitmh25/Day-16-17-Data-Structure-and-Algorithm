package com.bridgelabz.dsa;

import java.util.Scanner;

public class PrimeNumbers {

    public void primeRange(int lower, int upper) {
        for (int i = lower; i <= upper; i++) {
            if (i == 1 || i == 0)
                continue;
            int flag = 1;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int lowerLimit, upperLimit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        lowerLimit = sc.nextInt();
        System.out.println("Enter upper limit : ");
        upperLimit = sc.nextInt();
        PrimeNumbers range = new PrimeNumbers();
        System.out.println("Prime numbers between given range are:");
        range.primeRange(lowerLimit, upperLimit);
    }

}