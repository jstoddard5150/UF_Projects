/**
 *
 * @author Jason Stoddard
 */
import java.util.*;
public class Digits {
    public static void main(String[] args) {
        //start new scanner
        Scanner input = new Scanner(System.in);
        //set variables
        int userInput, result, thousandsPlace, hundredsPlace, tensPlace, onesPlace;//assign one number
        String error = "Please enter a number between 0 and 1000.";
        //Output question
        System.out.println("Enter a nuber between 0 and 1000");
        userInput = input.nextInt();
        //add error check
        if  (0 > userInput) {
            System.err.println(error);
        }else {
        if (userInput > 1000){
            System.err.println(error);
        }else {
        //extract numbers 
        thousandsPlace = userInput /1000;
        hundredsPlace = (userInput / 100) % 10;
        tensPlace = (userInput / 10) % 10;
        onesPlace = userInput % 10;
        //add numbers
        result = thousandsPlace + hundredsPlace + tensPlace + onesPlace;
        //output results
        System.out.println("The sum of the digits is: " + result);}
    }
    }
}
