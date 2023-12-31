/**
 * Workbook 5.6 uses control flow to check if numbers are even or odd.
 * 
 * 0 - even
 * 1 - odd
 * 2 - even
 * etc..
 * 
 * Task 1
   Make a for loop that counts from 0 to 19.

 * Task 2
   Using an if - else statement, mark each number as even or odd.
 * 
 */

public class Workbook_5_6 {

  public static void main(String[] args) {
    
    for (int i = 0; i <= 19; i++) {
      if (i%2==0) {
        System.out.println(i + " - even");
      } else {
        System.out.println(i + " - odd");
      }
    }

  }
    
}
