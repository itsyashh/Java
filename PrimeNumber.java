package Practices;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                temp++;
                break;
            }
        }
        if(temp == 0){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}
