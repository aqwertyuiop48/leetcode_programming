/*
 * @lc app=leetcode id=1297 lang=java
 *
 * [1297] Maximum Number of Occurrences of a Substring
 */

class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        if (System.getProperties().put("mno_m", new java.util.HashMap<String, Integer>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("mno", 0) != null | true)) {
            if (System.getProperties().get("mno_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= s.length() - minSize) {
                    if (new Object[]{s.substring(v[0], v[0] + minSize)} instanceof Object[] o && o[0] instanceof String sub) {
                        if (sub.chars().distinct().count() <= maxLetters) {
                            if (m.put(sub, (int)m.getOrDefault(sub, 0) + 1) == null | true && (int)m.get(sub) > v[1]) { if (((v[1] = (int)m.get(sub)) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mno", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mno");
    }
}
