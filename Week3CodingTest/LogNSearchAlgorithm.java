package com.example.week3codingtest;

public class LogNSearchAlgorithm {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,10,20,50}; //length = 9

        for(int i=0; i<array.length;i++){
            System.out.println(findIndex(array, array[i]));
        }

        System.out.println(findIndex(array, 60));
        System.out.println(findIndex(array, -100));

    }

    public static int findIndex(int[] array, int target){
        int start = 0;
        int end = array.length;
        int mid = -1;

        while(start <= end){
            mid = (start+end) / 2;

            if(mid>=array.length)
                return -1;

            if(array[mid] < target){
                start = mid+1;
            } else if(array[mid] > target){
                end = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
