/*
23/5.0 creates a different result because 5.0 is written in float-point form. 
Java recognizes this and reads the number as a float. When you omit the decimal 
Java recognizs it as a data type of int and truncates the remainder. 
 */

/**
 *
 * @author jasonstoddard
 */
public class MathBehavior {
    public static void main (String[] args){
    System.out.println("23/5 is " + 23/5);
    System.out.println("23/5.0 is " + 23/5.0);
}
}
