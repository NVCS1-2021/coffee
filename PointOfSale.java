import java.util.Scanner;

/**
 * Write a description of class PointOfSale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointOfSale
{
    // instance variables - replace the example below with your own
    public static double subtotal = 0.00;
    public static boolean done = false;
    public static Scanner kboard;
    
    public static void main(String[] args) {
        kboard = new Scanner(System.in);
        while (!done) {
            menu();
        }
    }
    
    public static void menu() { //define method
        System.out.println("Menu:"); //print text to console
        System.out.println("1) Regular Coffee ($7.99)");
        System.out.println("2) Breakfast Croissant ($5.99)");
        System.out.println("9) Total the Order");
        System.out.println("0) Exit");
        System.out.println("Subtotal: $"+subtotal);
        System.out.print("Your selection: ");
        String input = kboard.nextLine(); //get user input
        if (input.equals("0")) {
            done = true;
        }
    }
    
    public static void orderItem(String itemName, double price, String opt1Name, double opt1Price, String opt2Name, double opt2Price) {
        double itemSubtotal = price;
        boolean optionDone = false;
        System.out.println(itemName+":");
        while (!optionDone) {
            System.out.println("Do you want "+opt1Name+" for $"+opt1Price+" more (y/n)");
            String input = kboard.nextLine();
            if (input.substring(0,1).equalsIgnoreCase("y")) {
                itemSubtotal += opt1Price;
                optionDone = true;
            }
            else if (input.substring(0,1).equalsIgnoreCase("n")) {
                optionDone = true;
            }
            else {
                System.out.println("Error: Invalid input");
            }
        }
        
    }
}
