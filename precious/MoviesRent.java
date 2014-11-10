/* 
 * Created by Precious Rogers thus far
 * Date: 11/9/2014
 * Changes: The Project is being modified all the time to do different things.
 * There will be more projects like this in the near future. What we want to add:
 * - The ability to use Stock 
 * - Every time someone rents the stock will go down
 * - Notify the next  user using it how many are left.
 * - When one of the stocks are out the program will tell them how many are left in the other category 
 * - Ask them if they want to rent
 *     - If the say yes then the rest of the program continues 
 *     - If the say no then it will say anything for shopping 
 * - If both are out of stock say sorry we are out of stock come again later
*/

import java.util.Scanner;

class MoviesRent
{
    public static void main(String[] args )
    {
        // Initialize Scanner
        Scanner reader = new Scanner(System.in);
        
        double priceOld = 2.00;         // cost of oldies
        double priceTop = 3.00;         // cost of top-picks

        int amountOld;                  // number of oldies rented
        int amountTop;                  // number of top-picks rented

        int nightRentOld;               // number of nights for oldies
        int nightRentTop;               // number of nights for top-picks

        double totalCostOld;            // total cost of oldies
        double totalCostTop;            // total cost of top-picks

        int stockOld = 3;               // number of oldies in stock
        int stockTop = 50;              // number of top-picks in stock

        // Keep asking user for movies while stocks are not zero
        while (!(stockOld == 0 && stockTop == 0)) {
            System.out.println("Are you renting a top-pick or oldies movie? (1 for top-pick, 2 for oldies)");

            // User selected top-pick?
            if (reader.nextInt() == 1) {
                System.out.println("There are " + stockTop + " more of top-picked movies left. How many do you want to rent?");
                int currentRequest = reader.nextInt(); // save temporarily to store/dump depending on if/else

                // Enough in stock?
                if (currentRequest > stockTop) {
                    System.out.println("Oops, there aren't enough top-pick movies in stock. Please try again.");
                    continue; // start over
                } else {
                    amountTop = currentRequest;
                    stockTop -= currentRequest;

                    // Get number of nights requested
                    System.out.println("And for how many nights do you want to rent this movie?");
                    nightRentTop = reader.nextInt();

                    // Calculate and displaytotal cost
                    totalCostTop = amountTop * priceTop * nightRentTop;
                    System.out.println("Thank you for shopping! Your total is $" + totalCostTop);
                }
            } else {
                System.out.println("There are " + stockOld + " more of oldies movies left. How many do you want to rent?");
                int currentRequest = reader.nextInt(); // save temporarily to store/dump depending on if/else

                // Enough in stock?
                if (currentRequest > stockOld) {
                    System.out.println("Oops, there aren't enough oldies movies in stock. Please try again.");
                    continue; // start over
                } else {
                    amountOld = currentRequest;
                    stockOld -= currentRequest;

                    // Get number of nights requested
                    System.out.println("And for how many nights do you want to rent this movie?");
                    nightRentOld = reader.nextInt();

                    // Calculate and displaytotal cost
                    totalCostOld = amountOld * priceOld * nightRentOld;
                    System.out.println("Thank you for shopping! Your total is $" + totalCostOld);
                }
            }
        }
        // After loop is done, display final message.
        System.out.println("Sorry, we are out of stock. Come again later!");
    }
}

