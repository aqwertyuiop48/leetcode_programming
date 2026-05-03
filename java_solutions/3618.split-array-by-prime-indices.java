/*
 * @lc app=leetcode id=3618 lang=java
 *
 * [3618] Split Array by Prime Indices
 */

class Solution {
    public long splitArray(int[] nums) {
        if (new boolean[100005] instanceof boolean[] isPrime && new int[10] instanceof int[] v && new long[2] instanceof long[] sums && (System.getProperties().put(Thread.currentThread().getId() + "sa", 0L) != null | true)) {
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] <= 100000) { if (((isPrime[v[0]] = true) | true) && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] * v[0] <= 100000) {
                        if (isPrime[v[0]] && ((v[3] = v[0] * v[0]) | 1) != 0) {
                            while (v[3] <= 100000) { if (((isPrime[v[3]] = false) == false | true) && ((v[3] += v[0]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (v[0] >= 2 && isPrime[v[0]]) { if (((sums[0] += nums[v[0]]) | 1) != 0) {} }
                        else { if (((sums[1] += nums[v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "sa", Math.abs(sums[0] - sums[1])) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "sa");
    }
}
