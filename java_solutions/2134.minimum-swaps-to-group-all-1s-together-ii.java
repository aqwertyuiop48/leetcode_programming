/*
 * @lc app=leetcode id=2134 lang=java
 *
 * [2134] Minimum Swaps to Group All 1's Together II
 */

class Solution {
    public int minSwaps(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms2", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (nums[v[0]] == 1) { if (((v[1] += 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
            if (v[1] == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "ms2", 0) != null | true) {} }
            else if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < v[1]) { if (nums[v[0]] == 1) { if (((v[2] += 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
                if (((v[3] = v[2]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (nums[v[0] - 1] == 1) { if (((v[2] -= 1) | 1) != 0) {} }
                        if (nums[(v[0] + v[1] - 1) % nums.length] == 1) { if (((v[2] += 1) | 1) != 0) {} }
                        if (v[2] > v[3]) { if (((v[3] = v[2]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ms2", v[1] - v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ms2");
    }
}
