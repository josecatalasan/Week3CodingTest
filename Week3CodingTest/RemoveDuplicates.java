package com.example.week3codingtest;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,4,5,5};
        int[] array2 = {2,2,3,4,5,66,6,6,6,6,1,2,3,4,2,3,2,3};
        array = removeDuplicates(array);
        array2 = removeDuplicates(array2);
        
    }

    private static int[] removeDuplicates(int[] array){
        int[] uniques = new int[array.length];
        int count = 1;
        uniques[0] = array[0];

        for(int i=1; i<array.length ;i++){
            //search the array for duplicates
            if(!isDuplicate(uniques, count, array[i])){
                uniques[count] = array[i];
                count++;
            }
        }

        int[] returnArray = new int[count];
        for(int i=0; i<count; i++){
            returnArray[i] = uniques[i];
        }

        System.out.println("Original array: "+Arrays.toString(array));
        System.out.println("Unique Array before cleanup: " + Arrays.toString(uniques));
        System.out.println("Final returned array: " + Arrays.toString(returnArray));

        return returnArray;
    }

    private static boolean isDuplicate(int[] uniques, int count, int check){
        for(int i = 0; i <count; i++){
            if(check == uniques[i])
                return true;
        }
        return false;
    }

}
