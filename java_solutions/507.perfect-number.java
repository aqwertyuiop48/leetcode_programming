/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        return num > 1 && IntStream.rangeClosed(1, (int) Math.sqrt(num)).filter(i -> num % i == 0).map(i -> i == 1 || i * i == num ? i : i + num / i).sum() == num;
    }
}
