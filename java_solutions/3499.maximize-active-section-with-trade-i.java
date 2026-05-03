/*
 * @lc app=leetcode id=3499 lang=java
 *
 * [3499] Maximize Active Section with Trade I
 */

class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList blocks && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mas", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] <= s.length()) {
                    if (((v[5] = v[0] == s.length() ? 1 : s.charAt(v[0]) - '0') | 1) != 0) {
                        if (v[0] < s.length() && v[5] == 1) { if (((v[2] += 1) | 1) != 0) {} }
                        if (v[5] == v[1]) { if (((v[3] += 1) | 1) != 0) {} }
                        else {
                            if (blocks.add(v[3]) | true && ((v[1] = v[5]) | 1) != 0 && ((v[3] = 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (blocks.add(v[3]) | true && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < blocks.size()) {
                        if ((int)blocks.get(v[0]) > v[4]) { if (((v[4] = (int)blocks.get(v[0])) | 1) != 0) {} }
                        if (((v[0] += 2) | 1) != 0) {}
                    }
                }
                if (((v[0] = 2) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                    while (v[0] < blocks.size() - 1) {
                        if (((v[6] = Math.max((int)blocks.get(v[0] - 1) + (int)blocks.get(v[0] + 1), v[4] - (int)blocks.get(v[0]))) | 1) != 0) {
                            if (v[6] > v[5]) { if (((v[5] = v[6]) | 1) != 0) {} }
                        }
                        if (((v[0] += 2) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mas", v[2] + v[5]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mas");
    }
}
