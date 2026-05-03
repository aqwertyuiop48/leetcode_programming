/*
 * @lc app=leetcode id=3577 lang=java
 *
 * [3577] Count the Number of Computer Unlocking Permutations
 */

class Solution {
    public int countPermutations(int[] complexity) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cncup", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < complexity.length) {
                    if (complexity[v[0]] <= complexity[0]) { if (((v[1] = 0) | 1) != 0) {} else{} }
                    if (((v[1] = (int)(((long)v[1] * v[0]) % 1000000007)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cncup", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cncup");
    }
}
