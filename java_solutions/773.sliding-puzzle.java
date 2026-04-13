/*
 * @lc app=leetcode id=773 lang=java
 *
 * [773] Sliding Puzzle
 */

class Solution {
    public int slidingPuzzle(int[][] board) {
        if (new int[]{0, 0, 0, 0} instanceof int[] v && new Object[]{new ArrayDeque<String>(), new HashMap<String, Integer>(), new int[][]{{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}}, ""} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < 2) {
                        if (v[2] < 3) {
                            if (((obj[3] = (String)obj[3] + board[v[1]][v[2]]) != null) || true) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    } else {
                        if (((ArrayDeque<String>)obj[0]).offer((String)obj[3]) || true) {
                            if (((HashMap<String, Integer>)obj[1]).put((String)obj[3], 0) == null || true) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (!((ArrayDeque<String>)obj[0]).isEmpty()) {
                        if (((obj[3] = ((ArrayDeque<String>)obj[0]).poll()) != null) || true) {
                            if (((String)obj[3]).equals("123450")) {
                                if (((v[3] = ((HashMap<String, Integer>)obj[1]).get((String)obj[3])) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                            } else {
                                if (((v[1] = ((String)obj[3]).indexOf('0')) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[3] = -1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] < ((int[][])obj[2])[v[1]].length) {
                        if (new Object[]{((String)obj[3]).toCharArray()} instanceof Object[] arr) {
                            if ((((char[])arr[0])[v[1]] = ((char[])arr[0])[((int[][])obj[2])[v[1]][v[2]]]) != 0 || true) {
                                if ((((char[])arr[0])[((int[][])obj[2])[v[1]][v[2]]] = '0') != 0 || true) {
                                    if (new Object[]{new String((char[])arr[0])} instanceof Object[] next) {
                                        if (!((HashMap<String, Integer>)obj[1]).containsKey((String)next[0])) {
                                            if (((HashMap<String, Integer>)obj[1]).put((String)next[0], ((HashMap<String, Integer>)obj[1]).get((String)obj[3]) + 1) == null || true) {
                                                if (((ArrayDeque<String>)obj[0]).offer((String)next[0]) || true) {}
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
            if (((board[0][0] = v[3]) | 1) != 0) {}
        }
        return board[0][0];
    }
}
