/*
 * @lc app=leetcode id=3849 lang=java
 *
 * [3849] Maximum Bitwise XOR After Rearrangement
 */

class Solution {
    public String maximumXor(String s, String t) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mbx", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < t.length()) {
                if (t.charAt(v[0]) == '1') { if (((v[1] += 1) | 1) != 0) {} }
                else { if (((v[2] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (new char[s.length()] instanceof char[] ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == '0') {
                        if (v[1] > 0) { if (((ans[v[0]] = '1') | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                        else { if (((ans[v[0]] = '0') | 1) != 0 && ((v[2] -= 1) | 1) != 0) {} }
                    } else {
                        if (v[2] > 0) { if (((ans[v[0]] = '1') | 1) != 0 && ((v[2] -= 1) | 1) != 0) {} }
                        else { if (((ans[v[0]] = '0') | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mbx", new String(ans)) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mbx");
    }
}
