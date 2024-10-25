package Loops_Patterns;

// import java.util.*;
// public class RectangularPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int c = sc.nextInt();
//         int r = sc.nextInt();

//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++) {
//                 if(j==0 || j==c || i==0 || i==r) {
//                     System.out.println("*");
//                 } else {
//                     System.out.println();
//                 }
//             } 
//         }
//     }
// }
// ............................................
import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++){

            for(int j = 1; j <= c; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}