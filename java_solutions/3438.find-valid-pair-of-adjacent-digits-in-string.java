/*
 * @lc app=leetcode id=3438 lang=java
 *
 * [3438] Find Valid Pair of Adjacent Digits in String
 */

class Solution {
    public String findValidPair(String s) {
        if (new int[15] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fvp", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((cnt[s.charAt(v[0]) - '0'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < s.length() - 1 && "".equals((String)System.getProperties().get(Thread.currentThread().getId() + "fvp"))) {
                        if (s.charAt(v[0]) != s.charAt(v[0] + 1) && cnt[s.charAt(v[0]) - '0'] == s.charAt(v[0]) - '0' && cnt[s.charAt(v[0] + 1) - '0'] == s.charAt(v[0] + 1) - '0') {
                            if (System.getProperties().put(Thread.currentThread().getId() + "fvp", "" + s.charAt(v[0]) + s.charAt(v[0] + 1)) != null | true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "fvp");
    }
}
