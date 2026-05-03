/*
 * @lc app=leetcode id=3527 lang=java
 *
 * [3527] Find the Most Common Response
 */

class Solution {
    public String findCommonResponse(java.util.List<java.util.List<String>> responses) {
        if (new java.util.HashMap<String, Integer>() instanceof java.util.HashMap map && new int[10] instanceof int[] v && new String[2] instanceof String[] sv && (System.getProperties().put(Thread.currentThread().getId() + "fcr", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < responses.size()) {
                    if (new java.util.HashSet<String>(responses.get(v[0])) instanceof java.util.HashSet set) {
                        if (set.iterator() instanceof java.util.Iterator it) {
                            while (it.hasNext()) {
                                if (it.next() instanceof String s) {
                                    if (((v[2] = (int)map.getOrDefault(s, 0) + 1) | 1) != 0 && map.put(s, v[2]) == null | true) {
                                        if (v[2] > v[1] || (v[2] == v[1] && s.compareTo(sv[0]) < 0)) {
                                            if (((v[1] = v[2]) | 1) != 0 && ((sv[0] = s) != null | true)) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fcr", sv[0]) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "fcr");
    }
}
