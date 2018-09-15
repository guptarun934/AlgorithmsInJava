// LikedList with Strings
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main (String[] args)throws IOException {
        //create an empty linked List to store Strings
        LinkedList<String> linkedList = new LinkedList<>();

        //add some names to linked list
        linkedList.add("Arun");
        linkedList.add("Varun");
        linkedList.add("Gupta");
        linkedList.add("Arun");

        //display the elements in the linked list
        System.out.println("List = "+linkedList);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String element;
        int position;
        int choice = 0;

        while (choice < 4){
            System.out.println("LinkedList Operations:::");
            System.out.println("1 Add an element");
            System.out.println("2 Remove an element");
            System.out.println("3 Change an element");
            System.out.println("4 Exit");

            System.out.println("your choice::");
            choice = Integer.parseInt(bufferedReader.readLine());

            //perform a task depending on user choice
            switch (choice){
                case 1:
                    System.out.println("Enter element: ");
                    element = bufferedReader.readLine();
                    System.out.println("At what position? ");
                    position = Integer.parseInt(bufferedReader.readLine());
                    linkedList.add(position-1,element);
                    break;

                case 2:
                    System.out.println("Enter Position:");
                    position = Integer.parseInt(bufferedReader.readLine());
                    linkedList.remove(position-1);
                    break;
                case 3:
                    System.out.println("Enter position:");
                    position = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Enter new Element:");
                    element = bufferedReader.readLine();
                    linkedList.set(position-1,element);
                    break;
                    default: return;
            }
            //use Iterator to retrieve the elements
            System.out.print("List = ");
            Iterator it = linkedList.iterator();
            while (it.hasNext())
                System.out.println(it.next()+ " ");
        }

    }
}
