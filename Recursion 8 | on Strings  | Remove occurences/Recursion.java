// package Recursion | GCD | Euclids Algorithm;

// public class Recursion {
//     public static String remove(String s, int idx) {
//         if(idx == s.length()) {
//             return "";
//         }
        
//         String smallAns = remove(s, idx+1);
//         char currChar = s.charAt(idx);
        
//         if(currChar != 'a') {
//             return currChar + smallAns;
//         } else {
//             return smallAns;
//         }
//     }
    
//     public static void main(String[] args) {
//         System.out.print(remove("abcdea", 0));
//     }
// }

// output:
// bcde
// ............................................................................................
// public class Recursion {  // 2nd methode using substring.
//     public static String remove(String str) {
//         if(str.length() == 0) {
//             return "";
//         }
        
//         String random = remove(str.substring(1));
//         char currChar = str.charAt(0);
        
//         if(currChar != 'a') {
//             return currChar + random;
//         } else {
//             return random;
//         }
//     }
    
//     public static void main(String[] args) {
//         System.out.print(remove("abcda"));
//     }
// }

// output:
// bcd
// ............................................................................................
// String + char --> String

// public class Recursion {
//     public static String reverse(String str, int idx) {
//         if(idx == str.length()) {
//             return "";
//         }
        
//         String random = reverse(str, idx+1);
//         char currChar = str.charAt(idx);
        
//         return random + currChar;
        
//     }
    
//     public static void main(String[] args) {
//         System.out.print(reverse("hello", 0));
//     }
// }

// output:
// olleh
// ............................................................................................
// String + char --> String

// public class Recursion {. // // 2nd methode using substring.
//     public static String reverse(String str) {
//         if(str.length() == 0) {
//             return "";
//         }
        
//         String random = reverse(str.substring(1));
//         return random + str.charAt(0);
//     }
    
//     public static void main(String[] args) {
//         System.out.print(reverse("hello"));
//     }
// }

// output:
// olleh
// ............................................................................................
