/*
 * @lc app=leetcode id=3179 lang=java
 *
 * [3179] Find the N-th Value After K Seconds
 */

class Solution {
    public int valueAfterKSeconds(int n, int k) {
        if (new int[n] instanceof int[] a && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "vaks", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (((a[v[0]] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < k) {
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] < n) {
                                if (((a[v[1]] = (a[v[1]] + a[v[1] - 1]) % 1000000007) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "vaks", a[n - 1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "vaks");
    }
}
