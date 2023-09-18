public class ReturnValues {
    
    public static void main(String[] args) {
        
        // Values in () are called arguments, which are then passed to function
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.3);

    }

    // double length = first parameter which recieves first argument, double width = second parameter which recieves second argument from inside main function
    // 1. function must define a return type (example: double); 2. function must return a value; 3. the function call retains the return value
    public static double calculateArea(double length, double width) {

            double area = length * width;
            return area;

        }

}
