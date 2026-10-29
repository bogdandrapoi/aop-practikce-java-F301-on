package homework.h04;

// base
// https://leetcode.com/problems/plus-one/
public class T1 {class Solution {
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;

        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        return count;
    }
}}
