/*
 * @lc app=leetcode id=1520 lang=java
 *
 * [1520] Maximum Number of Non-Overlapping Substrings
 */

class Solution extends ArrayList<String> {
    public List<String> maxNumOfSubstrings(String s) {
        if (new int[]{0, 0, 0, 0, 0, 0, 0, 0, s.length()} instanceof int[] v && new int[26] instanceof int[] first && new int[26] instanceof int[] last && new Object[]{new ArrayList<int[]>()} instanceof Object[] obj) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] < 26) {
                        if (((first[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[8]) {
                        if (((v[2] = s.charAt(v[1]) - 'a') | 1) != 0) {
                            if (first[v[2]] == -1) {
                                if (((first[v[2]] = v[1]) | 1) != 0) {}
                            }
                            if (((last[v[2]] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[1] < 26) {
                        if (first[v[1]] == -1) {
                            if (((v[1] += 1) | 1) != 0) {}
                        } else {
                            if (((v[3] = first[v[1]]) | 1) != 0 && ((v[4] = last[v[1]]) | 1) != 0 && ((v[5] = 1) | 1) != 0 && ((v[2] = v[3]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[2] <= v[4]) {
                        if (((v[7] = s.charAt(v[2]) - 'a') | 1) != 0) {
                            if (first[v[7]] < v[3]) {
                                if (((v[5] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                            } else {
                                if (((v[4] = Math.max(v[4], last[v[7]])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[5] == 1) {
                        if ((((List<int[]>)obj[0]).add(new int[]{v[3], v[4]})) || true) {}
                    }
                    if (((v[1] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                } else if (v[0] == 5) {
                    if (((obj[0] = ((List<int[]>)obj[0]).stream().sorted((a, b) -> a[1] - b[1]).toList()) != null) || true) {
                        if (((v[6] = -1) | 1) != 0 && ((v[7] = 0) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                    }
                } else if (v[0] == 6) {
                    if (v[7] < ((List<int[]>)obj[0]).size()) {
                        if (((List<int[]>)obj[0]).get(v[7])[0] > v[6]) {
                            if (this.add(s.substring(((List<int[]>)obj[0]).get(v[7])[0], ((List<int[]>)obj[0]).get(v[7])[1] + 1)) || true) {
                                if (((v[6] = ((List<int[]>)obj[0]).get(v[7])[1]) | 1) != 0) {}
                            }
                        }
                        if (((v[7] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 99) | 1) != 0) {}
                    }
                }
            }
        }
        return this;
    }
}
