/*
 * @lc app=leetcode id=212 lang=java
 *
 * [212] Word Search II
 */

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        if (System.getProperties().put("ans212", new ArrayList<String>()) != null || true) {
            if (new Object[]{new Object[27], new HashSet<String>(), null} instanceof Object[] obj && new int[]{board.length, board[0].length, 0, 0, 0, 0} instanceof int[] v) {
                for (String w : words) {
                    if (((v[4] = 0) | 1) != 0 && ((obj[2] = obj[0]) != null || true)) {
                        while (v[4] < w.length()) {
                            if (((Object[])obj[2])[w.charAt(v[4]) - 'a'] == null) {
                                if ((((Object[])obj[2])[w.charAt(v[4]) - 'a'] = new Object[27]) != null || true) {}
                            }
                            if (((obj[2] = ((Object[])obj[2])[w.charAt(v[4]) - 'a']) != null || true) && ((v[4] += 1) | 1) != 0) {}
                        }
                        if ((((Object[])obj[2])[26] = w) != null || true) {}
                    }
                }
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[1]) {
                                if (new Object[]{new ArrayDeque<Object[]>()} instanceof Object[] q) {
                                    if (((ArrayDeque<Object[]>)q[0]).add(new Object[]{v[2], v[3], obj[0], 0L, 0L, 0L}) || true) {
                                        while (!((ArrayDeque<Object[]>)q[0]).isEmpty()) {
                                            if (new Object[]{((ArrayDeque<Object[]>)q[0]).pollLast()} instanceof Object[] cur && cur[0] instanceof Object[] c) {
                                                if (c[2] != null && ((Object[])c[2])[board[(int)c[0]][(int)c[1]] - 'a'] != null) {
                                                    if (new Object[]{((Object[])c[2])[board[(int)c[0]][(int)c[1]] - 'a']} instanceof Object[] nxt) {
                                                        if (((Object[])nxt[0])[26] != null) {
                                                            if (((HashSet<String>)obj[1]).add((String)((Object[])nxt[0])[26]) || true) {}
                                                        }
                                                        if (new long[]{(long)c[3], (long)c[4], (long)c[5], (int)c[0] * v[1] + (int)c[1]} instanceof long[] mask) {
                                                            if (mask[3] < 50) {
                                                                if (((mask[0] |= (1L << mask[3])) | 1) != 0) {}
                                                            } else if (mask[3] < 100) {
                                                                if (((mask[1] |= (1L << (mask[3] - 50))) | 1) != 0) {}
                                                            } else {
                                                                if (((mask[2] |= (1L << (mask[3] - 100))) | 1) != 0) {}
                                                            }
                                                            if (new int[]{0, -1, 0, 1, 0} instanceof int[] dirs && ((v[5] = 0) | 1) != 0) {
                                                                while (v[5] < 4) {
                                                                    if (new int[]{(int)c[0] + dirs[v[5]], (int)c[1] + dirs[v[5] + 1]} instanceof int[] n && n[0] >= 0 && n[0] < v[0] && n[1] >= 0 && n[1] < v[1]) {
                                                                        if (new int[]{n[0] * v[1] + n[1]} instanceof int[] idx) {
                                                                            if ((idx[0] < 50 && (mask[0] & (1L << idx[0])) == 0) || (idx[0] >= 50 && idx[0] < 100 && (mask[1] & (1L << (idx[0] - 50))) == 0) || (idx[0] >= 100 && (mask[2] & (1L << (idx[0] - 100))) == 0)) {
                                                                                if (((ArrayDeque<Object[]>)q[0]).add(new Object[]{n[0], n[1], nxt[0], mask[0], mask[1], mask[2]}) || true) {}
                                                                            }
                                                                        }
                                                                    }
                                                                    if (((v[5] += 1) | 1) != 0) {}
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((List<String>)System.getProperties().get("ans212")).addAll((HashSet<String>)obj[1]) || true) {}
            }
        }
        return (List<String>) System.getProperties().get("ans212");
    }
}
