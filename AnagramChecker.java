// public class anagram {
//     public static void main(String [] args){
//         String a = "listen";
//         String b = "silent";
//         boolean isAnagram = false;
//         boolean visited[] = new boolean[b.length()];
//         if (a.length() == b.length()){
//             for (int i = 0; i < a.length(); i++){
//                 char c = a.charAt(i);
//                 isAnagram = false;
//                 for (int j = 0; j < b.length(); j++){
//                     if (b.charAt(j) == c && !visited[j]){
//                         visited[j] = true;
//                         isAnagram = true;
//                         break;
//                     }
//                 }
//                 if (!isAnagram){
//                     break;
//                 }
//             }
//         }
//         if (isAnagram){
//             System.out.println("Anagram");
//         } else{
//             System.out.println("Not Anagram");
//         }
//     }
    
// }

// public class anagram {
//         public static void main(String [] args){
//             String a = "listen";
//             String b = "silent";
//             char c1 [] =a.toCharArray();     // convert the string to char array
//             char c2 [] =b.toCharArray();
//             int n1 = c1.length;              // get the length of the array
//             int n2 = c2.length;
//             if (n1 != n2)                       // check if the length of the array is equal
//             {
//                 System.out.println("Not Anagram");
//             } 


//              Arrays.sort (c1);                           // sort the array
//              Arrays.sort(c2);                       // sort the array

//             for (int i = 0; i<c1.length; i++){
//                 if (c1[i] != c2[i]){
//                     System.out.println("Not Anagram");
//                     break;



//                 }
//             }
//             System.out.println("Anagram");

//             }


//         }


import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] c1 = a.toCharArray();                  // Convert the strings to char arrays
        char[] c2 = b.toCharArray();

        if (c1.length != c2.length) {                      // Check if the lengths are equal
            System.out.println("Not Anagram");
            return;                                           // Exit the program if lengths differ
        }

        Arrays.sort(c1);                                      // Sort the arrays
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {                                // Compare each character
                System.out.println("Not Anagram");
                return;                                           // Exit the program if characters do not match
            }
        }

        System.out.println("Anagram");
    }
}

    


