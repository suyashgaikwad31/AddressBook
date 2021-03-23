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
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Main obj = new Main();
        obj.Contacts();
        
    }



}