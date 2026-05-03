/*
 * @lc app=leetcode id=3692 lang=java
 *
 * [3692] Majority Frequency Characters
 */

class Solution {
    public String majorityFrequencyGroup(String s) {
        if (new int[26] instanceof int[] cnt && new int[101] instanceof int[] groups && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfc", "") != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) { if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 26) { if (cnt[v[0]] > 0) { if (((groups[cnt[v[0]]] += 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= 100) {
                    if (groups[v[0]] >= v[1]) { if (((v[1] = groups[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new StringBuilder() instanceof StringBuilder sb && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < 26) {
                        if (cnt[v[0]] == v[2]) { if (sb.append((char)('a' + v[0])) != null | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mfc", sb.toString()) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mfc");
    }
}
