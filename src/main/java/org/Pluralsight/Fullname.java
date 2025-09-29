package org.Pluralsight;

import java.util.Scanner;

public class Fullname {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String first_name = scanner.nextLine();

        System.out.print("Please enter your middle initial: ");
        String middle_name = scanner.nextLine();

        System.out.print("Please enter your last name : ");
        String last_name = scanner.nextLine();

        System.out.println("Full name: " + first_name + " " + middle_name + " " + last_name);


    }
}
