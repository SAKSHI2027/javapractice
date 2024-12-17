import java.util.Scanner;

 public class prime {
    public static void main (String [] arg ){
        int n, count = 0;                          // declear the int n and count veriable
        System.out.print("Enter the number");      // user  input
        Scanner sc = new Scanner(System.in);       // scan input
        n = sc.nextInt();
        for (int i =1; i <= n; i++){               // run the loop from 1 to n 
            if ( n % i == 0){                      // check condition n % is 0 if yes then cout ++ for next number 
                count ++;                          // prime number is divide only with self and 1 
            }
        }
            if (count == 2)                          // the count is 2 then its prime number
               System.out.println("prime ");
               else
               System.out.println("not prime");    

    }
    
}
