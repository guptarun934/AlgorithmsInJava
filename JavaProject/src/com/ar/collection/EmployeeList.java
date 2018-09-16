//To create an arraylist of employee objects and search for a particular employee
package com.ar.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employee1{
      int id;
      String name;
      String address;
      String phone;

    Employee1(int i, String n, String a,String p){
        id = i;
        name = n;
        address = a;
        phone = p;
    }
    void display(){
        System.out.println("Employee Id"+ id);
        System.out.println("Employee Name"+ name);
        System.out.println("Employee Address"+ address);
        System.out.println("Employee Phone"+ phone);
    }
}

public class EmployeeList {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReaderv = new BufferedReader(new InputStreamReader(System.in));
        int id;
        String name;
        String address;
        String phone;

        ArrayList<Employee1> al = new ArrayList<>();

        for (int i=0;i<5;i++){
            System.out.print("Enter Employee Id::");
            id= Integer.parseInt(bufferedReaderv.readLine());

            System.out.print("Enter Employee Name::");
            name = bufferedReaderv.readLine();

            System.out.print("Enter Employee Address::");
            address = bufferedReaderv.readLine();

            System.out.print("Enter Employee Phone");
            phone = bufferedReaderv.readLine();

            Employee1 employee = new Employee1(id, name,address,phone);

            al.add(employee);
        }
        System.out.print("Enter Employee ID to search::");
        id = Integer.parseInt(bufferedReaderv.readLine());

        boolean found = false;

        for (int i =0; i<al.size();i++){
            Employee1 employee1 = al.get(i);

            if (id == employee1.id){
                employee1.display();
                found = true;
            }
        }
        if (!found)
            System.out.println("Employee not found");
    }

}
