/*
 * @lc app=leetcode id=3718 lang=java
 *
 * [3718] Smallest Missing Multiple of K
 */

class Solution {
    public int missingMultiple(int[] nums, int k) {
        if (new int[100005] instanceof int[] seen && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "smm", k) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] <= 100000) { if (((seen[nums[v[0]]] = 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[1] = k) | 1) != 0) {
                    while (v[1] <= 100000 && seen[v[1]] == 1) {
                        if (((v[1] += k) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "smm", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "smm");
    }
}
