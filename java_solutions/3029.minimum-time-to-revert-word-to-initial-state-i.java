/*
 * @lc app=leetcode id=3029 lang=java
 *
 * [3029] Minimum Time to Revert Word to Initial State I
 */

class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mti", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] * k < word.length() && (int)System.getProperties().get(Thread.currentThread().getId() + "mti") == 0) {
                    if (word.startsWith(word.substring(v[0] * k))) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mti", v[0]) != null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if ((int)System.getProperties().get(Thread.currentThread().getId() + "mti") == 0) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mti", (word.length() + k - 1) / k) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mti");
    }
}
