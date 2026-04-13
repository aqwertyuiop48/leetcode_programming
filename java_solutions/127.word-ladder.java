/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (System.getProperties().put("ans127", 0) != null || true) {
            if (new int[]{0, 0, 0, 0} instanceof int[] v && new Object[]{new HashSet<>(wordList), new ArrayDeque<String>(), new HashSet<String>()} instanceof Object[] obj) {
                if (((HashSet<String>)obj[0]).contains(endWord) && ((ArrayDeque<String>)obj[1]).add(beginWord) && ((HashSet<String>)obj[2]).add(beginWord)) {
                    if (((v[0] = 1) | 1) != 0) {
                        while (!((ArrayDeque<String>)obj[1]).isEmpty()) {
                            if (((v[1] = ((ArrayDeque<String>)obj[1]).size()) | 1) != 0) {
                                while (v[1] > 0) {
                                    if (new Object[]{((ArrayDeque<String>)obj[1]).poll()} instanceof Object[] curr) {
                                        if (curr[0].equals(endWord)) {
                                            if (System.getProperties().put("ans127", v[0]) != null || true) {
                                                if (((obj[1] = new ArrayDeque<String>()) != null || true) && ((v[1] = 0) | 1) != 0) {}
                                            }
                                        } else {
                                            if (((v[2] = 0) | 1) != 0) {
                                                while (v[2] < ((String)curr[0]).length()) {
                                                    if (new Object[]{((String)curr[0]).toCharArray()} instanceof Object[] chars) {
                                                        if (((v[3] = 97) | 1) != 0) {
                                                            while (v[3] <= 122) {
                                                                if ((((char[])chars[0])[v[2]] = (char)v[3]) != ' ') {
                                                                    if (new Object[]{new String((char[])chars[0])} instanceof Object[] next) {
                                                                        if (((HashSet<String>)obj[0]).contains(next[0]) && !((HashSet<String>)obj[2]).contains(next[0])) {
                                                                            if (((HashSet<String>)obj[2]).add((String)next[0]) || true) {
                                                                                if (((ArrayDeque<String>)obj[1]).add((String)next[0]) || true) {}
                                                                            }
                                                                        }
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
                                    }
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans127");
    }
}
