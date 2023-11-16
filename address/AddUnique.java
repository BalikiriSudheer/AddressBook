package com.address;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddUnique {
    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String addressBookName) {
        addressBooks.put(addressBookName, new AddressBook());
        System.out.println("Address Book '" + addressBookName + "' added successfully.");
    }

    public void displayAddressBooks() {
        System.out.println("Available Address Books:");
        for (String addressBookName : addressBooks.keySet()) {
            System.out.println(addressBookName);
        }
    }

    public static void main(String[] args) {
        AddUnique unique= new AddUnique();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Address Book");
            System.out.println("2. Display Address Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new Address Book: ");
                    String newAddressBookName = scanner.next();
                    unique.addAddressBook(newAddressBookName);
                    break;

                case 2:
                    unique.displayAddressBooks();
                    break;

                case 3:
                    System.out.println("Exiting the Address Book System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}
