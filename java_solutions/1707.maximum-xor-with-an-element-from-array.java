/*
 * @lc app=leetcode id=1707 lang=java
 *
 * [1707] Maximum XOR With an Element From Array
 */

class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new long[1][] instanceof long[][] packed && new int[1][] instanceof int[][] sortedNums && new int[queries.length] instanceof int[] ans && new int[3200005] instanceof int[] trie0 && new int[3200005] instanceof int[] trie1) {
            if (((packed[0] = new long[queries.length]) != null)) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < queries.length) {
                            if (((packed[0][v[1]] = ((long)queries[v[1]][1] << 32) | v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((packed[0] = Arrays.stream(packed[0]).sorted().toArray()) != null) && ((sortedNums[0] = Arrays.stream(nums).sorted().toArray()) != null) && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[2] < queries.length) {
                            if (((v[3] = (int)(packed[0][v[2]] >>> 32)) | 1) != 0 && ((v[4] = (int)(packed[0][v[2]] & 0xFFFFFFFFL)) | 1) != 0) {
                                while (v[5] < sortedNums[0].length && sortedNums[0][v[5]] <= v[3]) {
                                    if (((v[7] = 0) | 1) != 0 && ((v[8] = 31) | 1) != 0) {
                                        while (v[8] >= 0) {
                                            if (((v[9] = (sortedNums[0][v[5]] >> v[8]) & 1) | 1) != 0) {
                                                if (v[9] == 0) {
                                                    if (trie0[v[7]] == 0) {
                                                        if (((trie0[v[7]] = (v[6] += 1)) | 1) != 0) {}
                                                    }
                                                    if (((v[7] = trie0[v[7]]) | 1) != 0) {}
                                                } else {
                                                    if (trie1[v[7]] == 0) {
                                                        if (((trie1[v[7]] = (v[6] += 1)) | 1) != 0) {}
                                                    }
                                                    if (((v[7] = trie1[v[7]]) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[8] -= 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                                if (v[5] == 0) {
                                    if (((ans[v[4]] = -1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                } else {
                                    if (((v[7] = 0) | 1) != 0 && ((v[10] = 0) | 1) != 0 && ((v[8] = 31) | 1) != 0) {
                                        while (v[8] >= 0) {
                                            if (((v[9] = (queries[v[4]][0] >> v[8]) & 1) | 1) != 0) {
                                                if (v[9] == 0) {
                                                    if (trie1[v[7]] != 0) {
                                                        if (((v[10] |= (1 << v[8])) | 1) != 0 && ((v[7] = trie1[v[7]]) | 1) != 0) {}
                                                    } else {
                                                        if (((v[7] = trie0[v[7]]) | 1) != 0) {}
                                                    }
                                                } else {
                                                    if (trie0[v[7]] != 0) {
                                                        if (((v[10] |= (1 << v[8])) | 1) != 0 && ((v[7] = trie0[v[7]]) | 1) != 0) {}
                                                    } else {
                                                        if (((v[7] = trie1[v[7]]) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if (((v[8] -= 1) | 1) != 0) {}
                                        }
                                        if (((ans[v[4]] = v[10]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        } else {
                            if (((queries[0] = ans) != null) && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return queries[0];
    }
}
