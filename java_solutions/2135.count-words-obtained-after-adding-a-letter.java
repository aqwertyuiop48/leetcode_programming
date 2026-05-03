/*
 * @lc app=leetcode id=2135 lang=java
 *
 * [2135] Count Words Obtained After Adding a Letter
 */

class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        if (new int[10] instanceof int[] v && new java.util.HashSet<Integer>() instanceof java.util.HashSet set && (System.getProperties().put(Thread.currentThread().getId() + "wc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < startWords.length) {
                if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < startWords[v[0]].length()) {
                        if (((v[1] |= (1 << (startWords[v[0]].charAt(v[2]) - 'a'))) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                    if (set.add(v[1]) | true) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < targetWords.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < targetWords[v[0]].length()) {
                            if (((v[1] |= (1 << (targetWords[v[0]].charAt(v[2]) - 'a'))) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        }
                        if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                            while (v[3] < 26 && v[4] == 0) {
                                if ((v[1] & (1 << v[3])) != 0) {
                                    if (set.contains(v[1] ^ (1 << v[3]))) {
                                        if (((v[4] = 1) | 1) != 0 && ((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "wc", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wc");
    }
}
