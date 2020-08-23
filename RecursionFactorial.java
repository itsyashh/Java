package com.javacompany;
import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);

    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
      int fmi = factorial(n -1);
      int fn = n* fmi;
        return fn;
    }


}
