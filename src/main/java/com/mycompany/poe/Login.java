/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
public class Login {
    private String username;
    private String password;
    private String cellPhoneNumber;
            
    private String storedUsername;
    String setUsername;
    String setPassword;
    String setNumber;
    
    public Login() {}
    
    public boolean checkusername() {
        if (username == null) return false;
        return username.contains("_")&&username.length() <=8; 
    }
    public boolean checkPasswordComplexity(){
       if(password == null || password.length() < 8) return false;
       
       boolean hasCapital = false, hasNumber = false, hasSpecial = false;
       
       for(char c : password.toCharArray()){
        if (Character.isUpperCase(c)) hasCapital = true;
        if (Character.isDigit(c)) hasNumber = true;
        if (Character.isLetterOrDigit(c)) hasSpecial = true;
       }
        return hasCapital && hasNumber && hasSpecial;
    }
    public boolean checkCellPhoneNumber() {
        if (cellPhoneNumber == null) return false;
      String cleaned = cellPhoneNumber.replace("_","_");
      return cleaned.startsWith("+27") && cleaned.length() == 12
               && cleaned.substring(3).matches("\\d{9}");
    }

    /**
     *
     * @return
     */
    public String registeredUser() {
        if (!checkusername()) {
        return "Username is not correctly formatted; please ensure that your username contains at underscore and is no more than five characters in length";
       }
        if (!checkPasswordComplexity()){
            return"Password is not correctly formatted; please ensure that your username contains at least eight characters, a capital letter, a number and a special chracter.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell number is incorrectly formatted or doess not contain an international code; please correct the number and try again.";
        }
         this.storedUsername = this.username;
         return "User successfully registered!";
    }

    /**
     *
     * @param enteredUsername
     * @param enteredPassword
     * @return
     */
    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
         if(!loginUser(enteredUsername, enteredPassword)){
             return "Username or password incorrect, please try gain.";
         } else {
             return "Welcome" + storedUsername +", it is great to see you agin.";
         }
     }
     public void setUsername(String username) {this.username = username;}
     public void setPassword(String password) {this.password = password;}
     public void setCellPhoneNumber(String CellPhoneNumber) {this.cellPhoneNumber = cellPhoneNumber;}

    String registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean loginUser(String enteredUsername, String enteredPassword) {
        /*throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody*/return false;
        /*throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody*/
    }

}
    


