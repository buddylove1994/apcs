// Rothanak So
// This program will calculate the markup and wholesale values of each book in
// a series of purchases and keep an accumulative total.
// 
// Features
// --------
// - Asks for total number of books at start:
//   - Must buy at least 1 and no more than 9
//   - Gives error of too many or too few, lets user retry
// - Goes through each individual book:
//   - Computes current markup and wholesale
//   - Updates total markup and wholesale
// - When done:
//   - Displays total cost, markup, and wholesale

import java.util.Scanner;

public class MarkupNew
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        final double MARKUP = 0.1;  // constant markup

        // Current books
        double bookRetail;          // sales price
        double bookMarkup;          // markup value
        double bookWholesale;       // wholesale value

        // Accumulative totals
        double allMarkup = 0;       // total markup
        double allWholesale = 0;    // total wholesale
        double allRetail = 0;       // total sales price

        int booksNumber = 0;        // number of books bought

        // Keep asking for # of books if user wants <1 or >9
        // - If booksNumber is bad, the if statements are run and the while loop
        //   keeps asking until a good number is given to make the "while" false
        // - If booksNumber is good, the while loop becomes false and we move on
        
        while (booksNumber < 1 || booksNumber >= 10) {
            System.out.print("How many books are you buying? ");
            booksNumber = reader.nextInt();

            // Too small? Give error.
            if (booksNumber < 1) {
                System.out.println("Error: You must buy at least one book.");
            }
            // Too big? Give error.
            if (booksNumber >= 10) {
                System.out.println("Error: Sorry, too many books.");
            }
            // *~*Fancy*~* divider
            System.out.println("---------------------------------------");
        }

        // Get markup and wholesale of each individual book
        // - Iterates the same # of times as the # of books requested
        // - Automatically stops after last book has been entered, we move on
        
        for (int i=0; i<booksNumber; i++) {
            System.out.print("Enter the price of the book. ");
            bookRetail = reader.nextDouble();

            // Process current book
            bookMarkup = MARKUP * bookRetail;
            bookWholesale = bookRetail - bookMarkup;

            // Update totals
            allMarkup += bookMarkup;
            allWholesale += bookWholesale;
            allRetail += bookRetail;

            // Display results
            System.out.println("The markup value is " + bookMarkup);
            System.out.println("The wholesale value is " + bookWholesale);
            System.out.println("---------------------------------------");
        }

        // All done, display totals
        System.out.println("You bought " + booksNumber + " book(s).");
        System.out.println("Thank you, your total cost is " + allRetail);
        System.out.println("(The total markup was " + allMarkup + ")");
        System.out.println("(The total wholesale was " + allWholesale + ")");
        
        // Close reader
        reader.close();
    }
}