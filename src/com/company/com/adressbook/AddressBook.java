package com.company.com.adressbook;

import com.company.com.personcontact.PersonContact;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<PersonContact> personArrayList = new ArrayList<PersonContact>();
    static Scanner scan = new Scanner(System.in);
    PersonContact personContact = new PersonContact();

    public void addPersonDetails() {

        System.out.println("Please enter the First Name: ");
        String fName = scan.nextLine();
        String finalFName = fName;
        while(personArrayList.stream().anyMatch(s -> s.firstName.equalsIgnoreCase(finalFName))){
            System.out.println("Name Already exists, Please enter a New Name");
            fName = scan.nextLine();
        }
        System.out.println("Please enter the Last Name: ");
        personContact.setLastName(scan.nextLine());
        System.out.println("Please enter the Address: ");
        personContact.setAddress(scan.nextLine());
        System.out.println("Please enter the City: ");
        personContact.setCity(scan.nextLine());
        System.out.println("Please enter the State: ");
        personContact.setState(scan.nextLine());
        System.out.println("Please enter the Zip: ");
        personContact.setZip(scan.nextLine());
        System.out.println("Please enter the Phone Number: ");
        personContact.setpNo(scan.nextLine());
        System.out.println("Please enter the Email: ");
        personContact.setEmail(scan.nextLine());
        personArrayList.add(personContact);
    }

    public void viewPersons() {
        personArrayList.stream().forEach(s -> {
            System.out.println("First Name : " + s.firstName);
            System.out.println("Last Name : " + s.lastName);
            System.out.println("Address : " + s.address);
            System.out.println("City : " + s.city);
            System.out.println("State : " + s.state);
            System.out.println("Zip : " + s.zip);
            System.out.println("Phone Number : " + s.pNo);
            System.out.println("Email : " + s.email);
        });
    }

    public void editPersonDetails() {
        System.out.println("Enter the First Name of the Person");
        String fName = scan.nextLine();
        personArrayList.stream().filter(s -> s.firstName.equals(fName)).peek(s->{
            PersonContact personContact = s;
        });
        System.out.println(personContact.firstName);
        System.out.println("What do you want to edit?\n" +
                "1) Last Name" +
                "2) Address" +
                "3) City" +
                "4) State" +
                "5) Zip" +
                "6) Phone Number" +
                "7) Email");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the New Last Name");
                personContact.setLastName(scan.nextLine());
                break;
            case 2:
                System.out.println("Enter the New Address");
                personContact.setAddress(scan.nextLine());
                break;
            case 3:
                System.out.println("Enter the New City");
                personContact.setCity(scan.nextLine());
                break;
            case 4:
                System.out.println("Enter the New State");
                personContact.setState(scan.nextLine());
            case 5:
                System.out.println("Enter the New Zip");
                personContact.setZip(scan.nextLine());
            case 6:
                System.out.println("Enter the New Phone Number");
                personContact.setpNo(scan.nextLine());
            case 7:
                System.out.println("Enter the New Email");
                personContact.setEmail(scan.nextLine());
        }
    }

    public void deletePersonDetails() {
        System.out.println("Enter the First Name of the Person whose contact you want to delete.");
        String fName = scan.nextLine();
        personArrayList.stream().filter(s -> s.firstName.equals(fName)).peek(s->{
            PersonContact personContact = s;
        });
        personArrayList.remove(personContact);
    }

    public void addMultiplePerson() {
        System.out.println("How Many People do you want to add?");
        int numOfPeople = scan.nextInt();
        for(int i = 0; i < numOfPeople; i++){
            addPersonDetails();
        }
    }


}
