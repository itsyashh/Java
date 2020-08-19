package com.javacompany;
import java.util.Scanner;

public class BinarySearchIntro {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int l = 0;
        int h = arr.length -1;


        while (l <= h){
            int m = (1 + h) / 2;
            if(data > arr[m]){
                l = m + 1;

            }else if(data < arr[m]){
                h = m - 1;

            }else {
                System.out.println(m);
                break;
            }
        }
        System.out.println(-1);

    }
}
