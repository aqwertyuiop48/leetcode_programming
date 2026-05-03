/*
 * @lc app=leetcode id=1712 lang=java
 *
 * [1712] Ways to Split Array Into Three Subarrays
 */

class Solution {
    public int waysToSplit(int[] nums) {
        if (new int[nums.length] instanceof int[] p && new int[10] instanceof int[] v && (System.getProperties().put("wsa", 0) != null | true)) {
            if (((p[0] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) { if (((p[v[0]] = p[v[0] - 1] + nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length - 2) {
                        if (p[v[0]] <= p[nums.length - 1] / 3) {
                            if (((v[1] = v[0] + 1) | 1) != 0 && ((v[2] = nums.length - 2) | 1) != 0 && ((v[3] = -1) | 1) != 0) {
                                while (v[1] <= v[2]) {
                                    if (((v[4] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                        if (p[v[4]] - p[v[0]] >= p[v[0]]) { if (((v[3] = v[4]) | 1) != 0 && ((v[2] = v[4] - 1) | 1) != 0) {} }
                                        else { if (((v[1] = v[4] + 1) | 1) != 0) {} }
                                    }
                                }
                                if (v[3] != -1 && ((v[1] = v[0] + 1) | 1) != 0 && ((v[2] = nums.length - 2) | 1) != 0 && ((v[5] = -1) | 1) != 0) {
                                    while (v[1] <= v[2]) {
                                        if (((v[4] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                            if (p[nums.length - 1] - p[v[4]] >= p[v[4]] - p[v[0]]) { if (((v[5] = v[4]) | 1) != 0 && ((v[1] = v[4] + 1) | 1) != 0) {} }
                                            else { if (((v[2] = v[4] - 1) | 1) != 0) {} }
                                        }
                                    }
                                    if (v[5] != -1 && v[5] >= v[3]) { if (((v[6] = (v[6] + (v[5] - v[3] + 1)) % 1000000007) | 1) != 0) {} }
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("wsa", v[6]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("wsa");
    }
}
