import java.util.Scanner;
public class lcmNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the n1 : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the n2 : ");
        int n2 = scanner.nextInt();

        int max = Math.max(n1,n2);
        int lcm = max;

        // Increment lcm until it is divisible by both lcmNumber
         while (true){
                if (lcm % n1 == 0 && lcm % n2 ==0){
                    System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);
                    break;
                }else{
                    lcm += max;

                }
         }



    }
}