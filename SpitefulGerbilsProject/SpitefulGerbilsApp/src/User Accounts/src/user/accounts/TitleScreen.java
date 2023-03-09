


package user.accounts;

/**
 *
 * @author ojaylan4
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.ArrayList; // import the ArrayList class

public class TitleScreen 
{
       
        
    public static void signUp() throws IOException 
    {
        FileWriter writer = new FileWriter("user_info.txt",true); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter user name");
        String name = scanner.nextLine();
        System.out.println("Please Enter user email address");
        String email = scanner.nextLine();
        System.out.println("Please Enter user password");
        String password = scanner.nextLine();
        writer.write(name+","+email+","+password+"\n");
        writer.close();
        signIn(); 
    }
    public static void signIn() throws IOException 
    {
        FileReader reader = new FileReader("user_info.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Sign in");
        System.out.println("Enter your email: ");
        String email_login = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password_login = scanner.nextLine();
        String line;
        while ((line = bufferedReader.readLine()) != null)
        {
            String line_split[]=line.split(",");
            //System.out.println(email_login);
            //System.out.println(line_split[1]);
            //System.out.println(password_login);
            //System.out.println(line_split[2]);
            if(line_split[1].equals(email_login) && line_split[2].equals(password_login))
            {
                reader.close();
                System.out.println("success");
                System.exit(0);
                // Create user object with the following properties: name, password, email
                // Characters class will need to extend this user object
            }
        }
        reader.close();
        System.out.println("Username or Password Incorrect");
        signIn();
        }
    }
