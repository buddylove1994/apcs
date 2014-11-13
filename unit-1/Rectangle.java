// Rothanak So
// This program will calculate the area and perimeter of a rectangle from the
// inputted length and width.

import java.util.Scanner;

class Rectangle
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        int length;         // length of rectangle
        int width;          // width of rectangle
        int area;           // calculated area
        int perimeter;       // calculated perimeter

        // Get length and width
        System.out.print("Enter the length of the rectangle: ");
        length = reader.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        width = reader.nextInt();

        // Find area and perimeter
        area = length * width;
        perimeter = 2 * (length + width);

        // Display results
        System.out.println("The area of the triangle is " + area);
        System.out.println("The perimeter of the triangle is " + perimeter);
    }
}