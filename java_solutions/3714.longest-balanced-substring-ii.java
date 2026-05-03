/*
 * @lc app=leetcode id=3714 lang=java
 *
 * [3714] Longest Balanced Substring II
 */

class Solution {
    public int longestBalanced(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lb", 0) != null | true) && s.toCharArray() instanceof char[] cs) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = cs.length) | 1) != 0) {
                while (v[1] < v[2]) {
                    if (((v[3] = v[1] + 1) | 1) != 0) {
                        while (v[3] < v[2] && cs[v[3]] == cs[v[1]]) { if (((v[3] += 1) | 1) != 0) {} }
                        if (v[3] - v[1] > v[0]) { if (((v[0] = v[3] - v[1]) | 1) != 0) {} }
                        if (((v[1] = v[3]) | 1) != 0) {}
                    }
                }
                if (((v[4] = 0) | 1) != 0 && new char[][]{{'a', 'b'}, {'b', 'c'}, {'a', 'c'}} instanceof char[][] pairs && ((v[5] = 0) | 1) != 0) {
                    while (v[5] < 3) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < v[2]) {
                                while (v[1] < v[2] && cs[v[1]] != pairs[v[5]][0] && cs[v[1]] != pairs[v[5]][1]) { if (((v[1] += 1) | 1) != 0) {} }
                                if (new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap pos && pos.put(0, v[1] - 1) == null | true && ((v[6] = 0) | 1) != 0) {
                                    while (v[1] < v[2] && (cs[v[1]] == pairs[v[5]][0] || cs[v[1]] == pairs[v[5]][1])) {
                                        if (((v[6] += (cs[v[1]] == pairs[v[5]][0] ? 1 : -1)) | 1) != 0 && pos.containsKey(v[6])) {
                                            if (v[1] - (int)pos.get(v[6]) > v[4]) { if (((v[4] = v[1] - (int)pos.get(v[6])) | 1) != 0) {} }
                                        } else { if (pos.put(v[6], v[1]) == null | true) {} }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[5] += 1) | 1) != 0) {}
                    }
                    if (new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap pos2 && pos2.put((100000L << 20) | 100000L, -1) == null | true && new int[3] instanceof int[] cnt && ((v[7] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[2]) {
                            if (((cnt[cs[v[1]] - 'a'] += 1) | 1) != 0 && ((v[8] = cnt[0] - cnt[1]) | 1) != 0 && ((v[9] = cnt[1] - cnt[2]) | 1) != 0) {
                                if (pos2.containsKey(((long)(v[8] + 100000) << 20) | (v[9] + 100000))) {
                                    if (v[1] - (int)pos2.get(((long)(v[8] + 100000) << 20) | (v[9] + 100000)) > v[7]) { if (((v[7] = v[1] - (int)pos2.get(((long)(v[8] + 100000) << 20) | (v[9] + 100000))) | 1) != 0) {} }
                                } else { if (pos2.put(((long)(v[8] + 100000) << 20) | (v[9] + 100000), v[1]) == null | true) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "lb", Math.max(v[0], Math.max(v[4], v[7]))) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lb");
    }
}
