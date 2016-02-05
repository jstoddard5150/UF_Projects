
/**
 *
 * @author Jason Stoddard
 */
//import scanner class
import java.util.*;
public class Temperatures {
    public static void main(String[] args) {
        //Input Scanner
        Scanner input = new Scanner(System.in);
        // Print question on console
        System.out.printf("Please enter a temperature in celcius to convert"
                + " it to fahrenhiet: ");
        //set variables
        final String degree = "\u00b0";//unicode degree symbol
        double temp1 = input.nextDouble();
        double result = temp1 * (9.0/5) + 32;// compute conversion factor
        //output results
        System.out.println(temp1 + degree + "celcius = " + result + degree+ " fahrenheit");
    }    
}
