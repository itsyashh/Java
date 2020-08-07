package com.javacompany;
import java.util.Scanner;

public class PatternProblem9 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int v = 1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            int cv = v;
            for(int j = 1; j <= st; j++){
                System.out.print(cv+"\t");
                if(j <= st/2) {
                    cv++;
                }else {
                    cv--;
                }
            }

            if(i <= n/2){
                sp--;
                st += 2;
                v++;
            }else{
                sp++;
                st-=2;
                v--;
            }

            System.out.println();
        }
    }
}
