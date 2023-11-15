package com.address;

import java.util.Scanner;

public class AddAddressBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBook book=new AddressBook();
        System.out.println("welcome to address book");
        while (true){
            System.out.println("1.add a new contact");
            System.out.println("2.remove contact");
            System.out.println("3.exit");

            System.out.println("enter your choice:");
            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("enter first name:");
                    String fname=sc.nextLine();

                    System.out.println("enter last name");
                    String lname=sc.nextLine();

                    System.out.println("enter phone number");
                    int  phone=sc.nextInt();

                    System.out.println("enter email");
                    String mail=sc.nextLine();

                    System.out.println("enter zip");
                    int  zip=sc.nextInt();

                    System.out.println("enter state");
                    String state=sc.nextLine();

                    Address newadd=new Address(fname,lname,phone,mail,zip,state);
                    book.addDetails(newadd);
                    System.out.println("contact added succesfully");
                    break;
                case 2:
                    System.out.println("all contacts");
                    book.removeDetails();
                    break;

                default:
                    System.out.println("invalid choice:");
            }
        }
    }
}
