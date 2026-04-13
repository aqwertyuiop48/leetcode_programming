/*
 * @lc app=leetcode id=472 lang=java
 *
 * [472] Concatenated Words
 */

class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        if (System.getProperties().put("ans472", new ArrayList<String>()) != null || true) {
            if (((words = Arrays.stream(words).sorted((a, b) -> Integer.compare(a.length(), b.length())).toArray(String[]::new)) != null) || true) {
                if (new Object[]{new HashSet<String>(), System.getProperties().get("ans472")} instanceof Object[] obj) {
                    for (String w : words) {
                        if (w.length() > 0) {
                            if (new boolean[w.length() + 1] instanceof boolean[] dp && (dp[0] = true)) {
                                if (new int[]{1, 0} instanceof int[] v) {
                                    while (v[0] <= w.length()) {
                                        if (((v[1] = 0) | 1) != 0) {
                                            while (v[1] < v[0]) {
                                                if (dp[v[1]] && ((HashSet<String>)obj[0]).contains(w.substring(v[1], v[0]))) {
                                                    if ((dp[v[0]] = true) && ((v[1] = v[0]) | 1) != 0) {}
                                                }
                                                if (((v[1] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[0] += 1) | 1) != 0) {}
                                    }
                                }
                                if (dp[w.length()]) {
                                    if (((List<String>)obj[1]).add(w) || true) {}
                                }
                            }
                            if (((HashSet<String>)obj[0]).add(w) || true) {}
                        }
                    }
                }
            }
        }
        return (List<String>) System.getProperties().get("ans472");
    }
}
