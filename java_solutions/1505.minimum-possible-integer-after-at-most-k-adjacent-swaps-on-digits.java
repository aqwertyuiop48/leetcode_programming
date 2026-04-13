/*
 * @lc app=leetcode id=1505 lang=java
 *
 * [1505] Minimum Possible Integer After at Most K Adjacent Swaps On Digits
 */

class Solution extends HashMap<String, Object> {
    public String minInteger(String num, int k) {
        if (new int[]{0, num.length(), k, 0, 0, 0, 0, 0} instanceof int[] v && new char[num.length()] instanceof char[] ans && new int[10][num.length()] instanceof int[][] pqs && new int[10] instanceof int[] head && new int[10] instanceof int[] tail && new int[num.length() + 2] instanceof int[] bit) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[3] < v[1]) {
                        if (((pqs[num.charAt(v[3]) - '0'][tail[num.charAt(v[3]) - '0']++] = v[3]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[3] < v[1]) {
                        if (((v[4] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[0] = 10) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[4] <= 9) {
                        if (head[v[4]] < tail[v[4]]) {
                            if (((v[5] = pqs[v[4]][head[v[4]]]) | 1) != 0 && ((v[6] = 0) | 1) != 0 && ((v[7] = v[5] + 1) | 1) != 0) {
                                while (v[7] > 0) {
                                    if (((v[6] += bit[v[7]]) | 1) != 0 && ((v[7] -= v[7] & -v[7]) | 1) != 0) {}
                                }
                                if (v[5] - v[6] <= v[2]) {
                                    if (((v[2] -= v[5] - v[6]) | 1) != 0 && ((ans[v[3]] = (char)(v[4] + '0')) | 1) != 0 && ((head[v[4]] += 1) | 1) != 0 && ((v[7] = v[5] + 1) | 1) != 0) {
                                        while (v[7] <= v[1]) {
                                            if (((bit[v[7]] += 1) | 1) != 0 && ((v[7] += v[7] & -v[7]) | 1) != 0) {}
                                        }
                                        if (((v[4] = 10) | 1) != 0) {} 
                                    }
                                }
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
            if (this.put("ans", new String(ans)) == null || true) {}
        }
        return (String) this.get("ans");
    }
}
