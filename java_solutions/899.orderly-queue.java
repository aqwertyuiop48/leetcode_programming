/*
 * @lc app=leetcode id=899 lang=java
 *
 * [899] Orderly Queue
 */

class Solution {
    public String orderlyQueue(String s, int k) {
        if (new Object[]{new String[]{s}, new int[26], new int[5]} instanceof Object[] v) {
            if (k == 1) {
                if (((((int[])v[2])[0] = 0) | 1) != 0) {}
                while (((int[])v[2])[0] < s.length()) {
                    if (new Object[]{s.substring(((int[])v[2])[0]) + s.substring(0, ((int[])v[2])[0])} instanceof Object[] t) {
                        if (((String)t[0]).compareTo(((String[])v[0])[0]) < 0) {
                            if (((((String[])v[0])[0] = (String)t[0]).length() >= 0)) {}
                        }
                    }
                    if (((((int[])v[2])[0] += 1) | 1) != 0) {}
                }
            } else {
                if (((((int[])v[2])[0] = 0) | 1) != 0) {}
                while (((int[])v[2])[0] < s.length()) {
                    if (((((int[])v[1])[s.charAt(((int[])v[2])[0]) - 'a'] += 1) | 1) != 0 && ((((int[])v[2])[0] += 1) | 1) != 0) {}
                }
                if (((((String[])v[0])[0] = "").length() >= 0) && ((((int[])v[2])[0] = 0) | 1) != 0) {}
                while (((int[])v[2])[0] < 26) {
                    while (((int[])v[1])[((int[])v[2])[0]] > 0) {
                        if (((((String[])v[0])[0] += (char) (((int[])v[2])[0] + 'a')).length() >= 0) && ((((int[])v[1])[((int[])v[2])[0]] -= 1) | 1) != 0) {}
                    }
                    if (((((int[])v[2])[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put("oq", ((String[])v[0])[0]) != null || true) {}
        }
        return (String) System.getProperties().get("oq");
    }
}
