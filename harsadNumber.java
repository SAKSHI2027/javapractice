import java.util.Scanner;
public class harsadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;     // Initialize sum
        int temp = num;   // Store the original number for output
        while (temp > 0) {
            int rem = temp % 10;     // Extract the last digit
            sum += rem;              // Add the digit to sum
            temp /= 10;        // Remove the last digit
        }
        if (num % sum == 0) {       // Compare the number with the sum
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
}
}
