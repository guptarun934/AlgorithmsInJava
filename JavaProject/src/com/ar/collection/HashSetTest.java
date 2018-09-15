//HashSet JavaProgram
package com.ar.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main (String[] args) {

        //create a HashSet to Store Strings
        HashSet<String> hashSet = new HashSet<>();

        //Store some String elements
        hashSet.add("India");
        hashSet.add("Korea");
        hashSet.add("Japan");
        hashSet.add("America");
        hashSet.add("China");
        hashSet.add("Shri Lanka");
        hashSet.add("India");

        //view the HashSet
        System.out.println("Hash Set = " + hashSet);

        //add an Iterator to hashset
        Iterator it = hashSet.iterator();

        //display elements by element using Iterator
        System.out.println("Elements Using Iterator::");
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);
        }
    }
}
