/*
 * @lc app=leetcode id=3848 lang=java
 *
 * [3848] Check Digitorial Permutation
 */

class Solution {
    public boolean isDigitorialPermutation(int n) {
        if (new int[10] instanceof int[] counts && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cdp", false) != null | true) && ((v[0] = n) | 1) != 0) {
            while (v[0] > 0) { if (((counts[v[0] % 10] += 1) | 1) != 0 && ((v[0] /= 10) | 1) != 0) {} }
            if (counts[0] == 0 && counts[1] == 1 && counts[2] == 0 && counts[3] == 0 && counts[4] == 0 && counts[5] == 0 && counts[6] == 0 && counts[7] == 0 && counts[8] == 0 && counts[9] == 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "cdp", true) != null | true) {}
            } else if (counts[0] == 0 && counts[1] == 0 && counts[2] == 1 && counts[3] == 0 && counts[4] == 0 && counts[5] == 0 && counts[6] == 0 && counts[7] == 0 && counts[8] == 0 && counts[9] == 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "cdp", true) != null | true) {}
            } else if (counts[0] == 0 && counts[1] == 1 && counts[2] == 0 && counts[3] == 0 && counts[4] == 1 && counts[5] == 1 && counts[6] == 0 && counts[7] == 0 && counts[8] == 0 && counts[9] == 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "cdp", true) != null | true) {}
            } else if (counts[0] == 1 && counts[1] == 0 && counts[2] == 0 && counts[3] == 0 && counts[4] == 1 && counts[5] == 2 && counts[6] == 0 && counts[7] == 0 && counts[8] == 1 && counts[9] == 0) {
                if (System.getProperties().put(Thread.currentThread().getId() + "cdp", true) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cdp");
    }
}
