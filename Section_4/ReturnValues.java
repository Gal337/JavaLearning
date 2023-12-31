public class ReturnValues {
    
    public static void main(String[] args) {
        
        // Values in () are called arguments, which are then passed to function
        double area1 = calculateArea(2.3, 3.6);
        
        printArea(2.3, 3.6, area1);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);

        System.out.println("Area 1: " + area1);

    }

    // double length = first parameter which recieves first argument, double width = second parameter which recieves second argument from inside main function
    // 1. function must define a return type (example: double); 2. function must return a value; 3. the function call retains the return value
    public static double calculateArea(double length, double width) {
            if (length < 0 || width < 0) {
                System.out.println("Invalid dimensions!");
                System.exit(0);
            }
            double area = length * width;
            return area;

        }

    // 
    public static String explainArea(String language) {

        switch (language) {
            case "English": return "Area equals length * width";
                   
            case "French": return "La surface est egale a la longueur * la largeur";
                  
            case "Spanish": return "area es igual a largo * ancho";

            default: return "Language not available";

        }

    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area);
    }

}
