package com.grisha.lessons;

import java.util.Scanner;

public class practic3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();
        // рубль 1 !11
        //  рубля 2 3 4
        // рублей 5 6 7 8 9 10 11 12 13 14 15 16 17 ..
         if ((num % 10 == 1) && (num % 100 != 11)) {
            System.out.println(num + " Рубль");
        } else if ((num % 10 == 2 || num % 10 == 3 || num % 10 == 4) && !(num % 100 == 12 || num % 100 == 13 || num % 100 == 14)) {
             System.out.println(num + " Рубля");
         } else if ((num % 10 == 5 || num % 10 == 6 || num % 10 == 7 || num % 10 == 8 || num % 10 == 9 || num % 10 == 0 || num % 100 == 11) || (num % 100 == 12 || num % 100 == 13 || num % 100 == 14)) {
             System.out.println(num + " Рублей ");
         } else {
             System.out.println("Введите неотрицательное число");
         }
        in.close();
    }
}
