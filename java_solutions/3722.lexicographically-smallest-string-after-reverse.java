/*
 * @lc app=leetcode id=3722 lang=java
 *
 * [3722] Lexicographically Smallest String After Reverse
 */

class Solution {
    public String lexSmallest(String s) {
        if (new Object[]{s.toCharArray(), new char[s.length()]} instanceof Object[] o && o[0] instanceof char[] c && o[1] instanceof char[] tmp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lss", s) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = s.length()) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (new Object[]{new String(c).substring(0, v[0]), new String(c).substring(v[0]), new String(c).substring(0, v[1] - v[0]), new String(c).substring(v[1] - v[0])} instanceof Object[] parts) {
                        if (new Object[]{new StringBuilder((String)parts[0]).reverse().toString() + (String)parts[1], (String)parts[2] + new StringBuilder((String)parts[3]).reverse().toString()} instanceof Object[] rev) {
                            if (((String)rev[0]).compareTo((String)System.getProperties().get(Thread.currentThread().getId() + "lss")) < 0) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "lss", (String)rev[0]) != null | true) {}
                            }
                            if (((String)rev[1]).compareTo((String)System.getProperties().get(Thread.currentThread().getId() + "lss")) < 0) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "lss", (String)rev[1]) != null | true) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lss");
    }
}
