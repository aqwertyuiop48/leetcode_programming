/*
 * @lc app=leetcode id=2616 lang=java
 *
 * [2616] Minimize the Maximum Difference of Pairs
 */

class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mmd", 0) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(nums).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s && ((v[0] = 0) | 1) != 0 && ((v[1] = s[s.length - 1] - s[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[3] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[4] < s.length - 1) {
                            if (s[v[4] + 1] - s[v[4]] <= v[3]) { if (((v[5] += 1) | 1) != 0 && ((v[4] += 2) | 1) != 0) {} }
                            else { if (((v[4] += 1) | 1) != 0) {} }
                        }
                        if (v[5] >= p) { if (((v[2] = v[3]) | 1) != 0 && ((v[1] = v[3] - 1) | 1) != 0) {} }
                        else { if (((v[0] = v[3] + 1) | 1) != 0) {} }
                    }
                }
                if (System.getProperties().put("mmd", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mmd");
    }
}
