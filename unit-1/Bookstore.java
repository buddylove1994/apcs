// Rothanak So
// This program will calculate the markup amount and wholesale amount of
// the inputted price of a book that has been marked up 10%.

import java.util.Scanner;

class Bookstore
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        double factor = 0.1;    // markup percentage (10%)
        double retail;          // sales price of book
        double markup;          // markup amount
        double wholesale;       // wholesale value

        // Get sales price
        System.out.print("Enter the sales price of the book: ");
        retail = reader.nextDouble();

        // Find markup and wholesale amounts
        markup = factor * retail;
        wholesale = retail - markup;

        // Display markup and wholesale amounts
        System.out.println("The book's markup amount is $" + markup);
        System.out.println("The book's wholesale value is $" + wholesale);
    }
}