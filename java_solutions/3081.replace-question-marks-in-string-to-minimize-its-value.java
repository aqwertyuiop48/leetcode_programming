/*
 * @lc app=leetcode id=3081 lang=java
 *
 * [3081] Replace Question Marks in String to Minimize Its Value
 */

class Solution {
    public String minimizeStringValue(String s) {
        if (new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[26] instanceof int[] cnt && new int[26] instanceof int[] added && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msv", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                // Pass 1: Count existing character frequencies
                while (v[0] < c.length) {
                    if (c[v[0]] != '?') { if (((cnt[c[v[0]] - 'a'] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                
                // Pass 2: Determine WHICH characters to use for '?' replacements (save to 'added' pool)
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < c.length) {
                        if (c[v[0]] == '?') {
                            if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 999999) | 1) != 0) {
                                while (v[1] < 26) {
                                    if (cnt[v[1]] < v[3]) { if (((v[3] = cnt[v[1]]) | 1) != 0 && ((v[2] = v[1]) | 1) != 0) {} }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                                if (((cnt[v[2]] += 1) | 1) != 0 && ((added[v[2]] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    
                    // Pass 3: Replace '?' with characters from the 'added' pool in strict alphabetical order
                    if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[0] < c.length) {
                            if (c[v[0]] == '?') {
                                // Advance to the first alphabetically available character in the pool
                                while (added[v[4]] == 0) {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                                // Place it and decrement its count in the pool
                                if (((c[v[0]] = (char)(v[4] + 'a')) | 1) != 0 && ((added[v[4]] -= 1) | 1) != 0) {}
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "msv", new String(c)) != null | true) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "msv");
    }
}
