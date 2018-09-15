//HashMap used as Telephone book
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {
    public static void main (String[] args) throws IOException {
        //create HashMap
        HashMap<String,Long> hm = new HashMap<>();
        String name, str;
        Long phno;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("1 Enter Phone entries");
            System.out.println("2 Lookup in the book");
            System.out.println("3 Display names in book");
            System.out.println("4 Exit");

            System.out.print("your choice: ");
            int n = Integer.parseInt(bufferedReader.readLine());
            switch (n)
            {
                case 1:
                    System.out.print("Enter name:");
                    name = bufferedReader.readLine();
                    System.out.println("Enter phno:");
                    str = bufferedReader.readLine();
                    phno = new Long(str);
                    hm.put(name,phno);
                    break;
                case 2:
                    System.out.print("Enter name:");
                    name = bufferedReader.readLine();
                    name =name.trim();
                    phno = hm.get(name);
                    System.out.println("phno:"+phno);
                    break;
                case 3:
                    Set<String> set = new HashSet<>();
                    set = hm.keySet();
                    System.out.println(set);
                    break;
                case 4: return;

            }
        }


    }
}
