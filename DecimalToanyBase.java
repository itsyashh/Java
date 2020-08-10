package com.javacompany;

import java.util.Scanner;

public class DecimalToanyBase {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int p = 1;
        int rv = 0;
        while (n > 0){
            int dig = n % b;
            n = n/b;
            rv+= dig*p;
            p =p * 10;

        }
        System.out.println(rv);
    }
}
