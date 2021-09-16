package com.company;
import java.util.*;
public class PrintArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array limit");
        int limit=sc.nextInt();

        int arr[]=new int[limit];
        System.out.println("Enter array element:");
        for(int i=0;i<limit;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array element:");
        for(int i=0;i<limit;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
