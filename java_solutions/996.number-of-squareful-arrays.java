/*
 * @lc app=leetcode id=996 lang=java
 *
 * [996] Number of Squareful Arrays
 */

class Solution {
    public int numSquarefulPerms(int[] A) {
        if (System.setProperty("ans", "0") != null || true) {
            if (new int[]{0, 0, A.length, 0, 0, 0, 0} instanceof int[] v && new Object[]{new ArrayList<Integer>(), new boolean[A.length], new int[A.length + 1]} instanceof Object[] obj) {
                while (v[0] < 10) {
                    if (v[0] == 0) {
                        if (v[3] < v[2]) {
                            if (((v[4] = v[3] + 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    } else if (v[0] == 1) {
                        if (v[4] < v[2]) {
                            if (A[v[3]] > A[v[4]]) {
                                if (((v[5] = A[v[3]]) | 1) != 0 && ((A[v[3]] = A[v[4]]) | 1) != 0 && ((A[v[4]] = v[5]) | 1) != 0) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (((v[3] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                        }
                    } else if (v[0] == 2) {
                        if ((((int[])obj[2])[v[1]] = 0) == 0 || true) {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    } else if (v[0] == 3) {
                        if (((List<Integer>)obj[0]).size() == v[2]) {
                            if (((v[6] += 1) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                        } else {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    } else if (v[0] == 4) {
                        if (((int[])obj[2])[v[1]] < v[2]) {
                            if (((v[5] = ((int[])obj[2])[v[1]]) | 1) != 0) {
                                if (!((boolean[])obj[1])[v[5]] && !(v[5] > 0 && A[v[5]] == A[v[5] - 1] && !((boolean[])obj[1])[v[5] - 1])) {
                                    if (((List<Integer>)obj[0]).isEmpty() || Math.sqrt(((List<Integer>)obj[0]).get(((List<Integer>)obj[0]).size() - 1) + A[v[5]]) == Math.floor(Math.sqrt(((List<Integer>)obj[0]).get(((List<Integer>)obj[0]).size() - 1) + A[v[5]]))) {
                                        if ((((boolean[])obj[1])[v[5]] = true) || true) {
                                            if (((List<Integer>)obj[0]).add(A[v[5]]) || true) {
                                                if (((v[1] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                            }
                                        }
                                    } else {
                                        if ((((int[])obj[2])[v[1]] += 1) != 0 || true) {}
                                    }
                                } else {
                                    if ((((int[])obj[2])[v[1]] += 1) != 0 || true) {}
                                }
                            }
                        } else {
                            if (((v[0] = 5) | 1) != 0) {}
                        }
                    } else if (v[0] == 5) {
                        if (v[1] > 0) {
                            if (((v[1] -= 1) | 1) != 0) {
                                if ((((boolean[])obj[1])[((int[])obj[2])[v[1]]] = false) == false || true) {
                                    if (((List<Integer>)obj[0]).remove(((List<Integer>)obj[0]).size() - 1) != null || true) {
                                        if ((((int[])obj[2])[v[1]] += 1) != 0 || true) {
                                            if (((v[0] = 4) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        } else {
                            if (System.setProperty("ans", String.valueOf(v[6])) != null || true) {
                                if (((v[0] = 10) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
