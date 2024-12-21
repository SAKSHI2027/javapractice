import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        int n, c,s= 0, r;
        System.out.println("Enter the number  ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;                  // n= 121
        while (n > 0){
            r = n%10;          // divide 121 with 10  = r=12  / r =2 / r=1 
            s = (s*10)+r;      // initial s is (0*10)+r = 1 / 12/ 121
            n = n/10;          // n /10 = 1 / 2 / 1 all n>0 is true;
        }
        if ( c == s)
            System.out.println("it is palindrome");
        else
            System.out.println("is not palindrome");    

    }
    
}
