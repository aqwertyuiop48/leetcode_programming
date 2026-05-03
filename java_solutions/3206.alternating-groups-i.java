/*
 * @lc app=leetcode id=3206 lang=java
 *
 * [3206] Alternating Groups I
 */

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "noag", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = colors.length) | 1) != 0) {
                while (v[0] < v[2]) {
                    if (colors[v[0]] != colors[(v[0] + 1) % v[2]] && colors[(v[0] + 1) % v[2]] != colors[(v[0] + 2) % v[2]]) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "noag", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "noag");
    }
}
