public class ReturnValues {
    
    public static void main(String[] args) {
        
        // Values in () are called arguments, which are then passed to function
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.3);

        System.out.println("Area 1: " + area1 + "\nArea 2: " + area2 + "\nArea 3: " + area3);

    }

    // double length = first parameter which recieves first argument, double width = second parameter which recieves second argument from inside main function
    // 1. function must define a return type (example: double); 2. function must return a value; 3. the function call retains the return value
    public static double calculateArea(double length, double width) {

            double area = length * width;
            return area;

        }

}
