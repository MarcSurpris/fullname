package org.Pluralsight;

public class Main {
    public static void main(String[] args) {


        /*String s1 = "ABC";

        String prefix = "A";
        String s2 = prefix + "BC";

        System.out.println("This is s1: " + s1);
        System.out.println("This is s2: " + s2);

        if (s1 == s2) {
            System.out.println("Both strings are the same!");
        } else {
            System.out.print("Both strings are not the same!");

         */

        String fullName = "Raymond Maroun";

        int length = fullName.length();
        System.out.println(length);

        System.out.println("==================================");

        String username = "  bambam     ";
        System.out.println(username);

        String trimmedUserName = username.trim();
        System.out.println(trimmedUserName);

        System.out.println("============================");

        String name = "Marc";
        System.out.println(name.toUpperCase());

        System.out.println("=====================");

        String secondName = "Raymond";

        if (secondName.startsWith("ray")) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }

        System.out.println("=======================");

        String discountCode = "SAVE-50";

        if (discountCode.toLowerCase().endsWith("-50")) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }


        }
    }
