public class Parameters {

    public static void main(String[] args) {
        
        // Values in () are called arguments, which are then passed to function
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);

    }

    // double length = first parameter which recieves first argument, double width = second parameter which recieves second argument from inside main function
    public static void calculateArea(double length, double width) {

            double area = length * width;
            System.out.println("Area: " + area);

        }
    
}
