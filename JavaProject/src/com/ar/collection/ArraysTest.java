//Sorting and Searching an array
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysTest {
    public static void main (String[] args) throws IOException {
        //to accept data from keyboard
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter an Integer:");
            arr[i]= Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("Contents of the array:");
        display(arr);

        Arrays.sort(arr);
        System.out.println("The sorted array:");
        display(arr);
        System.out.print("which element to search?");
        int element = Integer.parseInt(bufferedReader.readLine());
        int index = Arrays.binarySearch(arr,element);
        if(index < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at location:" +(index +1));
    }
    static void display(int arr[]){
        for(int i : arr)
            System.out.println(i);
    }
}
