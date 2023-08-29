public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("\nMe: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if (biologyGrade > chemistryGrade) {
            System.out.println("Yes you did, congrats!");
        } else {
            System.out.println("No, you did not :(");
        }


        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");
        // Add if-else statement here
        if (sales > costs) {
            System.out.println("Yes we did.");
        } else {
            System.out.println("No, we did not.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if (temperature < targetTemperature) {
            System.out.println("Yes, temperature is lower than usual.");
        } else {
            System.out.println("No, it is not!");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if (currentSpeed < speedLimit) {
            System.out.println("You are driving lower than the speed limit.");
        } else {
            System.out.println("No, you're going too fast!!");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if ( age >= retirementAge) {
            System.out.println("You can retire!");
        } else {
            System.out.println("You still have to work for " + (retirementAge - age) + " years.");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if (myGrade == bestGrade) {
            System.out.println("Yes, you got the highest grade possible!");
        } else {
            System.out.println("No, you can do better!");
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");
        // Add if-else statement here
        if (word.equals(secondWord)) {
            System.out.println("Yes, both words are the same.");
        } else {
            System.out.println("No, these two words are different.");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different");
        // Add if-else statement here
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("They are indeed different.");
        } else {
            System.out.println("Yes, these two words are the same.");
        }
    }
}
