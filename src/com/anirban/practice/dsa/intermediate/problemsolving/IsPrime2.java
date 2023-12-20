package com.anirban.practice.dsa.intermediate.problemsolving;

public class IsPrime2 {
    public static void main(String[] args) {
        System.out.println(isPrime(19) ? "It's a Prime number" : "It's NOT a Prime number");
    }

    private static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        if(num == 2 || num == 3) {
            return true;
        }

        if(num%2 == 0 || num%3 == 0) {
            return false;
        }

        for(int i=5; i*i<=num; i+=6) {
            if(num%i == 0 || num % (i=2) == 0) {
                return false;
            }
        }

        return true;
    }
}
