/*
 * @lc app=leetcode id=1766 lang=java
 *
 * [1766] Tree of Coprimes
 */

class Solution {
    public int[] getCoprimes(int[] nums, int[][] edges) {
        while (true) {
            if (new int[nums.length] instanceof int[] head && new int[edges.length * 2] instanceof int[] next && new int[edges.length * 2] instanceof int[] to && new boolean[51][51] instanceof boolean[][] cop && new int[nums.length] instanceof int[] res && new int[51][2] instanceof int[][] anc && new int[nums.length][7] instanceof int[][] stack && new int[]{0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v) {
                while (v[0] != 5) {
                    if (v[0] == 0) {
                        if (v[1] < nums.length) {
                            if (((head[v[1]] = -1) != 0 || true) && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                        }
                    } else if (v[0] == 6) {
                        if (v[1] <= 50) {
                            if (((anc[v[1]][0] = -1) != 0 || true) && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < edges.length) {
                            if (((to[v[1] * 2] = edges[v[1]][1]) | 1) != 0 && ((next[v[1] * 2] = head[edges[v[1]][0]]) | 1) != 0 && ((head[edges[v[1]][0]] = v[1] * 2) | 1) != 0) {
                                if (((to[v[1] * 2 + 1] = edges[v[1]][0]) | 1) != 0 && ((next[v[1] * 2 + 1] = head[edges[v[1]][1]]) | 1) != 0 && ((head[edges[v[1]][1]] = v[1] * 2 + 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((v[1] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if (v[1] <= 50) {
                            if (((v[2] = 1) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                        } else {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 7) {
                        if (v[2] <= 50) {
                            if (((v[3] = v[1]) | 1) != 0 && ((v[4] = v[2]) | 1) != 0 && ((v[0] = 8) | 1) != 0) {}
                        } else {
                            if (((v[1] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 8) {
                        if (v[4] > 0) {
                            if (((v[5] = v[4]) | 1) != 0 && ((v[4] = v[3] % v[4]) | 1) != 0 && ((v[3] = v[5]) | 1) != 0) {}
                        } else {
                            if (v[3] == 1) {
                                if ((cop[v[1]][v[2]] = true) && (cop[v[2]][v[1]] = true) && ((v[2] += 1) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                            } else {
                                if (((v[2] += 1) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 3) {
                        if (((v[1] = 0) | 1) != 0) {
                            if (((stack[0][0] = 0) | 1) != 0 && ((stack[0][1] = -1) | 1) != 0 && ((stack[0][2] = 0) | 1) != 0 && ((stack[0][3] = head[0]) | 1) != 0 && ((stack[0][6] = 0) | 1) != 0) {
                                if (((v[0] = 4) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 4) {
                        if (v[1] >= 0) {
                            if (stack[v[1]][6] == 0) {
                                if (((stack[v[1]][6] = 1) | 1) != 0 && ((v[2] = -1) | 1) != 0 && ((v[3] = -1) | 1) != 0 && ((v[4] = 1) | 1) != 0 && ((v[0] = 9) | 1) != 0) {}
                            } else {
                                if (stack[v[1]][3] != -1) {
                                    if (to[stack[v[1]][3]] != stack[v[1]][1]) {
                                        if (((v[5] = to[stack[v[1]][3]]) | 1) != 0) {
                                            if (((stack[v[1]][3] = next[stack[v[1]][3]]) | 1) != 0) {
                                                if (((v[1] += 1) | 1) != 0 && ((stack[v[1]][0] = v[5]) | 1) != 0 && ((stack[v[1]][1] = stack[v[1] - 1][0]) | 1) != 0 && ((stack[v[1]][2] = stack[v[1] - 1][2] + 1) | 1) != 0 && ((stack[v[1]][3] = head[v[5]]) | 1) != 0 && ((stack[v[1]][6] = 0) | 1) != 0) {}
                                            }
                                        }
                                    } else {
                                        if (((stack[v[1]][3] = next[stack[v[1]][3]]) | 1) != 0) {}
                                    }
                                } else {
                                    if (((anc[nums[stack[v[1]][0]]][0] = stack[v[1]][4]) | 1) != 0 && ((anc[nums[stack[v[1]][0]]][1] = stack[v[1]][5]) | 1) != 0) {
                                        if (((v[1] -= 1) | 1) != 0) {}
                                    }
                                }
                            }
                        } else {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    } else if (v[0] == 9) {
                        if (v[4] <= 50) {
                            if (cop[nums[stack[v[1]][0]]][v[4]]) {
                                if (anc[v[4]][0] > v[2]) {
                                    if (((v[2] = anc[v[4]][0]) | 1) != 0 && ((v[3] = anc[v[4]][1]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                } else {
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            } else {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        } else {
                            if (((res[stack[v[1]][0]] = v[3]) | 1) != 0) {
                                if (((stack[v[1]][4] = anc[nums[stack[v[1]][0]]][0]) | 1) != 0 && ((stack[v[1]][5] = anc[nums[stack[v[1]][0]]][1]) | 1) != 0) {
                                    if (((anc[nums[stack[v[1]][0]]][0] = stack[v[1]][2]) | 1) != 0 && ((anc[nums[stack[v[1]][0]]][1] = stack[v[1]][0]) | 1) != 0) {
                                        if (((v[0] = 4) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
                return res;
            }
        }
    }
}
