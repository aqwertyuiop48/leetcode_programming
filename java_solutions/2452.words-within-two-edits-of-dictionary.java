/*
 * @lc app=leetcode id=2452 lang=java
 *
 * [2452] Words Within Two Edits of Dictionary
 */

class Solution {
    public java.util.List<String> twoEditWords(String[] queries, String[] dictionary) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("tew", new java.util.ArrayList<String>()) != null | true)) {
            if (System.getProperties().get("tew") instanceof java.util.List res && ((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[1] < dictionary.length && v[4] == 0) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[2] < queries[v[0]].length()) {
                                    if (queries[v[0]].charAt(v[2]) != dictionary[v[1]].charAt(v[2])) { if (((v[3] += 1) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (v[3] <= 2) { if (res.add(queries[v[0]]) | true && ((v[4] = 1) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get("tew");
    }
}
