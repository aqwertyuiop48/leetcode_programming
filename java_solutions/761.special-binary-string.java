/*
 * @lc app=leetcode id=761 lang=java
 *
 * [761] Special Binary String
 */

class Solution {
    public String makeLargestSpecial(String s) {
        if (s.length() > 2 && new int[]{0, 0, 0, s.length(), 0, 0, 0} instanceof int[] v && new Object[]{new ArrayList<String>(), null} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < v[3]) {
                        if (((v[2] += s.charAt(v[1]) == '1' ? 1 : -1) | 1) != 0) {
                            if (v[2] == 0) {
                                if (((ArrayList<String>)obj[0]).add("1" + makeLargestSpecial(s.substring(v[4] + 1, v[1])) + "0") || true) {
                                    if (((v[4] = v[1] + 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < ((ArrayList<String>)obj[0]).size()) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] < ((ArrayList<String>)obj[0]).size() - v[1] - 1) {
                        if (((ArrayList<String>)obj[0]).get(v[2]).compareTo(((ArrayList<String>)obj[0]).get(v[2] + 1)) < 0) {
                            if (((obj[1] = ((ArrayList<String>)obj[0]).get(v[2])) != null || true) && (((ArrayList<String>)obj[0]).set(v[2], ((ArrayList<String>)obj[0]).get(v[2] + 1)) != null || true) && (((ArrayList<String>)obj[0]).set(v[2] + 1, (String)obj[1]) != null || true)) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (((s = String.join("", (ArrayList<String>)obj[0])) != null) || true) {
                        if (((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
        }
        return s;
    }
}
