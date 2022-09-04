package com.grisha.lessons;

public class Lesson2 {
    public static void main(String[] args) {
        var value3 = 213;
        int value = 25;
        System.out.println(value);
        double value2 = 78.123;
        System.out.println(value2);
        boolean booleanValue = true;
        System.out.println(booleanValue);
        final char testValue = 'a';
        System.out.println(testValue);
        char testValue1 = 't';
        System.out.println(testValue1);
        int sum = value + value3;
        System.out.println(sum);
        double del = value3 / value;
        System.out.println(del);

        int value1 = 100;
        value1++;
        System.out.println(value1);
        value1 += 25;
        System.out.println(value1);
        if (value1 == 127) {
            System.out.println(value1);
        } else {
            System.out.println("неверно");
        }

        int zero = 0;

        if (zero > 0) {
            System.out.println("больше нуля");
        } else if (zero < 0) {
            System.out.println("меньше нуля");
        } else {
            System.out.println("Verno");
        }
        // byte, short, int, char, String, enum
        int value11 = 10;
        switch (value11) {
            case    1:
                System.out.println("value11 == 1");
                break;
            case    2:
                System.out.println("value11 == 2");
                break;
            case    10:
                System.out.println("value11 == 10");
                break;
            case    15:
                System.out.println("value11 == 15");
            default:
                System.out.println("Нет такого значения");
        }


        var charValue = switch (value11) {
            case 1 -> '1';
            case 2, 3, 4 -> 2;
            default -> '0';
        };
    }
}
