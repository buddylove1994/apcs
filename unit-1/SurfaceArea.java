// Rothanak So
// This program will calculate and display the surface area of a cube from and
// inputted edge length.

import java.util.Scanner;

class SurfaceArea
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        int edge;           // length of an edge
        int surface;        // caculated surface area

        // Get edge length
        System.out.print("Enter the length of the edge of the cube: ");
        edge = reader.nextInt();

        // Find surface area
        surface = 6 * (int)(Math.pow(edge, 2));
        System.out.println("The surface area of the cube is " + surface);
    }
}