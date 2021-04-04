package com.perscholas.core;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        Write a program that creates an array of integers with a length of 3.
//        Assign the values 1, 2, and 3 to the indexes. Print out each array element.

        int[] arr = {1, 2, 3};

        for (int j : arr) System.out.println(j);

//        Write a program that returns the middle element in an array. Give the following
//        values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

        int[] array = {13, 5, 7, 68, 2};
        int res = array[array.length / 2];

        System.out.println("Middle number is " + res);

//        Write a program that creates an array of String type and initializes it with the strings
//        “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( )
//        method. Use the Arrays.toString( ) method on the new array to verify that the original array was
//        copied.

        String[] sArray = {"red", "green", "blue", "yellow"};

        System.out.println(sArray.length);

        String sCArray = Arrays.toString(sArray.clone());

        System.out.println(sCArray);

//        Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any
//        integers.  Print out the value at the first index and the last index using length - 1 as the index.
//        Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of
//        exception which is produced. Now try to assign a value to the array index 5. You should get the same
//        type of exception.

        int[] numbers = {1, 67, 93, 35, 78};

        System.out.println(numbers[0] + " " + numbers[numbers.length - 1]);

//        Write a program where you create an integer array with a length of 5. Loop through the array and assign
//        the value of the loop control variable (e.g., i) to the corresponding index in the array.

        int[] autoNum = new int[5];

        for (int i = 0; i < autoNum.length; i++) {
            autoNum[i] = i;
        }

        System.out.println(Arrays.toString(autoNum));

//        Write a program where you create an integer array of 5 numbers. Loop through the array and assign the
//        value of the loop control variable multiplied by 2 to the corresponding index in the array.

        int[] autoNum1 = new int[5];

        for (int i = 0; i < autoNum1.length; i++) {
            autoNum1[i] = i * 2;
        }

        System.out.println(Arrays.toString(autoNum1));

//        Write a program where you create an array of 5 elements. Loop through the array and print the value of each
//        element, except for the middle (index 2) element.

        int[] ex2 = {64, 58, 32, 28, 283};

        for (int i = 0; i < ex2.length; i++) {
            if (i == ex2.length / 2) continue;
            System.out.println(ex2[i]);
        }

//        Write a program that creates a String array of 5 elements and swaps the first element with the middle
//        element without creating a new array.

        String[] swap = {"carrot", "car", "tree", "kitten", "water"};
        String a;
        a = swap[0];
        swap[0] = swap[swap.length / 2];
        swap[swap.length / 2] = a;

        System.out.println(Arrays.toString(swap));

//        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
//        Print the array in ascending order, print the smallest and the largest element of the array.
//        The output will look like the following:
//        Array in ascending order: 0, 1, 2, 4, 9, 13
//
//        The smallest number is 0
//
//        The biggest number is 13

        int[] nArray = {4, 2, 9, 13, 1, 0};

        int[] nPArray = nArray.clone();

        Arrays.sort(nPArray);

        System.out.println(Arrays.toString(nPArray));

        System.out.println("The smallest number is " + nPArray[0]);

        System.out.println("The biggest number is " + nPArray[nArray.length - 1]);

//        Create an array that includes an integer, 3 strings, and 1 double. Print the array.


//        String[] newArr = {1, "num", "nul", "nil", 1.5};


    }
}
