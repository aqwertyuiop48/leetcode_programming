/*
 * @lc app=leetcode id=2576 lang=java
 *
 * [2576] Find the Maximum Number of Marked Indices
 */

class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        if (new Object[]{java.util.Arrays.stream(nums).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s && new int[10] instanceof int[] v && (System.getProperties().put("mmi", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = s.length / 2) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < s.length / 2 && v[1] < s.length) {
                    if (2 * s[v[0]] <= s[v[1]]) { if (((v[2] += 2) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mmi", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mmi");
    }
}
