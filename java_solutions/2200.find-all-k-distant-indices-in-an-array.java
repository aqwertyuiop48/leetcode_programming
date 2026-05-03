/*
 * @lc app=leetcode id=2200 lang=java
 *
 * [2200] Find All K-Distant Indices in an Array
 */

class Solution {
    public java.util.List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        if (new int[10] instanceof int[] v && System.getProperties().put("fkdi", new java.util.ArrayList<Integer>()) != null | true) {
            if (System.getProperties().get("fkdi") instanceof java.util.List res && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] == key) {
                        if (((v[1] = Math.max(v[1], v[0] - k)) | 1) != 0 && ((v[2] = Math.min(nums.length - 1, v[0] + k)) | 1) != 0) {
                            while (v[1] <= v[2]) { if (res.add(v[1]) | true && ((v[1] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("fkdi");
    }
}
