package com.javacompany;
import java.util.Scanner;

public class BarChartArray {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> temp){
                temp = arr[i];
            }

        }
        for(int floor = temp; floor >= 1; floor--){
            for(int i =0; i< arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
