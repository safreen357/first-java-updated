package com.company;

import java.util.Scanner;

public class Findout_Min_Max_usingArray {
    static void min(int arr[])
    {
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {

            if(min>arr[i])
            {
                min=arr[i];
                System.out.println("MinimumElement " +min);
            }

            else if(max<arr[i])
            {
                max=arr[i];

                System.out.println("MaximumElement " +max);
            }
        }
    }
    public static void main (String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n=sc.nextInt();
        //creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the all elements of the array: ");
        for(int i=0; i<n; i++)
        {
            //reading array elements from the user
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }
        min(array);//passing array to method
    }

}
