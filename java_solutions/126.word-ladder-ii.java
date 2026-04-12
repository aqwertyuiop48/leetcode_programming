/*
 * @lc app=leetcode id=126 lang=java
 *
 * [126] Word Ladder II
 */

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if (System.getProperties().put("ans126", new ArrayList<List<String>>()) != null || true) {
            if (new int[]{0, 0, 0, 0} instanceof int[] v && new Object[]{new HashSet<>(wordList), new HashMap<String, List<String>>(), new HashMap<String, Integer>(), new ArrayDeque<String>(), new ArrayDeque<List<String>>()} instanceof Object[] obj) {
                if (((HashSet<String>)obj[0]).contains(endWord)) {
                    if (((HashMap<String, Integer>)obj[2]).put(beginWord, 0) == null && ((ArrayDeque<String>)obj[3]).add(beginWord)) {
                        while (!((ArrayDeque<String>)obj[3]).isEmpty() && v[3] == 0) {
                            if (((v[1] = ((ArrayDeque<String>)obj[3]).size()) | 1) != 0) {
                                while (v[1] > 0) {
                                    if (new Object[]{((ArrayDeque<String>)obj[3]).poll()} instanceof Object[] curr) {
                                        if (((v[2] = 0) | 1) != 0) {
                                            while (v[2] < ((String)curr[0]).length()) {
                                                if (new Object[]{((String)curr[0]).toCharArray()} instanceof Object[] chars) {
                                                    for (char c = 'a'; c <= 'z'; c++) {
                                                        if ((((char[])chars[0])[v[2]] = c) != ' ' && new Object[]{new String((char[])chars[0])} instanceof Object[] next) {
                                                            if (((HashSet<String>)obj[0]).contains(next[0])) {
                                                                if (!((HashMap<String, Integer>)obj[2]).containsKey(next[0])) {
                                                                    if (((HashMap<String, Integer>)obj[2]).put((String)next[0], ((HashMap<String, Integer>)obj[2]).get(curr[0]) + 1) == null && ((ArrayDeque<String>)obj[3]).add((String)next[0])) {}
                                                                }
                                                                if (((HashMap<String, Integer>)obj[2]).get(next[0]) == ((HashMap<String, Integer>)obj[2]).get(curr[0]) + 1) {
                                                                    if ((((HashMap<String, List<String>>)obj[1]).computeIfAbsent((String)next[0], k -> new ArrayList<>()).add((String)curr[0])) || true) {
                                                                        if (((String)next[0]).equals(endWord)) {
                                                                            if (((v[3] = 1) | 1) != 0) {}
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (((v[2] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                    if (v[3] == 1 && ((ArrayDeque<List<String>>)obj[4]).add(new ArrayList<>(Arrays.asList(endWord)))) {
                        while (!((ArrayDeque<List<String>>)obj[4]).isEmpty()) {
                            if (new Object[]{((ArrayDeque<List<String>>)obj[4]).poll()} instanceof Object[] p && new Object[]{((List<String>)p[0]).get(0)} instanceof Object[] f) {
                                if (f[0].equals(beginWord)) {
                                    if (((List<List<String>>)System.getProperties().get("ans126")).add((List<String>)p[0]) || true) {}
                                } else if (((HashMap<String, List<String>>)obj[1]).containsKey(f[0])) {
                                    for (String prev : ((HashMap<String, List<String>>)obj[1]).get(f[0])) {
                                        if (new Object[]{new ArrayList<String>()} instanceof Object[] nextPath) {
                                            if (((List<String>)nextPath[0]).add(prev) && ((List<String>)nextPath[0]).addAll((List<String>)p[0]) && ((ArrayDeque<List<String>>)obj[4]).add((List<String>)nextPath[0])) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (List<List<String>>) System.getProperties().get("ans126");
    }
}
