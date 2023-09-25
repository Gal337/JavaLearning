/* Task 1: Ask Bart to enter the line.
Ask Bart to enter the line he wants to write.
I will not forget semi-colons;
*/

import java.util.Scanner;

public class Workbook_5_2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.");
        System.out.println("What do you want me to write?");
        
        String input = scan.nextLine();

        for (int i = 1; i < 100; i++) {
            System.out.println(i + ". " + input);
        }

    }

}
