package com.core.Day1;

public class PlusMinus {
    /**
     *
     * @param args
     * Constraints
     *
     *
     * Output Format
     * Print the following  lines, each to  decimals:
     * proportion of positive values
     * proportion of negative values
     * proportion of zeros
     * Sample Input
     * STDIN           Function
     * -----           --------
     * 6               arr[] size n = 6
     * -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
     * Sample Output
     * 0.500000
     * 0.333333
     * 0.166667
     *
     * Explanation
     * There are  positive numbers,  negative numbers, and  zero in the array.
     * The proportions of occurrence are positive:  , negative:  and zeros:  .
     */
    public static void main(String[] args) {
        int[] array = {-4, 3, -9, 0, 4, 1};
        calculateFraction(array);
    }

    private static void calculateFraction(int[] array) {

        int length = array.length;
        float positiveCount = 0f;
        float negativeCount = 0f;
        float zeroCount = 0f;

       for(int i=0; i<array.length; i++){
           if(array[i] == 0){
               zeroCount ++;
           }if(array[i] >0){
               positiveCount ++;
           }if(array[i] <0){
               negativeCount ++;
           }
       }

        System.out.printf("%1.6f \n", positiveCount/length);
        System.out.printf("%1.6f \n", negativeCount/length);
        System.out.printf("%1.6f \n", zeroCount/length);
    }
}
