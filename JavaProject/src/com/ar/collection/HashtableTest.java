//hashtable with cricket player names and their scores
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {
    public static void main (String[] args) throws IOException {
        //create Hashtable with names and scores
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("MsDoni",183);
        hashtable.put("Sachin",200);
        hashtable.put("Rohit",264);
        hashtable.put("Virendra",219);

        //display all player names
        System.out.println("The player name: ");
        Enumeration e =hashtable.keys();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter player name:");
        String name = bufferedReader.readLine();
        name = name.trim();

        Integer score = hashtable.get(name);
        if(score != null){
            int sc = score.intValue();
            System.out.println(name+"Scored:"+sc);
        }
        else
            System.out.println("Player not found");

    }
}
