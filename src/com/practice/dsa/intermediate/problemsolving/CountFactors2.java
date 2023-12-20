package com.practice.dsa.intermediate.problemsolving;


/*
* Given an integer A, you need to find the count of it's factors.
* Factor of a number is the number which divides it perfectly leaving no remainder.
* Example : 1, 2, 3, 6 are factors of 6
*
* Problem Constraints
* 1 <= A <= 109
* */
public class CountFactors2 {
    public static void main(String[] args) {
        System.out.println(countFactors(5));
    }

    private static int countFactors(int num) {
        int countfactors = 0;
        for(int i=1; i*i<num; i++) {
            if(num!=0 && num%i == 0) {
                if(i != num/i) {
                    countfactors += 2;
                } else {
                    countfactors++;
                }
            }
        }

        return countfactors;
    }
}
