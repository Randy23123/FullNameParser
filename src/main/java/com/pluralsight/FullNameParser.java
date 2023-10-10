package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);{
            String fullName = "", firstName = "", middleName = "", lastName = "";
            System.out.print("Please enter your full name: ");
            fullName = scannner.nextLine().trim();
            firstName = fullName.substring(0, fullName.indexOf(" "));
            fullName = fullName.substring(fullName.indexOf(" ") + 1);
            if(fullName.contains(" ")) {
                middleName = fullName.substring(0, fullName.indexOf(" "));
                fullName = fullName.substring(fullName.indexOf(" ") + 1);
                lastName = fullName;
            }
            else{
                lastName = fullName;
            }
            System.out.println("First name: " + firstName + "\nMiddle name: " + middleName + "\nLast name: " + lastName);

        }
    }
}
