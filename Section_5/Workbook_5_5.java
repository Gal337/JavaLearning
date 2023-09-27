import java.util.Scanner;

/**
 * Workbook 5.5 considers user input to define the start, stop, and step.
 * I hear you like to count by threes.
 * 
 * Jimmy: It depends.
 * Oh, ok...
 * 
 * 
 * 1. Pick a number to count by: 3
 * 2. Pick a number to start counting from: 6
 * 3. Pick a number to count to: 66
 * 
 * Task 1 - Get integers from the user.
   You'll ask the user three questions:
   1. Pick a number to count by: <number>
   2. Pick a number to start counting from: <number>
   3. Pick a number to count to: <number>
   The user will submit his answer BESIDE each question:
 * 
 * 
 * Task 2 - Write a loop
   Make a for loop that:
   starts from the second number.
   stops at the third number.
   counts in steps of the first.
   Then, print your count in ONE line.
 * 
 * 
 */

public class Workbook_5_5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  

        System.out.println("I hear you like to count by threes.");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");
        
        System.out.print("1. Pick a number to count by: ");
        int countBy = scan.nextInt();

        System.out.print("2. Pick a number to start counting from: ");
        int startCount = scan.nextInt();

        System.out.print("3. Pick a number to count to: ");
        int countTo = scan.nextInt();

        for (int i = startCount ; i <= countTo; i += countBy) {
          System.out.print(i + " ");
        }

    }

}
