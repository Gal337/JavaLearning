/**
 * TASK 1: Calculate area of a square
 * Name: areaSquare  <------
 * @param side (double)
 * @return the area (double)
 *
 * Inside the function:
 *  1. If side is negative
 *        - prints "Impossible"
 *        - shuts the app down
 *  2. Calculates the area of the square. A = side²
 */

 /**
 * TASK 2: Calculate area of a rectangle
 * Name: areaRectangle    <------
 * @param length (double).
 * @param width  (double).
 * @return the area (double)
 *
 * Inside the function:
 *  1. If the length OR width is negative
 *       - print "Error: impossible" and
 *       - terminate the program.
 *  2. return the area: length * width
 */

 /**
 * TASK 3: Calculate area of a triangle
 * Name: areaTriangle
 * @param base: (double).
 * @param height: (double).
 * @return the area (double)
 *
 * Inside the function:
 *  1. If the base OR height is negative
 *      - print "Error: impossible"
 *      - terminate the program.
 *  2. return the area: base * height / 2
 */

 /**
 * TASK 4: Calculate area of a circle
 * Name: areaCircle
 * @param radius (double).
 * @return area (double)
 *
 * Inside the function:
 *  1. If the radius is negative
 *      - print: Impossible
 *      - terminates the program
 *  2. returns the area: π * radius2
 */

 /**
 * TASK 5: 
 * Using the appropriate function, calculate the area for:
 * a square with a side of 2 cm.
 * a rectangle with a length of 1 cm, and a width of 2 cm.
 * a triangle with a base of 1 cm, and a height of 2 cm.
 * a circle with a radius of 2 cm
 */

 /**
 * TASK 6: Write a function that prints every area
 * Name: printAreas -- it prints four areas
 * @param square (double)
 * @param rectangle (double)
 * @param triangle (double)
 * @param circle (double)
 *
 * Inside the function:
 *  1. print: ("Square area: <square area>")
 *  2. print: ("Rectangle area: <rectangle area>")
 *  3. print: ("Triangle area: <triangle area>")
 *  4. print: ("Circle area: <circle area>")
 */

/**
  * TASK 7: Call the printAreas function
  */

public class Workbook_4_5 {
    
    public static void main(String[] args) {
      
        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        printAreas(square, rectangle, triangle, circle);
      

    }

    public static double areaSquare (double side) {

        if (side < 0) {
            System.out.println("Impossible.");
            System.exit(0);
        } 

        return Math.pow(side, 2);
    }

    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }
        return length * width;
    } 

    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }

        return (base*height)/2;
    }

    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Not possible");
            System.exit(0);
        }
        return Math.PI*Math.pow(radius, 2);
    }

    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }

}
