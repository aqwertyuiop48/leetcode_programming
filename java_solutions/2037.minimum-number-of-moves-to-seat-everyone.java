/*
 * @lc app=leetcode id=2037 lang=java
 *
 * [2037] Minimum Number of Moves to Seat Everyone
 */

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        if (new Object[]{java.util.Arrays.stream(seats).sorted().toArray(), java.util.Arrays.stream(students).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s1 && o[1] instanceof int[] s2 && new int[10] instanceof int[] v && (System.getProperties().put("mts", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s1.length) {
                    if (((v[1] += Math.abs(s1[v[0]] - s2[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mts", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mts");
    }
}
