// // Initialize 2D array


// public class Main {
//     static void printArray(int[][] arr) {
//         for(int i=0; i<arr.length; i++) {
//             // System.out.println(arr[i]);
//             for(int j=0; j<arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int[][] arr2 = {
//             {1, 5, 6},
//             {7, 9, 11},
//             {8, 1, 1},
//         };
//         printArray(arr2);
//     }
// }

// output:
// 1 5 6 
// 7 9 11 
// 8 1 1 
// ............................................................................................
// // Taking 2D array user input


// import java.util.*;
// public class Main {
//     static void printArray(int[][] arr) {
//         for(int i=0; i<arr.length; i++) {
//             // System.out.println(arr[i]);
//             for(int j=0; j<arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int r = sc.nextInt();
//         System.out.println("Enter number of columns");
//         int c = sc.nextInt();

//         int[][] arr = new int[r][c];

//         System.out.println("Enter " + r*c + " elements");
//         for(int i=0; i<r; i++) {
//             for(int j=0; j<c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         printArray(arr);

//         sc.close();
//     }
// }

// input:
// Enter number of rows
// 3
// Enter number of columns
// 3
// Enter 9 elements
// 3 2 1
// 6 5 4
// 9 8 7

// output:
// 3 2 1 
// 6 5 4 
// 9 8 7 
// ............................................................................................
// // addition of 2 Matrices


// import java.util.Scanner;

// public class Matrix {
//     static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
//         if (r1 != r2 || c1 != c2) {
//             System.out.println("Wrong Input - Addition not possible");
//             return;
//         }

//         int[][] sum = new int[r1][c1];

//         for (int i = 0; i < r1; i++) { 
//             for (int j = 0; j < c1; j++) { 
//                 sum[i][j] = a[i][j] + b[i][j];
//             }
//         }
//         System.out.println("Sum of matrix 1 and matrix 2");
//         printMatrix(sum);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows and columns of matrix 1");
//         int r1 = sc.nextInt();
//         int c1 = sc.nextInt();
//         int[][] a = new int[r1][c1];
//         System.out.println("Enter matrix values");
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c1; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter number of rows and columns of matrix 2");
//         int r2 = sc.nextInt();
//         int c2 = sc.nextInt();
//         int[][] b = new int[r2][c2];
//         System.out.println("Enter matrix values");
//         for (int i = 0; i < r2; i++) {
//             for (int j = 0; j < c2; j++) {
//                 b[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix 1");
//         printMatrix(a);
//         System.out.println("Matrix 2");
//         printMatrix(b);

//         add(a, r1, c1, b, r2, c2);

//         sc.close();
//     }
// }

// output:
// Enter number of rows and columns of matrix 1
// 2 2
// Enter matrix values
// 1 2
// 3 4
// Enter number of rows and columns of matrix 2
// 2 2
// Enter matrix values
// 2 4
// 5 1

// output:
// Matrix 1
// 1 2
// 3 4
// Matrix 2
// 2 4
// 5 1
// Sum of matrix 1 and matrix 2
// 3 6
// 8 5
// ............................................................................................
// // Multiplication of 2 Matrices


// import java.util.Scanner;

// public class Matrix {
//     static void printMatrix(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
//         if (c1 != r2) {
//             System.out.println("Multiplication not possible - wrong dimension");
//             return;
//         }

//         int[][] mul = new int[r1][c2];

//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c2; j++) {
//                 for (int k = 0; k < c1; k++) {
//                     mul[i][j] += (a[i][k] * b[k][j]);
//                 }
//             }
//         }

//         System.out.println("Multiplication of 2 matrices");
//         printMatrix(mul);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows and columns of matrix 1");
//         int r1 = sc.nextInt();
//         int c1 = sc.nextInt();
//         int[][] a = new int[r1][c1];
//         System.out.println("Enter matrix values");
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c1; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter number of rows and columns of matrix 2");
//         int r2 = sc.nextInt();
//         int c2 = sc.nextInt();
//         int[][] b = new int[r2][c2];
//         System.out.println("Enter matrix values");
//         for (int i = 0; i < r2; i++) {
//             for (int j = 0; j < c2; j++) {
//                 b[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix 1");
//         printMatrix(a);
//         System.out.println("Matrix 2");
//         printMatrix(b);

//         multiply(a, r1, c1, b, r2, c2);

//         sc.close();
//     }
// }

// input:
// Enter number of rows and columns of matrix 1
// 2 3
// Enter matrix values
// 1 2 1
// 3 1 2
// Enter number of rows and columns of matrix 2
// 3 2
// Enter matrix values
// 2 1
// 1 3
// 1 1

// output:
// Matrix 1
// 1 2 1
// 3 1 2
// Matrix 2
// 2 1
// 1 3
// 1 1
// Multiplication of 2 matrices
// 5 8
// 9 8