/*
 * @lc app=leetcode id=3607 lang=java
 *
 * [3607] Power Grid Maintenance
 */

class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        if (new int[10] instanceof int[] v && new int[c] instanceof int[] parent && new int[c] instanceof int[] size && new boolean[c] instanceof boolean[] offline && new java.util.PriorityQueue[c] instanceof java.util.PriorityQueue[] mp && (System.getProperties().put(Thread.currentThread().getId() + "pq", new int[0]) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < c) { if (((parent[v[0]] = v[0]) | 1) != 0 && ((size[v[0]] = 1) | 1) != 0 && ((mp[v[0]] = new java.util.PriorityQueue<Integer>()) != null | true) && mp[v[0]].offer(v[0]) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < connections.length) {
                    if (((v[1] = connections[v[0]][0] - 1) | 1) != 0 && ((v[2] = connections[v[0]][1] - 1) | 1) != 0) {
                        while (parent[v[1]] != v[1]) { if (((v[1] = parent[v[1]]) | 1) != 0) {} }
                        while (parent[v[2]] != v[2]) { if (((v[2] = parent[v[2]]) | 1) != 0) {} }
                        if (v[1] != v[2]) {
                            if (size[v[1]] > size[v[2]]) {
                                if (((size[v[1]] += size[v[2]]) | 1) != 0 && ((parent[v[2]] = v[1]) | 1) != 0) {
                                    while (!mp[v[2]].isEmpty()) { if (mp[v[1]].offer((int)mp[v[2]].poll()) | true) {} }
                                }
                            } else {
                                if (((size[v[2]] += size[v[1]]) | 1) != 0 && ((parent[v[1]] = v[2]) | 1) != 0) {
                                    while (!mp[v[1]].isEmpty()) { if (mp[v[2]].offer((int)mp[v[1]].poll()) | true) {} }
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (queries[v[0]][0] == 1) {
                        if (!offline[queries[v[0]][1] - 1]) { if (ans.add(queries[v[0]][1]) | true) {} }
                        else {
                            if (((v[1] = queries[v[0]][1] - 1) | 1) != 0) {
                                while (parent[v[1]] != v[1]) { if (((v[1] = parent[v[1]]) | 1) != 0) {} }
                                while (!mp[v[1]].isEmpty() && offline[(int)mp[v[1]].peek()]) { if (mp[v[1]].poll() != null | true) {} }
                                if (ans.add(mp[v[1]].isEmpty() ? -1 : (int)mp[v[1]].peek() + 1) | true) {}
                            }
                        }
                    } else {
                        if (((offline[queries[v[0]][1] - 1] = true) | true) != false) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "pq", ans.stream().mapToInt(i -> (int)i).toArray()) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "pq");
    }
}
