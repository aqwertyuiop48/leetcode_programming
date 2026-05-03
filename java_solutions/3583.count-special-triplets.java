/*
 * @lc app=leetcode id=3583 lang=java
 *
 * [3583] Count Special Triplets
 */

class Solution {
    public int specialTriplets(int[] nums) {
        if (new int[200005] instanceof int[] left && new int[200005] instanceof int[] right && new int[10] instanceof int[] v && new long[1] instanceof long[] ans && (System.getProperties().put(Thread.currentThread().getId() + "cst", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((right[nums[v[0]++]] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((right[nums[v[0]]] -= 1) | 1) != 0) {
                        if (nums[v[0]] * 2 <= 200000) {
                            if (((ans[0] = (ans[0] + (long)left[nums[v[0]] * 2] * right[nums[v[0]] * 2]) % 1000000007) | 1) != 0) {}
                        }
                    }
                    if (((left[nums[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cst", (int)ans[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cst");
    }
}
