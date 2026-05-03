/*
 * @lc app=leetcode id=3397 lang=java
 *
 * [3397] Maximum Number of Distinct Elements After Operations
 */

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if (new int[nums.length] instanceof int[] tmp && new int[256] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mde", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 24) {
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]++] = 0) | 1) != 0) {} } }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < nums.length) { if (((cnt[(nums[v[1]++] >> v[0]) & 255] += 1) | 1) != 0) {} } }
                    if (((v[1] = 1) | 1) != 0) { while (v[1] < 256) { if (((cnt[v[1]] += cnt[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[1] = nums.length - 1) | 1) != 0) {
                        while (v[1] >= 0) { if (((tmp[--cnt[(nums[v[1]] >> v[0]) & 255]] = nums[v[1]]) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) { while (v[1] < nums.length) { if (((nums[v[1]] = tmp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                    if (((v[0] += 8) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -2147483648) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[3] = nums[v[0]] - k) | 1) != 0 && ((v[4] = nums[v[0]] + k) | 1) != 0) {
                        if (v[1] < v[3]) { if (((v[1] = v[3]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                        else if (v[1] < v[4]) { if (((v[1] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mde", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mde");
    }
}
