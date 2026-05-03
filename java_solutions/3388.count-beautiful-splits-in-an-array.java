/*
 * @lc app=leetcode id=3388 lang=java
 *
 * [3388] Count Beautiful Splits in an Array
 */

class Solution {
    public int beautifulSplits(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cbs", 0) != null | true)) {
            if (new int[nums.length + 5][nums.length + 5] instanceof int[][] lcp && ((v[0] = nums.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[1] = nums.length - 1) | 1) != 0) {
                        while (v[1] >= v[0]) {
                            if (nums[v[0]] == nums[v[1]]) {
                                if (((lcp[v[0]][v[1]] = 1 + lcp[v[0]+1][v[1]+1]) | 1) != 0) {}
                            }
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] < nums.length - 1) {
                        if (((v[1] = v[0] + 1) | 1) != 0) {
                            while (v[1] < nums.length) {
                                if ((v[0] <= v[1] - v[0] && lcp[0][v[0]] >= v[0]) || (v[1] - v[0] <= nums.length - v[1] && lcp[v[0]][v[1]] >= v[1] - v[0])) {
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cbs", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cbs");
    }
}
