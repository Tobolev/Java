package com.grisha.lessons;

public class practic2 {
    public static void main(String[] args) {
        int num = 21321323;
        int last = num % 10;
        System.out.println(last);
        if (last == 3) {
            System.out.println("3");
        } else {
            System.out.println("neverno");
        }
    }
}
