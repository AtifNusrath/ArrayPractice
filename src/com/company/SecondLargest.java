package com.company;

import java.util.*;
import java.util.Arrays;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) {

        Arrays.sort(arr);
        int length = arr.length;
        return arr[length - 2];
    }

    public static void main(String args[]) {
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
        System.out.println("Second Largest: " +getSecondLargest(arr));
    }
}

