/**
 *
 * @author jasonstoddard
 */
import java.util.*;
public class FutureInvestment {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //set variables
        double futureInvestmentAmount, investmentAmount, monthlyInterestRate;
        int numberOfYears;
        //user input
        System.out.println("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.println("Enter current interst rate: ");
        monthlyInterestRate = input.nextDouble();
        //set interest rate
        monthlyInterestRate = monthlyInterestRate / 100 ;
        System.out.println("Enter number of years: ");
        numberOfYears = input.nextInt();
        //calculate
        futureInvestmentAmount = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        //outout result
        System.out.printf("Accumulated Value is $%.2f" , futureInvestmentAmount);
    }  
}
