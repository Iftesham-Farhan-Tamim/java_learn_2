// package Recursion on Arrays | Max Value | Sum of arrays;

// public class Recursion {
//     public static void print(int arr[], int idx) {
//         if (idx == arr.length) {
//             return;
//         }

//         System.out.print(arr[idx] + " ");
//         array(arr, idx + 1);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 5, 6, 7, 8 };
//         print(arr, 0);
//     }
// }

// output:
// 5 6 7 8
// ............................................................................................
// public class Recursion {
//     static int max(int[] arr, int idx){
//         //base case
//         if(idx == arr.length-1){
//             return arr[idx];
//         }

//         // small problem -> idx+1, end of the array -> max -> recursive
//         int smallAns = max(arr, idx+1);

//         // self work and final ans
//         return Math.max(arr[idx], smallAns);
//     }

//     public static void main(String[] args) {
//         int [] arr = {5, 6, 7, 8};
//         System.out.println(max(arr, 0));
//     }
// }

// output:
// 8
// ............................................................................................
// public class Recursion {
//     public static int sum(int arr[], int idx) {
//         if(idx == arr.length-1) {
//             return arr[idx];
//         }

//         int ans = sum(arr, idx+1);
//         return ans + arr[idx];
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,3,5,20,1};
//         System.out.print(sum(arr, 0));
//     }
// }

// output:
// 31