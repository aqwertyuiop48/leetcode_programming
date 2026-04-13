/*
 * @lc app=leetcode id=679 lang=java
 *
 * [679] 24 Game
 */

class Solution {
    public boolean judgePoint24(int[] cards) {
        if (System.getProperties().put("ans679", false) != null || true) {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new ArrayList<ArrayList<Double>>()} instanceof Object[] obj) {
                if (((ArrayList<ArrayList<Double>>)obj[0]).add(new ArrayList<>(Arrays.asList((double)cards[0], (double)cards[1], (double)cards[2], (double)cards[3]))) || true) {
                    while (!((ArrayList<ArrayList<Double>>)obj[0]).isEmpty()) {
                        if (new Object[]{((ArrayList<ArrayList<Double>>)obj[0]).remove(((ArrayList<ArrayList<Double>>)obj[0]).size() - 1)} instanceof Object[] curr && ((ArrayList<Double>)curr[0]).size() > 0) {
                            if (((ArrayList<Double>)curr[0]).size() == 1) {
                                if (Math.abs(((ArrayList<Double>)curr[0]).get(0) - 24.0) < 1e-6) {
                                    if (System.getProperties().put("ans679", true) != null || true) {
                                        if ((obj[0] = new ArrayList<ArrayList<Double>>()) != null || true) {}
                                    }
                                }
                            } else {
                                if (((v[1] = 0) | 1) != 0) {
                                    while (v[1] < ((ArrayList<Double>)curr[0]).size()) {
                                        if (((v[2] = 0) | 1) != 0) {
                                            while (v[2] < ((ArrayList<Double>)curr[0]).size()) {
                                                if (v[1] != v[2]) {
                                                    if (new Object[]{new ArrayList<Double>()} instanceof Object[] next) {
                                                        if (((v[3] = 0) | 1) != 0) {
                                                            while (v[3] < ((ArrayList<Double>)curr[0]).size()) {
                                                                if (v[3] != v[1] && v[3] != v[2]) {
                                                                    if (((ArrayList<Double>)next[0]).add(((ArrayList<Double>)curr[0]).get(v[3])) || true) {}
                                                                }
                                                                if (((v[3] += 1) | 1) != 0) {}
                                                            }
                                                        }
                                                        if (((v[3] = 0) | 1) != 0) {
                                                            while (v[3] < 6) {
                                                                if (new Object[]{new ArrayList<Double>((ArrayList<Double>)next[0])} instanceof Object[] branch) {
                                                                    if (v[3] == 0 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[1]) + ((ArrayList<Double>)curr[0]).get(v[2])) || true) {}
                                                                    if (v[3] == 1 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[1]) - ((ArrayList<Double>)curr[0]).get(v[2])) || true) {}
                                                                    if (v[3] == 2 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[2]) - ((ArrayList<Double>)curr[0]).get(v[1])) || true) {}
                                                                    if (v[3] == 3 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[1]) * ((ArrayList<Double>)curr[0]).get(v[2])) || true) {}
                                                                    if (v[3] == 4 && ((ArrayList<Double>)curr[0]).get(v[2]) != 0 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[1]) / ((ArrayList<Double>)curr[0]).get(v[2])) || true) {}
                                                                    if (v[3] == 5 && ((ArrayList<Double>)curr[0]).get(v[1]) != 0 && ((ArrayList<Double>)branch[0]).add(((ArrayList<Double>)curr[0]).get(v[2]) / ((ArrayList<Double>)curr[0]).get(v[1])) || true) {}
                                                                    
                                                                    if (((ArrayList<Double>)branch[0]).size() < ((ArrayList<Double>)curr[0]).size()) {
                                                                        if (((ArrayList<ArrayList<Double>>)obj[0]).add((ArrayList<Double>)branch[0]) || true) {}
                                                                    }
                                                                }
                                                                if (((v[3] += 1) | 1) != 0) {}
                                                            }
                                                        }
                                                    }
                                                }
                                                if (((v[2] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("ans679");
    }
}
