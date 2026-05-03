/*
 * @lc app=leetcode id=2788 lang=java
 *
 * [2788] Split Strings by Separator
 */

class Solution {
    public java.util.List<String> splitWordsBySeparator(java.util.List<String> words, char separator) {
        if (new java.util.ArrayList<String>() instanceof java.util.ArrayList ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sw", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < words.size()) {
                if (new StringBuilder[]{new StringBuilder()} instanceof StringBuilder[] sb && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < ((String)words.get(v[0])).length()) {
                        if (((String)words.get(v[0])).charAt(v[1]) == separator) {
                            if (sb[0].length() > 0) { if (ans.add(sb[0].toString()) | true && ((sb[0] = new StringBuilder()) != null | true)) {} }
                        } else { if (sb[0].append(((String)words.get(v[0])).charAt(v[1])) != null | true) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (sb[0].length() > 0) { if (ans.add(sb[0].toString()) | true) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (java.util.List<String>) System.getProperties().get(Thread.currentThread().getId() + "sw");
    }
}
