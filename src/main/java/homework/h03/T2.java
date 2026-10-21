package homework.h03;

// advanced
// https://leetcode.com/problems/reverse-integer/
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
