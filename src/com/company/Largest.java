package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array limit");
        int limit=sc.nextInt();

        int array[]=new int[limit];

        System.out.println("Enter array element:");
        for(int i=0;i<limit;i++)
        {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int length=array.length;
        System.out.println("Largest element present in given array: " + array[length-1]);
    }
}