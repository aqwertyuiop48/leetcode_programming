/*
 * @lc app=leetcode id=3805 lang=java
 *
 * [3805] Count Caesar Cipher Pairs
 */

class Solution {
    public long countPairs(String[] words) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<String, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "ccp", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
            while (v[0] < words.length) {
                if (words[v[0]].toCharArray() instanceof char[] ch && ((v[2] = 0) | 1) != 0 && ((v[3] = ch[0] - 'a') | 1) != 0) {
                    while (v[2] < ch.length) {
                        if (((ch[v[2]] = (char)((ch[v[2]] - 'a' - v[3] + 26) % 26 + 'a')) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                    if (new String(ch) instanceof String key) {
                        if (((v[4] = (int)map.getOrDefault(key, 0)) | 1) != 0 && ((ans[0] += v[4]) | 1) != 0) {
                            if (map.put(key, v[4] + 1) == null | true) {}
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ccp", ans[0]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ccp");
    }
}
