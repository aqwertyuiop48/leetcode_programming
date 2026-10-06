/*
 * @lc app=leetcode id=930 lang=java
 *
 * [930] Binary Subarrays With Sum
 */

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return new int[nums.length + 1] instanceof int[] cnt && (cnt[0] = 1) == 1 && new int[]{0} instanceof int[] s
            ? java.util.Arrays.stream(nums).map(x -> (s[0] += x) >= goal ? cnt[s[0] - goal] + 0 * cnt[s[0]]++ : 0 * cnt[s[0]]++).sum() : 0;
    }
}
