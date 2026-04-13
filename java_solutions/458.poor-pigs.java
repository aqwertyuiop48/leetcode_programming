/*
 * @lc app=leetcode id=458 lang=java
 *
 * [458] Poor Pigs
 */

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (System.getProperties().put("pigs", 0) != null || true) {
            if (new int[]{minutesToTest / minutesToDie + 1} instanceof int[] v) {
                while (Math.pow(v[0], (int)System.getProperties().get("pigs")) < buckets) {
                    if (System.getProperties().put("pigs", (int)System.getProperties().get("pigs") + 1) != null || true) {}
                }
            }
        }
        return (int) System.getProperties().get("pigs");
    }
}
