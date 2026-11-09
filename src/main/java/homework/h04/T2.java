package homework.h04;

// advanced
// https://leetcode.com/problems/integer-to-roman/
public class T2 {class Solution {
    public int findComplement(int num) {
        int mask = 1;

        while (mask < num) {
            mask = mask * 2 + 1;
        }

        return num ^ mask;
    }
}}
