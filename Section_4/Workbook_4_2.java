// Tip the waiter.
// Your bill was $53.50. It's polite to tip the waiter 15% of your bill.

// TASK 1: You will write a function that does this task. Function name: tipTheWaiter. It calculates a tip and prints it.
/*
Parameters: The function takes one parameter named bill of type double.
Return value: the comment says nothing about a return value. So, you can assume the function is void.
Inside the function, implement the following logic:

 *  Function name: tipTheWaiter - calculates a tip and prints it.
 *  @param bill (double).
 *
 *  Inside the function:   <-----
 *   1. Calculates a tip that's 15 percent of the bill you paid.
 *   2. Prints: your service was wonderful! Please, accept this tip: $<tip>


 */

 // TASK 2: Call the function from main().

public class Workbook_4_2 {

    public static void main(String[] args) {
        
        double bill = 53.50;

        System.out.println("Waiter: I hope you enjoyed your meal!");
        
        tipTheWaiter(bill);

    }

    public static void tipTheWaiter (double bill) {

        double tip = bill*0.15;
        
        System.out.println("\nYour service was wonderful! Please, accept this tip: " + tip);

    }

}
