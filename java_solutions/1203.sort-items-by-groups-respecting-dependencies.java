/*
 * @lc app=leetcode id=1203 lang=java
 *
 * [1203] Sort Items by Groups Respecting Dependencies
 */

class Solution {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        if (new int[]{0, 0, 0, m, 0, 0, 0} instanceof int[] v && new Object[]{new ArrayList[n], new ArrayList[n+m], new int[n], new int[n+m], new ArrayDeque<Integer>(), new ArrayDeque<Integer>(), new ArrayList<Integer>(), new ArrayList<Integer>(), new ArrayList[n+m], group.clone()} instanceof Object[] obj) {
            while (v[0] < 20) {
                if (v[0] == 0) {
                    if (v[1] < n) {
                        if ((((ArrayList[])obj[0])[v[1]] = new ArrayList<>()) != null || true) {
                            if (((int[])obj[9])[v[1]] == -1) {
                                if (((((int[])obj[9])[v[1]] = v[3]++) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[3]) {
                        if ((((ArrayList[])obj[1])[v[1]] = new ArrayList<>()) != null || true) {
                            if ((((ArrayList[])obj[8])[v[1]] = new ArrayList<>()) != null || true) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] < n) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[2] < beforeItems.get(v[1]).size()) {
                        if (((v[4] = beforeItems.get(v[1]).get(v[2])) | 1) != 0) {
                            if ((((ArrayList<Integer>)((ArrayList[])obj[0])[v[4]]).add(v[1])) || true) {
                                if ((((int[])obj[2])[v[1]] += 1) != -1) {
                                    if (((int[])obj[9])[v[4]] != ((int[])obj[9])[v[1]]) {
                                        if ((((ArrayList<Integer>)((ArrayList[])obj[1])[((int[])obj[9])[v[4]]]).add(((int[])obj[9])[v[1]])) || true) {
                                            if ((((int[])obj[3])[((int[])obj[9])[v[1]]] += 1) != -1) {}
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[1] < n) {
                        if (((int[])obj[2])[v[1]] == 0) {
                            if (((ArrayDeque<Integer>)obj[4]).add(v[1]) || true) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 5) {
                    if (v[1] < v[3]) {
                        if (((int[])obj[3])[v[1]] == 0) {
                            if (((ArrayDeque<Integer>)obj[5]).add(v[1]) || true) {}
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (!((ArrayDeque<Integer>)obj[4]).isEmpty()) {
                        if (((v[4] = ((ArrayDeque<Integer>)obj[4]).poll()) | 1) != 0) {
                            if (((ArrayList<Integer>)obj[6]).add(v[4]) || true) {
                                if (((v[2] = 0) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 8) | 1) != 0) {}
                    }
                } else if (v[0] == 7) {
                    if (v[2] < ((ArrayList<Integer>)((ArrayList[])obj[0])[v[4]]).size()) {
                        if (((v[5] = ((ArrayList<Integer>)((ArrayList[])obj[0])[v[4]]).get(v[2])) | 1) != 0) {
                            if ((((int[])obj[2])[v[5]] -= 1) != -1) {
                                if (((int[])obj[2])[v[5]] == 0) {
                                    if (((ArrayDeque<Integer>)obj[4]).add(v[5]) || true) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 8) {
                    if (!((ArrayDeque<Integer>)obj[5]).isEmpty()) {
                        if (((v[4] = ((ArrayDeque<Integer>)obj[5]).poll()) | 1) != 0) {
                            if (((ArrayList<Integer>)obj[7]).add(v[4]) || true) {
                                if (((v[2] = 0) | 1) != 0 && ((v[0] = 9) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 10) | 1) != 0) {}
                    }
                } else if (v[0] == 9) {
                    if (v[2] < ((ArrayList<Integer>)((ArrayList[])obj[1])[v[4]]).size()) {
                        if (((v[5] = ((ArrayList<Integer>)((ArrayList[])obj[1])[v[4]]).get(v[2])) | 1) != 0) {
                            if ((((int[])obj[3])[v[5]] -= 1) != -1) {
                                if (((int[])obj[3])[v[5]] == 0) {
                                    if (((ArrayDeque<Integer>)obj[5]).add(v[5]) || true) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 8) | 1) != 0) {}
                    }
                } else if (v[0] == 10) {
                    if (((ArrayList<Integer>)obj[6]).size() != n || ((ArrayList<Integer>)obj[7]).size() != v[3]) {
                        if (((v[6] = 1) | 1) != 0 && ((v[0] = 20) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 11) | 1) != 0) {}
                    }
                } else if (v[0] == 11) {
                    if (v[1] < n) {
                        if (((v[4] = ((ArrayList<Integer>)obj[6]).get(v[1])) | 1) != 0) {
                            if ((((ArrayList<Integer>)((ArrayList[])obj[8])[((int[])obj[9])[v[4]]]).add(v[4])) || true) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[0] = 12) | 1) != 0) {}
                    }
                } else if (v[0] == 12) {
                    if (v[1] < v[3]) {
                        if (((v[4] = ((ArrayList<Integer>)obj[7]).get(v[1])) | 1) != 0) {
                            if (((v[5] = 0) | 1) != 0 && ((v[0] = 13) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 20) | 1) != 0) {}
                    }
                } else if (v[0] == 13) {
                    if (v[5] < ((ArrayList<Integer>)((ArrayList[])obj[8])[v[4]]).size()) {
                        if (((group[v[2]++] = ((ArrayList<Integer>)((ArrayList[])obj[8])[v[4]]).get(v[5])) | 1) != 0) {
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 12) | 1) != 0) {}
                    }
                }
            }
            if (v[6] == 1) {
                if (((group = new int[0]) != null) || true) {}
            }
        }
        return group;
    }
}
