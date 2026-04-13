/*
 * @lc app=leetcode id=1585 lang=java
 *
 * [1585] Check If String Is Transformable With Substring Sort Operations
 */

class Solution {
    public boolean isTransformable(String s, String t) {
        return java.util.Arrays.stream(new boolean[][]{new boolean[1]}).peek(res -> {
            if (new int[]{0, 0, 0, 0} instanceof int[] v && new int[10][s.length()] instanceof int[][] pos && new int[10] instanceof int[] head && new int[10] instanceof int[] tail) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[1] < s.length()) {
                            if (((v[2] = s.charAt(v[1]) - '0') | 1) != 0 && ((pos[v[2]][tail[v[2]]] = v[1]) | 1) != 0 && ((tail[v[2]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[1] < t.length()) {
                            if (((v[2] = t.charAt(v[1]) - '0') | 1) != 0) {
                                if (head[v[2]] == tail[v[2]]) {
                                    if (((res[0] = false) | true) && ((v[0] = 10) | 1) != 0) {}
                                } else {
                                    if (((v[3] = 0) | 1) != 0) {
                                        while (v[3] < v[2]) {
                                            if (head[v[3]] < tail[v[3]] && pos[v[3]][head[v[3]]] < pos[v[2]][head[v[2]]]) {
                                                if (((res[0] = false) | true) && ((v[0] = 10) | 1) != 0) {}
                                            }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                        if (v[0] != 10) {
                                            if (((head[v[2]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        } else {
                            if (((res[0] = true) | true) && ((v[0] = 10) | 1) != 0) {}
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
