/* Task 1
Ask Timmy what number he'd like to count up to.

Make sure Timmy can enter the value BESIDE the question.

Task 2
Count from 0 to that number. If Timmy enters 7, your app should should output: 0 1 2 3 4 5 6 7 */

import java.util.Scanner;

public class Workbook_5_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Hi Timmy! Choose a number to count to: ");
        
        int number = scan.nextInt();

        System.out.println("Great! Here's how it's done:");

        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");

        }

    }
    
}
