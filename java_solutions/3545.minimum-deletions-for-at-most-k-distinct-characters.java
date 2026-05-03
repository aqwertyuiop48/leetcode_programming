/*
 * @lc app=leetcode id=3545 lang=java
 *
 * [3545] Minimum Deletions for At Most K Distinct Characters
 */

class Solution {
    public int minDeletion(String s, int k) {
        if (new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "md", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < s.length()) { if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (java.util.Arrays.stream(cnt).sorted().toArray() instanceof int[] sorted) {
                if (((v[0] = 0) | 1) != 0 && ((v[1] = Math.max(0, 26 - k)) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while(v[0] < v[1]) { if (((v[2] += sorted[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "md", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "md");
    }
}
