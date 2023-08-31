/* Assume that day can be any value between 1 (Monday) and 7 (Sunday). There's also a boolean variable: holiday. */

// TAKS 1: 
/* 
In the event of a holiday, print:
Woohoo, no work

During the weekend (Saturday or Sunday), print:
It's the weekend, no work!

Otherwise, print:
Wake up at 7:00 :(
 */

public class Workbook_3_5 {

    public static void main(String[] args) {
        
        int day = 7;   //3rd day of the week...
        boolean holiday = false;
         
        // IF - ELSE IF - ELSE HERE!
        if (holiday) {
            System.out.println("Woohoo, no work!");
        } else if (day > 5 && day <= 7) {
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
        
        

    }
    
}
