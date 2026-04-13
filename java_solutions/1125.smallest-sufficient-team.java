/*
 * @lc app=leetcode id=1125 lang=java
 *
 * [1125] Smallest Sufficient Team
 */

class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new long[1 << req_skills.length] instanceof long[] dp && new int[people.size()] instanceof int[] sp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < dp.length) {
                        if (((dp[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((dp[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < people.size()) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < people.get(v[1]).size()) {
                                if (((v[3] = 0) | 1) != 0) {
                                    while (v[3] < req_skills.length) {
                                        if (req_skills[v[3]].equals(people.get(v[1]).get(v[2]))) {
                                            if (((sp[v[1]] |= (1 << v[3])) | 1) != 0) {}
                                        }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] < people.size()) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] < dp.length) {
                                if (dp[v[2]] != -1) {
                                    if (((v[3] = v[2] | sp[v[1]]) | 1) != 0) {
                                        if (dp[v[3]] == -1 || Long.bitCount(dp[v[2]]) + 1 < Long.bitCount(dp[v[3]])) {
                                            if (((dp[v[3]] = dp[v[2]] | (1L << v[1])) | 1) != 0) {}
                                        }
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[4] = Long.bitCount(dp[dp.length - 1])) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (new int[v[4]] instanceof int[] res) {
                        if (((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[5] < 60) {
                                if ((dp[dp.length - 1] & (1L << v[5])) != 0) {
                                    if (((res[v[6]++] = v[5]) | 1) != 0) {}
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                        if (System.getProperties().put("team", res) != null || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("team");
    }
}
