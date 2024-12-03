public class fact {
    public static void main(String[] args) {
        int n = 5;       // Declare n
        int fact = 1;    // Declare and initialize fact

        for (int i = 1; i <= n; i++) {  
            fact = fact * i;  // Multiply fact by i
        }

        System.out.println("Factorial of " + n + " is: " + fact);  // Print the factorial value
    }

    
}

