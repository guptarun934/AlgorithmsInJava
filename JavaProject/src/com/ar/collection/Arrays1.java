//Sorting an array with a group of Integer objects
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Ascend implements Comparator<Integer>{
    @Override
    public int compare (Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
class Descend implements Comparator<Integer>{
    @Override
    public int compare (Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

public class Arrays1 {
    public static void main (String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements?");
        int size = Integer.parseInt(bufferedReader.readLine());

        Integer arr[] = new Integer[size];

        for (int i =0 ; i<size ;i++){
            System.out.println("Enter int:");
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr,new Ascend());
        System.out.println("\n Sorted in Ascending order:");
        display(arr);
        Arrays.sort(arr,new Descend());
        System.out.println("\n Sorted in Descending Order:");
        display(arr);
    }
    static void display(Integer arr[]){
        for (Integer i : arr)
            System.out.println(i+ "\t");
    }
}
