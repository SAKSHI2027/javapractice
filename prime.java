import java.util.Scanner;

 public class prime {
    public static void main (String [] arg ){
        int n, count = 0;
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i =1; i <= n; i++){
            if ( n % i == 0){
                count ++;
            }
        }
            if (count == 2)
               System.out.println("prime ");
               else
               System.out.println("not prime");

    }
    
}
