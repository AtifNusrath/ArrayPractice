package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Ascending {

        public static void main(String[] args)
        {
            int limit;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            limit = sc.nextInt();
            int arr[] = new int[limit];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < limit; i++)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.print("Ascending Order:");
            for (int i = 0; i < limit; i++)
            {
                System.out.print(arr[i] + ",");
            }
        }
}

