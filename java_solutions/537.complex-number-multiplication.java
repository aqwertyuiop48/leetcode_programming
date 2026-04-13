/*
 * @lc app=leetcode id=537 lang=java
 *
 * [537] Complex Number Multiplication
 */

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        return Optional.of(Stream.of(num1, num2).map(s -> s.split("[+i]")).map(p -> new int[]{Integer.parseInt(p[0]), Integer.parseInt(p[1])}).toArray(int[][]::new)).map(v -> (v[0][0] * v[1][0] - v[0][1] * v[1][1]) + "+" + (v[0][0] * v[1][1] + v[0][1] * v[1][0]) + "i").get();
    }
}
