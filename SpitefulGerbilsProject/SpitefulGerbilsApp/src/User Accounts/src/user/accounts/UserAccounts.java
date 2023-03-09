/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.accounts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static user.accounts.TitleScreen.signIn;
import static user.accounts.TitleScreen.signUp;

/**
 *
 * @author ojaylan4
 */
public class UserAccounts 
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        TitleScreen test1 = new TitleScreen();
        
        //test1.menuSelection();
        //test1.createAccount();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to sign up for user account, 2 to log in ");
        int decision = scanner.nextInt();
        if (decision == 1) 
        {
            signUp();
        } 
        else if (decision == 2) 
        {
            signIn();
        }
    }
    
}
