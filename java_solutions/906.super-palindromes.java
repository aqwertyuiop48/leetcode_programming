/*
 * @lc app=leetcode id=906 lang=java
 *
 * [906] Super Palindromes
 */

class Solution {
    public int superpalindromesInRange(String left, String right) {
        if (new Object[]{new long[15]} instanceof Object[] v) {
            if (((((long[])v[0])[0] = Long.parseLong(left)) | 1) != 0 && ((((long[])v[0])[1] = Long.parseLong(right)) | 1) != 0 && ((((long[])v[0])[2] = 0) | 1) != 0 && ((((long[])v[0])[3] = 1) | 1) != 0) {}
            while (((long[])v[0])[3] < 100000) {
                if (((((long[])v[0])[7] = 0) | 1) != 0) {}
                while (((long[])v[0])[7] < 2) {
                    if (((long[])v[0])[7] == 0) {
                        if (((((long[])v[0])[6] = ((long[])v[0])[3]) | 1) != 0 && ((((long[])v[0])[4] = ((long[])v[0])[3]) | 1) != 0) {}
                    } else {
                        if (((((long[])v[0])[6] = ((long[])v[0])[3] / 10) | 1) != 0 && ((((long[])v[0])[4] = ((long[])v[0])[3]) | 1) != 0) {}
                    }
                    while (((long[])v[0])[6] > 0) {
                        if (((((long[])v[0])[4] = ((long[])v[0])[4] * 10 + ((long[])v[0])[6] % 10) | 1) != 0 && ((((long[])v[0])[6] /= 10) | 1) != 0) {}
                    }
                    if (((((long[])v[0])[5] = ((long[])v[0])[4] * ((long[])v[0])[4]) | 1) != 0) {}
                    if (((long[])v[0])[5] >= ((long[])v[0])[0] && ((long[])v[0])[5] <= ((long[])v[0])[1]) {
                        if (((((long[])v[0])[8] = 0) | 1) != 0 && ((((long[])v[0])[9] = ((long[])v[0])[5]) | 1) != 0) {}
                        while (((long[])v[0])[9] > 0) {
                            if (((((long[])v[0])[8] = ((long[])v[0])[8] * 10 + ((long[])v[0])[9] % 10) | 1) != 0 && ((((long[])v[0])[9] /= 10) | 1) != 0) {}
                        }
                        if (((long[])v[0])[8] == ((long[])v[0])[5]) {
                            if (((((long[])v[0])[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((((long[])v[0])[7] += 1) | 1) != 0) {}
                }
                if (((((long[])v[0])[3] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("supPal", (int)((long[])v[0])[2]) != null || true) {}
        }
        return (int) System.getProperties().get("supPal");
    }
}
