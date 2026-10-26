package homework.h03;

// base
// https://leetcode.com/problems/roman-to-integer/
public class T1 {class Solution {
public:
    double average(vector<int>& salary) {
        int minSal = INT_MAX;
        int maxSal = INT_MIN;
        double sum = 0;

        for (int s : salary) {
            sum += s;
            minSal = min(minSal, s);
            maxSal = max(maxSal, s);
        }

        return (sum - minSal - maxSal) / (salary.size() - 2);
    }
};}
