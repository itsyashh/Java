package com.javacompany;
import java.util.Scanner;

public class RevAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int a [] = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i]= scn.nextInt();

        }

        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i] + "  ");
    }
}

