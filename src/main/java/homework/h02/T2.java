package homework.h02;

// advanced
// https://leetcode.com/problems/divide-two-integers/
public class T2 {class Solution {
public:
    bool isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }

        if (num % 10 == 0) {
            return false;
        }

        return true;
    }
};
}
