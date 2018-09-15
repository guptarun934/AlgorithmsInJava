//ArrayList with String objects
package com.ar.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main (String[] args) {


        //create ArrayList
        ArrayList<String> al = new ArrayList<String>();
        // add 5 objects
        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Guava");
        al.add("Apple");

        //display contents
        System.out.println("Contents:" +al);

        //remove objects
        al.remove(3);
        al.remove("Apple");

        //display again
        System.out.println("Contents after removing:"+al);

        //display size
        System.out.println("Size of ArrayList:"+al.size());

        //extract elements using Iterator
        System.out.println("Extracting using Iterator :");

        //add an Iterator to ArrayList to retrieve elements
        Iterator it = al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
