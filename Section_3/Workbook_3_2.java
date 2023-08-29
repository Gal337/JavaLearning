// Scenario 1: If you have enough money, display Sure! and update the wallet value.

// Scenario 2: If you don't have enough money, display Sorry I only have <wallet> left.

public class Workbook_3_2 {

    public static void main(String[] args) {
        
        double wallet = 100;
       
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.
        if (wallet > toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry, I only have " + wallet + "$ left.");
        }
        
        
        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.  
        if (wallet > nike) {
            System.out.println("Sure!");
            wallet -= nike;
        } else {
            System.out.println("Sorry, I only have " + wallet + "$ left.");
        }

    }
    
}
