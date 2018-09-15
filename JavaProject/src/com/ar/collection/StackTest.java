//pushing , popping , searching elements in stack.
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackTest {
    public static void main (String[] args)throws IOException {
        //create an empty stack to contain Integer objects
        Stack<Integer> stack = new Stack<Integer>();

        //take vars
        int choice = 0;
        int position;
        int element ;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //display the menu as long as user choice < 4

        while (choice < 4){
            System.out.println("Stack Operations::");
            System.out.println("1 Push an element");
            System.out.println("2 Pop an element");
            System.out.println("3 Search an element");
            System.out.println("4 Exit");
            System.out.println("Your Choice::");

            choice = Integer.parseInt(bufferedReader.readLine());

            //perform a task depending on user choice
            switch (choice){
                case 1:
                    System.out.println("Enter element:");
                    element = Integer.parseInt(bufferedReader.readLine());
                    //int type element is Converted into Integer object and then pushed into stack
                    stack.push(element);
                    break;
                case 2 :
                    //The top-most integer object is popped
                    Integer integer = stack.pop();
                    System.out.println("Popped = "+integer);
                    break;
                case 3:
                    System.out.println("which element? ");
                    element = Integer.parseInt(bufferedReader.readLine());
                    //int type element is converted into integer object and then searched in the stack
                    position = stack.search(element);
                    if (position == -1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Position::"+position);
                    break;
                    default: //come out if user choice is other than 1, 2 or 3
                        return;

            }
            //view the contents of stack
            System.out.println("Stack contents:" + stack);
        }

    }
}
