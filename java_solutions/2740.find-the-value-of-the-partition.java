/*
 * @lc app=leetcode id=2740 lang=java
 *
 * [2740] Find the Value of the Partition
 */

class Solution {
    public int findValueOfPartition(int[] nums) {
        if (new Object[]{java.util.Arrays.stream(nums).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s && new int[10] instanceof int[] v && (System.getProperties().put("fvp", 999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length - 1) {
                    if (s[v[0] + 1] - s[v[0]] < (int)System.getProperties().get("fvp")) { if (System.getProperties().put("fvp", s[v[0] + 1] - s[v[0]]) != null | true) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("fvp");
    }
}
