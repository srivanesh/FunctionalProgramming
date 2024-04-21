package com.core.Day1;

import java.util.Arrays;

public class MeanMedianDay1 {
    public static void main(String args[])
    {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 }; // even input
        int n = a.length;

        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
        System.out.println("Odd input ");
        int b[] = { 9, 3, 1, 7, 5};
        int c = b.length;
        System.out.println("Odd input median = " + findMedian(b, c));

    }

    private static double findMedian(int[] a, int n) {
        System.out.println("Input :"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted :"+Arrays.toString(a));

        if(n % 2 !=0){
            return (double) a[n/2];
        }

        return (double) (a[n/2] + a[(n-1)/2])/ 2.0;
    }

    private static double findMean(int[] a, int n) {
        int sum = 0;
        for(int i=0; i< n; i++)
            sum += a[i];
        return  (double)sum/(double)n;
    }
}
