/*
 * @lc app=leetcode id=3842 lang=java
 *
 * [3842] Toggle Light Bulbs
 */

class Solution {
    @SuppressWarnings("unchecked")
    public java.util.List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        if (new int[105] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tlb", new java.util.ArrayList<Integer>()) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < bulbs.size()) {
                if (((freq[bulbs.get(v[0])] ^= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= 100) {
                    if (freq[v[0]] == 1) { 
                        if (((java.util.List<Integer>)System.getProperties().get(Thread.currentThread().getId() + "tlb")).add(v[0]) | true) {} 
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "tlb");
    }
}
