// TASK 1: Use Scanner to pick up each response.

// TASK 2: Print the data that you picked up.

// TASK 3: 

import java.util.Scanner;

public class Workbook_2_5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        System.out.println("\nWhat is your first name?");
        String name = scan.nextLine();
        
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();

        System.out.println("\nMake a username");  
        scan.nextLine();
        String username = scan.nextLine();
        
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        System.out.println("\nWhat country is that?");
        String country = scan.nextLine();
        
        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: "+ name);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: "+ age);
        System.out.println("\tUsername: "+ username);
        System.out.println("\tCity: "+ city);
        System.out.println("\tCountry: "+ country);

        //close scanner. It's good practice! 
        scan.close();
    }
    
}
