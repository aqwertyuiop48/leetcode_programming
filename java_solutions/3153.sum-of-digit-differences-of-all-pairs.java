/*
 * @lc app=leetcode id=3153 lang=java
 *
 * [3153] Sum of Digit Differences of All Pairs
 */

class Solution {
    public long sumDigitDifferences(int[] nums) {
        if (new long[15][10] instanceof long[][] cnt && new int[5] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "sdd", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) {
                            if (((cnt[v[2]][v[1] % 10] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                    while (v[0] < 15) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < 10) {
                                if (((v[2] = v[1] + 1) | 1) != 0) {
                                    while (v[2] < 10) {
                                        if (((lv[0] += cnt[v[0]][v[1]] * cnt[v[0]][v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "sdd", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "sdd");
    }
}
