# DSA & LLD Practice

- DSA
  - [DSA - Beginner](#dsa---beginner)
  - [DSA - Intermediate](#dsa---intermediate)
  - [DSA - Advance](#dsa-advance)
- [LLD]

## DSA - Beginner

### 1. Easy HCF
> Write a program to input two integers A & B from user and print their HCF. 
> Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two 
> positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
>
> Note : this is non-recursive way
> 
> Solution : [Click](src/com/practice/dsa/beginner/functions/EasyHCF.java)

## DSA - Intermediate

### **1. Find maximum consecutive ones possible by replacing 0 from a binary array**
> Given a binary array A[i] -> 0 or 1, find the maximum consecutive 1's we can get by replacing at least one 0 with a 1.
> 
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/MaxConsecutiveOnesByReplace.java)

### **2. Matrix Subtraction**
> You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
> 
> If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
>
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/MatrixSubtraction.java)

### **3. Multiple Left Rotation**
> Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
>
> Find the rotated array for each value and return the result in the form of a matrix where ith row represents the rotated array for the ith value in B.
> 
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/MultipleLeftRotation.java)

### **4. Carry-Forward: Amazing Sub Strings**
> You are given a string S, and you have to find all the amazing substrings of S. 
> An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
>
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/carryforward/AmazingSubstrings.java)

### **5. Josephus Problem**
> There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and 
> pass the knife to the next person standing in circle. This process continues till there is only 1 
> person remaining. Find the last person standing in the circle.
>
> Solution : [Click](src/com/practice/dsa/intermediate/problemsolving/JosephusProblem.java)

### **6. Carry-Forward: Count Pair**
> Given a character array, count the number of pairs (i, j) possible s.t. i<j and a[i]='a' and a[j]='g'.
> 
> Note : All characters are of lowercase
>
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/carryforward/CountPairs.java)

### **7. Sliding-Window: Subarray Given Sum**
> Given an array A of length N. Also given are integers B and C. Return 1 if there exists a subarray 
> with length B having sum C or 0 otherwise
>
> Solution : [Click](src/com/practice/dsa/intermediate/slidingwindow/SubarrayGivenSumAndLength.java)

### **8. Carry-Forward: Leaders in an Array**
> Given an integer array A containing N distinct integers, you have to find all the leaders in array A. 
> An element is a leader if it is strictly greater than all the elements to its right side.
>
> NOTE: The rightmost element is always a leader.
>
> Solution : [Click](src/com/practice/dsa/intermediate/arrays/carryforward/LeadersInAnArray.java)

### **9. Hashing: Count sub-array zero-sum**
> Given an array A of N integers. Find the count of the subarrays in the array which sums to zero. 
> Since the answer can be very large, return the remainder on dividing the result with 10^9+7
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/CountSubarrayZeroSum.java)

### **10. Hashing: Distinct numbers in window**
> You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of 
> distinct numbers in all windows of size B.
> 
> Formally, return an array of size N-B+1 where i'th element in this array contains number of 
> distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
>
> NOTE: if B > N, return an empty array.
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/DistinctNumberInWindow.java)

### **11. Hashing: Count Pair Sum**
> You are given an array A of N integers and an integer B. Count the number of pairs (i,j) 
> such that A[i] + A[j] = B and i ≠ j. 
> Since the answer can be very large, return the remainder after dividing the count with 109+7.
> 
> Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/CountPairSum.java)

### **12. Hashing: Count Pair Difference**
> You are given an array A of N integers and an integer B. 
> Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
> 
> Since the answer can be very large, return the remainder after dividing the count with 10^9+7.
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/CountPairDifference.java)

### **13. Hashing: Pair With Given Difference**
> Given a one-dimensional unsorted array A containing N integers.
> You are also given an integer B, find if there exists a pair of elements in the 
> array whose difference is B. 
> 
> Return 1 if any such pair exists else return 0.
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/PairWithGivenDiff.java)

### **14. Hashing: Pair With Given Difference**
> Given a one-dimensional String array of "Numbers". Return the count of magic 
> numbers exist in that array.
> 
> Magic Number : Sum of a number and its palindrome.
> 
> E.g. in the following given String array of "Numbers", 15 + 51 = 66 and "66" is 
> available in the array
> 
> ["13", "21", "86", "15", "47", "66"]
>
> Solution : [Click](src/com/practice/dsa/intermediate/hashing/CountMagicNums.java)