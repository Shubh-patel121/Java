package Java.core_Java;

import java.util.Arrays; // Import Arrays class for printing arrays

public class Array {

    /*
     * Arrays are used to represent a group of elements as a single entity, but these
     * elements are homogeneous and of fixed size.
     * - limitations:- The size of the array is fixed, meaning once created, it cannot be resized.
     * - Arrays in Java are zero-indexed, with the first element stored at index 0.
     */

    public static void main(String[] args) {
        // Approach 1: Declaration, instantiation, and initialization
        int[] firstArray = { 10, 20, 30, 40 };

        // Approach 2: Declaration and instantiation, followed by initialization
        int[] secondArray = new int[10]; // Size of the array is 10
        secondArray[0] = 10;
        secondArray[1] = 20;

        // Creating a multidimensional array
        // 2D array -
        int[][] twoD = new int[4][3];

        // 3D array -
        int [][][] threeD = new int[5][3][2];

        //IMP:- Each time to increase or decrease the depth of the array
        // change square brackets as per the depth

        // Print arrays
        System.out.println("First Array: " + Arrays.toString(firstArray));
        System.out.println("Second Array: " + Arrays.toString(secondArray));
        System.out.println("2d Array: " + Arrays.deepToString(twoD));
        System.out.println("3d Array: " + Arrays.deepToString(threeD));
        // Jagged array: Array with varying internal array sizes
        // int[][] jaggedArray = new int[4][]; 

        // ## ForEach loop :-
        // better than for loop , it will give directly that item, no need to iterate using iterator like i, start and end;  
        for(int n : secondArray){
            System.out.println(n);
        }
    }
}

// Exceptions - are the run time errors, this will not break anything while compilation;