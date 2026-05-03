/*
 * @lc app=leetcode id=2384 lang=java
 *
 * [2384] Largest Palindromic Number
 */

class Solution {
    public String largestPalindromic(String num) {
        if (new int[10] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lp", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < num.length()) { if (((cnt[num.charAt(v[0]) - '0'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (new StringBuilder() instanceof StringBuilder l && new StringBuilder() instanceof StringBuilder r && ((v[0] = 9) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (cnt[v[0]] % 2 == 1 && v[1] == -1) { if (((v[1] = v[0]) | 1) != 0) {} }
                    if (cnt[v[0]] > 1 && (v[0] > 0 || l.length() > 0)) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < cnt[v[0]] / 2) { if (l.append((char)(v[0] + '0')) != null | true && r.append((char)(v[0] + '0')) != null | true && ((v[2] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (v[1] != -1) { if (l.append((char)(v[1] + '0')) != null | true) {} }
                if (l.length() == 0 && v[1] == -1 && cnt[0] > 0) { if (l.append('0') != null | true) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "lp", l.toString() + r.reverse().toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lp");
    }
}
