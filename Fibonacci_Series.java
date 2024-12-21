import java.util.Scanner;


public class Fibonacci_Series {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;               // initialyse the a=0;b=0, and c
        System.out.print("Enter the turm");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {       // starting from index 1 
            
            System.out.print(a);             ////print  a 
            c = a + b;                       
            a = b;
            b = c;
        }

    }

}
