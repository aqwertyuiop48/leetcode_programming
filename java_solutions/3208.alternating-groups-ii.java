/*
 * @lc app=leetcode id=3208 lang=java
 *
 * [3208] Alternating Groups II
 */

class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nag", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < colors.length + k - 2) {
                    if (colors[v[0] % colors.length] != colors[(v[0] + 1) % colors.length]) {
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 1) | 1) != 0) {}
                    }
                    if (v[1] >= k) {
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nag", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nag");
    }
}
