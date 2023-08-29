// TASK 1: Make an int variable called margin. It will calculate the margin of points gryffindor scored over ravenclaw.

// TASK 2: if - else if - else
/*
If gryffindor wins by a margin of 300 points or more, print:
Gryffindor takes the house cup!

If gryffindor wins by a margin of any points or ties, print:
In second place, Gryffindor!

If gryffindor loses within 100 points, print:
In third place, Gryffindor!

else, print:
In fourth place, Gryffindor!
*/

// TASK 3: Test cases(points for team 1 / team 2): 400/200; 850/500; 620/500; 450/500; 100/500

public class Workbook_3_3 {

    public static void main(String[] args) {

        int gryffindor = 850;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = (gryffindor - ravenclaw);

        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

    }
    
}
