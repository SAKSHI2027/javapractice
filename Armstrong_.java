import java.util.Scanner;

public class Armstrong_ {
    public static void main(String[] args) {
        int n, arm = 0, r, c;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n; // Save the original number
        
        while (n > 0) {
            r = n % 10;         // Get the last digit
            arm = (r * r * r) + arm;     // Cube the digit and add to the sum
            n = n / 10;         // Remove the last digit
        }
        
        if (c == arm)
            System.out.println(c + " is an Armstrong number.");
        else
            System.out.println(c + " is not an Armstrong number.");
    }
}

