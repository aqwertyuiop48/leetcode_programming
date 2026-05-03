/*
 * @lc app=leetcode id=3741 lang=java
 *
 * [3741] Minimum Distance Between Three Equal Elements II
 */

class Solution {
    public int minimumDistance(int[] nums) {
        if (new int[100005] instanceof int[] last1 && new int[100005] instanceof int[] last2 && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mde2", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 100000) { if (((last1[v[0]] = -1) | 1) != 0 && ((last2[v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 999999999) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (last2[nums[v[0]]] != -1) {
                            if (2 * (v[0] - last2[nums[v[0]]]) < v[1]) { if (((v[1] = 2 * (v[0] - last2[nums[v[0]]])) | 1) != 0) {} }
                        }
                        if (((last2[nums[v[0]]] = last1[nums[v[0]]]) | 1) != 0 && ((last1[nums[v[0]]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mde2", v[1] == 999999999 ? -1 : v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mde2");
    }
}
