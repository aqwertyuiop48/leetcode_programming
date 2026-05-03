/*
 * @lc app=leetcode id=3375 lang=java
 *
 * [3375] Minimum Operations to Make Array Values Equal to K
 */

class Solution {
    public int minOperations(int[] nums, int k) {
        if (new int[105] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mok", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length && v[1] != -1) {
                    if (nums[v[0]] < k) { if (((v[1] = -1) | 1) != 0) {} }
                    else if (nums[v[0]] > k && cnt[nums[v[0]]] == 0) {
                        if (((cnt[nums[v[0]]] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mok", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mok");
    }
}
