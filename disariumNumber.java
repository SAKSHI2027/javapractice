public class disariumNumber {
    public static void main(String[] args) {
        int num = 175;
        int sum = 0;          // Initialize sum
        int temp = num;        // Store the original number for output
        int length = String.valueOf(num).length();
        while (temp > 0) {
            int rem = temp % 10;    // Extract the last digit
            sum += Math.pow(rem, length);  // Add the digit to sum
            temp /= 10;                    // Remove the last digit
            length--;                 // Decrement the length
        }
        if (sum == num) {
            System.out.println(num + " is a Disarium Number.");
        } else {
            System.out.println(num + " is not a Disarium Number.");
        }
    }

    
}
