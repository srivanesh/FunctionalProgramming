package com.core.Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {
        //int[] array = {7,2,10,25,18};
        int[] array = {1,2,3,4,5};
        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());
        minMaxSum(arr);
    }

    private static void minMaxSum(List<Integer> arr) {

        int[] inputArray = arr.stream().mapToInt(Integer::intValue).toArray();
        long min =0, max =0, sum =0;
        min = inputArray[0];
        max = min;
        sum = min;

        for(int i=1; i< inputArray.length; i++){
            sum += inputArray[i];
            if(inputArray[i] < min){
                min = inputArray[i];
            }
            if(inputArray[i] > max){
                max = inputArray[i];
            }
        }

        System.out.println((sum-max)+" "+(sum-min));
    }
}
