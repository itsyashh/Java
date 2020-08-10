package com.javacompany;

import java.util.Scanner;

public class AnytoDecimal {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int rv = 0;
        int p = 1;
        while (n >0) {
            int dig = n % 10;
            n = n / 10;
            rv += p * dig;
            p = p * b;
        }
        System.out.println(rv);

    }
}
