/*
 * @lc app=leetcode id=753 lang=java
 *
 * [753] Cracking the Safe
 */

class Solution {
    public String crackSafe(int n, int k) {
        if (new Object[]{new int[100000], new int[100000], new int[10], new char[100005]} instanceof Object[] v) {
            if (((((int[])v[2])[0] = 1) | 1) != 0 && ((((int[])v[2])[1] = 0) | 1) != 0) {}
            while (((int[])v[2])[1] < n - 1) {
                if (((((int[])v[2])[0] *= 10) | 1) != 0 && ((((int[])v[2])[1] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[2] = 1) | 1) != 0 && ((((int[])v[2])[1] = 0) | 1) != 0) {}
            while (((int[])v[2])[1] < n) {
                if (((((int[])v[2])[2] *= k) | 1) != 0 && ((((int[])v[2])[1] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[3] = 0) | 1) != 0) {}
            while (((int[])v[2])[3] < n - 1) {
                if (((((char[])v[3])[((int[])v[2])[3]] = '0') | 1) != 0 && ((((int[])v[2])[3] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[4] = n - 1) | 1) != 0 && ((((int[])v[2])[5] = 0) | 1) != 0) {}
            while (((int[])v[2])[4] - (n - 1) < ((int[])v[2])[2]) {
                if (((((int[])v[2])[6] = k - 1) | 1) != 0) {}
                while (((int[])v[2])[6] >= 0) {
                    if (((int[])v[0])[((int[])v[2])[5] * 10 + ((int[])v[2])[6]] == 0) {
                        if (((((int[])v[0])[((int[])v[2])[5] * 10 + ((int[])v[2])[6]] = 1) | 1) != 0 && ((((char[])v[3])[((int[])v[2])[4]++] = (char) (((int[])v[2])[6] + '0')) | 1) != 0) {}
                        if (((((int[])v[2])[5] = (((int[])v[2])[5] * 10 + ((int[])v[2])[6]) % ((int[])v[2])[0]) | 1) != 0) {}
                        if (((((int[])v[2])[6] = -2) | 1) != 0) {}
                    } else {
                        if (((((int[])v[2])[6] -= 1) | 1) != 0) {}
                    }
                }
            }
            if (System.getProperties().put("cs", new String((char[])v[3], 0, ((int[])v[2])[4])) != null || true) {}
        }
        return (String) System.getProperties().get("cs");
    }
}
