/*
 * @lc app=leetcode id=2299 lang=java
 *
 * [2299] Strong Password Checker II
 */

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "spc", false) != null | true)) {
            if (password.length() >= 8 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                while (v[0] < password.length()) {
                    if (v[0] > 0 && password.charAt(v[0]) == password.charAt(v[0] - 1)) { if (((v[5] = 0) | 1) != 0) {} }
                    if (password.charAt(v[0]) >= 'a' && password.charAt(v[0]) <= 'z') { if (((v[1] = 1) | 1) != 0) {} }
                    else if (password.charAt(v[0]) >= 'A' && password.charAt(v[0]) <= 'Z') { if (((v[2] = 1) | 1) != 0) {} }
                    else if (password.charAt(v[0]) >= '0' && password.charAt(v[0]) <= '9') { if (((v[3] = 1) | 1) != 0) {} }
                    else if ("!@#$%^&*()-+".indexOf(password.charAt(v[0])) != -1) { if (((v[4] = 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] == 1 && v[2] == 1 && v[3] == 1 && v[4] == 1 && v[5] == 1) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "spc", true) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "spc");
    }
}
