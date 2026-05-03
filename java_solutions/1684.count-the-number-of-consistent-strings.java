/*
 * @lc app=leetcode id=1684 lang=java
 *
 * [1684] Count the Number of Consistent Strings
 */

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ccs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < allowed.length()) { if (((v[1] |= (1 << (allowed.charAt(v[0]++) - 'a'))) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < words.length) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                            while (v[2] < words[v[0]].length()) {
                                if ((v[1] & (1 << (words[v[0]].charAt(v[2]++) - 'a'))) == 0) { if (((v[3] = 0) | 1) != 0) {} }
                            }
                            if (v[3] == 1) { if (((v[4] += 1) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ccs", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("ccs");
    }
}
