// TASK 1: Update your number of apples based on the printed messages.

//TASK 2: Increase your number of customers based on the printed messages.

// TASK 3: Make a price variable and set it equal to 0.40.

// TASK 4: Replace each placeholder with a variable.



public class Workbook_2_3 {
    
    public static void main(String[] args) {
        
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
        


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");
        double price = 0.40;
        
        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples -= 4;
        numOfCustomers++;
        profit += 4*price;
        
        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples -= 20;
        numOfCustomers++;
        profit += 20*price;
        
        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples -= 200;
        numOfCustomers++;
        profit += 200*price;
        
        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " + numOfApples + " apples left.");


    }

}
