package com.practice.dsa.beginner.string;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStrings = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=numberOfStrings; i++) {
            String str = sc.nextLine();

            int countVowels = 0;
            int countConsonents = 0;
            for(char ch: str.toCharArray()) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else {
                    countConsonents++;
                }
            }

            System.out.println(countVowels + " " + countConsonents);
        }
    }
}
