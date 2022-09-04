package com.grisha.lessons;

import java.util.Scanner;

public class practic4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a year: ");
        int year = in.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосный");
        } else  {
            System.out.println(year + "Не високосный");
        }
        in.close();
    }
}
