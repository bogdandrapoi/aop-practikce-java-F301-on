package homework.h03;

// advanced
// https://leetcode.com/problems/reverse-integer/
public class T2 {class Solution {
public:
    int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        int k = n / m;
        int num2 = m * k * (k + 1) / 2;
        return total - 2 * num2;
    }
};}
