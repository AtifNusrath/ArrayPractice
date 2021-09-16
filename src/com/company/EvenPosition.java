package com.company;

public class EvenPosition {
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        System.out.print("Existing array elements: ");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }

        System.out.print("\nElements of given array present on even position: ");
        for (int i = 1; i < arr.length; i = i+2) {
            if (i % 2 == 1) {
                System.out.print(arr[i]+" ");
            }

        }
    }
}
