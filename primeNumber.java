package com.javacompany;
import java.util.Scanner;

public class primeNumber {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();

        int temp = 0;

        for(int i = 2; i<= n-1; i++){
            if(n%i==0){
                temp = temp+1;
            }
        }
        if(temp>0){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
    }
}
