/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

Keep the input, processing, and output parts of your program separate. Collect the input,
then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges

Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int item1Price = readPriceOfItem1();
        int item1Amount = readAmountOfItem1();
        int item2Price = readPriceOfItem2();
        int item2Amount = readAmountOfItem2();
        int item3Price = readPriceOfItem3();
        int item3Amount = readAmountOfItem3();
        double subtotal = readSubtotal(item1Price, item1Amount, item2Price, item2Amount, item3Price, item3Amount);
        float tax = readTax(subtotal);
        generateTotal(subtotal, tax);
    }

    private static void generateTotal(double subtotal, float tax) {
        double total = subtotal + tax;
        System.out.println(String.format("Total: $%.2f", total));
    }

    private static float readTax(double subtotal) {
        float taxRate = (float) (subtotal * .055);
        System.out.println(String.format("Tax: $%.2f", taxRate));
        return taxRate;
    }

    private static double readSubtotal(int item1Price, int item1Amount, int item2Price, int item2Amount, int item3Price, int item3Amount) {
        double total =  (item1Price * item1Amount) + (item2Price * item2Amount) + (item3Price * item3Amount);
        System.out.println(String.format("Subtotal: $%.2f", total));
        return total;
    }

    private static int readPriceOfItem1() {
        System.out.print("Enter the price of item 1: ");
        return in.nextInt();
    }

    private static int readAmountOfItem1() {
        System.out.print("Enter the quantity of item 1: ");
        return in.nextInt();
    }

    private static int readPriceOfItem2() {
        System.out.print("Enter the price of item 2: ");
        return in.nextInt();
    }

    private static int readAmountOfItem2() {
        System.out.print("Enter the quantity of item 2: ");
        return in.nextInt();
    }

    private static int readPriceOfItem3() {
        System.out.print("Enter the price of item 3: ");
        return in.nextInt();
    }

    private static int readAmountOfItem3() {
        System.out.print("Enter the quantity of item 3: ");
        return in.nextInt();
    }
}
