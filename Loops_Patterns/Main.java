// package Loops_Patterns;

// public class Main {
//     public static void main(String[] args) {
        
//         int n = 4;
        
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" " + " ");
//             }
            
//             System.out.print(i + " ");
            
//             if (i < n) {
                
//                 for (int j = 1; j <= 2 * i - 3; j++) {
//                     System.out.print(" " + " ");
//                 }
                
//                 if (i > 1) {
//                     System.out.print(i + " ");
//                 }
//             } else {
                
//                 for (int j = 1; j < 2 * i - 1; j++) {
//                     System.out.print(i + " ");
//                 }
//             }
            
//             System.out.println();
//         }
//     }
// }

// output:
//       1 
//     2   2 
//   3       3 
// 4 4 4 4 4 4 4 