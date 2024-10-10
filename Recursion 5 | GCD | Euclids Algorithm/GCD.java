// package Recursion | GCD | Euclids Algorithm;

public class GCD {
    public static int gcd(int x, int y) {
        if(y==0) {
            return x;
        }

           // if(x%y == 0) {  // optional base case
           //     return y;
           // }

        return gcd(y, x%y);
    }


    public static void main(String[] args) {
        System.out.println("GCD is : " + gcd(24, 15));
    }
}

// output:
// GCD is : 3