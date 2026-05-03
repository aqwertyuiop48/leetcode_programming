/*
 * @lc app=leetcode id=2744 lang=java
 *
 * [2744] Find Maximum Number of String Pairs
 */

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        if (new int[10] instanceof int[] v && System.getProperties().put("msp", new java.util.HashSet<String>()) != null | true && (System.getProperties().put("msp_ans", 0) != null | true)) {
            if (System.getProperties().get("msp") instanceof java.util.Set s && ((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (s.contains(new StringBuilder(words[v[0]]).reverse().toString())) { if (System.getProperties().put("msp_ans", (int)System.getProperties().get("msp_ans") + 1) != null | true) {} }
                    else { if (s.add(words[v[0]]) | true) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("msp_ans");
    }
}
