/**
 *
 * @author jasonstoddard
 */
import java.util.*;
public class Years {
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);
        //declare varibles 
        long minutes, hours,years, totalDays, days; 
        //user inout
        System.out.println("Please enter the number of minutes: ");
        minutes = input.nextLong(); 
        //calculations
        hours = minutes / 60;
        totalDays = hours / 24;
        years = totalDays / 365;
        days = totalDays % 365;
        // output result
        System.out.println(minutes + " minutes is about " + years + " years and " + days + " days.");     
        
    }   
}