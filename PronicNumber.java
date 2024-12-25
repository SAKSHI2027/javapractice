public class PronicNumber {       /// is could be a Pronic / Heteromecic number
     public static void main(String[] args){
        int n = 42;  // 42 = 6*7
        boolean flag = false;
        for(int i = 0; i<=n; i++){
            if (i*(i+1) == n){ // correct the syntax errar
                flag = true;
                break; // exit the loop if the condition is true
            }
        
        }
    
        if (flag){
            System.out.println(n + " is a pronic number");
        } else{
            System.out.println(n +" is not a pronic number");
        }
        }

     }
    
    
