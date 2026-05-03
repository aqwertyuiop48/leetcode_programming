/*
 * @lc app=leetcode id=3432 lang=java
 *
 * [3432] Count Partitions with Even Sum Difference
 */

class Solution {
    public int countPartitions(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < nums.length - 1) {
                        if (((v[2] += nums[v[0]]) | 1) != 0) {
                            if ((v[2] - (v[1] - v[2])) % 2 == 0) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cp", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cp");
    }
}
