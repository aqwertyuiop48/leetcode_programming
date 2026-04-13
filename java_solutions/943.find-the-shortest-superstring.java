/*
 * @lc app=leetcode id=943 lang=java
 *
 * [943] Find the Shortest Superstring
 */

class Solution {
    public String shortestSuperstring(String[] words) {
        if (new Object[]{new int[words.length][words.length], new int[1 << words.length][words.length], new int[1 << words.length][words.length], new int[10], new String[1]} instanceof Object[] v) {
            if (((((int[])v[3])[7] = words.length) | 1) != 0 && ((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < ((int[])v[3])[7]) {
                if (((((int[])v[3])[1] = 0) | 1) != 0) {}
                while (((int[])v[3])[1] < ((int[])v[3])[7]) {
                    if (((int[])v[3])[0] != ((int[])v[3])[1]) {
                        if (((((int[])v[3])[2] = 0) | 1) != 0) {}
                        while (((int[])v[3])[2] < words[((int[])v[3])[0]].length()) {
                            if (words[((int[])v[3])[1]].startsWith(words[((int[])v[3])[0]].substring(((int[])v[3])[2]))) {
                                if (((((int[][])v[0])[((int[])v[3])[0]][((int[])v[3])[1]] = words[((int[])v[3])[0]].length() - ((int[])v[3])[2]) | 1) != 0 && ((((int[])v[3])[2] = words[((int[])v[3])[0]].length()) | 1) != 0) {} 
                            } else {
                                if (((((int[])v[3])[2] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((((int[])v[3])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < (1 << ((int[])v[3])[7])) {
                if (((((int[])v[3])[1] = 0) | 1) != 0) {}
                while (((int[])v[3])[1] < ((int[])v[3])[7]) {
                    if (((((int[])v[3])[2] = 0) | 1) != 0) {}
                    while (((int[])v[3])[2] < ((int[])v[3])[7]) {
                        if ((((int[])v[3])[0] & (1 << ((int[])v[3])[1])) > 0 && (((int[])v[3])[0] & (1 << ((int[])v[3])[2])) == 0) {
                            if ((((int[][])v[1])[((int[])v[3])[0]][((int[])v[3])[1]] + ((int[][])v[0])[((int[])v[3])[1]][((int[])v[3])[2]]) >= ((int[][])v[1])[((int[])v[3])[0] | (1 << ((int[])v[3])[2])][((int[])v[3])[2]]) {
                                if (((((int[][])v[1])[((int[])v[3])[0] | (1 << ((int[])v[3])[2])][((int[])v[3])[2]] = ((int[][])v[1])[((int[])v[3])[0]][((int[])v[3])[1]] + ((int[][])v[0])[((int[])v[3])[1]][((int[])v[3])[2]]) | 1) != 0 && ((((int[][])v[2])[((int[])v[3])[0] | (1 << ((int[])v[3])[2])][((int[])v[3])[2]] = ((int[])v[3])[1]) | 1) != 0) {}
                            }
                        }
                        if (((((int[])v[3])[2] += 1) | 1) != 0) {}
                    }
                    if (((((int[])v[3])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[6] = 0) | 1) != 0 && ((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < ((int[])v[3])[7]) {
                if (((int[][])v[1])[(1 << ((int[])v[3])[7]) - 1][((int[])v[3])[0]] > ((int[][])v[1])[(1 << ((int[])v[3])[7]) - 1][((int[])v[3])[6]]) {
                    if (((((int[])v[3])[6] = ((int[])v[3])[0]) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[4] = (1 << ((int[])v[3])[7]) - 1) | 1) != 0 && ((((String[])v[4])[0] = "").length() >= 0)) {}
            while (((int[])v[3])[4] > 0) {
                if (((((int[])v[3])[8] = ((int[])v[3])[4] & (((int[])v[3])[4] - 1)) | 1) != 0 &&
                    ((((String[])v[4])[0] = words[((int[])v[3])[6]].substring(((int[])v[3])[8] == 0 ? 0 : ((int[][])v[0])[((int[][])v[2])[((int[])v[3])[4]][((int[])v[3])[6]]][((int[])v[3])[6]]) + ((String[])v[4])[0]).length() >= 0) &&
                    ((((int[])v[3])[9] = ((int[])v[3])[6]) | 1) != 0 &&
                    ((((int[])v[3])[6] = ((int[][])v[2])[((int[])v[3])[4]][((int[])v[3])[6]]) | 1) != 0 &&
                    ((((int[])v[3])[4] ^= (1 << ((int[])v[3])[9])) | 1) != 0) {}
            }
            if (System.getProperties().put("ss", ((String[])v[4])[0]) != null || true) {}
        }
        return (String) System.getProperties().get("ss");
    }
}
