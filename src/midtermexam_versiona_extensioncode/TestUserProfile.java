/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author okami
 */
import java.util.*;
public class TestUserProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To create a new profile, please enter your name");
        String user = input.nextLine();
        System.out.println("Enter your favourite genre:");
        System.out.println("Comedy, Drama, Action, Mystery");
        String favGenre = input.nextLine();
        UserProfile profile = new UserProfile(user, favGenre);
        System.out.println("Your userProfile has been created");
    }
}
