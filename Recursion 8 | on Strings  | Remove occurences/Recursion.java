// package Recursion | GCD | Euclids Algorithm;

public class Recursion {
    public static String remove(String s, int idx) {
        if(idx == s.length()) {
            return "";
        }
        
        String smallAns = remove(s, idx+1);
        char currChar = s.charAt(idx);
        
        if(currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }
    
    public static void main(String[] args) {
        System.out.print(remove("abcdea", 0));
    }
}

// output:
// bcde