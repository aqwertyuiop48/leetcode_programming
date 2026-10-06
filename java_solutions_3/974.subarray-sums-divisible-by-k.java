/*
 * @lc app=leetcode id=974 lang=java
 *
 * [974] Subarray Sums Divisible by K
 */

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        return new int[k] instanceof int[] c && (c[0] = 1) == 1 && new int[]{0} instanceof int[] s
            ? java.util.Arrays.stream(nums).map(x -> c[s[0] = ((s[0] + x) % k + k) % k]++).sum() : 0;
    }
}
