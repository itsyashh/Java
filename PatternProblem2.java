package com.javacompany;

import java.util.Scanner;

public class PatternProblem2 {
    public  static  void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();

        int sp = m-1;
        int st = 1;
        for(int i = 1; i<= m; i++){
            for(int j = 1; j <=sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j<= st;j++){
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();

        }
    }
}
