/**
 * Task 1: See if the user wants to play

Use Scanner to pick up the user's response.
>>Let's play Rock Paper Scissors.
>>When I say 'shoot', Choose: rock, paper, or scissors.
>>
>>Are you ready? Write 'yes' if you are
 */

 /**
  * Task 2: Set up the game.

- if the answer is yes:
   -- print: Great!
   -- print: rock - paper - scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3).
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- else:
   -- print: Darn, some other time...!

Here, the user would enter rock paper or scissors. Using Scanner, pick up their choice.
- if the answer is yes:
   -- print: Great!
   -- print: rock - paper - scissors, shoot!
   -- pick up user's choice. <----------
   -- get the computer choice (can be done after task 3).
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- else:
   -- print: Darn, some other time...

There are more instructions for the if statement. You cannot do them until you finish tasks 3, 4, and 5.
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3). <------
   -- get the result (can only be done after task 4) <-------
   -- print everything (can only be done after task 5). <--------
- else:
   -- print: Darn, some other time...

So, you're left with the else block. If the user doesn't enter "yes", print: Darn, some other time...!
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3).
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- else: <---------------
   -- print: Darn, some other time...
  */

import java.util.Scanner;

/**
   * Task 3: Generate a random choice



You'll write a function that picks randomly between rock paper scissors.
Function name:


 * Function name: computerChoice <--------
 * @return a choice (String).
 *
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 1: return the choice 'rock'
 *      if 2: return the choice 'paper'
 *      if 3: return the choice 'scissors'

 Parameters: The function takes no parameters.
 Return type:

 * Function name: computerChoice
 * @return a choice (String). <------
 *
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 0: return the choice 'rock'
 *      if 1: return the choice 'paper'
 *      if 2: return the choice 'scissors'
 
 Inside the function, generate a random number between 0 and 2. Based on the result, return rock, paper or scissors.

 * Function name: computerChoice
 * @return a choice (String).
 *
 * Inside the function: <----------
 *   1. Picks a random number between 0 and 2.
 *   2. if 0: return the choice 'rock'
 *      if 1: return the choice 'paper'
 *      if 2: return the choice 'scissors'

Call the function and store the computer choice.
- if the answer is yes:
   -- print: Great!
   -- print: rock -- paper -- scissors, shoot!
   -- pick up user's choice.
   -- get the computer choice (can be done after task 3). <------------
   -- get the result (can only be done after task 4)
   -- print everything (can only be done after task 5).
- else:
   -- print: Darn, some other time...
   */
public class Challenge_4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("\nWhen I say 'shoot', choose: rock, paper, or scissors.");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String response = scan.nextLine();

        if (response.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("\nrock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            
        } else {
            System.out.println("\nDarn, some other time...!");
        }
    }

    public static String computerChoice() {
        int randomNumber = (int)(Math.random() * 3);
        
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else if (randomNumber == 2) {
            return "scissors";
        } else {
            return "Error 404";
        }
    }
}
