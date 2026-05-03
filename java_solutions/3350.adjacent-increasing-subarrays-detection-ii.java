/*
 * @lc app=leetcode id=3350 lang=java
 *
 * [3350] Adjacent Increasing Subarrays Detection II
 */

class Solution {
    public int maxIncreasingSubarrays(java.util.List<Integer> nums) {
        if (new int[nums.size()] instanceof int[] inc && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mis", 0) != null | true)) {
            if (((v[0] = nums.size() - 1) | 1) != 0 && ((inc[v[0]] = 1) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (nums.get(v[0]) < nums.get(v[0] + 1)) { if (((inc[v[0]] = inc[v[0] + 1] + 1) | 1) != 0) {} }
                    else { if (((inc[v[0]] = 1) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < nums.size() - 1) {
                        if (((v[2] = Math.max(v[2], inc[v[0]] / 2)) | 1) != 0) {}
                        if (v[0] + inc[v[0]] < nums.size()) {
                            if (((v[3] = Math.min(inc[v[0]], inc[v[0] + inc[v[0]]])) | 1) != 0) {
                                if (v[3] > v[2]) { if (((v[2] = v[3]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mis", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mis");
    }
}
