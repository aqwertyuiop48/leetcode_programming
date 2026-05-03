/*
 * @lc app=leetcode id=3377 lang=java
 *
 * [3377] Digit Operations to Make Two Integers Equal
 */

class Solution {
    public int minOperations(int n, int m) {
        if (new boolean[10005] instanceof boolean[] isPrime && ((isPrime[0] = isPrime[1] = false) == false | true) && new int[10] instanceof int[] v && new int[10005] instanceof int[] dist && new java.util.PriorityQueue<int[]>(java.util.Comparator.comparingInt(a -> a[0])) instanceof java.util.PriorityQueue pq && (System.getProperties().put(Thread.currentThread().getId() + "do", -1) != null | true)) {
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] < 10000) { if (((isPrime[v[0]] = true) | true) && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= 100) {
                        if (isPrime[v[0]] && ((v[1] = v[0] * v[0]) | 1) != 0) {
                            while (v[1] < 10000) { if (((isPrime[v[1]] = false) == false | true) && ((v[1] += v[0]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            if (!isPrime[n] && !isPrime[m] && ((v[0] = 0) | 1) != 0) {
                while (v[0] < 10000) { if (((dist[v[0]++] = 2000000000) | 1) != 0) {} }
                if (((dist[n] = n) | 1) != 0 && pq.offer(new int[]{n, n}) | true && ((v[2] = String.valueOf(n).length()) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                    while (!pq.isEmpty() && v[8] == 0) {
                        if (pq.poll() instanceof int[] curr && curr[0] <= dist[curr[1]]) {
                            if (curr[1] == m) { if (System.getProperties().put(Thread.currentThread().getId() + "do", curr[0]) != null | true && ((v[8] = 1) | 1) != 0) {} }
                            else if (((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[2]) {
                                    if (((v[5] = (curr[1] / v[3]) % 10) | 1) != 0) {
                                        if (v[5] < 9 && ((v[6] = curr[1] + v[3]) | 1) != 0 && !isPrime[v[6]] && curr[0] + v[6] < dist[v[6]]) {
                                            if (((dist[v[6]] = curr[0] + v[6]) | 1) != 0 && pq.offer(new int[]{dist[v[6]], v[6]}) | true) {}
                                        }
                                        if (v[5] > 0 && !(v[4] == v[2] - 1 && v[5] == 1) && ((v[6] = curr[1] - v[3]) | 1) != 0 && !isPrime[v[6]] && curr[0] + v[6] < dist[v[6]]) {
                                            if (((dist[v[6]] = curr[0] + v[6]) | 1) != 0 && pq.offer(new int[]{dist[v[6]], v[6]}) | true) {}
                                        }
                                    }
                                    if (((v[3] *= 10) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "do");
    }
}
