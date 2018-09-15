//Vector with Integer Elements
package com.ar.collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
    public static void main (String[] args) {
        //take a vector to store Integer Objects
        Vector<Integer> vector = new Vector<>();

        //take an int type array
        int x[] = {22,33, 44, 55,10,20,30,40};

        for (int i =0 ; i< x.length ; i++){
            vector.add(x[i]);
        }
        System.out.println("Vector elements:");
        for (int i=0;i<vector.size();i++){
            System.out.println(vector.get(i));
        }
        System.out.println("Elements using ListIterator:");
        ListIterator lit = vector.listIterator();

        System.out.println("In forward direction:");
        while (lit.hasNext())
            System.out.print(lit.next()+"\t");

        System.out.println("\nBackward direction:");
        while (lit.hasPrevious())
            System.out.print(lit.previous()+"\t");
    }
}
