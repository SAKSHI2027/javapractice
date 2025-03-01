import java.util.*;
class Affixing_zero{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        for (int i = m; i<n; i ++){
            if (n>= 100){
                System.out.printf("%03d " , i);
           }else if (n>= 10){
            System.out.printf("%02d " , i);
           }else{
            System.out.printf("%d " , i);
           }

        }

    }
}