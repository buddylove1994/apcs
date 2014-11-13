// Rothanak So
// This program will calculate the total cost to rent top-picked and
// oldies movies in a single night from the inputted number each of the
// types of movies rented.

import java.util.Scanner;

class VideoRent
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        double topCost = 3.00;      // cost per top-picked movie
        double oldCost = 2.00;      // cost per oldies movie
        double totalCost;           // total cost of renting movies
        int topCount;               // total top-picked movies rented
        int oldCount;               // total oldies movies rented

        // Get number of top-picked and oldies movies rented
        System.out.print("Enter the number of top-picked movies rented: ");
        topCount = reader.nextInt();

        System.out.print("Enter the number of oldies movies rented: ");
        oldCount = reader.nextInt();

        // Calculate total cost
        totalCost = (topCost * topCount) + (oldCost * oldCount);

        // Display total cost
        System.out.println("The total cost for movies is " + totalCost);
    }
}