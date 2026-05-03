/*
 * @lc app=leetcode id=2780 lang=java
 *
 * [2780] Minimum Index of a Valid Split
 */

class Solution {
    public int minimumIndex(java.util.List<Integer> nums) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap m && (System.getProperties().put(Thread.currentThread().getId() + "mi", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.size()) {
                if (m.put((int)nums.get(v[0]), (int)m.getOrDefault((int)nums.get(v[0]), 0) + 1) == null | true) {
                    if ((int)m.get((int)nums.get(v[0])) * 2 > nums.size()) { if (((v[1] = (int)nums.get(v[0])) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[2] = (int)m.get(v[1])) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                while (v[0] < nums.size() - 1 && v[4] == 1) {
                    if ((int)nums.get(v[0]) == v[1]) { if (((v[3] += 1) | 1) != 0) {} }
                    if (v[3] * 2 > v[0] + 1 && (v[2] - v[3]) * 2 > nums.size() - v[0] - 1) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mi", v[0]) != null | true && ((v[4] = 0) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mi");
    }
}
