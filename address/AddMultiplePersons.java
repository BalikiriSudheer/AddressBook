package com.address;

import java.util.Scanner;

public class AddMultiplePersons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBook book=new AddressBook();
        char choice;
        do{
            System.out.println("enter person details");
            System.out.println("fname");
            String fname=sc.nextLine();
            System.out.println("lname");
            String lname=sc.nextLine();
            System.out.println("phone");
            long phonenumber=sc.nextLong();
            System.out.println("mail");
            String mail=sc.nextLine();
            System.out.println("zip");
            long zip=sc.nextLong();
            System.out.println("state");
            String state=sc.nextLine();
            book.addPerson(fname,lname,phonenumber,mail,zip,state);
            System.out.println("do you want to add to another person ? (y/n) :");
            choice =sc.nextLine().charAt(0);

        }while (choice=='y' || choice=='Y');
        book.displayAddressBook();
        sc.close();
    }
}
