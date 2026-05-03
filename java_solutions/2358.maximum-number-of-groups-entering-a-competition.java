/*
 * @lc app=leetcode id=2358 lang=java
 *
 * [2358] Maximum Number of Groups Entering a Competition
 */

class Solution {
    public int maximumGroups(int[] grades) {
        if (System.getProperties().put("mng", (int)(Math.sqrt(grades.length * 8.0 + 1) - 1) / 2) != null | true) {}
        return (int) System.getProperties().get("mng");
    }
}
