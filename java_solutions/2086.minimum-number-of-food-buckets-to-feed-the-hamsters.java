/*
 * @lc app=leetcode id=2086 lang=java
 *
 * [2086] Minimum Number of Food Buckets to Feed the Hamsters
 */

class Solution {
    public int minimumBuckets(String hamsters) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mb", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && hamsters.toCharArray() instanceof char[] h) {
            while (v[0] < h.length && v[2] == 0) {
                if (h[v[0]] == 'H') {
                    if (v[0] > 0 && h[v[0] - 1] == 'B') {}
                    else if (v[0] < h.length - 1 && h[v[0] + 1] == '.') { if (((h[v[0] + 1] = 'B') | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    else if (v[0] > 0 && h[v[0] - 1] == '.') { if (((h[v[0] - 1] = 'B') | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    else { if (((v[2] = 1) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mb", v[2] == 1 ? -1 : v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mb");
    }
}
