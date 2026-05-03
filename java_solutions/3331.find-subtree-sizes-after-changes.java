/*
 * @lc app=leetcode id=3331 lang=java
 *
 * [3331] Find Subtree Sizes After Changes
 */

class Solution {
    public int[] findSubtreeSizes(int[] parent, String s) {
        if (new int[parent.length] instanceof int[] ans && new int[parent.length] instanceof int[] newP && new int[parent.length][26] instanceof int[][] closest && new java.util.ArrayList[parent.length] instanceof java.util.ArrayList[] adj && new java.util.ArrayList[parent.length] instanceof java.util.ArrayList[] nadj && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList q && new int[parent.length] instanceof int[] order && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sts", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < parent.length) {
                    if ((adj[v[0]] = new java.util.ArrayList<Integer>()) != null | true && (nadj[v[0]] = new java.util.ArrayList<Integer>()) != null | true && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < parent.length) { if (adj[parent[v[0]]].add(v[0]) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (q.offer(0) | true && ((newP[0] = -1) | 1) != 0) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < 26) { if (((closest[0][v[1]] = (s.charAt(0) - 'a' == v[1] ? 0 : -1)) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                }
                while (!q.isEmpty()) {
                    if (q.poll() instanceof Integer curr && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < adj[(int)curr].size()) {
                            if (adj[(int)curr].get(v[1]) instanceof Integer nxt) {
                                if (((newP[(int)nxt] = (closest[(int)curr][s.charAt((int)nxt) - 'a'] != -1 ? closest[(int)curr][s.charAt((int)nxt) - 'a'] : curr)) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                    while (v[2] < 26) {
                                        if (((closest[(int)nxt][v[2]] = (s.charAt((int)nxt) - 'a' == v[2] ? nxt : closest[(int)curr][v[2]])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                    }
                                    if (q.offer(nxt) | true) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < parent.length) { if (nadj[newP[v[0]]].add(v[0]) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (q.offer(0) | true && ((v[3] = 0) | 1) != 0) {
                while (!q.isEmpty()) {
                    if (q.poll() instanceof Integer curr && ((order[v[3]++] = curr) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < nadj[(int)curr].size()) { if (q.offer((Integer)nadj[(int)curr].get(v[1])) | true && ((v[1] += 1) | 1) != 0) {} }
                    }
                }
            }
            if (((v[0] = parent.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((v[4] = order[v[0]]) | 1) != 0 && ((ans[v[4]] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < nadj[v[4]].size()) { if (((ans[v[4]] += ans[(Integer)nadj[v[4]].get(v[1])]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "sts");
    }
}
