/*
 * @lc app=leetcode id=3824 lang=java
 *
 * [3824] Minimum K to Reduce Array Within Limit
 */

class Solution {
    public int minimumK(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mk", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 100000) | 1) != 0 && ((v[2] = 100000) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[3] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[5] < nums.length) {
                            if (((v[4] += (nums[v[5]] + v[3] - 1) / v[3]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                        }
                        if ((long)v[4] <= (long)v[3] * v[3]) {
                            if (((v[2] = v[3]) | 1) != 0 && ((v[1] = v[3] - 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = v[3] + 1) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mk", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mk");
    }
}
