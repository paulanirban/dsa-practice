package com.anirban.practice.dsa.intermediate.problemsolving;

/*
* Given a number A. Return square root of the number if it is perfect square otherwise return -1.
* Note: A number is a perfect square if its square root is an integer.
*
* Problem Constraints
* 1 <= A <= 108
* */
public class PerfectSquare {
    public static void main(String[] args) {
        int squareNum = isPerfectSqare(26);
        System.out.println(squareNum == -1 ? "The given number is not a perfect square" : "The square root of the given number is : " + squareNum);
    }

    private static int isPerfectSqare(int num) {
        if(num == 0 || num == 1) {
            return num;
        }

        int left = 1;
        int right = num;

        while(left <= right) {
            long mid = (right + left) / 2;
            long square = mid * mid;

            if(square == num) {
                return (int)mid;
            }

            if(square < num ) {
                left = (int)mid+1;
            } else {
                right = (int)mid-1;
            }
        }

        return -1;
    }
}
