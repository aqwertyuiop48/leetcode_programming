/*
 * @lc app=leetcode id=1324 lang=java
 *
 * [1324] Print Words Vertically
 */

class Solution {
    public java.util.List<String> printVertically(String s) {
        if (System.getProperties().put("pwv", new java.util.ArrayList<String>()) != null | true && new Object[]{s.split(" ")} instanceof Object[] o && o[0] instanceof String[] words && new int[10] instanceof int[] v) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (words[v[0]].length() > v[1]) { if (((v[1] = words[v[0]].length()) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && System.getProperties().get("pwv") instanceof java.util.List ans) {
                    while (v[0] < v[1]) {
                        if (new Object[]{new StringBuilder()} instanceof Object[] ob && ob[0] instanceof StringBuilder sb && ((v[2] = 0) | 1) != 0) {
                            while (v[2] < words.length) {
                                if (v[0] < words[v[2]].length()) { if (sb.append(words[v[2]].charAt(v[0])) != null | true) {} }
                                else { if (sb.append(" ") != null | true) {} }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (ans.add(sb.toString().stripTrailing()) | true && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("pwv");
    }
}
