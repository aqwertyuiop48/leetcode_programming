/*
 * @lc app=leetcode id=1202 lang=java
 *
 * [1202] Smallest String With Swaps
 */

class Solution {
    public String smallestStringWithSwaps(String s, java.util.List<java.util.List<Integer>> pairs) {
        if (new int[s.length()] instanceof int[] p && new int[10] instanceof int[] v && System.getProperties().put("ssw_m", new java.util.HashMap<Integer, java.util.PriorityQueue<Character>>()) != null | true && System.getProperties().put("ssw_ans", "") != null | true) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) { if (((p[v[0]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < pairs.size()) {
                        if (((v[1] = pairs.get(v[0]).get(0)) | 1) != 0 && ((v[2] = pairs.get(v[0]).get(1)) | 1) != 0) {
                            while (p[v[1]] != v[1]) { if (((v[1] = p[v[1]]) | 1) != 0) {} }
                            while (p[v[2]] != v[2]) { if (((v[2] = p[v[2]]) | 1) != 0) {} }
                            if (((p[v[1]] = v[2]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < s.length()) {
                            if (((v[1] = v[0]) | 1) != 0) {
                                while (p[v[1]] != v[1]) { if (((p[v[1]] = p[p[v[1]]]) | 1) != 0 && ((v[1] = p[v[1]]) | 1) != 0) {} }
                                if (System.getProperties().get("ssw_m") instanceof java.util.Map m && ((java.util.PriorityQueue)m.computeIfAbsent(v[1], k -> new java.util.PriorityQueue<Character>())).offer(s.charAt(v[0])) | true && ((v[0] += 1) | 1) != 0) {}
                            }
                        }
                        if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && System.getProperties().get("ssw_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                            while (v[0] < s.length()) {
                                if (((v[1] = v[0]) | 1) != 0) {
                                    while (p[v[1]] != v[1]) { if (((v[1] = p[v[1]]) | 1) != 0) {} }
                                    if (sb.append(((java.util.PriorityQueue)m.get(v[1])).poll()) != null | true && ((v[0] += 1) | 1) != 0) {}
                                }
                            }
                            if (System.getProperties().put("ssw_ans", sb.toString()) != null | true) {}
                        }
                    }
                }
            }
        }
        return (String) System.getProperties().get("ssw_ans");
    }
}
