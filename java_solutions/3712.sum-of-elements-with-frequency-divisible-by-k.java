/*
 * @lc app=leetcode id=3712 lang=java
 *
 * [3712] Sum of Elements With Frequency Divisible by K
 */

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "soe", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (map.put(nums[v[0]], (int)map.getOrDefault(nums[v[0]], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (map.containsKey(nums[v[0]])) {
                        if ((int)map.get(nums[v[0]]) % k == 0) {
                            if (((v[1] += nums[v[0]] * (int)map.get(nums[v[0]])) | 1) != 0) {}
                        }
                        if (map.remove(nums[v[0]]) != null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "soe", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "soe");
    }
}
