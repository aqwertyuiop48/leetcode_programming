/*
 * @lc app=leetcode id=2274 lang=java
 *
 * [2274] Maximum Consecutive Floors Without Special Floors
 */

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0) != null | true) && (special = java.util.Arrays.stream(special).sorted().toArray()) != null && ((v[0] = Math.max(special[0] - bottom, top - special[special.length - 1])) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
            while (v[1] < special.length) {
                if (special[v[1]] - special[v[1] - 1] - 1 > v[0]) { if (((v[0] = special[v[1]] - special[v[1] - 1] - 1) | 1) != 0) {} }
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mc", v[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
