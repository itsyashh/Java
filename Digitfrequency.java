package com.javacompany;

import java.util.Scanner;

public class Digitfrequency {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();

        int temp = 0;
        while (n > 0){
            int i = n%10;
            n = n/10;
          if(i == d){
              temp++;
          }

        }
        System.out.println(temp);

    }

}
