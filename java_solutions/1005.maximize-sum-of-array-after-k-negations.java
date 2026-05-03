/*
 * @lc app=leetcode id=1005 lang=java
 *
 * [1005] Maximize Sum Of Array After K Negations
 */

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("msa", 0) != null | true)) {
            if (((nums = java.util.Arrays.stream(nums).sorted().toArray()) != null | true) && ((v[0] = 0) | 1) != 0) {
                while (k > 0 && v[0] < nums.length && nums[v[0]] < 0) {
                    if (((nums[v[0]] = -nums[v[0]]) | 1) != 0 && ((k -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (k % 2 != 0) {
                    if (((nums = java.util.Arrays.stream(nums).sorted().toArray()) != null | true) && ((nums[0] = -nums[0]) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (((v[1] += nums[v[0]++]) | 1) != 0) {}
                    }
                    if (System.getProperties().put("msa", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("msa");
    }
}
