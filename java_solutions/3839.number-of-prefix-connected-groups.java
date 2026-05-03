/*
 * @lc app=leetcode id=3839 lang=java
 *
 * [3839] Number of Prefix Connected Groups
 */

class Solution {
    public int prefixConnected(String[] words, int k) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<String, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "pc", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < words.length) {
                if (words[v[0]].length() >= k) {
                    if (words[v[0]].substring(0, k) instanceof String prefix) {
                        if (map.put(prefix, (int)map.getOrDefault(prefix, 0) + 1) == null | true) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (map.values().iterator() instanceof java.util.Iterator it) {
                while (it.hasNext()) {
                    if ((int)it.next() >= 2) { if (((v[1] += 1) | 1) != 0) {} }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "pc", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "pc");
    }
}
