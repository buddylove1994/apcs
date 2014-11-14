// Rothanak So
// This program will calculate the total sales price and total markup
// amount of a series of books purchased using the input sales price of
// each, in addition to finding the markup and wholesale value of the
// books individually.

import java.util.Scanner;

public class BookstoreMulti
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        double factor = 0.1;    // markup percentage (10%)
        double retail;          // sales price of current book
        double markup;          // markup amount of current book
        double wholesale;       // wholesale value of current book

        double totalRetail = 0;     // total sales prices of all books
        double totalMarkup = 0;     // total markup amount of all books

        // Get sales values
        System.out.print("Enter the sales price of the book, " +
            "or type a negative number to quit: ");
        retail = reader.nextDouble();

        while (retail > 0) {

            // Find markup and wholesale amounts
            markup = factor * retail;
            wholesale = retail - markup;

            // Add to total retail and markup
            totalRetail += retail;
            totalMarkup += markup;

            // Display markup and wholesale amounts
            System.out.println("The markup amount is $" + markup);
            System.out.println("The wholesale value is $" + wholesale);

            // Get next sales value
            System.out.print("Enter the sales price of the book, " +
                "or type a negative number to quit: ");
            retail = reader.nextDouble();

        }

        // Display total retail and markup of all books
        System.out.println("The total sales price is $" + totalRetail);
        System.out.println("The total markup amount is $" + totalMarkup);
        
        // Close reader
        reader.close();
    }
 }