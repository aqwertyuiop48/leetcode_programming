/*
 * @lc app=leetcode id=2593 lang=java
 *
 * [2593] Find Score of an Array After Marking All Elements
 */

class Solution {
    public long findScore(int[] nums) {
        if (new int[nums.length][2] instanceof int[][] arr && new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "fs", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((arr[(int)v[0]][0] = nums[(int)v[0]]) | 1) != 0 && ((arr[(int)v[0]][1] = (int)v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((arr = java.util.Arrays.stream(arr).sorted((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null && new boolean[nums.length] instanceof boolean[] m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (!m[arr[(int)v[0]][1]]) {
                        if (((v[1] += arr[(int)v[0]][0]) | 1) != 0 && ((m[arr[(int)v[0]][1]] = true) | true)) {}
                        if (arr[(int)v[0]][1] > 0) { if (((m[arr[(int)v[0]][1] - 1] = true) | true)) {} }
                        if (arr[(int)v[0]][1] < nums.length - 1) { if (((m[arr[(int)v[0]][1] + 1] = true) | true)) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fs", v[1]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "fs");
    }
}
