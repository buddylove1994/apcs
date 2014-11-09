/*
 * reader.java
 * -------------
 * This is a basic demonstration of the use of the Scanner object to read
 * and work with user input from the console.
 */

import java.util.Scanner; // import Scanner class

class Reader
{
    public static void main(String[] args)
    {
        // instantiate scanner object
        Scanner reader = new Scanner(System.in);

        // request and save input
        System.out.print("Enter a string. ");
        String string = reader.nextLine();

        // echo the input
        System.out.println(string);
    }
}