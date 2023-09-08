// TASK 1: Pick up the user's decision

// TASK 2: Task 2 - if - else
// If the decision is 'yes', ask the user about their savings and debt. If the decision is anything other than 'yes', print: 'OK. Have a nice day!'.

// TASK 3 - Pick up the savings and debt values
// Pick up and store the savings and debt values.

// TASK 4 - Pick up the number of years working

// TASK 5 - Pick up the user's name

// TASK 6 - Logical Operator
/* Use a logical operator to check if the user has
at least $10,000 in their savings account.
less than $5,000 in credit card debt.
more than 2 years of work experience.

If they meet the requirements, print:
Congratulations <name>, you have been approved!

Otherwise, print:
Sorry, you are not eligible for a mortgage.

Finally, use these values:
savings: 20000
debt: 1500
years: 7
*/



import java.util.Scanner;

public class Workbook_3_7 {

     public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();
        
        if (decision.equals("yes")) {
            
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
                  // Task 3 - Pick up each value 
            double savings = scan.nextInt();
            double debt = scan.nextInt();
            System.out.println("\nHow many years have you worked for?");
            scan.nextLine();
               // Task 4 - Pick up number of years
            int years = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your name?");
               // Task 5 - Pick up the user's name
            String name = scan.nextLine();
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.
            if (savings >= 10000 && debt < 5000 && years > 2) {
                System.out.println("Congratulations "+ name +" You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        } else {
            System.out.println("OK. Have a nice day!");
        }
          

        scan.close();
    }
    
}
