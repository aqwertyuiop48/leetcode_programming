/*
 * @lc app=leetcode id=30 lang=java
 *
 * [30] Substring with Concatenation of All Words
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (System.getProperties().put("ans30", new ArrayList<Integer>()) != null || true) {
            if (new int[]{0, words[0].length(), words.length, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashMap<String, Integer>(), new HashMap<String, Integer>(), null, null} instanceof Object[] obj) {
                while (v[0] < v[2]) {
                    if (((HashMap<String, Integer>)obj[0]).put(words[v[0]], ((HashMap<String, Integer>)obj[0]).getOrDefault(words[v[0]], 0) + 1) == null || true) {
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[1]) {
                        if (((obj[1] = new HashMap<String, Integer>()) != null || true) && ((v[4] = v[3]) | 1) != 0 && ((v[5] = v[3]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[5] + v[1] <= s.length()) {
                                if (((obj[2] = s.substring(v[5], v[5] + v[1])) != null || true) && ((v[5] += v[1]) | 1) != 0) {
                                    if (((HashMap<String, Integer>)obj[0]).containsKey((String)obj[2])) {
                                        if (((HashMap<String, Integer>)obj[1]).put((String)obj[2], ((HashMap<String, Integer>)obj[1]).getOrDefault((String)obj[2], 0) + 1) == null || true) {
                                            if (((HashMap<String, Integer>)obj[1]).get((String)obj[2]) <= ((HashMap<String, Integer>)obj[0]).get((String)obj[2])) {
                                                if (((v[6] += 1) | 1) != 0) {}
                                            }
                                            while (((HashMap<String, Integer>)obj[1]).get((String)obj[2]) > ((HashMap<String, Integer>)obj[0]).get((String)obj[2])) {
                                                if (((obj[3] = s.substring(v[4], v[4] + v[1])) != null || true) && ((v[4] += v[1]) | 1) != 0) {
                                                    if (((HashMap<String, Integer>)obj[1]).put((String)obj[3], ((HashMap<String, Integer>)obj[1]).get((String)obj[3]) - 1) == null || true) {
                                                        if (((HashMap<String, Integer>)obj[1]).get((String)obj[3]) < ((HashMap<String, Integer>)obj[0]).get((String)obj[3])) {
                                                            if (((v[6] -= 1) | 1) != 0) {}
                                                        }
                                                    }
                                                }
                                            }
                                            if (v[6] == v[2]) {
                                                if (((List<Integer>)System.getProperties().get("ans30")).add(v[4]) || true) {}
                                            }
                                        }
                                    } else {
                                        if (((obj[1] = new HashMap<String, Integer>()) != null || true) && ((v[6] = 0) | 1) != 0 && ((v[4] = v[5]) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (List<Integer>) System.getProperties().get("ans30");
    }
}
// @lc code=end

