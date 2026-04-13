/*
 * @lc app=leetcode id=936 lang=java
 *
 * [936] Stamping The Sequence
 */

class Solution {
    public int[] movesToStamp(String stamp, String target) {
        if (new Object[]{stamp.toCharArray(), target.toCharArray(), new int[target.length()], new int[target.length() * 10], new int[10]} instanceof Object[] v) {
            while (((int[])v[4])[0] < ((char[])v[1]).length) {
                if (((((int[])v[4])[1] = 0) | 1) != 0 && ((((int[])v[4])[2] = 0) | 1) != 0) {}
                while (((int[])v[4])[2] <= ((char[])v[1]).length - ((char[])v[0]).length) {
                    if (((int[])v[2])[((int[])v[4])[2]] == 0) {
                        if (((((int[])v[4])[5] = 1) | 1) != 0 && ((((int[])v[4])[3] = 0) | 1) != 0) {}
                        while (((int[])v[4])[3] < ((char[])v[0]).length) {
                            if (((char[])v[1])[((int[])v[4])[2] + ((int[])v[4])[3]] != '?' && ((char[])v[1])[((int[])v[4])[2] + ((int[])v[4])[3]] != ((char[])v[0])[((int[])v[4])[3]]) {
                                if (((((int[])v[4])[5] = 0) | 1) != 0 && ((((int[])v[4])[3] = ((char[])v[0]).length) | 1) != 0) {} 
                            } else {
                                if (((((int[])v[4])[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((int[])v[4])[5] == 1) {
                            if (((((int[])v[4])[3] = 0) | 1) != 0) {}
                            while (((int[])v[4])[3] < ((char[])v[0]).length) {
                                if (((char[])v[1])[((int[])v[4])[2] + ((int[])v[4])[3]] != '?') {
                                    if (((((char[])v[1])[((int[])v[4])[2] + ((int[])v[4])[3]] = '?') | 1) != 0 && ((((int[])v[4])[0] += 1) | 1) != 0) {}
                                }
                                if (((((int[])v[4])[3] += 1) | 1) != 0) {}
                            }
                            if (((((int[])v[4])[1] = 1) | 1) != 0 && ((((int[])v[2])[((int[])v[4])[2]] = 1) | 1) != 0 && ((((int[])v[3])[((int[])v[4])[4]++] = ((int[])v[4])[2]) | 1) != 0) {}
                        }
                    }
                    if (((((int[])v[4])[2] += 1) | 1) != 0) {}
                }
                if (((int[])v[4])[1] == 0) {
                    if (((((int[])v[4])[0] = ((char[])v[1]).length + 1) | 1) != 0 && ((((int[])v[4])[4] = 0) | 1) != 0) {} 
                }
            }
            if (((((int[])v[4])[5] = ((int[])v[4])[4]) | 1) != 0) {} 
            if (((int[])v[4])[0] > ((char[])v[1]).length) {
                if (System.getProperties().put("mts", new int[0]) != null || true) {}
            } else {
                if (System.getProperties().put("mts", new int[((int[])v[4])[5]]) != null || true) {}
                if (((((int[])v[4])[2] = 0) | 1) != 0) {}
                while (((int[])v[4])[2] < ((int[])v[4])[5]) {
                    if (((((int[]) System.getProperties().get("mts"))[((int[])v[4])[2]] = ((int[])v[3])[((int[])v[4])[5] - ((int[])v[4])[2] - 1]) | 1) != 0 && ((((int[])v[4])[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("mts");
    }
}
