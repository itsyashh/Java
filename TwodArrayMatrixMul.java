package com.javacompany;
import java.util.Scanner;

public class TwodArrayMatrixMul {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [] [] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int [] [] arr1 = new int[n1][m1];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        if( m != n1){
            System.out.println("Invalid input");
            return;
        }
        int [][] prd = new int[n][m1];
        for(int i = 0; i < prd.length; i++ ){
            for(int j = 0; j < prd[0].length; j++){
                for(int k = 0; k < m; k++){
                    prd[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

        for(int i = 0; i < prd.length; i++ ){
            for(int j = 0; j < prd[0].length; j++){
                System.out.print(prd[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
