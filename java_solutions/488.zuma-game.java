/*
 * @lc app=leetcode id=488 lang=java
 *
 * [488] Zuma Game
 */

class Solution {
    public int findMinStep(String board, String hand) {
        if (new Object[]{new String[200000], new String[200000], new int[200000], new String[1048576], new String[1048576], new int[25]} instanceof Object[] o && o[0] instanceof String[] qB && o[1] instanceof String[] qH && o[2] instanceof int[] qS && o[3] instanceof String[] setB && o[4] instanceof String[] setH && o[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "zg", -1) != null | true)) {
            if (new Object[]{hand.toCharArray()} instanceof Object[] ho && ho[0] instanceof char[] hc) {
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] < hc.length) {
                        if (((v[3] = v[2] + 1) | 1) != 0) {
                            while (v[3] < hc.length) {
                                if (hc[v[2]] > hc[v[3]]) { if (((v[4] = hc[v[2]]) | 1) != 0 && ((hc[v[2]] = hc[v[3]]) | 1) != 0 && ((hc[v[3]] = (char)v[4]) | 1) != 0) {} }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((qB[0] = board).length() >= 0) && ((qH[0] = new String(hc)).length() >= 0) && ((qS[0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {}
            }
            while (v[0] < v[1] && (int)System.getProperties().get(Thread.currentThread().getId() + "zg") == -1) {
                if (new Object[]{qB[v[0]], qH[v[0]], qS[v[0]]} instanceof Object[] curr && curr[0] instanceof String cb && curr[1] instanceof String ch && curr[2] instanceof Integer cs) {
                    if (cb.length() == 0) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "zg", cs) != null | true) {}
                    } else {
                        if (((v[5] = 0) | 1) != 0) {
                            while (v[5] < cb.length()) {
                                if (((v[6] = 0) | 1) != 0) {
                                    while (v[6] < ch.length()) {
                                        if (v[6] == 0 || ch.charAt(v[6]) != ch.charAt(v[6] - 1)) {
                                            if ((cb.charAt(v[5]) == ch.charAt(v[6]) && (v[5] == 0 || cb.charAt(v[5] - 1) != ch.charAt(v[6]))) || (v[5] > 0 && cb.charAt(v[5]) == cb.charAt(v[5] - 1) && cb.charAt(v[5]) != ch.charAt(v[6]))) {
                                                if (new Object[]{cb.substring(0, v[5]) + ch.charAt(v[6]) + cb.substring(v[5]), ch.substring(0, v[6]) + ch.substring(v[6] + 1)} instanceof Object[] no && no[0] instanceof String nb && no[1] instanceof String nh) {
                                                    if (((v[10] = 1) | 1) != 0) {
                                                        while (v[10] == 1) {
                                                            if (((v[10] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0 && ((v[12] = 0) | 1) != 0) {
                                                                while (v[7] < nb.length() && v[12] == 0) {
                                                                    if (((v[8] = v[7]) | 1) != 0) {
                                                                        while (v[8] < nb.length() && nb.charAt(v[8]) == nb.charAt(v[7])) { if (((v[8] += 1) | 1) != 0) {} }
                                                                    }
                                                                    if (v[8] - v[7] >= 3) {
                                                                        if (((nb = nb.substring(0, v[7]) + nb.substring(v[8])).length() >= 0) && ((v[10] = 1) | 1) != 0 && ((v[12] = 1) | 1) != 0) {}
                                                                    }
                                                                    if (v[12] == 0) {
                                                                        if (((v[7] = v[8]) | 1) != 0) {}
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (((v[11] = Math.abs(nb.hashCode() * 31 + nh.hashCode()) & 1048575) | 1) != 0) {
                                                        while (setB[v[11]] != null && !(setB[v[11]].equals(nb) && setH[v[11]].equals(nh))) { if (((v[11] = (v[11] + 1) & 1048575) | 1) != 0) {} }
                                                        if (setB[v[11]] == null && v[1] < 199999) {
                                                            if (((setB[v[11]] = nb).length() >= 0) && ((setH[v[11]] = nh).length() >= 0) && ((qB[v[1]] = nb).length() >= 0) && ((qH[v[1]] = nh).length() >= 0) && ((qS[v[1]] = cs + 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "zg");
    }
}
