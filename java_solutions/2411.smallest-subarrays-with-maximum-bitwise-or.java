/*
 * @lc app=leetcode id=2411 lang=java
 *
 * [2411] Smallest Subarrays With Maximum Bitwise OR
 */

class Solution {
    public int[] smallestSubarrays(int[] nums) {
        if (new int[nums.length] instanceof int[] ans && java.util.stream.IntStream.generate(() -> -1).limit(32).toArray() instanceof int[] last && (System.getProperties().put(Thread.currentThread().getId() + "ss", ans) != null | true) && new int[10] instanceof int[] v && ((v[0] = nums.length - 1) | 1) != 0) {
            while (v[0] >= 0) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {
                    while (v[1] < 30) {
                        if ((nums[v[0]] & (1 << v[1])) != 0) { if (((last[v[1]] = v[0]) | 1) != 0) {} }
                        if (last[v[1]] != -1) { if (((v[2] = Math.max(v[2], last[v[1]])) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((ans[v[0]] = v[2] - v[0] + 1) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ss");
    }
}
