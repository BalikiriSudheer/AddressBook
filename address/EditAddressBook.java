package com.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EditAddressBook {
    private static Map<String ,Address> contacts=new HashMap<>();

    public static void main(String[] args) {
        contacts.put("Balikiri",new Address("Balikiri","Sudheerkumar",976548,"Sudheer@123",23456,"A.P"));
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.view contacts");
            System.out.println("2.edit contacts");
            System.out.println("3.exit");

            System.out.println("enter your choice");
             int choice=sc.nextInt();
                 sc.nextLine();
             switch (choice){
                 case 1:
                     viewContact();
                     break;
                 case 2:
                     editContact(sc);
                     break;
                 case 3:
                     System.out.println("exitng program good bye");
                     System.exit(0);
                 default:
                     System.out.println("Invalid choice");
                     
                 }

             }
        }


    private static void viewContact() {
        System.out.println("contacts");
        for(Address address:contacts.values()){
            System.out.println(address);
        }
    }
    private static void editContact(Scanner sc){
        System.out.println("enter the name of the person to edit");
        String fname=sc.nextLine();

        if(contacts.containsKey(fname)){
            System.out.println("enter new details for "+fname+":");

            System.out.print("lname");
            String lname=sc.nextLine();
            System.out.print("Email");
            String mail=sc.nextLine();
            System.out.print("phone number");
            long phonenumber=sc.nextLong();
            System.out.print("zip");
            long zip=sc.nextLong();
            System.out.print("State");
            String state=sc.nextLine();

            Address updateAddress=new Address(fname,lname,phonenumber,mail,zip,state);
            contacts.put(fname,updateAddress);
            System.out.println("contact update successfully");


        }
        else{
            System.out.println("contact not found");
        }
    }
}
