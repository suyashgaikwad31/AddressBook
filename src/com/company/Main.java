package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<ArrayList<String>> contact = new ArrayList<ArrayList<String>>();
    Scanner scan = new Scanner(System.in);
    public void Contacts() {
        ArrayList<String> addNew = new ArrayList<String>();
        System.out.println("Enter the First Name: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter the Last Name: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter address: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter the City: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter the State: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter the ZIP: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter Phone Number: ");
        addNew.add(scan.nextLine());
        System.out.println("Enter email address: ");
        addNew.add(scan.nextLine());
        contact.add(addNew);

        System.out.println("contact added");
        for(int i = 0; i < contact.size(); i++)
            for(int j = 0; j < contact.get(i).size(); j++) {
                System.out.print(contact.get(i).get(j) + " ");
            }
                System.out.println("Contact Addes Sucessful");

    }
    public void addcontacts() {
        System.out.println( "add to create another contact");
        String condition =  scan.next();
        if (condition.equals("Y")) {
            Contacts();
        } else {
            choiceCondition();
        }
    }

    public void editContact() {
        System.out.print("Edit First Name: ");
        String name = scan.next();
        for(int i = 0; i < contact.size(); i++){
            if(contact.get(i).contains(name)) {
                System.out.println("Edit First Name ");
                for(int j = 0; j < contact.get(i).size(); j++) {
                    System.out.println(j + " " + contact.get(i).get(j));
                }
                System.out.println("Edit Last Name");
                for(int j = 0; j < contact.get(i).size(); j++) {
                    System.out.println(j + " " + contact.get(i).get(j));
                }
                System.out.print("Enter the Number whic do you Want edit ");
                int info = scan.nextInt();
                System.out.print("Enter the new data ");
                String newInfo = scan.next();
                contact.get(i).set(info, newInfo);
                System.out.println("Data Changed ");
                break;
            }
        }
    }

    public void choiceCondition() {
        System.out.println( + contact.size());
        System.out.println("Select condition \n 1) Add New Contact\n 2) Edit Existing Contact\n ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                addcontacts();
                break;
            case 2:
                editContact();
                break;
            default:
                System.out.println("Enter the number");
                choiceCondition();
        }
    }



    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Main obj = new Main();
        obj.choiceCondition();
    }



}