/*
 * @lc app=leetcode id=3761 lang=java
 *
 * [3761] Minimum Absolute Distance Between Mirror Pairs
 */

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "mad", -1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0) {
            while (v[0] < nums.length) {
                if (map.containsKey(nums[v[0]]) && v[0] - (int)map.get(nums[v[0]]) < v[1]) {
                    if (((v[1] = v[0] - (int)map.get(nums[v[0]])) | 1) != 0) {}
                }
                if (((v[2] = nums[v[0]]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[2] > 0) { if (((v[3] = v[3] * 10 + v[2] % 10) | 1) != 0 && ((v[2] /= 10) | 1) != 0) {} }
                    if (map.put(v[3], v[0]) == null | true) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mad", v[1] == 2000000000 ? -1 : v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mad");
    }
}
