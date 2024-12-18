import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;                    // decler the number of term and a value b value and c is temporary veriable
        System.out.print("Enter the turm");           // user input
        Scanner sc = new Scanner(System.in);          //
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {           // run the loop untill i<= term
            System.out.print(a);                    // print the 1st value
            c = a + b;                              //c become 0+1= 1
            a = b;                                  // a become b   :. 1
            b = c;                                  // b become c    :. 1
        }

    }

}
