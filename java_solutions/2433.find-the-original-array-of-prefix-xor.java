/*
 * @lc app=leetcode id=2433 lang=java
 *
 * [2433] Find The Original Array of Prefix Xor
 */

class Solution {
    public int[] findArray(int[] pref) {
        if (new int[pref.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fa", ans) != null | true) && ((ans[0] = pref[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
            while (v[0] < pref.length) {
                if (((ans[v[0]] = pref[v[0]] ^ pref[v[0] - 1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "fa", ans) != null | true) {}
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fa");
    }
}
