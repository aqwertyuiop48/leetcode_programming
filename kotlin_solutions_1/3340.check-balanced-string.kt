/*
 * @lc app=leetcode id=3340 lang=java
 *
 * [3340] Check Balanced String
 */
fun isBalanced(num: String): Boolean = IntArray(2).also { v -> num.indices.forEach { i -> v[i % 2] += num[i] - '0' } }.let { v -> v[0] == v[1] }