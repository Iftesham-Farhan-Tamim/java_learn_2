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
// (empty string)
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
// (empty string)
// ............................................................................................

// ............................................................................................