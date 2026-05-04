/*
 * @lc app=leetcode id=3603 lang=java
 *
 * [3603] Minimum Cost Path with Alternating Directions II
 */

class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
        record State(java.util.PriorityQueue<long[]> pq, long[][] cm, long[] res) {}
        
        return java.util.stream.Stream.of(new State(new java.util.PriorityQueue<>((a, b) -> Long.compare(a[0], b[0])), new long[m][n], new long[]{-1}))
            .filter(s -> s.pq.offer(new long[]{s.cm[0][0] = 1, 0, 0}))
            .map(s -> java.util.stream.Stream.generate(s.pq::poll)
                .takeWhile(t -> t != null && s.res[0] == -1)
                .filter(t -> t[0] <= s.cm[(int)t[1]][(int)t[2]])
                .map(t -> t[1] == m - 1 && t[2] == n - 1 ? 
                    (s.res[0] = t[0] - waitCost[0][0]) : 
                    java.util.stream.Stream.of(new int[]{(int)t[1] + 1, (int)t[2]}, new int[]{(int)t[1], (int)t[2] + 1})
                        .filter(nxy -> nxy[0] < m && nxy[1] < n)
                        .map(nxy -> new long[]{t[0] + waitCost[(int)t[1]][(int)t[2]] + (long)(nxy[0] + 1) * (nxy[1] + 1), nxy[0], nxy[1]})
                        .filter(v -> s.cm[(int)v[1]][(int)v[2]] == 0 || s.cm[(int)v[1]][(int)v[2]] > v[0])
                        .map(v -> s.pq.offer(new long[]{s.cm[(int)v[1]][(int)v[2]] = v[0], v[1], v[2]}))
                        .count())
                .count() >= 0 ? s.res[0] : -1L)
            .findFirst().orElse(-1L);
    }
}