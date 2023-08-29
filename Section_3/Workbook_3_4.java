// TASK 1: 
/*
Update the forecast.
Update the forecast variable based on the temperature.
Less than or equal to -1

The forecast is FREEZING! Stay home!

Less than or equal to 10

The forecast is Chilly. Wear a coat!

Otherwise

It's warm. Go outside!

Test cases (temperature): 25, -1, 0, 10, 11, -12 
 */
public class Workbook_3_4 {
    
    public static void main(String[] args) {
        
        int temp = 10;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp <= -1) {
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp <= 10) {
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }
        
        System.out.println(forecast);

    }

}
