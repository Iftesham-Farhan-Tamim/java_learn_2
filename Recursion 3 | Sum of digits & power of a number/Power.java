// package Recursion | Sum of digits & power of a number;

// public class Recursion {
//     public static int sod(int n){
//         if(n >= 0 && n <= 9) return n;
//         return sod(n/10) + n%10;
//     }

//     public static void main(String[] args) {
//         System.out.println(sod(12345));
//     }
// }

// output:
// 15
// ............................................................................................
// Return the count of digits in a given number n
// public class Recursion {
//     public static int count(int n) {
//         if (n >= 0 && n <= 9) return 1; 
//         return count(n / 10) + 1; 
//     }

//     public static void main(String[] args) {
//         int result = count(5683); // method removed or turned into a comment
//         System.out.println("Number of digits: " + result); 
//     }
// }

// output:
// Number of digits: 4
// ............................................................................................
public class Recursion {
    //    static int pow(int p, int q){ // p^q -> TC - O(q)
    //        if(q == 0) return 1;
    //        return pow(p, q-1) * p; // p^q-1 * p = p^q
    //    }
    
        static int pow(int p, int q){
            if(q == 0) return 1;
            int smallPow = pow(p, q/2);
            if(q % 2 == 0){ // even
                return smallPow * smallPow;
            }
            return p * smallPow * smallPow;
        }
    
        public static void main(String[] args) {
            System.out.println(pow(2, 5));
        }
}

// output:
// 32