// For loop
// public class Main {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Iteration: " + i);
//         }
//     }
// }

// output:
// Iteration: 0
// Iteration: 1
// Iteration: 2
// Iteration: 3
// Iteration: 4
// ............................................................................................
// For each loop
// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {1, 2, 3, 4, 5};
        
//         for (int num : numbers) {
//             System.out.println("Number: " + num);
//         }
//     }
// }

// output:
// Number: 1
// Number: 2
// Number: 3
// Number: 4
// Number: 5
// ............................................................................................
// import java.util.ArrayList;
// public class Main {

//     static ArrayList<String> getSSQ(String s){
//         ArrayList<String> ans = new ArrayList<>();
//         // base case
//         if(s.length() == 0){
//             ans.add("");
//             return ans;
//         }
//         char curr = s.charAt(0); 
//         ArrayList<String> smallAns = getSSQ(s.substring(1)); 
        
//         for(String ss: smallAns){
//             ans.add(ss); 
//             ans.add(curr + ss);  
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         ArrayList<String> ans = getSSQ("abc");
//         for(String ss : ans){
//             System.out.println(ss);
//         }
//     }
// }
 
// output:
//  (empty string)
// a
// b
// ab
// c
// ac
// bc
// abc
// ............................................................................................
// public class Main {
//     static void printSSQ(String s, String currAns){
//         if(s.length() == 0){
//             System.out.println(currAns);
//             return;
//         }
        
//         char curr = s.charAt(0);
//         String remString = s.substring(1);
//         printSSQ(remString, currAns + curr); // add curr
//         printSSQ(remString, currAns);  // do not add curr
//     }

//     public static void main(String[] args) {
//         printSSQ("abc", "");
//     }
// }

// output:
// abc
// ab
// ac
// a
// bc
// b
// c
//  (empty string)
// ............................................................................................
// public class Main {
//     static void subsetSum(int[] a, int n, int idx, int sum) {
//         if(idx == n) {
//             System.out.println(sum);
//             return;
//         }
        
//         subsetSum(a, n, idx+1, sum + a[idx]);
//         subsetSum(a, n, idx+1, sum);
//     }

//     public static void main(String[] args) {
//         int[] a = {2, 4, 5};
//         subsetSum(a, a.length, 0, 0);
//     }
// }

// output:
// 11
// 6
// 7
// 2
// 9
// 4
// 5
// 0
// ............................................................................................
public class Main {
    static void findSubsequences(int[] arr, int index, String current) {
        
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        
        findSubsequences(arr, index + 1, current + arr[index] + " ");
        findSubsequences(arr, index + 1, current);
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        findSubsequences(arr, 0, "");
    }
}

// output;
// 2 4 5 
// 2 4 
// 2 5 
// 2 
// 4 5 
// 4 
// 5 
//  (empty)