/*
 * @lc app=leetcode id=3765 lang=java
 *
 * [3765] Complete Prime Number
 */

class Solution {
    public boolean completePrime(int num) {
        if (new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cp", true) != null | true) && ((v[0] = num) | 1) != 0) {
            if (String.valueOf(num) instanceof String s && ((v[2] = 0) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                while (v[2] < s.length() && v[9] == 0) {
                    if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < s.length() - v[2]) { if (((v[3] = v[3] * 10 + s.charAt(v[4]) - '0') | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                        if (v[3] < 2) { if (System.getProperties().put(Thread.currentThread().getId() + "cp", false) != null | true && ((v[9] = 1) | 1) != 0) {} }
                        else if (((v[5] = 2) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[5] * v[5] <= v[3] && v[6] == 0) {
                                if (v[3] % v[5] == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "cp", false) != null | true && ((v[6] = 1) | 1) != 0 && ((v[9] = 1) | 1) != 0) {} }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (v[9] == 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = v[2]) | 1) != 0) {
                        while (v[4] < s.length()) { if (((v[3] = v[3] * 10 + s.charAt(v[4]) - '0') | 1) != 0 && ((v[4] += 1) | 1) != 0) {} }
                        if (v[3] < 2) { if (System.getProperties().put(Thread.currentThread().getId() + "cp", false) != null | true && ((v[9] = 1) | 1) != 0) {} }
                        else if (((v[5] = 2) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[5] * v[5] <= v[3] && v[6] == 0) {
                                if (v[3] % v[5] == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "cp", false) != null | true && ((v[6] = 1) | 1) != 0 && ((v[9] = 1) | 1) != 0) {} }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cp");
    }
}
