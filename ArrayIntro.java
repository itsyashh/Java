package com.javacompany;

public class ArrayIntro {
    public static void main(String[]args){
         int arr[] = new int [5];
         arr[0] = 10;
         arr[1] = 18;
         arr[2] = 13;
         arr[3] = 17;
         arr[4] = 13;
         System.out.println(arr.length);

         for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] +" ");
         }
    }
}
