package homework.h02;

// base
// https://leetcode.com/problems/add-binary/
public class T7 {class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            count++;
        }

        return count;
    }
}}
