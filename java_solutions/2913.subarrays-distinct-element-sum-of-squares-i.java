/*
 * @lc app=leetcode id=2913 lang=java
 *
 * [2913] Subarrays Distinct Element Sum of Squares I
 */

class Solution {
    public int sumCounts(List<Integer> nums) {
        if (new int[105] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sds", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.size()) {
                    if (((v[1] = v[0]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] < nums.size()) {
                            if (cnt[nums.get(v[1])] != v[0] + 1) {
                                if (((cnt[nums.get(v[1])] = v[0] + 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                            if (((v[2] += v[3] * v[3]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sds", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sds");
    }
}
