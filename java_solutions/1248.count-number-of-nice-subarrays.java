/*
 * @lc app=leetcode id=1248 lang=java
 *
 * [1248] Count Number of Nice Subarrays
 */

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if (new int[nums.length + 1] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put("cns", 0) != null | true)) {
            if (((c[0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[v[0]] % 2) | 1) != 0 && ((c[v[1]] += 1) | 1) != 0) {
                        if (v[1] >= k) { if (System.getProperties().put("cns", (int)System.getProperties().get("cns") + c[v[1] - k]) != null | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("cns");
    }
}
