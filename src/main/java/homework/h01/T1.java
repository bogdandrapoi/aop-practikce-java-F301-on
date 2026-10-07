package homework.h01;

// base
// https://leetcode.com/problems/palindrome-number/
public class T1 {}

class Solution {
public:
    int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }
};
