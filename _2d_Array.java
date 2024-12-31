import java.util.Scanner;

public class _2d_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of rows and columns
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt(); 
        int columns = sc.nextInt(); 
        
        // Declare a 2D array
        int[][] number = new int[rows][columns];

        // Input elements into the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // Output the 2D array elements
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(number[i][j] + " "); // Prints each element with a space
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}/


// Q2 take a matrix as input from user search for a given number x and print the indices at which it accures?

import java.util.Scanner;

public class _2d_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of rows and columns
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt(); 
        int columns = sc.nextInt(); 
        
        // Declare a 2D array
        int[][] number = new int[rows][columns];

        // Input elements into the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x= sc.nextInt();
        // Output the 2D array elements
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (number[i][j] == x){
                    System.out.println("x is found at location ("+ i + "," + j + ")");
                }
            //    System.out.print(number[i][j] +  " "); // Prints each element with a space
            }
            // Move to the next line after each row
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}


