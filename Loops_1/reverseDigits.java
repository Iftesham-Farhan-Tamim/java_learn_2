// package Loops_1;

// import java.util.Scanner;

// public class reverseDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();  // Read input number

//         int ans = 0;  // Initialize answer to store the reversed number

//         while(n > 0){
//             ans = ans * 10 + n % 10;  // Extract last digit of n and add to ans
//             n /= 10;  // Remove the last digit from n
//         }

//         System.out.println(ans);  // Print the reversed number
//     }
// }