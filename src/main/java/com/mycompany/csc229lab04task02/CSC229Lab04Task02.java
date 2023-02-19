/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04task02;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04Task02.git
 */
public class CSC229Lab04Task02 {
    static int gcd(int x, int y) { // GCD function
        if (x % y == 0) // base case
            return y;
        else
            // Returns the GCD of x and y
            return gcd(y, x % y);
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // Used to read a and b
        int a; // Starting value
        int b; // Ending value
        // Entering the first number
        System.out.println("Please enter the first number: ");
        a = scnr.nextInt(); // Reading the first number
        // Entering the second number
        System.out.println("Please enter the second number: ");
        b = scnr.nextInt(); // Reading the second number
        int result; // GCD of a and b
        result = gcd(a, b); // Calling the gcd function
        System.out.println(result); // Printing the GCD
    }
}
