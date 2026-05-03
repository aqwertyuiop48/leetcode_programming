/*
 * @lc app=leetcode id=3663 lang=java
 *
 * [3663] Find The Least Frequent Digit
 */

class Solution {
    public int getLeastFrequentDigit(int n) {
        if (new int[10] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lfd", 0) != null | true)) {
            if (((v[0] = n) | 1) != 0) {
                while (v[0] > 0) { if (((freq[v[0] % 10] += 1) | 1) != 0 && ((v[0] /= 10) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < 10) {
                    if (freq[v[0]] > 0 && freq[v[0]] < v[1]) { if (((v[1] = freq[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lfd", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lfd");
    }
}
