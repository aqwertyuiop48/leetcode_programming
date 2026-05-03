/*
 * @lc app=leetcode id=3001 lang=java
 *
 * [3001] Minimum Moves to Capture The Queen
 */

class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mmcq", 2) != null | true)) {
            if (a == e) {
                if (!(a == c && ((d > b && d < f) || (d > f && d < b)))) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mmcq", 1) != null | true) {}
                }
            }
            if (b == f && (int)System.getProperties().get(Thread.currentThread().getId() + "mmcq") != 1) {
                if (!(b == d && ((c > a && c < e) || (c > e && c < a)))) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mmcq", 1) != null | true) {}
                }
            }
            if (Math.abs(c - e) == Math.abs(d - f) && (int)System.getProperties().get(Thread.currentThread().getId() + "mmcq") != 1) {
                if (!(Math.abs(a - c) == Math.abs(b - d) && Math.abs(a - e) == Math.abs(b - f) && ((a > c && a < e) || (a > e && a < c)))) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "mmcq", 1) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmcq");
    }
}
