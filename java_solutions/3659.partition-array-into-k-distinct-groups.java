/*
 * @lc app=leetcode id=3659 lang=java
 *
 * [3659] Partition Array Into K-Distinct Groups
 */

class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "pa", true) != null | true)) {
            if (nums.length % k != 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "pa", false) != null | true) {}
            } else if (((v[0] = 0) | 1) != 0 && ((v[1] = nums.length / k) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (map.put(nums[v[0]], (int)map.getOrDefault(nums[v[0]], 0) + 1) == null | true && (int)map.get(nums[v[0]]) > v[1]) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "pa", false) != null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "pa");
    }
}
