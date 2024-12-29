import java.util.Scanner;
public class Perfec_Square {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n > 0)
          {
           int squareRoot = (int)Math.sqrt(n);
           if (squareRoot * squareRoot == n){         // root multiplication
            System.out.print("The number " +  n  + " is perfect square ");
           }else {
            System.out.print("the number " +  n  + " is not perfect Square");
         }
        } else {
        System.out.print("the number " +  n  + " is perfect Square");

    }
}
    
}
