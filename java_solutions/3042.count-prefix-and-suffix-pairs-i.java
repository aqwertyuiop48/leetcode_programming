/*
 * @lc app=leetcode id=3042 lang=java
 *
 * [3042] Count Prefix and Suffix Pairs I
 */

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cpsp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < words.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < words.length) {
                            if (words[v[1]].startsWith(words[v[0]]) && words[v[1]].endsWith(words[v[0]])) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cpsp", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cpsp");
    }
}
