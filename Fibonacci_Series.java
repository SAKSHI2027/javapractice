import java.util.Scanner;


public class Fibonacci_Series {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter the turm");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;
        }

    }

}
