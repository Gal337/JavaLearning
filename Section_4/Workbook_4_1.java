// TASK 1: Help Bart write a function that does the task for him. The doc comment will guide you.
/*
He needs to write this paragraph 6 times:
I will not copy and paste code.
I will use Camel Case when writing class names.
I will use lower Camel Case when writing function names.
I will use lower Camel Case when writing variables names.
 */

/*
The name of the function is printLines
The comment says nothing about parameters, so you can assume it doesn't take any.
The comment says nothing about a return value. So, you can assume the function is void.
Inside the function, it prints the four lines.
 */

// TASK 2: Once you finish writing it, call the function six times from main()

public class Workbook_4_1 {

    public static void main(String[] args) {
        printLines();
        printLines();
        printLines();
        printLines();
        printLines();
        printLines();

        // Other solution (better looking code)
        for (int i = 0; i < 6; i++) {
            printLines();
        }

    }

    public static void printLines() {
        System.out.println("\nI will not copy and paste code.");
        System.out.println("I will use Camel Case when writing class names.");
        System.out.println("I will use lower Camel Case when writing function names.");
        System.out.println("I will use lower Camel Case when writing variables names.");
    }
    
}
