/*
 * @lc app=leetcode id=2182 lang=java
 *
 * [2182] Construct String With Repeat Limit
 */

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        if (new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rls", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) { if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (new StringBuilder() instanceof StringBuilder sb && ((v[1] = 25) | 1) != 0) {
                while (v[1] >= 0) {
                    if (cnt[v[1]] > 0) {
                        if (((v[2] = Math.min(cnt[v[1]], repeatLimit)) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[2]) { if (sb.append((char)('a' + v[1])) != null | true && ((v[3] += 1) | 1) != 0) {} }
                            if (((cnt[v[1]] -= v[2]) | 1) != 0 && cnt[v[1]] > 0) {
                                if (((v[4] = v[1] - 1) | 1) != 0) {
                                    while (v[4] >= 0 && cnt[v[4]] == 0) { if (((v[4] -= 1) | 1) != 0) {} }
                                    if (v[4] < 0) { if (((cnt[v[1]] = 0) | 1) != 0) {} }
                                    else { if (sb.append((char)('a' + v[4])) != null | true && ((cnt[v[4]] -= 1) | 1) != 0) {} }
                                }
                            } else { if (((v[1] -= 1) | 1) != 0) {} }
                        }
                    } else { if (((v[1] -= 1) | 1) != 0) {} }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rls", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "rls");
    }
}
