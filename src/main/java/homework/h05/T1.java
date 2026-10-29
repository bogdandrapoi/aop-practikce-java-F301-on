package homework.h05;
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        return nums[n - 1] * nums[n - 2]
             - nums[0] * nums[1];
    }
}
// base
// https://leetcode.com/problems/longest-common-prefix/
public class T1 {}
