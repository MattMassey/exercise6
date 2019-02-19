package com.company.week1;
import java.util.*;
//Matthew Massey, 2/19/2019
//Program doesn't do much, is just to utilize try/catch statements

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a string");
        System.out.println(promptString(input.nextLine()));
        System.out.println("Please enter an integer");
        System.out.println(promptInt(input.nextLine()));
        System.out.println("Please enter a double");
        System.out.println(promptDouble(input.nextLine()));
    }

    public static String promptString(String message) {
        //This is really roundabout, and looks awful, but it does work!
        boolean isString = false;
        String s; //Dummy variable to check for later
        while (!isString) {
            try {
                Integer.parseInt(message); //Checks if message can be converted to int
                s = null; //If the above statement works, empty the variable
            } catch (Exception e) {
                s = "blank"; //If the parse fails, give s a value
            }
            try {
                Double.parseDouble(message); //Checks if message can be converted to int
                s = null; //If the above statement works, empty the variable
            } catch (Exception e) {
                s = "blank"; //If the parse fails, give s a value
            }
            if (s == null) { //If neither parse statement works, else statement reached
                System.out.println("Invalid input");
                message = input.nextLine();
            } else {
                isString = true; //Exits the while loop
            }
        }
        return message;
    }

    public static int promptInt(String message) {
        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(message);
                isInt = true; //Checks if message can be converted to int, only proceeds once it can
            } catch (Exception e) {
                System.out.println("Invalid input");
                message = input.nextLine();
            }
        }
        return userInt;
    }

    public static double promptDouble(String message) {
        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(message);
                isDouble = true; //Checks if message can be converted to double, only proceeds once it can
            } catch (Exception e) {
                System.out.println("Invalid input");
                message = input.nextLine();
            }
        }
        return userDouble;
    }
}
