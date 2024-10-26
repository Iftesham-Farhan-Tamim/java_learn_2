// package Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int arr[] = new int[3];
        
//         arr[0] = 0;
//         arr[1] = 1;
//         arr[2] = 2;
        
//         for(int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// output:
// 0
// 1
// 2
// ............................................................................................
// public class Main {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4};

//         System.out.println(arr[1]);
//     }
// }

// output:
// 2
// ............................................................................................
// //Taking User Input to Populate the Array
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i=0; i<arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
// ............................................................................................
// //multi-dimensional arrays (arrays of arrays)
// public class Main {
//     public static void main(String[] args) {
//         int arr[][] = new int[2][3];
        
//         arr[0][0] = 0;
//         arr[0][1] = 1;
//         arr[0][2] = 2;
//         arr[1][0] = 3;
//         arr[1][1] = 4;
//         arr[1][2] = 5;
        
//         // Printing elements of the 2D array
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println(); // Newline after each row
//         }
//     }
// }

// output:
// 0 1 2 
// 3 4 5 
// ............................................................................................
// public class Main {
//     public static void main(String[] args) {
                
//         int arr1[][] = {{1,2,9},{3,4,9},{5,6,9}};
        
               
//         for(int i=0; i<arr1.length; i++) {
//             for(int j=0; j<arr1[i].length; j++) {
//                 System.out.print(arr1[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// output:
// 1 2 9 
// 3 4 9 
// 5 6 9 
// ............................................................................................
// //Calculate sum
// public class Main {
//     public static void main(String[] args) {
        
//         int arr[] =  {1,2,3,4};
//         int sum = 0;
        
//         for(int i=0; i<arr.length; i++) {
//             sum+=arr[i];
//         }
//         System.out.print(sum);
        
//     }
// }

// output:
// 10
// ............................................................................................
// //Calculate the maximum value out off all elements in the array
// public class Main {
//     public static void main(String[] args) {
        
//         int arr[] =  {1,2,9,4};
//         int ans = 0;
        
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i]>ans) {
//                 ans=arr[i];
//             }
//         }
//         System.out.print(ans);
        
//     }
// }

// output:
// 9
// ............................................................................................
// //Search the given element x in the array. If present then 
// //return the index else return -1

// public class Main {
//     public static void main(String[] args) {
        
//         int arr[] =  {1,2,9,4};
//         int ans = -1;
//         int x = 5;
        
//         for(int i=0; i<arr.length; i++) {
//             if(x==arr[i]) {
//                 ans = i;
//                 break;
//             } 
//         }
//         System.out.print(ans);
        
//     }
// }

// output:
// -1
// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................

// ............................................................................................
// ............................................................................................
// ............................................................................................
// ............................................................................................
// ............................................................................................