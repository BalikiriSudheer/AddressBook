package com.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Address> Details;

    public AddressBook() {
        this.Details = new ArrayList<>();
    }

    public void addDetails(Address address) {
        Details.add(address);
    }

    public void removeDetails(){


        System.out.println("Contacts in the Address Book:");
        for (Address address : Details) {
            System.out.println(address);
        }
    }



    public void viewDetails(){
        if(Details.isEmpty()){
            System.out.println("There is no Details");
        }
        else{
            System.out.println("Your Address Details are:");
            for(Address list:Details){
                System.out.println(list.getFname()+" "+list.getLname()+" "+list.getMail()+" "+list.getPhone()+" "+list.getZip()+" "+list.getState());
            }
        }
    }

    public static void main(String[] args) {
        Address a1=new Address("Balikiri","sudheerkumar",789654328,"sudheer@123",34567,"Andhra");
        Address a2=new Address("Balikiri","Badri",4567899,"ABC@123",4578,"ANDHRA");
        Address a3=new Address("balikri","SUDHEER",234567,"CDE@234",23456,"Andhra");
        AddressBook ab=new AddressBook();
        ab.addDetails(a1);
        ab.addDetails(a2);
        ab.addDetails(a3);
        ab.viewDetails();

    }

}
