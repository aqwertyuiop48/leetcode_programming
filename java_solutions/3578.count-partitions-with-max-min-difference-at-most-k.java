/*
 * @lc app=leetcode id=3578 lang=java
 *
 * [3578] Count Partitions With Max-Min Difference at Most K
 */

class Solution {
    public int countPartitions(int[] nums, int k) {
        if (new int[nums.length + 1] instanceof int[] dp && new int[10] instanceof int[] v && new java.util.TreeMap<Integer, Integer>() instanceof java.util.TreeMap map && (System.getProperties().put(Thread.currentThread().getId() + "cp", 0) != null | true)) {
            if (((dp[0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (map.put(nums[v[0]], (int)map.getOrDefault(nums[v[0]], 0) + 1) == null | true) {}
                    while ((int)map.lastKey() - (int)map.firstKey() > k) {
                        if (((v[3] = (int)map.get(nums[v[1]])) | 1) != 0) {
                            if (v[3] == 1) { if (map.remove(nums[v[1]]) != null | true) {} }
                            else { if (map.put(nums[v[1]], v[3] - 1) != null | true) {} }
                        }
                        if (((v[2] = (v[2] - dp[v[1]] + 1000000007) % 1000000007) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (((dp[v[0] + 1] = v[2]) | 1) != 0 && ((v[2] = (v[2] + dp[v[0] + 1]) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cp", dp[nums.length]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cp");
    }
}
