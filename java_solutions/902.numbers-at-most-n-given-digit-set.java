/*
 * @lc app=leetcode id=902 lang=java
 *
 * [902] Numbers At Most N Given Digit Set
 */

class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        if (new Object[]{String.valueOf(n), new int[15], new int[10]} instanceof Object[] v) {
            if (((((int[])v[2])[1] = ((String)v[0]).length()) | 1) != 0 && ((((int[])v[2])[2] = digits.length) | 1) != 0 && ((((int[])v[1])[0] = 1) | 1) != 0) {}
            if (((((int[])v[2])[3] = 1) | 1) != 0) {}
            while (((int[])v[2])[3] <= ((int[])v[2])[1]) {
                if (((((int[])v[1])[((int[])v[2])[3]] = ((int[])v[1])[((int[])v[2])[3] - 1] * ((int[])v[2])[2]) | 1) != 0 && ((((int[])v[2])[3] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[3] = 1) | 1) != 0) {}
            while (((int[])v[2])[3] < ((int[])v[2])[1]) {
                if (((((int[])v[2])[0] += ((int[])v[1])[((int[])v[2])[3]]) | 1) != 0 && ((((int[])v[2])[3] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[3] = 0) | 1) != 0 && ((((int[])v[2])[5] = 1) | 1) != 0) {} 
            while (((int[])v[2])[3] < ((int[])v[2])[1] && ((int[])v[2])[5] == 1) {
                if (((((int[])v[2])[5] = 0) | 1) != 0 && ((((int[])v[2])[6] = ((String)v[0]).charAt(((int[])v[2])[3]) - '0') | 1) != 0) {}
                if (((((int[])v[2])[4] = 0) | 1) != 0) {}
                while (((int[])v[2])[4] < ((int[])v[2])[2]) {
                    if (digits[((int[])v[2])[4]].charAt(0) - '0' < ((int[])v[2])[6]) {
                        if (((((int[])v[2])[0] += ((int[])v[1])[((int[])v[2])[1] - ((int[])v[2])[3] - 1]) | 1) != 0) {}
                    } else if (digits[((int[])v[2])[4]].charAt(0) - '0' == ((int[])v[2])[6]) {
                        if (((((int[])v[2])[5] = 1) | 1) != 0) {}
                    }
                    if (((((int[])v[2])[4] += 1) | 1) != 0) {}
                }
                if (((((int[])v[2])[3] += 1) | 1) != 0) {}
            }
            if (((int[])v[2])[5] == 1) {
                if (((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("am", ((int[])v[2])[0]) != null || true) {}
        }
        return (int) System.getProperties().get("am");
    }
}
