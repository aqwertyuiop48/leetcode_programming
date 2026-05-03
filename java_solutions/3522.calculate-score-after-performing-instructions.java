/*
 * @lc app=leetcode id=3522 lang=java
 *
 * [3522] Calculate Score After Performing Instructions
 */

class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        if (new boolean[values.length] instanceof boolean[] vis && new long[2] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csapi", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0) {
                while (v[0] >= 0 && v[0] < values.length && !vis[v[0]]) {
                    if (((vis[v[0]] = true) | true) && instructions[v[0]].charAt(0) == 'a') {
                        if (((lv[0] += values[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] += values[v[0]]) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "csapi", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "csapi");
    }
}
