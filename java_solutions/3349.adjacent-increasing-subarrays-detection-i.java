/*
 * @lc app=leetcode id=3349 lang=java
 *
 * [3349] Adjacent Increasing Subarrays Detection I
 */

class Solution {
    public boolean hasIncreasingSubarrays(java.util.List<Integer> nums, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ais", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= nums.size() - 2 * k && !(boolean)System.getProperties().get(Thread.currentThread().getId() + "ais")) {
                    if (((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < k - 1 && v[1] == 1) {
                            if (nums.get(v[0] + v[2]) >= nums.get(v[0] + v[2] + 1)) { if (((v[1] = 0) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 1 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < k - 1 && v[1] == 1) {
                                if (nums.get(v[0] + k + v[3]) >= nums.get(v[0] + k + v[3] + 1)) { if (((v[1] = 0) | 1) != 0) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                            if (v[1] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "ais", true) != null | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ais");
    }
}
