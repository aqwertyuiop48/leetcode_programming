/*
 * @lc app=leetcode id=2391 lang=java
 *
 * [2391] Minimum Amount of Time to Collect Garbage
 */

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "gc", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
            while (v[0] < garbage.length) {
                if (((v[1] += garbage[v[0]].length()) | 1) != 0) {}
                if (garbage[v[0]].indexOf('M') != -1) { if (((v[2] = v[0]) | 1) != 0) {} }
                if (garbage[v[0]].indexOf('P') != -1) { if (((v[3] = v[0]) | 1) != 0) {} }
                if (garbage[v[0]].indexOf('G') != -1) { if (((v[4] = v[0]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < travel.length) {
                    if (v[0] < v[2]) { if (((v[1] += travel[v[0]]) | 1) != 0) {} }
                    if (v[0] < v[3]) { if (((v[1] += travel[v[0]]) | 1) != 0) {} }
                    if (v[0] < v[4]) { if (((v[1] += travel[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "gc", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "gc");
    }
}
