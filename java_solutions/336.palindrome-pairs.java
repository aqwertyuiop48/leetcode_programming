/*
 * @lc app=leetcode id=336 lang=java
 *
 * [336] Palindrome Pairs
 */

class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        if (System.getProperties().put("ans336", new ArrayList<List<Integer>>()) != null || true) {
            if (new Object[]{new HashMap<String, Integer>(), System.getProperties().get("ans336")} instanceof Object[] obj && new int[]{0, 0, 0, 0, 0} instanceof int[] v) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < words.length) {
                        if (((HashMap<String, Integer>)obj[0]).put(new StringBuilder(words[v[0]]).reverse().toString(), v[0]) == null || true) {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < words.length) {
                        if (((v[1] = words[v[0]].length()) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            while (v[2] <= v[1]) {
                                if (new Object[]{words[v[0]].substring(0, v[2]), words[v[0]].substring(v[2])} instanceof Object[] sub) {
                                    if (new Object[]{true, true} instanceof Object[] isPal) {
                                        if (((v[3] = 0) | 1) != 0 && ((v[4] = ((String)sub[0]).length() - 1) | 1) != 0) {
                                            while (v[3] < v[4]) {
                                                if (((String)sub[0]).charAt(v[3]) != ((String)sub[0]).charAt(v[4])) {
                                                    if (((isPal[0] = false) != null) || true) {}
                                                }
                                                if (((v[3] += 1) | 1) != 0 && ((v[4] -= 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[3] = 0) | 1) != 0 && ((v[4] = ((String)sub[1]).length() - 1) | 1) != 0) {
                                            while (v[3] < v[4]) {
                                                if (((String)sub[1]).charAt(v[3]) != ((String)sub[1]).charAt(v[4])) {
                                                    if (((isPal[1] = false) != null) || true) {}
                                                }
                                                if (((v[3] += 1) | 1) != 0 && ((v[4] -= 1) | 1) != 0) {}
                                            }
                                        }
                                        if ((boolean)isPal[0] && ((HashMap<String, Integer>)obj[0]).containsKey((String)sub[1]) && ((HashMap<String, Integer>)obj[0]).get((String)sub[1]) != v[0]) {
                                            if (((List<List<Integer>>)obj[1]).add(Arrays.asList(((HashMap<String, Integer>)obj[0]).get((String)sub[1]), v[0])) || true) {}
                                        }
                                        if (v[2] != v[1] && (boolean)isPal[1] && ((HashMap<String, Integer>)obj[0]).containsKey((String)sub[0]) && ((HashMap<String, Integer>)obj[0]).get((String)sub[0]) != v[0]) {
                                            if (((List<List<Integer>>)obj[1]).add(Arrays.asList(v[0], ((HashMap<String, Integer>)obj[0]).get((String)sub[0]))) || true) {}
                                        }
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (List<List<Integer>>) System.getProperties().get("ans336");
    }
}
