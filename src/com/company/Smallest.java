package com.company;
import java.util.*;

public class Smallest {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array limit");
        int limit=sc.nextInt();
        int array[]=new int[limit];

        System.out.println("Enter array element:");
        for(int i=0;i<limit;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Given array ");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        Arrays.sort(array);

        System.out.println("Smallest element present in given array: " +array[0]);
    }
}
