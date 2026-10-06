/*
 * @lc app=leetcode id=789 lang=java
 *
 * [789] Escape The Ghosts
 */

class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        return java.util.Arrays.stream(ghosts).allMatch(g -> Math.abs(g[0] - target[0]) + Math.abs(g[1] - target[1]) > Math.abs(target[0]) + Math.abs(target[1]));
    }
}
