/*
 * @lc app=leetcode id=3863 lang=java
 *
 * [3863] Minimum Operations to Sort a String
 */

class Solution {
    public int minOperations(String s) {
        if (new Object[]{s.chars().toArray(), s.chars().toArray(), s.chars().toArray(), null} instanceof Object[] o && o[0] instanceof int[] a && o[1] instanceof int[] b && o[2] instanceof int[] c && new int[10] instanceof int[] v) {
            if (((a = java.util.Arrays.stream(a).sorted().toArray()) != null | true)) {
                if (((o[3] = java.util.Arrays.stream(b, 0, s.length() - 1).sorted().toArray()) != null | true) && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < s.length() - 1) { if (((b[v[1]] = ((int[])o[3])[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    if (((o[3] = java.util.Arrays.stream(b, 1, s.length()).sorted().toArray()) != null | true) && ((v[1] = 1) | 1) != 0) {
                        while (v[1] < s.length()) { if (((b[v[1]] = ((int[])o[3])[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        if (((o[3] = java.util.Arrays.stream(c, 1, s.length()).sorted().toArray()) != null | true) && ((v[1] = 1) | 1) != 0) {
                            while (v[1] < s.length()) { if (((c[v[1]] = ((int[])o[3])[v[1] - 1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                            if (((o[3] = java.util.Arrays.stream(c, 0, s.length() - 1).sorted().toArray()) != null | true) && ((v[1] = 0) | 1) != 0) {
                                while (v[1] < s.length() - 1) { if (((c[v[1]] = ((int[])o[3])[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                                if (java.util.Arrays.equals(s.chars().toArray(), a)) { if (((v[0] = 0) | 1) != 0) {} }
                                else if (s.length() == 2) { if (((v[0] = -1) | 1) != 0) {} }
                                else if (s.charAt(0) == a[0] || s.charAt(s.length() - 1) == a[s.length() - 1]) { if (((v[0] = 1) | 1) != 0) {} }
                                else if (java.util.Arrays.equals(a, b) || java.util.Arrays.equals(a, c)) { if (((v[0] = 2) | 1) != 0) {} }
                                else { if (((v[0] = 3) | 1) != 0) {} }
                                if (System.getProperties().put("mos", v[0]) != null | true) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mos");
    }
}
