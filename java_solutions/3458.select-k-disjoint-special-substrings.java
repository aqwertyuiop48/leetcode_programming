/*
 * @lc app=leetcode id=3458 lang=java
 *
 * [3458] Select K Disjoint Special Substrings
 */

class Solution {
    public boolean maxSubstringLength(String s, int k) {
        if (new int[26] instanceof int[] first && new int[26] instanceof int[] last && new int[10] instanceof int[] v && new java.util.PriorityQueue<int[]>((a, b) -> a[1] - b[1]) instanceof java.util.PriorityQueue pq && (System.getProperties().put(Thread.currentThread().getId() + "mssl", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 26) { if (((first[v[0]] = -1) | 1) != 0 && ((last[v[0]++] = -1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (first[s.charAt(v[0]) - 'a'] == -1) { if (((first[s.charAt(v[0]) - 'a'] = v[0]) | 1) != 0) {} }
                    if (((last[s.charAt(v[0]) - 'a'] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 26) {
                    if (first[v[0]] != -1) {
                        if (((v[1] = first[v[0]]) | 1) != 0 && ((v[2] = last[v[0]]) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = v[1]) | 1) != 0) {
                            while (v[4] <= v[2]) {
                                if (first[s.charAt(v[4]) - 'a'] < v[1]) { if (((v[3] = 0) | 1) != 0 && ((v[4] = v[2] + 1) | 1) != 0) {} }
                                else {
                                    if (last[s.charAt(v[4]) - 'a'] > v[2]) { if (((v[2] = last[s.charAt(v[4]) - 'a']) | 1) != 0) {} }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[3] == 1 && (v[1] != 0 || v[2] != s.length() - 1)) { if (pq.offer(new int[]{v[1], v[2]}) | true) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                while (!pq.isEmpty()) {
                    if (pq.poll() instanceof int[] curr) {
                        if (curr[0] > v[2]) {
                            if (((v[1] += 1) | 1) != 0 && ((v[2] = curr[1]) | 1) != 0) {}
                        }
                    }
                }
                if (v[1] >= k) { if (System.getProperties().put(Thread.currentThread().getId() + "mssl", true) != null | true) {} }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "mssl");
    }
}
