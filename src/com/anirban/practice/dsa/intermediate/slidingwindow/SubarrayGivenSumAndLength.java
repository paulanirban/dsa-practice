package com.anirban.practice.dsa.intermediate.slidingwindow;

/*
* Given an array A of length N. Also given are integers B and C.
* Return 1 if there exists a subarray with length B having sum
* C and 0 otherwise
* */
public class SubarrayGivenSumAndLength {
    public static void main(String[] args) {
        int[] arrVals = {4, 3, 2, 6, 1};
        int length = 3;
        int sum = 11;

        System.out.println(checkSubarrayGivenSumAndLength(arrVals, length, sum));
    }

    private static int checkSubarrayGivenSumAndLength(int[] arrVals, int length, int sum) {
        int currentSum = 0;
        for(int i=0; i<length; i++) {
            currentSum += arrVals[i];
        }

        if(currentSum == sum) {
            return 1;
        }

        for(int i=length; i<arrVals.length; i++) {
            currentSum += arrVals[i] - arrVals[i-length];

            if(currentSum == sum) {
                return 1;
            }
        }

        return 0;
    }
}
