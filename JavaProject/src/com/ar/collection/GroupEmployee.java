//To Store and a group of objects in an array
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    //instance vars
    private int id;
    private String name;
    private String address;

    //to store data
    Employee (int i, String n, String a){
        id = i;
        name = n;
        address = a;
    }
    // method to display data
    public void  displayData(){
        System.out.println("EmployeeID::"+id+"\t"+"Name::"+name+"\t"+"Address::"+address);
    }
}

public class GroupEmployee{
     public static void main(String args[]) throws IOException{
         //to accept data from keyboard
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

         //create Employee type array with size 10;
         Employee employee[] = new Employee[10];

         //store 10 employees data into the array
         for (int i = 0; i <10; i++){
             System.out.println("Enter EmployeeId::");
             int id = Integer.parseInt(bufferedReader.readLine());

             System.out.println("Enter Name::");
             String name = bufferedReader.readLine();

             System.out.println("Enter Address::");
             String address = bufferedReader.readLine();

             employee[i] = new Employee(id,name,address);
         }

         System.out.println(" Group Employee data is ::");

         //display the Employee data from the array
         for (int i=0;i<employee.length;i++){
             employee[i].displayData();
         }
     }
}