/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

import java.util.Scanner;


public class LoginSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login login = new Login();   // Login class object

        // ====================== REGISTRATION ======================
        System.out.println("=== USER REGISTRATION ===");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Create username: ");
        login.setUsername(input.nextLine());

        System.out.print("Create password: ");
        login.setPassword(input.nextLine());

        System.out.print("Enter cell phone number: ");
        login.setNumber(input.nextLine());

        // Register the user
        String registrationMessage = login.registerUser(firstName, lastName);

        System.out.println("\n" + registrationMessage);

        // ====================== LOGIN ======================
        if (registrationMessage.contains("successful")) {
            System.out.println("\n=== LOGIN ===");

            System.out.print("Enter username: ");
            String enteredUsername = input.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = input.nextLine();

            String loginStatus = login.loginUser(enteredUsername, enteredPassword);
            System.out.println(loginStatus);
        } else {
            System.out.println("Registration failed. Cannot proceed to login.");
        }

        input.close();
    }
}
        
        



