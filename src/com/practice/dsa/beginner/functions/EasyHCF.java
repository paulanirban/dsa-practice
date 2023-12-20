package com.practice.dsa.beginner.functions;

import java.util.Scanner;


/*
* Write a program to input two integers A & B from user and print their HCF.
* Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two
* positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
*
* Note : this is non-recursive way
* */

public class EasyHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();

        int gcd = 0;
        for(int i=1; i<numOne || i<numTwo; i++) {
            if(numOne % i == 0 && numTwo % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
