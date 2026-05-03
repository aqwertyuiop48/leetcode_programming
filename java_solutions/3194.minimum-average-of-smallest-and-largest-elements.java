/*
 * @lc app=leetcode id=3194 lang=java
 *
 * [3194] Minimum Average of Smallest and Largest Elements
 */

class Solution {
    public double minimumAverage(int[] nums) {
        if (new int[55] instanceof int[] cnt && new int[nums.length] instanceof int[] sorted && new int[10] instanceof int[] v && new double[5] instanceof double[] dv && (System.getProperties().put(Thread.currentThread().getId() + "masl", 0.0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((cnt[nums[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] <= 50) {
                        while (cnt[v[0]] > 0) {
                            if (((sorted[v[1]++] = v[0]) | 1) != 0 && ((cnt[v[0]] -= 1) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0 && ((dv[0] = 999999.0) != 0 | true)) {
                        while (v[0] < nums.length / 2) {
                            if (((dv[1] = (sorted[v[0]] + sorted[nums.length - 1 - v[0]]) / 2.0) != 0 | true)) {
                                if (dv[1] < dv[0]) {
                                    if (((dv[0] = dv[1]) != 0 | true)) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "masl", dv[0]) != null | true) {}
                    }
                }
            }
        }
        return (double) System.getProperties().get(Thread.currentThread().getId() + "masl");
    }
}
