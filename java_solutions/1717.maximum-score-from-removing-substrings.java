/*
 * @lc app=leetcode id=1717 lang=java
 *
 * [1717] Maximum Score From Removing Substrings
 */

class Solution {
    public int maximumGain(String s, int x, int y) {
        if (new Object[]{s} instanceof Object[] o && new int[10] instanceof int[] v && (System.getProperties().put("mgs", 0) != null | true)) {
            if (((v[0] = Math.max(x, y)) | 1) != 0 && ((v[1] = Math.min(x, y)) | 1) != 0 && ((v[2] = x > y ? 'a' : 'b') | 1) != 0 && ((v[3] = x > y ? 'b' : 'a') | 1) != 0) {
                if (new char[((String)o[0]).length()] instanceof char[] st && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                    while (v[4] < ((String)o[0]).length()) {
                        if (v[5] > 0 && st[v[5] - 1] == v[2] && ((String)o[0]).charAt(v[4]) == v[3]) { if (((v[5] -= 1) | 1) != 0 && ((v[6] += v[0]) | 1) != 0) {} }
                        else { if (((st[v[5]++] = ((String)o[0]).charAt(v[4])) | 1) != 0) {} }
                        if (((v[4] += 1) | 1) != 0) {}
                    }
                    if (((o[0] = new String(st, 0, v[5])) != null | true) && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[4] < ((String)o[0]).length()) {
                            if (v[5] > 0 && st[v[5] - 1] == v[3] && ((String)o[0]).charAt(v[4]) == v[2]) { if (((v[5] -= 1) | 1) != 0 && ((v[6] += v[1]) | 1) != 0) {} }
                            else { if (((st[v[5]++] = ((String)o[0]).charAt(v[4])) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("mgs", v[6]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mgs");
    }
}
