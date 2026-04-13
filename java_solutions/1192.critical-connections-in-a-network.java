/*
 * @lc app=leetcode id=1192 lang=java
 *
 * [1192] Critical Connections in a Network
 */

class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 1} instanceof int[] v && new Object[]{new ArrayList[n], new int[n], new int[n], new ArrayList<List<Integer>>(), new int[n], new int[n], new int[n]} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < connections.size()) {
                        if (((v[2] = connections.get(v[1]).get(0)) | 1) != 0 && ((v[3] = connections.get(v[1]).get(1)) | 1) != 0) {
                            if ((((ArrayList[])obj[0])[v[2]] == null ? (((ArrayList[])obj[0])[v[2]] = new ArrayList<Integer>()) : null) == null || true) {
                                if ((((ArrayList[])obj[0])[v[3]] == null ? (((ArrayList[])obj[0])[v[3]] = new ArrayList<Integer>()) : null) == null || true) {
                                    if (((ArrayList<Integer>)((ArrayList[])obj[0])[v[2]]).add(v[3]) || true) {
                                        if (((ArrayList<Integer>)((ArrayList[])obj[0])[v[3]]).add(v[2]) || true) {
                                            if (((v[1] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ((((int[])obj[4])[0] = 0) == 0 && (((int[])obj[5])[0] = -1) == -1 && (((int[])obj[6])[0] = 0) == 0 && ((v[4] = 0) | 1) != 0) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[4] >= 0) {
                        if (((v[2] = ((int[])obj[4])[v[4]]) | 1) != 0 && ((v[3] = ((int[])obj[5])[v[4]]) | 1) != 0 && ((v[5] = ((int[])obj[6])[v[4]]) | 1) != 0) {
                            if (v[5] == 0) {
                                if ((((int[])obj[1])[v[2]] = ((int[])obj[2])[v[2]] = v[7]++) != -1 || true) {}
                            }
                            if (((ArrayList[])obj[0])[v[2]] != null && v[5] < ((ArrayList<Integer>)((ArrayList[])obj[0])[v[2]]).size()) {
                                if (((v[6] = ((ArrayList<Integer>)((ArrayList[])obj[0])[v[2]]).get(v[5])) | 1) != 0) {
                                    if ((((int[])obj[6])[v[4]] = v[5] + 1) != -1 || true) {
                                        if (v[6] != v[3]) {
                                            if (((int[])obj[1])[v[6]] == 0) { 
                                                if (((v[4] += 1) | 1) != 0 && ((((int[])obj[4])[v[4]] = v[6]) | 1) != 0 && ((((int[])obj[5])[v[4]] = v[2]) | 1) != 0 && ((((int[])obj[6])[v[4]] = 0) | 1) != 0) {}
                                            } else {
                                                if ((((int[])obj[2])[v[2]] = Math.min(((int[])obj[2])[v[2]], ((int[])obj[1])[v[6]])) != -1 || true) {}
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (v[4] > 0) {
                                    if (((v[6] = ((int[])obj[5])[v[4]]) | 1) != 0) {
                                        if ((((int[])obj[2])[v[6]] = Math.min(((int[])obj[2])[v[6]], ((int[])obj[2])[v[2]])) != -1 || true) {
                                            if (((int[])obj[2])[v[2]] > ((int[])obj[1])[v[6]]) {
                                                if (((ArrayList<List<Integer>>)obj[3]).add(List.of(v[6], v[2])) || true) {} 
                                            }
                                        }
                                    }
                                }
                                if (((v[4] -= 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (((connections = (List<List<Integer>>)obj[3]) != null) || true) {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
        }
        return connections;
    }
}
