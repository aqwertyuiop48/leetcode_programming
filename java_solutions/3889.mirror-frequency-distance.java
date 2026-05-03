/*
 * @lc app=leetcode id=3889 lang=java
 *
 * [3889] Mirror Frequency Distance
 */

class Solution {
    public int mirrorFrequency(String s) {
        if (new int[128] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put("mfd", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) { if (((freq[s.charAt(v[0]++)] += 1) | 1) != 0) {} }
                if (((v[0] = 'a') | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] <= 'm') { if (((v[1] += Math.abs(freq[v[0]] - freq['z' - (v[0] - 'a')])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((v[0] = '0') | 1) != 0) {
                        while (v[0] <= '4') { if (((v[1] += Math.abs(freq[v[0]] - freq['9' - (v[0] - '0')])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                        if (System.getProperties().put("mfd", v[1]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mfd");
    }
}
