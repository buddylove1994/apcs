// Rothanak So
// This program will print the reversal of an inputted name in lowercase
// e.g. Peter Ustinov -> vonitsu retep

import java.util.Scanner;

class NameReversal
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        String name;         // inputted name
        String reverse = ""; // reverse
        int length;          // length of name

        System.out.print("Please enter your name. ");
        name = reader.nextLine();
        length = name.length();

        // Adds characters to variable reverse, starting from the
        // last character and working its way to the first.
        for (int i=length; i>0; i--) {
            reverse += name.substring(i-1, i).toLowerCase();
        }

        System.out.println(reverse);
    }
}