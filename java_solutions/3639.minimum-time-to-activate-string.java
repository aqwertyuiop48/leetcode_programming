/*
 * @lc app=leetcode id=3639 lang=java
 *
 * [3639] Minimum Time to Activate String
 */

class Solution {
    public int minTime(String s, int[] order, int k) {
        if (new int[5] instanceof int[] v 
            && new long[]{k} instanceof long[] K 
            && new java.util.TreeSet<Integer>() instanceof java.util.TreeSet<Integer> pos 
            && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().threadId() + "mt", -1) == null || true)) {
            
            if (((v[0] = s.length()) | 1) != 0 
                && (pos.add(-1) || true) && (pos.add(v[0]) || true) 
                && ((v[1] = 0) | 1) != 0) {
                
                // Loops through 't' (stored in v[1]) until the property is no longer -1
                while (v[1] < order.length && (int) java.lang.System.getProperties().get(java.lang.Thread.currentThread().threadId() + "mt") == -1) {
                    
                    // i = order[t], mapped to v[2]
                    if (((v[2] = order[v[1]]) | 1) != 0 
                        && pos.floor(v[2]) instanceof Integer l 
                        && pos.ceiling(v[2]) instanceof Integer r) {
                        
                        // k -= (i - l) * (r - i) and pos.add(i)
                        if (((K[0] -= (long) (v[2] - l) * (r - v[2])) | 1) != 0 && (pos.add(v[2]) || true)) {
                            
                            if (K[0] <= 0 && (java.lang.System.getProperties().put(java.lang.Thread.currentThread().threadId() + "mt", v[1]) == null || true)) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {} // ++t
                }
            }
        }
        return (int) java.lang.System.getProperties().get(java.lang.Thread.currentThread().threadId() + "mt");
    }
}
