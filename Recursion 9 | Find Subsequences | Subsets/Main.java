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
// ............................................................................................
public class Main {
    static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + curr); // add curr
        printSSQ(remString, currAns);  // do not add curr
    }

    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
// ............................................................................................

// ............................................................................................