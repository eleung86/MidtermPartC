/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Edmund Leung
 * 991531421
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Choose your favourite genre (Comedy, Drama, Action, Mystery): ");
        String genre = input.nextLine();
        
        UserProfile user = new UserProfile(name, genre);
        
        System.out.println("Your user profile has been created");
        System.out.println("User Profile: " + name + " | Genre: " + genre);
        
        
    } //end main
} //end class