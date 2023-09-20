import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
        
    }
    
    public static int rollDice () {
        double randomNumber = Math.random() * 6;
        randomNumber += 1; // value will always be between 1 - 6.999999999999
        return (int)randomNumber;
    }

}
