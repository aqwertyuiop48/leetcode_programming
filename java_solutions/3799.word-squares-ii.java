/*
 * @lc app=leetcode id=3799 lang=java
 *
 * [3799] Word Squares II
 */

class Solution {
    public java.util.List<java.util.List<String>> wordSquares(String[] words) {
        if (new java.util.ArrayList<java.util.List<String>>() instanceof java.util.ArrayList ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ws2", ans) != null | true)) {
            if ((words = java.util.Arrays.stream(words).sorted().toArray(String[]::new)) != null && ((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < words.length) {
                            if (v[0] != v[1] && words[v[0]].charAt(0) == words[v[1]].charAt(0)) {
                                if (((v[2] = 0) | 1) != 0) {
                                    while (v[2] < words.length) {
                                        if (v[2] != v[0] && v[2] != v[1] && words[v[0]].charAt(3) == words[v[2]].charAt(0)) {
                                            if (((v[3] = 0) | 1) != 0) {
                                                while (v[3] < words.length) {
                                                    if (v[3] != v[0] && v[3] != v[1] && v[3] != v[2]) {
                                                        if (words[v[3]].charAt(0) == words[v[1]].charAt(3) && words[v[3]].charAt(3) == words[v[2]].charAt(3)) {
                                                            if (ans.add(java.util.Arrays.asList(words[v[0]], words[v[1]], words[v[2]], words[v[3]])) | true) {}
                                                        }
                                                    }
                                                    if (((v[3] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<java.util.List<String>>) System.getProperties().get(Thread.currentThread().getId() + "ws2");
    }
}
