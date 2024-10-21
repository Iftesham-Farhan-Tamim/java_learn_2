// package Recursion | Recursion on Array & Strings | Frog Problem;

public class Main {
    public static int jump(int arr[], int idx) {
        if(idx == arr.length-1) return 0;
        
        int op1 = jump(arr, idx+1) + Math.abs(arr[idx+1] - arr[idx]);
        
        if(idx == arr.length-2) return op1;
        
        int op2 = jump(arr, idx+2) + Math.abs(arr[idx+2] - arr[idx]);
        
        return Math.min(op1, op2);
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 20};
        System.out.print(jump(arr, 0));
    }
}

// output:
// 30








