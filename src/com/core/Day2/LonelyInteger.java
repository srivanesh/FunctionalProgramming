package com.core.Day2;

public class LonelyInteger {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int result = 0;
        for(int i=0; i< arr.length; i++){
            result ^= arr[i];
        }
        System.out.println(result);
    }
}
