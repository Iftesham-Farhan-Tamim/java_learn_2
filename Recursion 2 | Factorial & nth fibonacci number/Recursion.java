// package Recursion | Factorial & nth fibonacci number;

// public class Recursion {
//     public static int factorial(int n){ // n = 5
//         //base case
//         if(n == 0) return 1;
//         //smaller problem - recursive work
//         // big problem - self work
//         return  n * factorial(n-1);
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

// output;
// 120
// ............................................................................................
// public class Recursion {
//     public static int fib(int n){
//         //base case
//         if(n == 0 || n == 1){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
// //        //subproblems - recursive work
// //        int prev = fib(n-1);
// //        int prevPrev = fib(n-2);
// //
// //        //self work
// //        return prev + prevPrev;
//     }
//     public static void main(String[] args) {
//         for(int i = 0; i <= 10; i++) {
//             System.out.print(fib(i) + " ");
//         }

//         System.out.println();

//         int n = 7;
//         for(int i=0; i<=n; i++) {
//             System.out.print(fib(i) + " ");
//         }
//     }
// }

// output:
// 0 1 1 2 3 5 8 13 21 34 55 
// 0 1 1 2 3 5 8 13