// package Loops;
// // && is higher then ||

// //while loop
// //print numbers from 1 to n, where n is the input
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         int i = 1;
//         while(i<=x) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }
// ............................................................................................
// //print the sum of 1st n natural numbers, where n is the input
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         int sum = 0;
//         int i = 1;
//         while(i<=x) {
//             sum+=i;
//             i++;
//         }

//         System.out.print(sum);

//         sc.close();
//     }
// }
// ............................................................................................
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int sum = 0;

//         while(x != -1) {
//             sum+=x;
//             x = sc.nextInt();
//         }

//         System.out.println("Sum is : " + sum);

//         sc.close();
//     }
// }
// ............................................................................................
// //For loop
// //print numbers from 1 to n, where n is the input
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         int sum = 0;
//         for(int i=1; i<=x; i++) {
//             sum+=i;
//         }

//         System.out.println(sum);

//         sc.close();
//     }
// }
// ............................................................................................
// //print numbers from n to 1, where n is the input
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         for(int i=x; i>0; i--) {
//             System.out.println(i);
//         }

//         sc.close();
//     }
// }
// ............................................................................................
// //do while loop
// //print numbers from n to 1, where n is the input
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i = 0;

//         do{
//             System.out.println(n);
//             n--;
//         } while(n>i);

//         sc.close();
//     }
// }
// ............................................................................................
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 0;

//         do {
//             sum+=i;
//             i++;
//         } while(i<=n);
//         System.out.println(sum);

//         sc.close();
//     }
// }
// ............................................................................................
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int sum = 0;

//         do {
//             sum+=x;
//             x = sc.nextInt();
//         } while (x != -1);

//         System.out.print("Sum is " + sum);

//         sc.close();
//     }
// }

// imput:
// 10
// 20
// 30
// 40
// 0
// output:
// Sum is 100
// ............................................................................................
// //print the 1st multiple of 5, which is also a multiple of 7.
// public class Main {
//     public static void main(String[] args) {
//         int num = 1;

//         while(true) {
//             if((num%5==0) && (num%3==0)) {
//                 System.out.println("Found number " + num);
//                 break;
//             }
//             num++;
//         }
//     }
// }

// output:
// Found number 15
// ............................................................................................
// //continue
// public class Main {
//     public static void main(String[] args) {
//         for(int i=0; i<=10; i++) {
//             if(i%3==0) {
//                 continue;
//             }

//             System.out.println(i);
//         }
//     }
// }

// output:
// 1
// 2
// 4
// 5
// 7
// 8
// 10
// ............................................................................................
// //continue using while loop
// public class Main {
//     public static void main(String[] args) {
//         int i = 1;

//         while(i<=10) {
//             if(i%3==0) {
//                 i++;  // when commit it prints (1, 2)
//                 continue;
//             }

//             System.out.println(i);
//             i++;
//         }
//     }
// }

// output:
// 1
// 2
// 4
// 5
// 7
// 8
// 10
// ............................................................................................
// //Take integer input and print the absolute value of that integer
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         System.out.print(Math.abs(x));
//     }
// }

// input:
// -87
// output:
// 87
// ............................................................................................
// //write a program todetermine whether the seller has made profit or
// //incurred loss. Also determine how much profit hemade or loss he incurred.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter cost price : ");
//         double cp = sc.nextInt();
//         System.out.print("Enter selling price : ");
//         double sp = sc.nextInt();
        
//         if(cp>sp) {
//             System.out.println("make loss");
//             System.out.print(cp-sp);
//         } else if(sp>cp) {
//             System.out.println("make profit");
//             System.out.print(sp-cp);
//         } else {
//             System.out.print("no loss no profit");
//         }
//     }
// }
// ............................................................................................
// //Given the length and breadth of a rectangle,write a program to find 
// whether the area of therectangle is greater than its perimeter.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the length of the rectangle: ");
//         int length = sc.nextInt();
        
//         System.out.print("Enter the breadth of the rectangle: ");
//         int breadth = sc.nextInt();
        
//         int area = length * breadth;
//         int perimeter = 2 * (length + breadth);
        
//         if (length == breadth) {
//             System.out.println("This is a square.");
//         } else {
//             System.out.println("This is a rectangle.");
//         }

//         if (area > perimeter) {
//             System.out.println("Area is greater than perimeter.");
//         } else if(perimeter > area){
//             System.out.println("Perimeter is greater than area.");
//         } else {
//             System.out.println("Both are equal");
//         }
        
//         System.out.println("Area: " + area);
//         System.out.println("Perimeter: " + perimeter);
//     }
// }
// ............................................................................................
// //Take input percentage of a student andprint the Grade according to marks:

// 1) 90-100 Excellent
// 2) 80-90 Very Good
// 3) 70-80 Good
// 4) 60-70 Can do better
// 5) 50-60 Average
// 6) 40-50 Below Average
// 7) <40 Fail

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         if(x>=90 && x<=100) {
//             System.out.print("Excellent");
//         } else if(x>=80 && x<90) {
//             System.out.print("Very Good");
//         } else if(x>=70 && x<80) {
//             System.out.print("Good");
//         } else if(x>=60 && x<70) {
//             System.out.print("Can do better");
//         } else if(x>=50 && x<60) {
//             System.out.print("Average");
//         } else if(x>=40 && x<50) {
//             System.out.print("Below Average");
//         } else if(x<40) {
//             System.out.print("Fail");
//         } else {
//             System.out.print("Invalid percentage entered.");
//         }
//     }
// }
// ............................................................................................
// //Take positive integer input and tell if it is a three or two digit number or not.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
    
//         if(x>99 && x<1000) {
//             System.out.print("The number is a three-digit number.");
//         } else if(x>9 && x<99) {
//             System.out.print("The number is a two-digit number.");
//         } else {
//             System.out.print("The number is not a three-digit number.");
//         }
//     }
// }
// ............................................................................................
// //Take positive integer input and tell if it is divisible by 5 and 3.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();
        
//         if (number % 5 == 0 && number % 3 == 0) {
//             System.out.println("The number is divisible by both 5 and 3.");
//         } else {
//             System.out.println("The number is not divisible by both 5 and 3.");
//         }
//     }
// }
// ............................................................................................
// //Take a positive integer input and checks if it is divisible by 5 
// but not divisible by 3
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a positive integer: ");
//         int number = sc.nextInt();
        
//         if (number % 5 == 0 && number % 3 != 0) {
//             System.out.println("The number is divisible by 5 but not by 3.");
//         } else {
//             System.out.println("The number does not meet the condition (divisible by 5 but not by 3).");
//         }
//     }
// }
// ............................................................................................
// //Take positive integer input and tell if it is divisible by 5 or 3.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
        
//         if(x%5==0 || x%3==0) {
//             System.out.print("divisible by 5 or 3.");
//         } else {
//             System.out.print("not divisible by 5 or 3.");
//         }
//     }
// }
// ............................................................................................
// //Take 3 positive integers input and print the greatest of them.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         if(a>c && a>b) {
//             System.out.print("a is greater");
//         } else if(b>a && b>c) {
//             System.out.print("b is greater");
//         } else {
//             System.out.print("c is greater");
//         }
//     }
// }
// ...........................................................................................
// //Take 3 numbers input and tell if they can be the sides of a triangle.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         if(a+b>c && b+c>a && c+a>b) {
//             System.out.print("triangle");
//         } else {
//             System.out.print("not a triangle");
//         }
//     }
// }

// input:
// 3
// 4
// 5

// output:
// triangle
// ............................................................................................
// //if a number is divisible by both 3 and 5
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();
        
//         if (number % 3 == 0 && number % 5 == 0) {
//             System.out.println("The number is divisible by both 3 and 5.");
//         } else {
//             System.out.println("The number is not divisible by both 3 and 5.");
//         }
//     }
// }
// ............................................................................................
// // && is higher then ||
// //Take positive integer input and tell if it is divisible by 5 or 3 
// but not divisible by 15.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int x = sc.nextInt();
        
//         if(x%5==0 || x%3==0) {
//             if(x%15!=0) {
//                 System.out.print("The number is divisible by 5 or 3 but not by 15.");
//             } else {
//                 System.out.print("The number is divisible by 5 or 3 and 15.");
//             }
//         } else {
//             System.out.print("This number is not divisible by 5, 3, 15");
//         }
//     }
// }
// ............................................................................................
// //Given three points (x1, y1), (x2, y2) and (x3, y3), write a 
// program to check if all the three points fall on one straight line.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
        
//         double x1=1, x2=2, x3=3, y1=1, y2=2, y3=3;
//         double m1 = (y2-y1)/(x2-x1);
//         double m2 = (y3-y2)/(x3-x2);
        
//         if(m1==m2) {
//             System.out.print("straight line");
//         } else {
//             System.out.print("not a straight line");
//         }
//     }
// }
// ............................................................................................
// //Given the coordinates (x, y) of a center of a circle and its (using square)
// radius, write a program which will determine whether a point lies 
// inside the circle, on the circle or outside the circle.
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius: ");
//         int r = sc.nextInt();
//         int rSquared = r * r;
        
//         int x = 4, y = 4;  
//         int x1 = 8, y1 = 8; 
        
//         int oa = (x - x1) * (x - x1) + (y - y1) * (y - y1);

//         if (oa == rSquared) {
//             System.out.print("on the circle");
//         } else if (oa > rSquared) {
//             System.out.print("outside");
//         } else {
//             System.out.print("inside");
//         }
//     }
// }
// ............................................................................................
// //Given the coordinates (x, y) of a center of a circle and its (Math.sqrt function)
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter radius: ");
//         int r = sc.nextInt();
        
//         int x = 4, y = 4;  
//         int x1 = 8, y1 = 8; 
        
//         double distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        
//         if (distance == r) {
//             System.out.print("on the circle");
//         } else if (distance < r) {
//             System.out.print("inside");
//         } else {
//             System.out.print("outside");
//         }
//     }
// }
// ............................................................................................
// //Given a point (x, y), write a program to find out if it lies on the x-axis, y-axis 
// or at the origin, viz. (0, 0). 
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the x-coordinate: ");
//         int x = sc.nextInt();
//         System.out.print("Enter the y-coordinate: ");
//         int y = sc.nextInt();
        
//         if (x == 0 && y == 0) {
//             System.out.println("The point lies at the origin (0, 0).");
//         } else if (x == 0) {
//             System.out.println("The point lies on the y-axis.");
//         } else if (y == 0) {
//             System.out.println("The point lies on the x-axis.");
//         } else {
//             System.out.println("The point does not lie on any axis or the origin.");
//         }
//     }
// }
// ............................................................................................



