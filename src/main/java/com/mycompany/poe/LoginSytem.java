/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
import java.util.Scanner;


public class LoginSytem {

    private static Object registrationMessage;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            Login login = new Login();
        
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        
         System.out.print("Create username: ");
        login.setUsername = input.nextLine();
        
         System.out.print("Create password: ");
        login.setPassword = input.nextLine();
        
         System.out.print("Enter cell phone number (with +27): ");
        login.setNumber = input.nextLine();
        
        System.out.println("Registration appproved");
        
        if (registrationMessage.equals("User successfully registered!")){
            /* */       System.out.println("Registration failed. Please try aagin, ");
            return;
        }
        
            System.out.println("\n~~~Registration Complete ~~~\n");
            
            System.out.print("Enter username: ");
        
         System.out.print("Enter password: ");
        
        

    }
}
