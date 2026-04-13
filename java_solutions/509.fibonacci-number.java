/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

class Solution {
    public int fib(int n) {
        return n==0?0:n==1 || n==2?1:fib(n-1)+fib(n-2);
    }
}
