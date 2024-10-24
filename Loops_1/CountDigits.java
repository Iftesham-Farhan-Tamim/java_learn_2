// package Loops_1;

// //count the number of digits for a given number n
// import java.util.Scanner;
// public class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int count = 0;
        
//         if (x == 0) {
//             count = 1;
//         } else {
//             x = Math.abs(x);
            
//             while (x > 0) {
//                 x = x / 10;
//                 count++;
//             }
//         }
        
//         System.out.print(count);

//         sc.close();
//     }
// }