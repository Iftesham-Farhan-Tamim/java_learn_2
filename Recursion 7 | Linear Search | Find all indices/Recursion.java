// package Recursion | Linear Search | Find all indices;

// public class Recursion {
//     static boolean search(int[] a, int n, int target, int idx){

//         // base case
//         if(idx >= n) return false;

//         //self work
//         if(a[idx] == target) return true;

//         //recursive work
//         return search(a, n, target, idx+1);
//     }
    
//     public static void main(String[] args) {
//         int[] a = {1, 2, 4, 4, 4, 5, 6};
//         int target = 4;
//         int n = a.length;
        
//         if(search(a, a.length, target, 0)) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }

// output:
// Yes
// ............................................................................................
// public class Recursion {    // Linear Search (2nd methode)
//     public static boolean search(int arr[], int t, int idx)  {
//         if(idx == arr.length) {
//             return false;
//         }
        
//         if(arr[idx] == t) {
//             return true;
//         } else {
//             return search(arr, t, idx+1);
//         }
        
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {1,2,4,6};
//         System.out.print(search(arr, 4, 0));
//     }
// }

// output:
// true
// ............................................................................................
// public class Recursion {
//     static void findAllIndices(int[] a, int n, int target, int idx){
//         // base case
//         if(idx >= n){
//             return;
//         }
//         //self work
//         if(a[idx] == target){
//             System.out.println(idx);
//         }
//         //recursive work
//         findAllIndices(a, n, target, idx+1); // 1, 3, 4
//     }

//     public static void main(String[] args) {
//         int[] a = {1, 2, 4, 4, 4, 5, 6};
//         int target = 4;
//         int n = a.length;
//         findAllIndices(a, n, target, 0);
        
//     }
// }

// output:
// 2
// 3
// 4
// ............................................................................................
// public class Recursion {
//     public static void index(int arr[], int t, int idx) {
//         if(idx == arr.length) {
//             return;
//         }
        
//         if(arr[idx] == t) {
//             System.out.print(idx + " ");
//         } 
        
//         index(arr, t, idx+1);
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {2, 4, 6, 8, 4, 8, 4};
//         index(arr, 4, 0);
//     }
// }

// output:
// 1 4 6














