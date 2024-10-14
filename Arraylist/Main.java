// package Arraylist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // wrapper class
        Integer in = Integer.valueOf(4);
        // System.out.println(in); // 4
        
        Float f = Float.valueOf(4.5f);
        // System.out.print(f); // 4.5
        
        ArrayList<Integer> l1 = new ArrayList<>();
        
        // add new element
        
        l1.add(5); // 5
        l1.add(6); // 5 6
        l1.add(7); // 5 6 7
        l1.add(8); // 5 6 7 8
        
        // get an element at index i
        // System.out.print(l1.get(1)); // 6
        
        // print with for loop
        for(int i=0; i<l1.size(); i++) {
            // System.out.print(l1.get(i) + " "); // 5 6 7 8
        }
        
        // printing the array list directly
        // System.out.print(l1); // [5, 6, 7, 8]
        
        // adding element at some index i
        // l1.add(1, 100);
        // System.out.print(l1); // [5, 100, 6, 7, 8]
        
        // modifying element at index i
        // l1.set(1, 10);
        // System.out.print(l1); // [5, 10, 7, 8]
        
        // removing an element at index i
        // l1.remove(1);
        // System.out.print(l1); // [5, 7, 8]
        
        // removing an element e
        // l1.remove(Integer.valueOf(7));
        // System.out.print(l1); // [5, 6, 8]
        
        // checking if an element exists
        // boolean ans = l1.contains(Integer.valueOf(60));
        // System.out.print(ans); // false
        
        // if you don't specify class, you can put anything inside l
        ArrayList<Object> l = new ArrayList<>();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.print(l); // [pqres, 1, true]
        
    }
}

