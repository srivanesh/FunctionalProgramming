package com.core;

import java.util.Arrays;

public class MeanMedian {
    public static void main(String args[])
    {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
        int n = a.length;

        // Function call
        System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
    }

    private static double findMedian(int[] a, int n) {
        Arrays.sort(a);

        if(n % 2 !=0) return (double) a[n/2];

        return (double) (a[n/2] + a[(n-1)/2])/ 2.0;
    }

    private static double findMean(int[] a, int n) {
        int sum = 0;
        for(int i=0; i< n; i++)
            sum += a[i];
        return  (double)sum/(double)n;
    }
}
