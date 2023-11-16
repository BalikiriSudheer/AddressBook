package com.address;

import java.util.Scanner;

public class DeletePesronName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AddressBook book=new AddressBook();
        book.addDetails(new Address("JOHN","SUDHEER",345677,"Sudheer@123",45677,"a.p"));
        book.addDetails(new Address("jane","balikiri",654378,"Abc@123",1234556,"ANDHRA"));


        while(true){
            System.out.println("1.display person");
            System.out.println("2.delete person");
            System.out.println("3.exit");

            System.out.println("enter your choice:");

            int choice=sc.nextInt();
            sc.nextLine();
          switch (choice){
              case 1:
                  book.viewDetails();
                  break;
              case 2:
                  System.out.println("enter person name to delete");
                  String Delete=sc.nextLine();
                  book.deletePerson(Delete);
                  break;
              case 3:
                  System.out.println("exiting program");
                  sc.close();
                  System.exit(0);
              default:
                  System.out.println("invalid choice");
          }
        }

    }
}
